package com.jsdroid.server.bean;

/**
 * 工具评论表 jsdroid_tool_comment
 *
 * @author jsdroid
 * @date 2019-06-23
 */
public class JsdToolComment extends BaseEntity {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsdToolComment that = (JsdToolComment) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

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
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 回复评论ID
     */
    private Integer replyId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

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

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyId() {
        return replyId;
    }


}
