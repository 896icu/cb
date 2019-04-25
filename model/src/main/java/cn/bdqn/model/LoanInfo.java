package cn.bdqn.model;

import java.util.Date;

public class LoanInfo {
    private Integer id;

    private Integer devId;

    private Integer backendId;

    private Integer money;

    private Integer repayWork;

    private Integer yearRate;

    private Long interest;

    private Long takeInterest;

    private Long waitInterest;

    private Long overInterest;

    private Date borrowDate;

    private Date dueDate;

    private String overdue;

    private String remark;

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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getRepayWork() {
        return repayWork;
    }

    public void setRepayWork(Integer repayWork) {
        this.repayWork = repayWork;
    }

    public Integer getYearRate() {
        return yearRate;
    }

    public void setYearRate(Integer yearRate) {
        this.yearRate = yearRate;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public Long getTakeInterest() {
        return takeInterest;
    }

    public void setTakeInterest(Long takeInterest) {
        this.takeInterest = takeInterest;
    }

    public Long getWaitInterest() {
        return waitInterest;
    }

    public void setWaitInterest(Long waitInterest) {
        this.waitInterest = waitInterest;
    }

    public Long getOverInterest() {
        return overInterest;
    }

    public void setOverInterest(Long overInterest) {
        this.overInterest = overInterest;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}