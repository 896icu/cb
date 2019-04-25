package cn.bdqn.model;

import java.util.Date;

public class RiskDetail {
    private Integer id;

    private String decisionId;

    private Integer score;

    private String mobileAddress;

    private String IDCardAddress;

    private String level;

    private String detail;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(String decisionId) {
        this.decisionId = decisionId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getMobileAddress() {
        return mobileAddress;
    }

    public void setMobileAddress(String mobileAddress) {
        this.mobileAddress = mobileAddress;
    }

    public String getIDCardAddress() {
        return IDCardAddress;
    }

    public void setIDCardAddress(String IDCardAddress) {
        this.IDCardAddress = IDCardAddress;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}