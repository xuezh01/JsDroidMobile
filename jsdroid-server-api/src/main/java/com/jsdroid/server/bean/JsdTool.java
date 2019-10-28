package com.jsdroid.server.bean;


/**
 * 工具表 jsdroid_tool
 *
 * @author jsdroid
 * @date 2019-06-23
 */
public class JsdTool extends BaseEntity {

    /**
     * ID
     */
    private Integer id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsdTool jsdTool = (JsdTool) o;

        return id.equals(jsdTool.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /**
     * 分类
     */
    private String classify;
    /**
     * 名称
     */
    private String name;
    /**
     * 包名
     */
    private String pkg;
    /**
     * 版本
     */
    private String version;
    /**
     * 简介
     */
    private String note;
    /**
     * 文件路径
     */
    private String uploadPath;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 是否公开
     */
    private Integer shared;
    /**
     * 图标
     */
    private String icon;
    /**
     * 点赞数量
     */
    private Integer zanCount;
    /**
     * 回复数量
     */
    private Integer commentCount;
    /**
     * 下载数量
     */
    private Integer downloadCount;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getClassify() {
        return classify;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    public String getPkg() {
        return pkg;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setShared(Integer shared) {
        this.shared = shared;
    }

    public Integer getShared() {
        return shared;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setZanCount(Integer zanCount) {
        this.zanCount = zanCount;
    }

    public Integer getZanCount() {
        return zanCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }
}
