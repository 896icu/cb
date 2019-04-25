package cn.bdqn.model;

import java.util.Date;

public class Iou {
    private Integer id;

    private Date createDate;

    private Integer backendId;

    private Integer devId;

    private Date startDate;

    private Date endDate;

    private Double money;

    private Double yearRate;

    private Long interest;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getBackendId() {
        return backendId;
    }

    public void setBackendId(Integer backendId) {
        this.backendId = backendId;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getYearRate() {
        return yearRate;
    }

    public void setYearRate(Double yearRate) {
        this.yearRate = yearRate;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}