package com.mu.beta.model;

import java.math.BigDecimal;
import java.util.Date;

public class PolicyPreservation {
    private Long id;

    private String incDecOrderNo;

    private String policyNo;

    private String insurancePolicyNo;

    private String channelOrderNo;

    private String balanceNo;

    private Boolean preservationType;

    private String incReviseNo;

    private String decReviseNo;

    private Boolean businessType;

    private Boolean businessDetailType;

    private String productCode;

    private String productName;

    private String userCode;

    private String userName;

    private Integer multiPlan;

    private Boolean payType;

    private Boolean payStatus;

    private Date payTime;

    private Date payExpiredTime;

    private Integer incReviseSum;

    private BigDecimal incRevisePremium;

    private Integer decReviseSum;

    private BigDecimal decRevisePremium;

    private BigDecimal incDecPremium;

    private Date applyTime;

    private Date effectiveDate;

    private Date invalidDate;

    private String businessBelongUserCode;

    private String businessBelongUserName;

    private String remark;

    private Date startDate;

    private Date endDate;

    private String sellChannelCode;

    private String sellChannelName;

    private Boolean holderType;

    private String holderName;

    private String checkerCode;

    private String checkerName;

    private String checkComment;

    private Date checkTime;

    private String insuranceCode;

    private String insuranceName;

    private Date cancelTime;

    private Boolean status;

    private BigDecimal amount;

    private Boolean bigPolicy;

    private Boolean paymentType;

    private Boolean coinsuranceIs;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncDecOrderNo() {
        return incDecOrderNo;
    }

    public void setIncDecOrderNo(String incDecOrderNo) {
        this.incDecOrderNo = incDecOrderNo == null ? null : incDecOrderNo.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public String getInsurancePolicyNo() {
        return insurancePolicyNo;
    }

    public void setInsurancePolicyNo(String insurancePolicyNo) {
        this.insurancePolicyNo = insurancePolicyNo == null ? null : insurancePolicyNo.trim();
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo == null ? null : channelOrderNo.trim();
    }

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo == null ? null : balanceNo.trim();
    }

    public Boolean getPreservationType() {
        return preservationType;
    }

    public void setPreservationType(Boolean preservationType) {
        this.preservationType = preservationType;
    }

    public String getIncReviseNo() {
        return incReviseNo;
    }

    public void setIncReviseNo(String incReviseNo) {
        this.incReviseNo = incReviseNo == null ? null : incReviseNo.trim();
    }

    public String getDecReviseNo() {
        return decReviseNo;
    }

    public void setDecReviseNo(String decReviseNo) {
        this.decReviseNo = decReviseNo == null ? null : decReviseNo.trim();
    }

    public Boolean getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Boolean businessType) {
        this.businessType = businessType;
    }

    public Boolean getBusinessDetailType() {
        return businessDetailType;
    }

    public void setBusinessDetailType(Boolean businessDetailType) {
        this.businessDetailType = businessDetailType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getMultiPlan() {
        return multiPlan;
    }

    public void setMultiPlan(Integer multiPlan) {
        this.multiPlan = multiPlan;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPayExpiredTime() {
        return payExpiredTime;
    }

    public void setPayExpiredTime(Date payExpiredTime) {
        this.payExpiredTime = payExpiredTime;
    }

    public Integer getIncReviseSum() {
        return incReviseSum;
    }

    public void setIncReviseSum(Integer incReviseSum) {
        this.incReviseSum = incReviseSum;
    }

    public BigDecimal getIncRevisePremium() {
        return incRevisePremium;
    }

    public void setIncRevisePremium(BigDecimal incRevisePremium) {
        this.incRevisePremium = incRevisePremium;
    }

    public Integer getDecReviseSum() {
        return decReviseSum;
    }

    public void setDecReviseSum(Integer decReviseSum) {
        this.decReviseSum = decReviseSum;
    }

    public BigDecimal getDecRevisePremium() {
        return decRevisePremium;
    }

    public void setDecRevisePremium(BigDecimal decRevisePremium) {
        this.decRevisePremium = decRevisePremium;
    }

    public BigDecimal getIncDecPremium() {
        return incDecPremium;
    }

    public void setIncDecPremium(BigDecimal incDecPremium) {
        this.incDecPremium = incDecPremium;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getBusinessBelongUserCode() {
        return businessBelongUserCode;
    }

    public void setBusinessBelongUserCode(String businessBelongUserCode) {
        this.businessBelongUserCode = businessBelongUserCode == null ? null : businessBelongUserCode.trim();
    }

    public String getBusinessBelongUserName() {
        return businessBelongUserName;
    }

    public void setBusinessBelongUserName(String businessBelongUserName) {
        this.businessBelongUserName = businessBelongUserName == null ? null : businessBelongUserName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getSellChannelCode() {
        return sellChannelCode;
    }

    public void setSellChannelCode(String sellChannelCode) {
        this.sellChannelCode = sellChannelCode == null ? null : sellChannelCode.trim();
    }

    public String getSellChannelName() {
        return sellChannelName;
    }

    public void setSellChannelName(String sellChannelName) {
        this.sellChannelName = sellChannelName == null ? null : sellChannelName.trim();
    }

    public Boolean getHolderType() {
        return holderType;
    }

    public void setHolderType(Boolean holderType) {
        this.holderType = holderType;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName == null ? null : holderName.trim();
    }

    public String getCheckerCode() {
        return checkerCode;
    }

    public void setCheckerCode(String checkerCode) {
        this.checkerCode = checkerCode == null ? null : checkerCode.trim();
    }

    public String getCheckerName() {
        return checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName == null ? null : checkerName.trim();
    }

    public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment == null ? null : checkComment.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode == null ? null : insuranceCode.trim();
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName == null ? null : insuranceName.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getBigPolicy() {
        return bigPolicy;
    }

    public void setBigPolicy(Boolean bigPolicy) {
        this.bigPolicy = bigPolicy;
    }

    public Boolean getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Boolean paymentType) {
        this.paymentType = paymentType;
    }

    public Boolean getCoinsuranceIs() {
        return coinsuranceIs;
    }

    public void setCoinsuranceIs(Boolean coinsuranceIs) {
        this.coinsuranceIs = coinsuranceIs;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}