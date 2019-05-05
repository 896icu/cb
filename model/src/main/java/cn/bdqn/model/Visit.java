package cn.bdqn.model;

import java.util.Date;

public class Visit {
    private Integer id;

    private Integer duId;

    private String visitObject;

    private Integer visitMethodId;

    private String contact;

    private Integer number;

    private String content;

    private String remark;

    private Date createDate;

    private String returnvisit;

    private String commentators;

    private String comments;

    private Date demohour;
    private DevUser devUser;
    private String typeName;

    public DevUser getDevUser() {
        return devUser;
    }

    public void setDevUser(DevUser devUser) {
        this.devUser = devUser;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDuId() {
        return duId;
    }

    public void setDuId(Integer duId) {
        this.duId = duId;
    }

    public String getVisitObject() {
        return visitObject;
    }

    public void setVisitObject(String visitObject) {
        this.visitObject = visitObject;
    }

    public Integer getVisitMethodId() {
        return visitMethodId;
    }

    public void setVisitMethodId(Integer visitMethodId) {
        this.visitMethodId = visitMethodId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getReturnvisit() {
        return returnvisit;
    }

    public void setReturnvisit(String returnvisit) {
        this.returnvisit = returnvisit;
    }

    public String getCommentators() {
        return commentators;
    }

    public void setCommentators(String commentators) {
        this.commentators = commentators;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDemohour() {
        return demohour;
    }

    public void setDemohour(Date demohour) {
        this.demohour = demohour;
    }
}