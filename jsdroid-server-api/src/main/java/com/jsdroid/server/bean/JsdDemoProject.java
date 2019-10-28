package com.jsdroid.server.bean;

/**
 * 示例工程表 jsdroid_demo_project
 *
 * @author jsdroid
 * @date 2019-06-22
 */
public class JsdDemoProject extends BaseEntity {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsdDemoProject that = (JsdDemoProject) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /**
     * 工程ID
     */
    private Integer id;
    /**
     * 工程名称
     */
    private String name;
    /**
     * 上传路径
     */
    private String path;
    private String icon;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }


    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
