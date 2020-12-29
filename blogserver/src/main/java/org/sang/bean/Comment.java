package org.sang.bean;

public class Comment {
    private Integer id;
    private Integer aid;
    private String content;
    private String publishDate;
    private Integer parentId;
    private Integer uid;

    public Comment() {
    }

    public Comment(Integer id, Integer aid, String content, String publishDate, Integer parentId, Integer uid) {
        this.id = id;
        this.aid = aid;
        this.content = content;
        this.publishDate = publishDate;
        this.parentId = parentId;
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
