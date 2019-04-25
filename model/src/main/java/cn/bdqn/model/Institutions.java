package cn.bdqn.model;

import java.util.Date;

public class Institutions {
    private Integer id;

    private Integer backendId;

    private String institutionName;

    private String productName;

    private String versionType;

    private Long deposit;

    private Long serviceCharge;

    private String remarks;

    private String merchantSituation;

    private Date createDate;

    private String institutionalStatus;

    private Integer accountLimit;

    private String riskSetting;

    private Long balance;
    private String name;

    private String phone;
    private String idCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBackendId() {
        return backendId;
    }

    public void setBackendId(Integer backendId) {
        this.backendId = backendId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public Long getDeposit() {
        return deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getMerchantSituation() {
        return merchantSituation;
    }

    public void setMerchantSituation(String merchantSituation) {
        this.merchantSituation = merchantSituation;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getInstitutionalStatus() {
        return institutionalStatus;
    }

    public void setInstitutionalStatus(String institutionalStatus) {
        this.institutionalStatus = institutionalStatus;
    }

    public Integer getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Integer accountLimit) {
        this.accountLimit = accountLimit;
    }

    public String getRiskSetting() {
        return riskSetting;
    }

    public void setRiskSetting(String riskSetting) {
        this.riskSetting = riskSetting;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}