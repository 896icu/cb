package cn.bdqn.model;

import java.util.Date;

public class LendDetail {
    private Integer id;

    private Integer devId;

    private Integer backendId;

    private Integer lId;

    private Date createDate;

    private Integer lsId;

    private Date upStaDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public Integer getBackendId() {
        return backendId;
    }

    public void setBackendId(Integer backendId) {
        this.backendId = backendId;
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getLsId() {
        return lsId;
    }

    public void setLsId(Integer lsId) {
        this.lsId = lsId;
    }

    public Date getUpStaDate() {
        return upStaDate;
    }

    public void setUpStaDate(Date upStaDate) {
        this.upStaDate = upStaDate;
    }
}