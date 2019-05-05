package cn.bdqn.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pledge {
    private Integer id;

    private BigDecimal valuation;

    private BigDecimal transaction;

    private Date createDate;

    private String name;

    private Integer typeId;

    private Integer status;

    private Integer attn;

    private Integer company;

    private Integer variety;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValuation() {
        return valuation;
    }

    public void setValuation(BigDecimal valuation) {
        this.valuation = valuation;
    }

    public BigDecimal getTransaction() {
        return transaction;
    }

    public void setTransaction(BigDecimal transaction) {
        this.transaction = transaction;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAttn() {
        return attn;
    }

    public void setAttn(Integer attn) {
        this.attn = attn;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public Integer getVariety() {
        return variety;
    }

    public void setVariety(Integer variety) {
        this.variety = variety;
    }
}