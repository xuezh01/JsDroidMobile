package com.jsdroid.server.bean;

/**
 * 工具下载表 jsdroid_tool_down
 *
 * @author jsdroid
 * @date 2019-06-23
 */
public class JsdToolDown extends BaseEntity{

    /**
     * ID
     */
    private Integer id;
    /**
     * 工具ID
     */
    private Integer toolId;
    /**
     * 用户ID
     */
    private Long userId;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    public Integer getToolId() {
        return toolId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

}
