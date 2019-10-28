#include<iostream>
#include<vector>
#include<map>
#include <android/log.h>
#include <exception>

#define LOG_TAG  "findpic"
#define loge(...)  __android_log_print(ANDROID_LOG_FATAL, LOG_TAG, __VA_ARGS__)

namespace jsdroid {
    using namespace std;

    //创建二维数组
    char **char_arr_alloc(int width, int height, char value) {
        char **arr = new char *[width];
        for (int i = 0; i < width; i++) {
            arr[i] = new char[height]{value};
        }
        return arr;
    }

    //释放二维数组
    void char_arr_release(char **arr, int width) {
        for (int i = 0; i < width; i++) {
            delete[]arr[i];
            arr[i] = 0;
        }
        delete[] arr;
        arr = 0;
    }

    //颜色
    struct RGB {
        unsigned char b = 0;
        unsigned char g = 0;
        unsigned char r = 0;
        unsigned char a = 0;
    };
    //点
    struct Point {
        int x;
        int y;
    };

    //判断一个数组中是否包含一个点
    bool containsPoint(vector<Point> points, int x, int y) {
        for (int i = 0; i < points.size(); i++) {
            if (points[i].x == x && points[i].y == y) {
                return true;
            }
        }
        return false;
    }

    //多点找色中的一个点
    struct MultiColor {
        Point p;
        RGB color;
    };

    //比较颜色是否相同
    bool compileColor(RGB c1, RGB c2, RGB offset) {

        if (abs(c1.r - c2.r) > offset.r) {
            return false;
        }
        if (abs(c1.g - c2.g) > offset.g) {
            return false;
        }
        if (abs(c1.b - c2.b) > offset.b) {
            return false;
        }
        return true;
    }

    //图片
    class Img {
    private:
        int off_x;
        int off_y;
        int mWidth;
        int mHeight;
        RGB **mColors;
    public:
        Img(int width, int height, RGB *colors) {
            off_x = 0;
            off_y = 0;
            mWidth = width;
            mHeight = height;
            mColors = new RGB *[height];
            for (int i = 0; i < height; i++) {
                int off = i * width;
                mColors[i] = (colors + off);//new RGB[width];
            }
        }

        Img(Img origin, int left, int top, int width, int height) {
            mColors = origin.mColors;
            off_x = left;
            off_y = top;
            mWidth = width;
            mHeight = height;
        }

        //将图片颜色变成黑白的
        void toFontMap(RGB color, RGB offset) {
            for (int i = 0; i < mHeight; ++i) {
                for (int j = 0; j < mWidth; ++j) {
                    if (compileColor(mColors[i][j], color, offset)) {
                        //是需要的颜色，变成黑色
                        mColors[i][j].r = 0;
                        mColors[i][j].g = 0;
                        mColors[i][j].b = 0;
                    } else {
                        mColors[i][j].r = 255;
                        mColors[i][j].g = 255;
                        mColors[i][j].b = 255;
                    }
                }
            }
        }

        ~Img() {
            //delete mColors;
        }

        RGB getColor(int x, int y) {
            return mColors[y + off_y][x + off_x];
        }

        int width() {
            return mWidth;
        }

        int height() {
            return mHeight;
        }
    };

    //字体
    struct Font {
        long id = 0;
        int count = 0;//点的个数
        int width = 0;//宽度
        int height = 0;//高度
        char **colors;//01颜色矩阵
    };

    //创建字体
    Font *createFont(Img img, RGB color, RGB offset) {
        Font *font = new Font();
        font->width = img.width();
        font->height = img.height();
        font->colors = char_arr_alloc(font->width, font->height, 0);
        font->count = 0;
        for (int i = 0; i < font->width; i++) {
            for (int j = 0; j < font->height; j++) {
                if (compileColor(color, img.getColor(i, j), offset)) {
                    font->colors[i][j] = 1;
                    font->count++;
                }
            }
        }
        return font;
    }

    //释放字体
    void releaseFont(Font *font) {
        char_arr_release(font->colors, font->width);
    }

    //找字结果
    struct Code {
        long font_id = 0;//在字库中的位置
        int left = 0;
        int top = 0;
        int right = 0;
        int bottom = 0;//范围
        int count = 0;//点的个数
        int width;
        int height;
    };

    //获取文字宽度
    int codeWidth(Code code) {
        return abs(code.left - code.right) + 1;
    }

    //获取文字高度
    int codeHeight(Code code) {
        return abs(code.top - code.bottom) + 1;
    }

    //图片转换成的用于找字的01矩阵
    class CodePic {
    private:
        char **mColors;//01矩阵
        int mWidth, mHeight;//宽高
        //扫描文字
        int scanCode(Code &code, char **has_scan, vector<Point> points, int distance) {
            int count = 0;
            vector<Point> next;

            for (int i = 0; i < points.size(); i++) {
                int x = points[i].x;
                int y = points[i].y;
                //扫描Code，往右下扫描
                for (int k = -distance; k <= distance; k++) {
                    int px = k + x;
                    if (px < 0 || px >= mWidth) {
                        continue;
                    }
                    for (int l = -distance; l <= distance; l++) {
                        int py = l + y;
                        if (py < 0 || py >= mHeight) {
                            continue;
                        }
                        //如果该点为0，则跳过
                        if (mColors[px][py] == 0) {
                            continue;
                        }
                        //如果该点已经扫描过了，则跳过
                        if (has_scan[px][py] == 1) {
                            continue;
                        }
                        //扫描成功
                        has_scan[px][py] = 1;
                        count++;
                        //将该点保存起来，下次接着扫描
                        Point p;
                        p.x = px;
                        p.y = py;
                        next.push_back(p);
                        //界限
                        if (px > code.right) {
                            code.right = px;
                        }
                        if (py > code.bottom) {
                            code.bottom = py;
                        }
                    }
                }
            }
            if (next.size() > 0) {
                int ncount = scanCode(code, has_scan, next, distance);
                count = ncount + count;
            }

            return count;
        }

    public:
        CodePic(Img img,//图片
                RGB color,//需要筛选的颜色
                RGB offset//筛选颜色的色差
        ) {
            mWidth = img.width();
            mHeight = img.height();
            mColors = new char *[mWidth];
            int count = 0;
            for (int i = 0; i < mWidth; i++) {
                mColors[i] = new char[mHeight];
                for (int j = 0; j < mHeight; j++) {
                    if (compileColor(img.getColor(i, j), color, offset)) {
                        mColors[i][j] = 1;
                        count++;
                    } else {
                        mColors[i][j] = 0;
                    }
                }
            }
            loge("pic count:%d==%d", count, mWidth * mHeight);
        }


        //采集到的字与字库的字匹配
        bool compileFont(Code code, Font font, float sim) {
            int w_2 = font.width >> 1;
            int h_2 = font.height >> 1;
            int abs_off_x = abs(font.width - codeWidth(code));
            int abs_off_y = abs(font.height - codeHeight(code));
            if (abs_off_x > w_2) {
                return false;
            }
            if (abs_off_y > h_2) {
                return false;
            }
            //较多的点的数量：图中为1的点
            int max_count = 0;
            //较少的点的数量
            int min_count = 0;
            //最大匹配错误次数
            int max_miss_count = font.width * font.height * (1 - sim);
            //最大匹配成功次数
            int max_suc_count = font.width * font.height - max_miss_count;
            if (code.count > font.count) {
                max_count = code.count;
                min_count = font.count;
            } else {
                max_count = font.count;
                min_count = code.count;
            }
            if ((max_count - min_count) > max_miss_count) {
                return false;
            }
            int x, y, miss_count, suc_count;
            int startx, endx, starty, endy;
            if (font.width > codeWidth(code)) {
                startx = code.left - abs_off_x;
                endx = code.left + abs_off_x;
            } else {
                startx = code.left + abs_off_x;
                endx = code.left - abs_off_x;
            }
            if (font.height > codeHeight(code)) {
                starty = code.top - abs_off_y;
                endy = code.top + abs_off_y;
            } else {
                starty = code.top + abs_off_y;
                endy = code.top - abs_off_y;
            }

            //比较每个点，是否匹配
            for (int ox = startx; ox <= endx; ox++) {
                for (int oy = starty; oy <= endy; oy++) {
                    miss_count = suc_count = 0;
                    //比较2个字符的颜色是否匹配
                    for (int i = 0; i < font.width; i++) {
                        x = i + ox;
                        if (x < 0 || x >= mWidth) {
                            miss_count += font.height;
                            if (miss_count > max_miss_count) {
                                goto next;
                            }
                            continue;
                        }
                        for (int j = 0; j < font.height; j++) {
                            y = j + oy;
                            if (y < 0 || y >= mHeight) {
                                miss_count++;
                                if (miss_count > max_miss_count) {
                                    goto next;
                                }
                                continue;
                            }
                            if (font.colors[i][j] == mColors[x][y]) {
                                suc_count++;
                                if (suc_count >= max_suc_count) {
                                    goto result;
                                }
                            } else {
                                miss_count++;
                                if (miss_count > max_miss_count) {
                                    goto next;
                                }
                            }
                        }
                    }
                    result:
                    return true;
                    next:
                    continue;
                }
            }

            return false;
        }

        //根据间隔分割字符
        vector<Code> getCodes(int distance) {
            vector<Code> codes;
            char **has_scan = char_arr_alloc(mWidth, mHeight, 0);
            //挨个扫描
            for (int i = 0; i < mWidth; i++) {
                for (int j = 0; j < mHeight; j++) {
                    if (mColors[i][j] == 0) {
                        continue;
                    }
                    if (has_scan[i][j] == 1) {
                        continue;
                    }
                    vector<Point> points;
                    Point p;
                    p.x = i;
                    p.y = j;
                    points.push_back(p);

                    Code code;
                    code.left = i;
                    code.right = i;
                    code.top = j;
                    code.bottom = j;
                    code.count = 1 + scanCode(code, has_scan, points, distance);

                    codes.push_back(code);
                }
            }
            char_arr_release(has_scan, mWidth);
            return codes;
        }

        //找字
        vector<Code> ocr(vector<Font> fonts, int distance, float sim) {
            vector<Code> result;
            vector<Code> codes = getCodes(distance);
            loge("codes:%d", codes.size());

            for (int i = 0; i < codes.size(); ++i) {
                codes[i].width = codeWidth(codes[i]);
                codes[i].height = codeHeight(codes[i]);
            }

            for (int i = 0; i < codes.size(); i++) {
                for (int j = 0; j < fonts.size(); j++) {
                    if (compileFont(codes[i], fonts[j], sim)) {
                        codes[i].font_id = fonts[j].id;
                        result.push_back(codes[i]);
                        break;
                    }
                }
            }
            return result;
        }

        ~CodePic() {
            for (int i = 0; i < mWidth; i++) {
                delete[] mColors[i];
                mColors[i] = 0;
            }
            delete[] mColors;
            mColors = 0;
        }
    };


    //多点找色，返回单个结果
    bool find_multi_color(Point &ret,//查找结果
                          Img img,//图片
                          vector<MultiColor> colors,//颜色数组
                          RGB offset,//色差
                          float sim//相似度
    ) {
        if (sim > 1.0f) {
            sim = 1.0f;
        }
        if (sim < 0) {
            sim = 0;
        }
        if (sim == 0) {
            return false;
        }
        int max_miss = (int) (colors.size() * (1.0f - sim));
        int max_suc = (int) (colors.size() * (sim));
        int miss = 0;
        int suc = 0;
        int x, y;
        int colorsCount = colors.size();
        for (int i = 0; i < img.width(); i++) {
            for (int j = 0; j < img.height(); j++) {
                miss = 0;
                suc = 0;
                for (int k = 0; k < colorsCount; k++) {
                    MultiColor cp = colors[k];
                    x = i + cp.p.x;
                    y = j + cp.p.y;
                    if (x >= img.width() || x < 0) {
                        goto next;
                    }
                    if (y >= img.height() || y < 0) {
                        goto next;
                    }
                    RGB c1 = img.getColor(x, y);
                    RGB c2 = cp.color;
                    if (!compileColor(c1, c2, offset)) {
                        miss++;
                        if (miss > max_miss) {
                            goto next;
                        }
                        continue;
                    }
                    suc++;
                    if (suc >= max_suc) {
                        goto result;
                    }
                }

                result:
                ret.x = i;
                ret.y = j;

                return true;
                next:
                continue;
            }
        }
        return false;
    }

    //多点找色，返回多个结果
    vector<Point> find_all_multi_colors(
            Img img,//图片
            vector<MultiColor> colors,//颜色数组
            RGB offset,//色差
            float sim//相似度
    ) {
        vector<Point> ret;
        if (sim > 1.0f) {
            sim = 1.0f;
        }
        if (sim < 0) {
            sim = 0;
        }
        if (sim == 0) {
            return ret;
        }
        int max_miss = (int) (colors.size() * (1.0f - sim));
        int max_suc = (int) (colors.size() * (sim));
        int miss = 0;
        int suc = 0;
        int x, y;
        int colorsCount = colors.size();
        for (int i = 0; i < img.width(); i++) {
            for (int j = 0; j < img.height(); j++) {
                miss = 0;
                suc = 0;
                for (int k = 0; k < colorsCount; k++) {
                    MultiColor cp = colors[k];
                    x = i + cp.p.x;
                    y = j + cp.p.y;
                    if (x >= img.width() || x < 0) {
                        goto next;
                    }
                    if (y >= img.height() || y < 0) {
                        goto next;
                    }
                    RGB c1 = img.getColor(x, y);
                    RGB c2 = cp.color;
                    if (!compileColor(c1, c2, offset)) {
                        miss++;
                        if (miss > max_miss) {
                            goto next;
                        }
                        continue;
                    }
                    suc++;
                    if (suc >= max_suc) {
                        goto result;
                    }
                }
                result:
                Point p;
                p.x = i;
                p.y = j;
                ret.push_back(p);
                next:
                continue;
            }
        }
        return ret;
    }

    //获取非透明数量
    int get_n_a_count(Img img) {
        int count = 0;
        for (int i = 0; i < img.width(); i++) {
            for (int j = 0; j < img.height(); j++) {
                RGB c = img.getColor(i, j);
                if (c.a != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    //找图
    bool find_pic(
            Point &ret,//查找结果
            Img big,//大图
            Img small,//小图
            RGB offset,//色差
            float sim//相似度
    ) {
        if (sim > 1.0f) {
            sim = 1.0f;
        }
        if (sim < 0) {
            sim = 0;
        }
        if (sim == 0) {
            return false;
        }
        int n_a_count = get_n_a_count(small);
        int max_miss = (int) (n_a_count * (1.0f - sim));
        int max_suc = (int) (n_a_count * (sim));
        int miss = 0;
        int suc = 0;
        int bigx, bigy;
        for (int i = 0; i < big.width(); i++) {
            for (int j = 0; j < big.height(); j++) {
                miss = suc = 0;
                for (int k = 0; k < small.width(); k++) {
                    bigx = i + k;
                    if (bigx >= big.width()) {
                        goto next;
                    }
                    for (int l = 0; l < small.height(); l++) {
                        bigy = j + l;
                        if (bigy >= big.height()) {
                            goto next;
                        }
                        RGB c1 = big.getColor(bigx, bigy);
                        RGB c2 = small.getColor(k, l);
                        //如果该点颜色透明，则放弃比较
                        if (c2.a == 0) {
                            continue;
                        }
                        if (!compileColor(c1, c2, offset)) {
                            miss++;
                            if (miss > max_miss) {
                                goto next;
                            }
                            continue;
                        }
                        suc++;
                        if (suc >= max_suc) {
                            goto result;
                        }

                    }
                }

                result:
                ret.x = i;
                ret.y = j;
                return true;
                next:
                continue;
            }
        }

        return false;
    }

    void randPos(int arr[], int len) {
        for (int i = 0; i < len; ++i) {
            arr[i] = i;
        }
        for (int i = 0; i < len; ++i) {
            int pos = abs(rand()) % len;
            swap(arr[0], arr[pos]);
        }
    }

    //返回多个找图结果
    vector<Point> find_all_pic(
            Img big,//大图
            Img small,//小图
            RGB offset,//色差
            float sim//相似度
    ) {
        vector<Point> ret;
        if (sim > 1.0f) {
            sim = 1.0f;
        }
        if (sim < 0) {
            sim = 0;
        }
        if (sim == 0) {
            return ret;
        }
        int n_a_count = get_n_a_count(small);
        int max_miss = (int) (n_a_count * (1.0f - sim));
        int max_suc = (int) (n_a_count * (sim));
        int miss = 0;
        int suc = 0;
        int bigx, bigy;
        int pos_small_x[small.width()];
        int pos_small_y[small.height()];
        randPos(pos_small_x, small.width());
        randPos(pos_small_y, small.height());

        for (int i = 0; i < big.width(); i++) {
            for (int j = 0; j < big.height(); j++) {
                miss = suc = 0;
                for (int k = 0; k < small.width(); k++) {
                    bigx = i + pos_small_x[k];
                    if (bigx >= big.width()) {
                        goto next;
                    }
                    for (int l = 0; l < small.height(); l++) {
                        bigy = j + pos_small_y[l];
                        if (bigy >= big.height()) {
                            goto next;
                        }
                        RGB c1 = big.getColor(bigx, bigy);
                        RGB c2 = small.getColor(pos_small_x[k], pos_small_y[l]);
                        //如果该点颜色透明，则放弃比较
                        if (c2.a == 0) {
                            continue;
                        }
                        if (!compileColor(c1, c2, offset)) {
                            miss++;
                            if (miss > max_miss) {
                                goto next;
                            }
                            continue;
                        }
                        suc++;
                        if (suc >= max_suc) {
                            goto result;
                        }

                    }
                }
                result:
                Point p;
                p.x = i;
                p.y = j;
                ret.push_back(p);
//                max_miss = 1;
                next:
                continue;
            }
        }
        return ret;
    }

    //找字
    vector<Code> ocr(
            vector<Font> fonts,//字库
            Img img,
            RGB color,
            RGB offset,
            int distance,
            float sim
    ) {
        CodePic pic(img, color, offset);
        return pic.ocr(fonts, distance, sim);
    }

    RGB int2rgb(int color) {
        RGB rgb;
//        rgb.a = static_cast<char>(color >> 24);
        rgb.r = (char) ((color >> 16) & 0xFF);
        rgb.g = (char) ((color >> 8) & 0xFF);
        rgb.b = (char) (color & 0xFF);
        return rgb;
    }
}
