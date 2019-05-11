package cn.bdqn.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pledge {
    private Integer id;

    private BigDecimal valuation;

    private BigDecimal transaction;

    private Date createDate;

    private String name;

    private Integer status;

    private Integer attn;

    private Integer company;
    private Integer duId;
    private Integer variety;
    private String typeName;
    private String statusName;
    private String attnName;
    private String companyName;
    private String varietyName;
    private String remark;
    private DevUser devUser;

    public Integer getDuId() {
        return duId;
    }

    public void setDuId(Integer duId) {
        this.duId = duId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DevUser getDevUser() {
        return devUser;
    }

    public void setDevUser(DevUser devUser) {
        this.devUser = devUser;
    }

    public String getVarietyName() {
        return varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getAttnName() {
        return attnName;
    }

    public void setAttnName(String attnName) {
        this.attnName = attnName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

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