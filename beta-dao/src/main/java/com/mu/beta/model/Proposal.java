package com.mu.beta.model;

import java.math.BigDecimal;
import java.util.Date;

public class Proposal {
    private Long id;

    private String proposalNo;

    private String insuranceProposalNo;

    private String policyNo;

    private String insurancePolicyNo;

    private String channelOrderNo;

    private String productCode;

    private String productName;

    private Integer multiPlan;

    private Boolean policyCategory;

    private Boolean policyProperty;

    private Boolean policyType;

    private Boolean holderType;

    private String holderName;

    private Boolean insuredType;

    private Boolean subjectType;

    private String insuranceCode;

    private String insuranceName;

    private Boolean businessType;

    private Boolean businessDetailType;

    private String userCode;

    private String userName;

    private Integer firstInsureMasterNum;

    private Integer firstInsureSlaveNum;

    private String industryCode;

    private String industryName;

    private String professionType;

    private String professionCode;

    private String professionName;

    private String cityCode;

    private String cityName;

    private Double premiumPrice;

    private Double sumPremium;

    private Double netPremium;

    private Double firstInsurePremium;

    private Double extraPremium;

    private Double rebatePercent;

    private Double rebatePremium;

    private Integer sumQuantity;

    private Date startDate;

    private Date endDate;

    private Boolean insureTimeUnit;

    private Double insureTime;

    private Boolean paymentType;

    private Date paymentTime;

    private Boolean paymentStatus;

    private Date paymentExpiredTime;

    private Date proposalTime;

    private Date insuranceProposalTime;

    private String checkerCode;

    private String checkerName;

    private String checkerMark;

    private Date checkTime;

    private Date insuranceInsureTime;

    private String insureDirections;

    private String policyDownloadUrl;

    private String policyQueryUrl;

    private String invoiceUrl;

    private String policySourceCode;

    private String policySourceName;

    private String sellChannelCode;

    private String sellChannelName;

    private Boolean invoiceType;

    private Boolean invoiceFormat;

    private Boolean invoiceBuyerType;

    private String businessBelongUserCode;

    private String businessBelongUserName;

    private String operationUserCode;

    private String operationUserName;

    private Boolean policyLevel;

    private Boolean onlinePreserve;

    private Boolean onlineRenewal;

    private Boolean continuedType;

    private Boolean continuedPolicyIs;

    private String continuedPolicyNo;

    private String continuedOriginalPolicyNo;

    private Boolean takeOverReceiveIs;

    private BigDecimal commissionDiscountPercent;

    private BigDecimal amount;

    private Boolean bigPolicy;

    private Boolean step;

    private Boolean status;

    private Boolean ledgerStatus;

    private Boolean refundStatus;

    private Boolean applicantType;

    private Boolean signStatus;

    private Boolean payType;

    private Boolean coinsuranceIs;

    private String salesCode;

    private String extendA;

    private String extendB;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProposalNo() {
        return proposalNo;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo == null ? null : proposalNo.trim();
    }

    public String getInsuranceProposalNo() {
        return insuranceProposalNo;
    }

    public void setInsuranceProposalNo(String insuranceProposalNo) {
        this.insuranceProposalNo = insuranceProposalNo == null ? null : insuranceProposalNo.trim();
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

    public Integer getMultiPlan() {
        return multiPlan;
    }

    public void setMultiPlan(Integer multiPlan) {
        this.multiPlan = multiPlan;
    }

    public Boolean getPolicyCategory() {
        return policyCategory;
    }

    public void setPolicyCategory(Boolean policyCategory) {
        this.policyCategory = policyCategory;
    }

    public Boolean getPolicyProperty() {
        return policyProperty;
    }

    public void setPolicyProperty(Boolean policyProperty) {
        this.policyProperty = policyProperty;
    }

    public Boolean getPolicyType() {
        return policyType;
    }

    public void setPolicyType(Boolean policyType) {
        this.policyType = policyType;
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

    public Boolean getInsuredType() {
        return insuredType;
    }

    public void setInsuredType(Boolean insuredType) {
        this.insuredType = insuredType;
    }

    public Boolean getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Boolean subjectType) {
        this.subjectType = subjectType;
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

    public Integer getFirstInsureMasterNum() {
        return firstInsureMasterNum;
    }

    public void setFirstInsureMasterNum(Integer firstInsureMasterNum) {
        this.firstInsureMasterNum = firstInsureMasterNum;
    }

    public Integer getFirstInsureSlaveNum() {
        return firstInsureSlaveNum;
    }

    public void setFirstInsureSlaveNum(Integer firstInsureSlaveNum) {
        this.firstInsureSlaveNum = firstInsureSlaveNum;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode == null ? null : industryCode.trim();
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public String getProfessionType() {
        return professionType;
    }

    public void setProfessionType(String professionType) {
        this.professionType = professionType == null ? null : professionType.trim();
    }

    public String getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(String professionCode) {
        this.professionCode = professionCode == null ? null : professionCode.trim();
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName == null ? null : professionName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Double getPremiumPrice() {
        return premiumPrice;
    }

    public void setPremiumPrice(Double premiumPrice) {
        this.premiumPrice = premiumPrice;
    }

    public Double getSumPremium() {
        return sumPremium;
    }

    public void setSumPremium(Double sumPremium) {
        this.sumPremium = sumPremium;
    }

    public Double getNetPremium() {
        return netPremium;
    }

    public void setNetPremium(Double netPremium) {
        this.netPremium = netPremium;
    }

    public Double getFirstInsurePremium() {
        return firstInsurePremium;
    }

    public void setFirstInsurePremium(Double firstInsurePremium) {
        this.firstInsurePremium = firstInsurePremium;
    }

    public Double getExtraPremium() {
        return extraPremium;
    }

    public void setExtraPremium(Double extraPremium) {
        this.extraPremium = extraPremium;
    }

    public Double getRebatePercent() {
        return rebatePercent;
    }

    public void setRebatePercent(Double rebatePercent) {
        this.rebatePercent = rebatePercent;
    }

    public Double getRebatePremium() {
        return rebatePremium;
    }

    public void setRebatePremium(Double rebatePremium) {
        this.rebatePremium = rebatePremium;
    }

    public Integer getSumQuantity() {
        return sumQuantity;
    }

    public void setSumQuantity(Integer sumQuantity) {
        this.sumQuantity = sumQuantity;
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

    public Boolean getInsureTimeUnit() {
        return insureTimeUnit;
    }

    public void setInsureTimeUnit(Boolean insureTimeUnit) {
        this.insureTimeUnit = insureTimeUnit;
    }

    public Double getInsureTime() {
        return insureTime;
    }

    public void setInsureTime(Double insureTime) {
        this.insureTime = insureTime;
    }

    public Boolean getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Boolean paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getPaymentExpiredTime() {
        return paymentExpiredTime;
    }

    public void setPaymentExpiredTime(Date paymentExpiredTime) {
        this.paymentExpiredTime = paymentExpiredTime;
    }

    public Date getProposalTime() {
        return proposalTime;
    }

    public void setProposalTime(Date proposalTime) {
        this.proposalTime = proposalTime;
    }

    public Date getInsuranceProposalTime() {
        return insuranceProposalTime;
    }

    public void setInsuranceProposalTime(Date insuranceProposalTime) {
        this.insuranceProposalTime = insuranceProposalTime;
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

    public String getCheckerMark() {
        return checkerMark;
    }

    public void setCheckerMark(String checkerMark) {
        this.checkerMark = checkerMark == null ? null : checkerMark.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getInsuranceInsureTime() {
        return insuranceInsureTime;
    }

    public void setInsuranceInsureTime(Date insuranceInsureTime) {
        this.insuranceInsureTime = insuranceInsureTime;
    }

    public String getInsureDirections() {
        return insureDirections;
    }

    public void setInsureDirections(String insureDirections) {
        this.insureDirections = insureDirections == null ? null : insureDirections.trim();
    }

    public String getPolicyDownloadUrl() {
        return policyDownloadUrl;
    }

    public void setPolicyDownloadUrl(String policyDownloadUrl) {
        this.policyDownloadUrl = policyDownloadUrl == null ? null : policyDownloadUrl.trim();
    }

    public String getPolicyQueryUrl() {
        return policyQueryUrl;
    }

    public void setPolicyQueryUrl(String policyQueryUrl) {
        this.policyQueryUrl = policyQueryUrl == null ? null : policyQueryUrl.trim();
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl == null ? null : invoiceUrl.trim();
    }

    public String getPolicySourceCode() {
        return policySourceCode;
    }

    public void setPolicySourceCode(String policySourceCode) {
        this.policySourceCode = policySourceCode == null ? null : policySourceCode.trim();
    }

    public String getPolicySourceName() {
        return policySourceName;
    }

    public void setPolicySourceName(String policySourceName) {
        this.policySourceName = policySourceName == null ? null : policySourceName.trim();
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

    public Boolean getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Boolean invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Boolean getInvoiceFormat() {
        return invoiceFormat;
    }

    public void setInvoiceFormat(Boolean invoiceFormat) {
        this.invoiceFormat = invoiceFormat;
    }

    public Boolean getInvoiceBuyerType() {
        return invoiceBuyerType;
    }

    public void setInvoiceBuyerType(Boolean invoiceBuyerType) {
        this.invoiceBuyerType = invoiceBuyerType;
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

    public String getOperationUserCode() {
        return operationUserCode;
    }

    public void setOperationUserCode(String operationUserCode) {
        this.operationUserCode = operationUserCode == null ? null : operationUserCode.trim();
    }

    public String getOperationUserName() {
        return operationUserName;
    }

    public void setOperationUserName(String operationUserName) {
        this.operationUserName = operationUserName == null ? null : operationUserName.trim();
    }

    public Boolean getPolicyLevel() {
        return policyLevel;
    }

    public void setPolicyLevel(Boolean policyLevel) {
        this.policyLevel = policyLevel;
    }

    public Boolean getOnlinePreserve() {
        return onlinePreserve;
    }

    public void setOnlinePreserve(Boolean onlinePreserve) {
        this.onlinePreserve = onlinePreserve;
    }

    public Boolean getOnlineRenewal() {
        return onlineRenewal;
    }

    public void setOnlineRenewal(Boolean onlineRenewal) {
        this.onlineRenewal = onlineRenewal;
    }

    public Boolean getContinuedType() {
        return continuedType;
    }

    public void setContinuedType(Boolean continuedType) {
        this.continuedType = continuedType;
    }

    public Boolean getContinuedPolicyIs() {
        return continuedPolicyIs;
    }

    public void setContinuedPolicyIs(Boolean continuedPolicyIs) {
        this.continuedPolicyIs = continuedPolicyIs;
    }

    public String getContinuedPolicyNo() {
        return continuedPolicyNo;
    }

    public void setContinuedPolicyNo(String continuedPolicyNo) {
        this.continuedPolicyNo = continuedPolicyNo == null ? null : continuedPolicyNo.trim();
    }

    public String getContinuedOriginalPolicyNo() {
        return continuedOriginalPolicyNo;
    }

    public void setContinuedOriginalPolicyNo(String continuedOriginalPolicyNo) {
        this.continuedOriginalPolicyNo = continuedOriginalPolicyNo == null ? null : continuedOriginalPolicyNo.trim();
    }

    public Boolean getTakeOverReceiveIs() {
        return takeOverReceiveIs;
    }

    public void setTakeOverReceiveIs(Boolean takeOverReceiveIs) {
        this.takeOverReceiveIs = takeOverReceiveIs;
    }

    public BigDecimal getCommissionDiscountPercent() {
        return commissionDiscountPercent;
    }

    public void setCommissionDiscountPercent(BigDecimal commissionDiscountPercent) {
        this.commissionDiscountPercent = commissionDiscountPercent;
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

    public Boolean getStep() {
        return step;
    }

    public void setStep(Boolean step) {
        this.step = step;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getLedgerStatus() {
        return ledgerStatus;
    }

    public void setLedgerStatus(Boolean ledgerStatus) {
        this.ledgerStatus = ledgerStatus;
    }

    public Boolean getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Boolean refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Boolean getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(Boolean applicantType) {
        this.applicantType = applicantType;
    }

    public Boolean getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Boolean signStatus) {
        this.signStatus = signStatus;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public Boolean getCoinsuranceIs() {
        return coinsuranceIs;
    }

    public void setCoinsuranceIs(Boolean coinsuranceIs) {
        this.coinsuranceIs = coinsuranceIs;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode == null ? null : salesCode.trim();
    }

    public String getExtendA() {
        return extendA;
    }

    public void setExtendA(String extendA) {
        this.extendA = extendA == null ? null : extendA.trim();
    }

    public String getExtendB() {
        return extendB;
    }

    public void setExtendB(String extendB) {
        this.extendB = extendB == null ? null : extendB.trim();
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