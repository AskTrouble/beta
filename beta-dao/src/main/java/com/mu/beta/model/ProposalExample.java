package com.mu.beta.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProposalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProposalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProposalNoIsNull() {
            addCriterion("proposal_no is null");
            return (Criteria) this;
        }

        public Criteria andProposalNoIsNotNull() {
            addCriterion("proposal_no is not null");
            return (Criteria) this;
        }

        public Criteria andProposalNoEqualTo(String value) {
            addCriterion("proposal_no =", value, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoNotEqualTo(String value) {
            addCriterion("proposal_no <>", value, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoGreaterThan(String value) {
            addCriterion("proposal_no >", value, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoGreaterThanOrEqualTo(String value) {
            addCriterion("proposal_no >=", value, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoLessThan(String value) {
            addCriterion("proposal_no <", value, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoLessThanOrEqualTo(String value) {
            addCriterion("proposal_no <=", value, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoLike(String value) {
            addCriterion("proposal_no like", value, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoNotLike(String value) {
            addCriterion("proposal_no not like", value, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoIn(List<String> values) {
            addCriterion("proposal_no in", values, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoNotIn(List<String> values) {
            addCriterion("proposal_no not in", values, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoBetween(String value1, String value2) {
            addCriterion("proposal_no between", value1, value2, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andProposalNoNotBetween(String value1, String value2) {
            addCriterion("proposal_no not between", value1, value2, "proposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoIsNull() {
            addCriterion("insurance_proposal_no is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoIsNotNull() {
            addCriterion("insurance_proposal_no is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoEqualTo(String value) {
            addCriterion("insurance_proposal_no =", value, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoNotEqualTo(String value) {
            addCriterion("insurance_proposal_no <>", value, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoGreaterThan(String value) {
            addCriterion("insurance_proposal_no >", value, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_proposal_no >=", value, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoLessThan(String value) {
            addCriterion("insurance_proposal_no <", value, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoLessThanOrEqualTo(String value) {
            addCriterion("insurance_proposal_no <=", value, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoLike(String value) {
            addCriterion("insurance_proposal_no like", value, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoNotLike(String value) {
            addCriterion("insurance_proposal_no not like", value, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoIn(List<String> values) {
            addCriterion("insurance_proposal_no in", values, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoNotIn(List<String> values) {
            addCriterion("insurance_proposal_no not in", values, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoBetween(String value1, String value2) {
            addCriterion("insurance_proposal_no between", value1, value2, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalNoNotBetween(String value1, String value2) {
            addCriterion("insurance_proposal_no not between", value1, value2, "insuranceProposalNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIsNull() {
            addCriterion("policy_no is null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIsNotNull() {
            addCriterion("policy_no is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoEqualTo(String value) {
            addCriterion("policy_no =", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotEqualTo(String value) {
            addCriterion("policy_no <>", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoGreaterThan(String value) {
            addCriterion("policy_no >", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoGreaterThanOrEqualTo(String value) {
            addCriterion("policy_no >=", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLessThan(String value) {
            addCriterion("policy_no <", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLessThanOrEqualTo(String value) {
            addCriterion("policy_no <=", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLike(String value) {
            addCriterion("policy_no like", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotLike(String value) {
            addCriterion("policy_no not like", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIn(List<String> values) {
            addCriterion("policy_no in", values, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotIn(List<String> values) {
            addCriterion("policy_no not in", values, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoBetween(String value1, String value2) {
            addCriterion("policy_no between", value1, value2, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotBetween(String value1, String value2) {
            addCriterion("policy_no not between", value1, value2, "policyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoIsNull() {
            addCriterion("insurance_policy_no is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoIsNotNull() {
            addCriterion("insurance_policy_no is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoEqualTo(String value) {
            addCriterion("insurance_policy_no =", value, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoNotEqualTo(String value) {
            addCriterion("insurance_policy_no <>", value, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoGreaterThan(String value) {
            addCriterion("insurance_policy_no >", value, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_policy_no >=", value, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoLessThan(String value) {
            addCriterion("insurance_policy_no <", value, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoLessThanOrEqualTo(String value) {
            addCriterion("insurance_policy_no <=", value, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoLike(String value) {
            addCriterion("insurance_policy_no like", value, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoNotLike(String value) {
            addCriterion("insurance_policy_no not like", value, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoIn(List<String> values) {
            addCriterion("insurance_policy_no in", values, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoNotIn(List<String> values) {
            addCriterion("insurance_policy_no not in", values, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoBetween(String value1, String value2) {
            addCriterion("insurance_policy_no between", value1, value2, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNoNotBetween(String value1, String value2) {
            addCriterion("insurance_policy_no not between", value1, value2, "insurancePolicyNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoIsNull() {
            addCriterion("channel_order_no is null");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoIsNotNull() {
            addCriterion("channel_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoEqualTo(String value) {
            addCriterion("channel_order_no =", value, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoNotEqualTo(String value) {
            addCriterion("channel_order_no <>", value, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoGreaterThan(String value) {
            addCriterion("channel_order_no >", value, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("channel_order_no >=", value, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoLessThan(String value) {
            addCriterion("channel_order_no <", value, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoLessThanOrEqualTo(String value) {
            addCriterion("channel_order_no <=", value, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoLike(String value) {
            addCriterion("channel_order_no like", value, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoNotLike(String value) {
            addCriterion("channel_order_no not like", value, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoIn(List<String> values) {
            addCriterion("channel_order_no in", values, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoNotIn(List<String> values) {
            addCriterion("channel_order_no not in", values, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoBetween(String value1, String value2) {
            addCriterion("channel_order_no between", value1, value2, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNoNotBetween(String value1, String value2) {
            addCriterion("channel_order_no not between", value1, value2, "channelOrderNo");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andMultiPlanIsNull() {
            addCriterion("multi_plan is null");
            return (Criteria) this;
        }

        public Criteria andMultiPlanIsNotNull() {
            addCriterion("multi_plan is not null");
            return (Criteria) this;
        }

        public Criteria andMultiPlanEqualTo(Integer value) {
            addCriterion("multi_plan =", value, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanNotEqualTo(Integer value) {
            addCriterion("multi_plan <>", value, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanGreaterThan(Integer value) {
            addCriterion("multi_plan >", value, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanGreaterThanOrEqualTo(Integer value) {
            addCriterion("multi_plan >=", value, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanLessThan(Integer value) {
            addCriterion("multi_plan <", value, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanLessThanOrEqualTo(Integer value) {
            addCriterion("multi_plan <=", value, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanIn(List<Integer> values) {
            addCriterion("multi_plan in", values, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanNotIn(List<Integer> values) {
            addCriterion("multi_plan not in", values, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanBetween(Integer value1, Integer value2) {
            addCriterion("multi_plan between", value1, value2, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andMultiPlanNotBetween(Integer value1, Integer value2) {
            addCriterion("multi_plan not between", value1, value2, "multiPlan");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryIsNull() {
            addCriterion("policy_category is null");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryIsNotNull() {
            addCriterion("policy_category is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryEqualTo(Boolean value) {
            addCriterion("policy_category =", value, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryNotEqualTo(Boolean value) {
            addCriterion("policy_category <>", value, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryGreaterThan(Boolean value) {
            addCriterion("policy_category >", value, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("policy_category >=", value, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryLessThan(Boolean value) {
            addCriterion("policy_category <", value, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryLessThanOrEqualTo(Boolean value) {
            addCriterion("policy_category <=", value, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryIn(List<Boolean> values) {
            addCriterion("policy_category in", values, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryNotIn(List<Boolean> values) {
            addCriterion("policy_category not in", values, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryBetween(Boolean value1, Boolean value2) {
            addCriterion("policy_category between", value1, value2, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyCategoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("policy_category not between", value1, value2, "policyCategory");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyIsNull() {
            addCriterion("policy_property is null");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyIsNotNull() {
            addCriterion("policy_property is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyEqualTo(Boolean value) {
            addCriterion("policy_property =", value, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyNotEqualTo(Boolean value) {
            addCriterion("policy_property <>", value, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyGreaterThan(Boolean value) {
            addCriterion("policy_property >", value, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("policy_property >=", value, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyLessThan(Boolean value) {
            addCriterion("policy_property <", value, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyLessThanOrEqualTo(Boolean value) {
            addCriterion("policy_property <=", value, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyIn(List<Boolean> values) {
            addCriterion("policy_property in", values, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyNotIn(List<Boolean> values) {
            addCriterion("policy_property not in", values, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyBetween(Boolean value1, Boolean value2) {
            addCriterion("policy_property between", value1, value2, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyPropertyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("policy_property not between", value1, value2, "policyProperty");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeIsNull() {
            addCriterion("policy_type is null");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeIsNotNull() {
            addCriterion("policy_type is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeEqualTo(Boolean value) {
            addCriterion("policy_type =", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeNotEqualTo(Boolean value) {
            addCriterion("policy_type <>", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeGreaterThan(Boolean value) {
            addCriterion("policy_type >", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("policy_type >=", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeLessThan(Boolean value) {
            addCriterion("policy_type <", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("policy_type <=", value, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeIn(List<Boolean> values) {
            addCriterion("policy_type in", values, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeNotIn(List<Boolean> values) {
            addCriterion("policy_type not in", values, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("policy_type between", value1, value2, "policyType");
            return (Criteria) this;
        }

        public Criteria andPolicyTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("policy_type not between", value1, value2, "policyType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeIsNull() {
            addCriterion("holder_type is null");
            return (Criteria) this;
        }

        public Criteria andHolderTypeIsNotNull() {
            addCriterion("holder_type is not null");
            return (Criteria) this;
        }

        public Criteria andHolderTypeEqualTo(Boolean value) {
            addCriterion("holder_type =", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNotEqualTo(Boolean value) {
            addCriterion("holder_type <>", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeGreaterThan(Boolean value) {
            addCriterion("holder_type >", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("holder_type >=", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeLessThan(Boolean value) {
            addCriterion("holder_type <", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("holder_type <=", value, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeIn(List<Boolean> values) {
            addCriterion("holder_type in", values, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNotIn(List<Boolean> values) {
            addCriterion("holder_type not in", values, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("holder_type between", value1, value2, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("holder_type not between", value1, value2, "holderType");
            return (Criteria) this;
        }

        public Criteria andHolderNameIsNull() {
            addCriterion("holder_name is null");
            return (Criteria) this;
        }

        public Criteria andHolderNameIsNotNull() {
            addCriterion("holder_name is not null");
            return (Criteria) this;
        }

        public Criteria andHolderNameEqualTo(String value) {
            addCriterion("holder_name =", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotEqualTo(String value) {
            addCriterion("holder_name <>", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameGreaterThan(String value) {
            addCriterion("holder_name >", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameGreaterThanOrEqualTo(String value) {
            addCriterion("holder_name >=", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLessThan(String value) {
            addCriterion("holder_name <", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLessThanOrEqualTo(String value) {
            addCriterion("holder_name <=", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLike(String value) {
            addCriterion("holder_name like", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotLike(String value) {
            addCriterion("holder_name not like", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameIn(List<String> values) {
            addCriterion("holder_name in", values, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotIn(List<String> values) {
            addCriterion("holder_name not in", values, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameBetween(String value1, String value2) {
            addCriterion("holder_name between", value1, value2, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotBetween(String value1, String value2) {
            addCriterion("holder_name not between", value1, value2, "holderName");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeIsNull() {
            addCriterion("insured_type is null");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeIsNotNull() {
            addCriterion("insured_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeEqualTo(Boolean value) {
            addCriterion("insured_type =", value, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeNotEqualTo(Boolean value) {
            addCriterion("insured_type <>", value, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeGreaterThan(Boolean value) {
            addCriterion("insured_type >", value, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("insured_type >=", value, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeLessThan(Boolean value) {
            addCriterion("insured_type <", value, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("insured_type <=", value, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeIn(List<Boolean> values) {
            addCriterion("insured_type in", values, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeNotIn(List<Boolean> values) {
            addCriterion("insured_type not in", values, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("insured_type between", value1, value2, "insuredType");
            return (Criteria) this;
        }

        public Criteria andInsuredTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("insured_type not between", value1, value2, "insuredType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIsNull() {
            addCriterion("subject_type is null");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIsNotNull() {
            addCriterion("subject_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeEqualTo(Boolean value) {
            addCriterion("subject_type =", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeNotEqualTo(Boolean value) {
            addCriterion("subject_type <>", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeGreaterThan(Boolean value) {
            addCriterion("subject_type >", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subject_type >=", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeLessThan(Boolean value) {
            addCriterion("subject_type <", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("subject_type <=", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIn(List<Boolean> values) {
            addCriterion("subject_type in", values, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeNotIn(List<Boolean> values) {
            addCriterion("subject_type not in", values, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("subject_type between", value1, value2, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subject_type not between", value1, value2, "subjectType");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIsNull() {
            addCriterion("insurance_code is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIsNotNull() {
            addCriterion("insurance_code is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeEqualTo(String value) {
            addCriterion("insurance_code =", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotEqualTo(String value) {
            addCriterion("insurance_code <>", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeGreaterThan(String value) {
            addCriterion("insurance_code >", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_code >=", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLessThan(String value) {
            addCriterion("insurance_code <", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLessThanOrEqualTo(String value) {
            addCriterion("insurance_code <=", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLike(String value) {
            addCriterion("insurance_code like", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotLike(String value) {
            addCriterion("insurance_code not like", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIn(List<String> values) {
            addCriterion("insurance_code in", values, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotIn(List<String> values) {
            addCriterion("insurance_code not in", values, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeBetween(String value1, String value2) {
            addCriterion("insurance_code between", value1, value2, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotBetween(String value1, String value2) {
            addCriterion("insurance_code not between", value1, value2, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNull() {
            addCriterion("insurance_name is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNotNull() {
            addCriterion("insurance_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameEqualTo(String value) {
            addCriterion("insurance_name =", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotEqualTo(String value) {
            addCriterion("insurance_name <>", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThan(String value) {
            addCriterion("insurance_name >", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_name >=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThan(String value) {
            addCriterion("insurance_name <", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThanOrEqualTo(String value) {
            addCriterion("insurance_name <=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLike(String value) {
            addCriterion("insurance_name like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotLike(String value) {
            addCriterion("insurance_name not like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIn(List<String> values) {
            addCriterion("insurance_name in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotIn(List<String> values) {
            addCriterion("insurance_name not in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameBetween(String value1, String value2) {
            addCriterion("insurance_name between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotBetween(String value1, String value2) {
            addCriterion("insurance_name not between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Boolean value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Boolean value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Boolean value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Boolean value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Boolean> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Boolean> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeIsNull() {
            addCriterion("business_detail_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeIsNotNull() {
            addCriterion("business_detail_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeEqualTo(Boolean value) {
            addCriterion("business_detail_type =", value, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeNotEqualTo(Boolean value) {
            addCriterion("business_detail_type <>", value, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeGreaterThan(Boolean value) {
            addCriterion("business_detail_type >", value, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("business_detail_type >=", value, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeLessThan(Boolean value) {
            addCriterion("business_detail_type <", value, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("business_detail_type <=", value, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeIn(List<Boolean> values) {
            addCriterion("business_detail_type in", values, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeNotIn(List<Boolean> values) {
            addCriterion("business_detail_type not in", values, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("business_detail_type between", value1, value2, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andBusinessDetailTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("business_detail_type not between", value1, value2, "businessDetailType");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumIsNull() {
            addCriterion("first_insure_master_num is null");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumIsNotNull() {
            addCriterion("first_insure_master_num is not null");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumEqualTo(Integer value) {
            addCriterion("first_insure_master_num =", value, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumNotEqualTo(Integer value) {
            addCriterion("first_insure_master_num <>", value, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumGreaterThan(Integer value) {
            addCriterion("first_insure_master_num >", value, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_insure_master_num >=", value, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumLessThan(Integer value) {
            addCriterion("first_insure_master_num <", value, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumLessThanOrEqualTo(Integer value) {
            addCriterion("first_insure_master_num <=", value, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumIn(List<Integer> values) {
            addCriterion("first_insure_master_num in", values, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumNotIn(List<Integer> values) {
            addCriterion("first_insure_master_num not in", values, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumBetween(Integer value1, Integer value2) {
            addCriterion("first_insure_master_num between", value1, value2, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureMasterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("first_insure_master_num not between", value1, value2, "firstInsureMasterNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumIsNull() {
            addCriterion("first_insure_slave_num is null");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumIsNotNull() {
            addCriterion("first_insure_slave_num is not null");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumEqualTo(Integer value) {
            addCriterion("first_insure_slave_num =", value, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumNotEqualTo(Integer value) {
            addCriterion("first_insure_slave_num <>", value, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumGreaterThan(Integer value) {
            addCriterion("first_insure_slave_num >", value, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_insure_slave_num >=", value, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumLessThan(Integer value) {
            addCriterion("first_insure_slave_num <", value, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumLessThanOrEqualTo(Integer value) {
            addCriterion("first_insure_slave_num <=", value, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumIn(List<Integer> values) {
            addCriterion("first_insure_slave_num in", values, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumNotIn(List<Integer> values) {
            addCriterion("first_insure_slave_num not in", values, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumBetween(Integer value1, Integer value2) {
            addCriterion("first_insure_slave_num between", value1, value2, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andFirstInsureSlaveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("first_insure_slave_num not between", value1, value2, "firstInsureSlaveNum");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNull() {
            addCriterion("industry_code is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNotNull() {
            addCriterion("industry_code is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeEqualTo(String value) {
            addCriterion("industry_code =", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotEqualTo(String value) {
            addCriterion("industry_code <>", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThan(String value) {
            addCriterion("industry_code >", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("industry_code >=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThan(String value) {
            addCriterion("industry_code <", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThanOrEqualTo(String value) {
            addCriterion("industry_code <=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLike(String value) {
            addCriterion("industry_code like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotLike(String value) {
            addCriterion("industry_code not like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIn(List<String> values) {
            addCriterion("industry_code in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotIn(List<String> values) {
            addCriterion("industry_code not in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeBetween(String value1, String value2) {
            addCriterion("industry_code between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotBetween(String value1, String value2) {
            addCriterion("industry_code not between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNull() {
            addCriterion("industry_name is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNotNull() {
            addCriterion("industry_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameEqualTo(String value) {
            addCriterion("industry_name =", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotEqualTo(String value) {
            addCriterion("industry_name <>", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThan(String value) {
            addCriterion("industry_name >", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThanOrEqualTo(String value) {
            addCriterion("industry_name >=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThan(String value) {
            addCriterion("industry_name <", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThanOrEqualTo(String value) {
            addCriterion("industry_name <=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLike(String value) {
            addCriterion("industry_name like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotLike(String value) {
            addCriterion("industry_name not like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIn(List<String> values) {
            addCriterion("industry_name in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotIn(List<String> values) {
            addCriterion("industry_name not in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameBetween(String value1, String value2) {
            addCriterion("industry_name between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotBetween(String value1, String value2) {
            addCriterion("industry_name not between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeIsNull() {
            addCriterion("profession_type is null");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeIsNotNull() {
            addCriterion("profession_type is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeEqualTo(String value) {
            addCriterion("profession_type =", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeNotEqualTo(String value) {
            addCriterion("profession_type <>", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeGreaterThan(String value) {
            addCriterion("profession_type >", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("profession_type >=", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeLessThan(String value) {
            addCriterion("profession_type <", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeLessThanOrEqualTo(String value) {
            addCriterion("profession_type <=", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeLike(String value) {
            addCriterion("profession_type like", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeNotLike(String value) {
            addCriterion("profession_type not like", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeIn(List<String> values) {
            addCriterion("profession_type in", values, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeNotIn(List<String> values) {
            addCriterion("profession_type not in", values, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeBetween(String value1, String value2) {
            addCriterion("profession_type between", value1, value2, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeNotBetween(String value1, String value2) {
            addCriterion("profession_type not between", value1, value2, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeIsNull() {
            addCriterion("profession_code is null");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeIsNotNull() {
            addCriterion("profession_code is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeEqualTo(String value) {
            addCriterion("profession_code =", value, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeNotEqualTo(String value) {
            addCriterion("profession_code <>", value, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeGreaterThan(String value) {
            addCriterion("profession_code >", value, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("profession_code >=", value, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeLessThan(String value) {
            addCriterion("profession_code <", value, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeLessThanOrEqualTo(String value) {
            addCriterion("profession_code <=", value, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeLike(String value) {
            addCriterion("profession_code like", value, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeNotLike(String value) {
            addCriterion("profession_code not like", value, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeIn(List<String> values) {
            addCriterion("profession_code in", values, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeNotIn(List<String> values) {
            addCriterion("profession_code not in", values, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeBetween(String value1, String value2) {
            addCriterion("profession_code between", value1, value2, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionCodeNotBetween(String value1, String value2) {
            addCriterion("profession_code not between", value1, value2, "professionCode");
            return (Criteria) this;
        }

        public Criteria andProfessionNameIsNull() {
            addCriterion("profession_name is null");
            return (Criteria) this;
        }

        public Criteria andProfessionNameIsNotNull() {
            addCriterion("profession_name is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionNameEqualTo(String value) {
            addCriterion("profession_name =", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameNotEqualTo(String value) {
            addCriterion("profession_name <>", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameGreaterThan(String value) {
            addCriterion("profession_name >", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameGreaterThanOrEqualTo(String value) {
            addCriterion("profession_name >=", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameLessThan(String value) {
            addCriterion("profession_name <", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameLessThanOrEqualTo(String value) {
            addCriterion("profession_name <=", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameLike(String value) {
            addCriterion("profession_name like", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameNotLike(String value) {
            addCriterion("profession_name not like", value, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameIn(List<String> values) {
            addCriterion("profession_name in", values, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameNotIn(List<String> values) {
            addCriterion("profession_name not in", values, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameBetween(String value1, String value2) {
            addCriterion("profession_name between", value1, value2, "professionName");
            return (Criteria) this;
        }

        public Criteria andProfessionNameNotBetween(String value1, String value2) {
            addCriterion("profession_name not between", value1, value2, "professionName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceIsNull() {
            addCriterion("premium_price is null");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceIsNotNull() {
            addCriterion("premium_price is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceEqualTo(Double value) {
            addCriterion("premium_price =", value, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceNotEqualTo(Double value) {
            addCriterion("premium_price <>", value, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceGreaterThan(Double value) {
            addCriterion("premium_price >", value, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("premium_price >=", value, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceLessThan(Double value) {
            addCriterion("premium_price <", value, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceLessThanOrEqualTo(Double value) {
            addCriterion("premium_price <=", value, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceIn(List<Double> values) {
            addCriterion("premium_price in", values, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceNotIn(List<Double> values) {
            addCriterion("premium_price not in", values, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceBetween(Double value1, Double value2) {
            addCriterion("premium_price between", value1, value2, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andPremiumPriceNotBetween(Double value1, Double value2) {
            addCriterion("premium_price not between", value1, value2, "premiumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPremiumIsNull() {
            addCriterion("sum_premium is null");
            return (Criteria) this;
        }

        public Criteria andSumPremiumIsNotNull() {
            addCriterion("sum_premium is not null");
            return (Criteria) this;
        }

        public Criteria andSumPremiumEqualTo(Double value) {
            addCriterion("sum_premium =", value, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumNotEqualTo(Double value) {
            addCriterion("sum_premium <>", value, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumGreaterThan(Double value) {
            addCriterion("sum_premium >", value, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_premium >=", value, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumLessThan(Double value) {
            addCriterion("sum_premium <", value, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumLessThanOrEqualTo(Double value) {
            addCriterion("sum_premium <=", value, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumIn(List<Double> values) {
            addCriterion("sum_premium in", values, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumNotIn(List<Double> values) {
            addCriterion("sum_premium not in", values, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumBetween(Double value1, Double value2) {
            addCriterion("sum_premium between", value1, value2, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andSumPremiumNotBetween(Double value1, Double value2) {
            addCriterion("sum_premium not between", value1, value2, "sumPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumIsNull() {
            addCriterion("net_premium is null");
            return (Criteria) this;
        }

        public Criteria andNetPremiumIsNotNull() {
            addCriterion("net_premium is not null");
            return (Criteria) this;
        }

        public Criteria andNetPremiumEqualTo(Double value) {
            addCriterion("net_premium =", value, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumNotEqualTo(Double value) {
            addCriterion("net_premium <>", value, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumGreaterThan(Double value) {
            addCriterion("net_premium >", value, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumGreaterThanOrEqualTo(Double value) {
            addCriterion("net_premium >=", value, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumLessThan(Double value) {
            addCriterion("net_premium <", value, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumLessThanOrEqualTo(Double value) {
            addCriterion("net_premium <=", value, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumIn(List<Double> values) {
            addCriterion("net_premium in", values, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumNotIn(List<Double> values) {
            addCriterion("net_premium not in", values, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumBetween(Double value1, Double value2) {
            addCriterion("net_premium between", value1, value2, "netPremium");
            return (Criteria) this;
        }

        public Criteria andNetPremiumNotBetween(Double value1, Double value2) {
            addCriterion("net_premium not between", value1, value2, "netPremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumIsNull() {
            addCriterion("first_insure_premium is null");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumIsNotNull() {
            addCriterion("first_insure_premium is not null");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumEqualTo(Double value) {
            addCriterion("first_insure_premium =", value, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumNotEqualTo(Double value) {
            addCriterion("first_insure_premium <>", value, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumGreaterThan(Double value) {
            addCriterion("first_insure_premium >", value, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumGreaterThanOrEqualTo(Double value) {
            addCriterion("first_insure_premium >=", value, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumLessThan(Double value) {
            addCriterion("first_insure_premium <", value, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumLessThanOrEqualTo(Double value) {
            addCriterion("first_insure_premium <=", value, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumIn(List<Double> values) {
            addCriterion("first_insure_premium in", values, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumNotIn(List<Double> values) {
            addCriterion("first_insure_premium not in", values, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumBetween(Double value1, Double value2) {
            addCriterion("first_insure_premium between", value1, value2, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andFirstInsurePremiumNotBetween(Double value1, Double value2) {
            addCriterion("first_insure_premium not between", value1, value2, "firstInsurePremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumIsNull() {
            addCriterion("extra_premium is null");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumIsNotNull() {
            addCriterion("extra_premium is not null");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumEqualTo(Double value) {
            addCriterion("extra_premium =", value, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumNotEqualTo(Double value) {
            addCriterion("extra_premium <>", value, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumGreaterThan(Double value) {
            addCriterion("extra_premium >", value, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumGreaterThanOrEqualTo(Double value) {
            addCriterion("extra_premium >=", value, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumLessThan(Double value) {
            addCriterion("extra_premium <", value, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumLessThanOrEqualTo(Double value) {
            addCriterion("extra_premium <=", value, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumIn(List<Double> values) {
            addCriterion("extra_premium in", values, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumNotIn(List<Double> values) {
            addCriterion("extra_premium not in", values, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumBetween(Double value1, Double value2) {
            addCriterion("extra_premium between", value1, value2, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andExtraPremiumNotBetween(Double value1, Double value2) {
            addCriterion("extra_premium not between", value1, value2, "extraPremium");
            return (Criteria) this;
        }

        public Criteria andRebatePercentIsNull() {
            addCriterion("rebate_percent is null");
            return (Criteria) this;
        }

        public Criteria andRebatePercentIsNotNull() {
            addCriterion("rebate_percent is not null");
            return (Criteria) this;
        }

        public Criteria andRebatePercentEqualTo(Double value) {
            addCriterion("rebate_percent =", value, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentNotEqualTo(Double value) {
            addCriterion("rebate_percent <>", value, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentGreaterThan(Double value) {
            addCriterion("rebate_percent >", value, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentGreaterThanOrEqualTo(Double value) {
            addCriterion("rebate_percent >=", value, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentLessThan(Double value) {
            addCriterion("rebate_percent <", value, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentLessThanOrEqualTo(Double value) {
            addCriterion("rebate_percent <=", value, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentIn(List<Double> values) {
            addCriterion("rebate_percent in", values, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentNotIn(List<Double> values) {
            addCriterion("rebate_percent not in", values, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentBetween(Double value1, Double value2) {
            addCriterion("rebate_percent between", value1, value2, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePercentNotBetween(Double value1, Double value2) {
            addCriterion("rebate_percent not between", value1, value2, "rebatePercent");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumIsNull() {
            addCriterion("rebate_premium is null");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumIsNotNull() {
            addCriterion("rebate_premium is not null");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumEqualTo(Double value) {
            addCriterion("rebate_premium =", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumNotEqualTo(Double value) {
            addCriterion("rebate_premium <>", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumGreaterThan(Double value) {
            addCriterion("rebate_premium >", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumGreaterThanOrEqualTo(Double value) {
            addCriterion("rebate_premium >=", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumLessThan(Double value) {
            addCriterion("rebate_premium <", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumLessThanOrEqualTo(Double value) {
            addCriterion("rebate_premium <=", value, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumIn(List<Double> values) {
            addCriterion("rebate_premium in", values, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumNotIn(List<Double> values) {
            addCriterion("rebate_premium not in", values, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumBetween(Double value1, Double value2) {
            addCriterion("rebate_premium between", value1, value2, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andRebatePremiumNotBetween(Double value1, Double value2) {
            addCriterion("rebate_premium not between", value1, value2, "rebatePremium");
            return (Criteria) this;
        }

        public Criteria andSumQuantityIsNull() {
            addCriterion("sum_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSumQuantityIsNotNull() {
            addCriterion("sum_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSumQuantityEqualTo(Integer value) {
            addCriterion("sum_quantity =", value, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityNotEqualTo(Integer value) {
            addCriterion("sum_quantity <>", value, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityGreaterThan(Integer value) {
            addCriterion("sum_quantity >", value, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_quantity >=", value, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityLessThan(Integer value) {
            addCriterion("sum_quantity <", value, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("sum_quantity <=", value, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityIn(List<Integer> values) {
            addCriterion("sum_quantity in", values, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityNotIn(List<Integer> values) {
            addCriterion("sum_quantity not in", values, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityBetween(Integer value1, Integer value2) {
            addCriterion("sum_quantity between", value1, value2, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andSumQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_quantity not between", value1, value2, "sumQuantity");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitIsNull() {
            addCriterion("insure_time_unit is null");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitIsNotNull() {
            addCriterion("insure_time_unit is not null");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitEqualTo(Boolean value) {
            addCriterion("insure_time_unit =", value, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitNotEqualTo(Boolean value) {
            addCriterion("insure_time_unit <>", value, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitGreaterThan(Boolean value) {
            addCriterion("insure_time_unit >", value, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("insure_time_unit >=", value, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitLessThan(Boolean value) {
            addCriterion("insure_time_unit <", value, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitLessThanOrEqualTo(Boolean value) {
            addCriterion("insure_time_unit <=", value, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitIn(List<Boolean> values) {
            addCriterion("insure_time_unit in", values, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitNotIn(List<Boolean> values) {
            addCriterion("insure_time_unit not in", values, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitBetween(Boolean value1, Boolean value2) {
            addCriterion("insure_time_unit between", value1, value2, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeUnitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("insure_time_unit not between", value1, value2, "insureTimeUnit");
            return (Criteria) this;
        }

        public Criteria andInsureTimeIsNull() {
            addCriterion("insure_time is null");
            return (Criteria) this;
        }

        public Criteria andInsureTimeIsNotNull() {
            addCriterion("insure_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsureTimeEqualTo(Double value) {
            addCriterion("insure_time =", value, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeNotEqualTo(Double value) {
            addCriterion("insure_time <>", value, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeGreaterThan(Double value) {
            addCriterion("insure_time >", value, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("insure_time >=", value, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeLessThan(Double value) {
            addCriterion("insure_time <", value, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeLessThanOrEqualTo(Double value) {
            addCriterion("insure_time <=", value, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeIn(List<Double> values) {
            addCriterion("insure_time in", values, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeNotIn(List<Double> values) {
            addCriterion("insure_time not in", values, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeBetween(Double value1, Double value2) {
            addCriterion("insure_time between", value1, value2, "insureTime");
            return (Criteria) this;
        }

        public Criteria andInsureTimeNotBetween(Double value1, Double value2) {
            addCriterion("insure_time not between", value1, value2, "insureTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Boolean value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Boolean value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Boolean value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Boolean value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Boolean> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Boolean> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Boolean value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Boolean value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Boolean value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Boolean value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Boolean> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Boolean> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeIsNull() {
            addCriterion("payment_expired_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeIsNotNull() {
            addCriterion("payment_expired_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeEqualTo(Date value) {
            addCriterion("payment_expired_time =", value, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeNotEqualTo(Date value) {
            addCriterion("payment_expired_time <>", value, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeGreaterThan(Date value) {
            addCriterion("payment_expired_time >", value, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_expired_time >=", value, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeLessThan(Date value) {
            addCriterion("payment_expired_time <", value, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_expired_time <=", value, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeIn(List<Date> values) {
            addCriterion("payment_expired_time in", values, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeNotIn(List<Date> values) {
            addCriterion("payment_expired_time not in", values, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeBetween(Date value1, Date value2) {
            addCriterion("payment_expired_time between", value1, value2, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiredTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_expired_time not between", value1, value2, "paymentExpiredTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeIsNull() {
            addCriterion("proposal_time is null");
            return (Criteria) this;
        }

        public Criteria andProposalTimeIsNotNull() {
            addCriterion("proposal_time is not null");
            return (Criteria) this;
        }

        public Criteria andProposalTimeEqualTo(Date value) {
            addCriterion("proposal_time =", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeNotEqualTo(Date value) {
            addCriterion("proposal_time <>", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeGreaterThan(Date value) {
            addCriterion("proposal_time >", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proposal_time >=", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeLessThan(Date value) {
            addCriterion("proposal_time <", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeLessThanOrEqualTo(Date value) {
            addCriterion("proposal_time <=", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeIn(List<Date> values) {
            addCriterion("proposal_time in", values, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeNotIn(List<Date> values) {
            addCriterion("proposal_time not in", values, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeBetween(Date value1, Date value2) {
            addCriterion("proposal_time between", value1, value2, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeNotBetween(Date value1, Date value2) {
            addCriterion("proposal_time not between", value1, value2, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeIsNull() {
            addCriterion("insurance_proposal_time is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeIsNotNull() {
            addCriterion("insurance_proposal_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeEqualTo(Date value) {
            addCriterion("insurance_proposal_time =", value, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeNotEqualTo(Date value) {
            addCriterion("insurance_proposal_time <>", value, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeGreaterThan(Date value) {
            addCriterion("insurance_proposal_time >", value, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insurance_proposal_time >=", value, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeLessThan(Date value) {
            addCriterion("insurance_proposal_time <", value, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeLessThanOrEqualTo(Date value) {
            addCriterion("insurance_proposal_time <=", value, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeIn(List<Date> values) {
            addCriterion("insurance_proposal_time in", values, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeNotIn(List<Date> values) {
            addCriterion("insurance_proposal_time not in", values, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeBetween(Date value1, Date value2) {
            addCriterion("insurance_proposal_time between", value1, value2, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceProposalTimeNotBetween(Date value1, Date value2) {
            addCriterion("insurance_proposal_time not between", value1, value2, "insuranceProposalTime");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeIsNull() {
            addCriterion("checker_code is null");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeIsNotNull() {
            addCriterion("checker_code is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeEqualTo(String value) {
            addCriterion("checker_code =", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeNotEqualTo(String value) {
            addCriterion("checker_code <>", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeGreaterThan(String value) {
            addCriterion("checker_code >", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("checker_code >=", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeLessThan(String value) {
            addCriterion("checker_code <", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeLessThanOrEqualTo(String value) {
            addCriterion("checker_code <=", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeLike(String value) {
            addCriterion("checker_code like", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeNotLike(String value) {
            addCriterion("checker_code not like", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeIn(List<String> values) {
            addCriterion("checker_code in", values, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeNotIn(List<String> values) {
            addCriterion("checker_code not in", values, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeBetween(String value1, String value2) {
            addCriterion("checker_code between", value1, value2, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeNotBetween(String value1, String value2) {
            addCriterion("checker_code not between", value1, value2, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIsNull() {
            addCriterion("checker_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIsNotNull() {
            addCriterion("checker_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerNameEqualTo(String value) {
            addCriterion("checker_name =", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotEqualTo(String value) {
            addCriterion("checker_name <>", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameGreaterThan(String value) {
            addCriterion("checker_name >", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameGreaterThanOrEqualTo(String value) {
            addCriterion("checker_name >=", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLessThan(String value) {
            addCriterion("checker_name <", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLessThanOrEqualTo(String value) {
            addCriterion("checker_name <=", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLike(String value) {
            addCriterion("checker_name like", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotLike(String value) {
            addCriterion("checker_name not like", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIn(List<String> values) {
            addCriterion("checker_name in", values, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotIn(List<String> values) {
            addCriterion("checker_name not in", values, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameBetween(String value1, String value2) {
            addCriterion("checker_name between", value1, value2, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotBetween(String value1, String value2) {
            addCriterion("checker_name not between", value1, value2, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkIsNull() {
            addCriterion("checker_mark is null");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkIsNotNull() {
            addCriterion("checker_mark is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkEqualTo(String value) {
            addCriterion("checker_mark =", value, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkNotEqualTo(String value) {
            addCriterion("checker_mark <>", value, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkGreaterThan(String value) {
            addCriterion("checker_mark >", value, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkGreaterThanOrEqualTo(String value) {
            addCriterion("checker_mark >=", value, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkLessThan(String value) {
            addCriterion("checker_mark <", value, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkLessThanOrEqualTo(String value) {
            addCriterion("checker_mark <=", value, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkLike(String value) {
            addCriterion("checker_mark like", value, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkNotLike(String value) {
            addCriterion("checker_mark not like", value, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkIn(List<String> values) {
            addCriterion("checker_mark in", values, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkNotIn(List<String> values) {
            addCriterion("checker_mark not in", values, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkBetween(String value1, String value2) {
            addCriterion("checker_mark between", value1, value2, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckerMarkNotBetween(String value1, String value2) {
            addCriterion("checker_mark not between", value1, value2, "checkerMark");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeIsNull() {
            addCriterion("insurance_insure_time is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeIsNotNull() {
            addCriterion("insurance_insure_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeEqualTo(Date value) {
            addCriterion("insurance_insure_time =", value, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeNotEqualTo(Date value) {
            addCriterion("insurance_insure_time <>", value, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeGreaterThan(Date value) {
            addCriterion("insurance_insure_time >", value, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insurance_insure_time >=", value, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeLessThan(Date value) {
            addCriterion("insurance_insure_time <", value, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeLessThanOrEqualTo(Date value) {
            addCriterion("insurance_insure_time <=", value, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeIn(List<Date> values) {
            addCriterion("insurance_insure_time in", values, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeNotIn(List<Date> values) {
            addCriterion("insurance_insure_time not in", values, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeBetween(Date value1, Date value2) {
            addCriterion("insurance_insure_time between", value1, value2, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceInsureTimeNotBetween(Date value1, Date value2) {
            addCriterion("insurance_insure_time not between", value1, value2, "insuranceInsureTime");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsIsNull() {
            addCriterion("insure_directions is null");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsIsNotNull() {
            addCriterion("insure_directions is not null");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsEqualTo(String value) {
            addCriterion("insure_directions =", value, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsNotEqualTo(String value) {
            addCriterion("insure_directions <>", value, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsGreaterThan(String value) {
            addCriterion("insure_directions >", value, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsGreaterThanOrEqualTo(String value) {
            addCriterion("insure_directions >=", value, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsLessThan(String value) {
            addCriterion("insure_directions <", value, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsLessThanOrEqualTo(String value) {
            addCriterion("insure_directions <=", value, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsLike(String value) {
            addCriterion("insure_directions like", value, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsNotLike(String value) {
            addCriterion("insure_directions not like", value, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsIn(List<String> values) {
            addCriterion("insure_directions in", values, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsNotIn(List<String> values) {
            addCriterion("insure_directions not in", values, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsBetween(String value1, String value2) {
            addCriterion("insure_directions between", value1, value2, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andInsureDirectionsNotBetween(String value1, String value2) {
            addCriterion("insure_directions not between", value1, value2, "insureDirections");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlIsNull() {
            addCriterion("policy_download_url is null");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlIsNotNull() {
            addCriterion("policy_download_url is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlEqualTo(String value) {
            addCriterion("policy_download_url =", value, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlNotEqualTo(String value) {
            addCriterion("policy_download_url <>", value, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlGreaterThan(String value) {
            addCriterion("policy_download_url >", value, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("policy_download_url >=", value, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlLessThan(String value) {
            addCriterion("policy_download_url <", value, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("policy_download_url <=", value, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlLike(String value) {
            addCriterion("policy_download_url like", value, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlNotLike(String value) {
            addCriterion("policy_download_url not like", value, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlIn(List<String> values) {
            addCriterion("policy_download_url in", values, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlNotIn(List<String> values) {
            addCriterion("policy_download_url not in", values, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlBetween(String value1, String value2) {
            addCriterion("policy_download_url between", value1, value2, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("policy_download_url not between", value1, value2, "policyDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlIsNull() {
            addCriterion("policy_query_url is null");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlIsNotNull() {
            addCriterion("policy_query_url is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlEqualTo(String value) {
            addCriterion("policy_query_url =", value, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlNotEqualTo(String value) {
            addCriterion("policy_query_url <>", value, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlGreaterThan(String value) {
            addCriterion("policy_query_url >", value, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("policy_query_url >=", value, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlLessThan(String value) {
            addCriterion("policy_query_url <", value, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlLessThanOrEqualTo(String value) {
            addCriterion("policy_query_url <=", value, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlLike(String value) {
            addCriterion("policy_query_url like", value, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlNotLike(String value) {
            addCriterion("policy_query_url not like", value, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlIn(List<String> values) {
            addCriterion("policy_query_url in", values, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlNotIn(List<String> values) {
            addCriterion("policy_query_url not in", values, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlBetween(String value1, String value2) {
            addCriterion("policy_query_url between", value1, value2, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andPolicyQueryUrlNotBetween(String value1, String value2) {
            addCriterion("policy_query_url not between", value1, value2, "policyQueryUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlIsNull() {
            addCriterion("invoice_url is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlIsNotNull() {
            addCriterion("invoice_url is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlEqualTo(String value) {
            addCriterion("invoice_url =", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlNotEqualTo(String value) {
            addCriterion("invoice_url <>", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlGreaterThan(String value) {
            addCriterion("invoice_url >", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_url >=", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlLessThan(String value) {
            addCriterion("invoice_url <", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlLessThanOrEqualTo(String value) {
            addCriterion("invoice_url <=", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlLike(String value) {
            addCriterion("invoice_url like", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlNotLike(String value) {
            addCriterion("invoice_url not like", value, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlIn(List<String> values) {
            addCriterion("invoice_url in", values, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlNotIn(List<String> values) {
            addCriterion("invoice_url not in", values, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlBetween(String value1, String value2) {
            addCriterion("invoice_url between", value1, value2, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andInvoiceUrlNotBetween(String value1, String value2) {
            addCriterion("invoice_url not between", value1, value2, "invoiceUrl");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeIsNull() {
            addCriterion("policy_source_code is null");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeIsNotNull() {
            addCriterion("policy_source_code is not null");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeEqualTo(String value) {
            addCriterion("policy_source_code =", value, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeNotEqualTo(String value) {
            addCriterion("policy_source_code <>", value, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeGreaterThan(String value) {
            addCriterion("policy_source_code >", value, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("policy_source_code >=", value, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeLessThan(String value) {
            addCriterion("policy_source_code <", value, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeLessThanOrEqualTo(String value) {
            addCriterion("policy_source_code <=", value, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeLike(String value) {
            addCriterion("policy_source_code like", value, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeNotLike(String value) {
            addCriterion("policy_source_code not like", value, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeIn(List<String> values) {
            addCriterion("policy_source_code in", values, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeNotIn(List<String> values) {
            addCriterion("policy_source_code not in", values, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeBetween(String value1, String value2) {
            addCriterion("policy_source_code between", value1, value2, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceCodeNotBetween(String value1, String value2) {
            addCriterion("policy_source_code not between", value1, value2, "policySourceCode");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameIsNull() {
            addCriterion("policy_source_name is null");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameIsNotNull() {
            addCriterion("policy_source_name is not null");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameEqualTo(String value) {
            addCriterion("policy_source_name =", value, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameNotEqualTo(String value) {
            addCriterion("policy_source_name <>", value, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameGreaterThan(String value) {
            addCriterion("policy_source_name >", value, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("policy_source_name >=", value, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameLessThan(String value) {
            addCriterion("policy_source_name <", value, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameLessThanOrEqualTo(String value) {
            addCriterion("policy_source_name <=", value, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameLike(String value) {
            addCriterion("policy_source_name like", value, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameNotLike(String value) {
            addCriterion("policy_source_name not like", value, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameIn(List<String> values) {
            addCriterion("policy_source_name in", values, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameNotIn(List<String> values) {
            addCriterion("policy_source_name not in", values, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameBetween(String value1, String value2) {
            addCriterion("policy_source_name between", value1, value2, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andPolicySourceNameNotBetween(String value1, String value2) {
            addCriterion("policy_source_name not between", value1, value2, "policySourceName");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeIsNull() {
            addCriterion("sell_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeIsNotNull() {
            addCriterion("sell_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeEqualTo(String value) {
            addCriterion("sell_channel_code =", value, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeNotEqualTo(String value) {
            addCriterion("sell_channel_code <>", value, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeGreaterThan(String value) {
            addCriterion("sell_channel_code >", value, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_channel_code >=", value, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeLessThan(String value) {
            addCriterion("sell_channel_code <", value, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("sell_channel_code <=", value, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeLike(String value) {
            addCriterion("sell_channel_code like", value, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeNotLike(String value) {
            addCriterion("sell_channel_code not like", value, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeIn(List<String> values) {
            addCriterion("sell_channel_code in", values, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeNotIn(List<String> values) {
            addCriterion("sell_channel_code not in", values, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeBetween(String value1, String value2) {
            addCriterion("sell_channel_code between", value1, value2, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelCodeNotBetween(String value1, String value2) {
            addCriterion("sell_channel_code not between", value1, value2, "sellChannelCode");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameIsNull() {
            addCriterion("sell_channel_name is null");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameIsNotNull() {
            addCriterion("sell_channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameEqualTo(String value) {
            addCriterion("sell_channel_name =", value, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameNotEqualTo(String value) {
            addCriterion("sell_channel_name <>", value, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameGreaterThan(String value) {
            addCriterion("sell_channel_name >", value, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("sell_channel_name >=", value, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameLessThan(String value) {
            addCriterion("sell_channel_name <", value, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameLessThanOrEqualTo(String value) {
            addCriterion("sell_channel_name <=", value, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameLike(String value) {
            addCriterion("sell_channel_name like", value, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameNotLike(String value) {
            addCriterion("sell_channel_name not like", value, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameIn(List<String> values) {
            addCriterion("sell_channel_name in", values, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameNotIn(List<String> values) {
            addCriterion("sell_channel_name not in", values, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameBetween(String value1, String value2) {
            addCriterion("sell_channel_name between", value1, value2, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andSellChannelNameNotBetween(String value1, String value2) {
            addCriterion("sell_channel_name not between", value1, value2, "sellChannelName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(Boolean value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(Boolean value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(Boolean value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(Boolean value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<Boolean> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<Boolean> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatIsNull() {
            addCriterion("invoice_format is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatIsNotNull() {
            addCriterion("invoice_format is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatEqualTo(Boolean value) {
            addCriterion("invoice_format =", value, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatNotEqualTo(Boolean value) {
            addCriterion("invoice_format <>", value, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatGreaterThan(Boolean value) {
            addCriterion("invoice_format >", value, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("invoice_format >=", value, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatLessThan(Boolean value) {
            addCriterion("invoice_format <", value, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatLessThanOrEqualTo(Boolean value) {
            addCriterion("invoice_format <=", value, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatIn(List<Boolean> values) {
            addCriterion("invoice_format in", values, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatNotIn(List<Boolean> values) {
            addCriterion("invoice_format not in", values, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_format between", value1, value2, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceFormatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_format not between", value1, value2, "invoiceFormat");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeIsNull() {
            addCriterion("invoice_buyer_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeIsNotNull() {
            addCriterion("invoice_buyer_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeEqualTo(Boolean value) {
            addCriterion("invoice_buyer_type =", value, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeNotEqualTo(Boolean value) {
            addCriterion("invoice_buyer_type <>", value, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeGreaterThan(Boolean value) {
            addCriterion("invoice_buyer_type >", value, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("invoice_buyer_type >=", value, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeLessThan(Boolean value) {
            addCriterion("invoice_buyer_type <", value, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("invoice_buyer_type <=", value, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeIn(List<Boolean> values) {
            addCriterion("invoice_buyer_type in", values, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeNotIn(List<Boolean> values) {
            addCriterion("invoice_buyer_type not in", values, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_buyer_type between", value1, value2, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andInvoiceBuyerTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_buyer_type not between", value1, value2, "invoiceBuyerType");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeIsNull() {
            addCriterion("business_belong_user_code is null");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeIsNotNull() {
            addCriterion("business_belong_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeEqualTo(String value) {
            addCriterion("business_belong_user_code =", value, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeNotEqualTo(String value) {
            addCriterion("business_belong_user_code <>", value, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeGreaterThan(String value) {
            addCriterion("business_belong_user_code >", value, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("business_belong_user_code >=", value, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeLessThan(String value) {
            addCriterion("business_belong_user_code <", value, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeLessThanOrEqualTo(String value) {
            addCriterion("business_belong_user_code <=", value, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeLike(String value) {
            addCriterion("business_belong_user_code like", value, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeNotLike(String value) {
            addCriterion("business_belong_user_code not like", value, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeIn(List<String> values) {
            addCriterion("business_belong_user_code in", values, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeNotIn(List<String> values) {
            addCriterion("business_belong_user_code not in", values, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeBetween(String value1, String value2) {
            addCriterion("business_belong_user_code between", value1, value2, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserCodeNotBetween(String value1, String value2) {
            addCriterion("business_belong_user_code not between", value1, value2, "businessBelongUserCode");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameIsNull() {
            addCriterion("business_belong_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameIsNotNull() {
            addCriterion("business_belong_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameEqualTo(String value) {
            addCriterion("business_belong_user_name =", value, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameNotEqualTo(String value) {
            addCriterion("business_belong_user_name <>", value, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameGreaterThan(String value) {
            addCriterion("business_belong_user_name >", value, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_belong_user_name >=", value, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameLessThan(String value) {
            addCriterion("business_belong_user_name <", value, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameLessThanOrEqualTo(String value) {
            addCriterion("business_belong_user_name <=", value, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameLike(String value) {
            addCriterion("business_belong_user_name like", value, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameNotLike(String value) {
            addCriterion("business_belong_user_name not like", value, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameIn(List<String> values) {
            addCriterion("business_belong_user_name in", values, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameNotIn(List<String> values) {
            addCriterion("business_belong_user_name not in", values, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameBetween(String value1, String value2) {
            addCriterion("business_belong_user_name between", value1, value2, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessBelongUserNameNotBetween(String value1, String value2) {
            addCriterion("business_belong_user_name not between", value1, value2, "businessBelongUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeIsNull() {
            addCriterion("operation_user_code is null");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeIsNotNull() {
            addCriterion("operation_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeEqualTo(String value) {
            addCriterion("operation_user_code =", value, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeNotEqualTo(String value) {
            addCriterion("operation_user_code <>", value, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeGreaterThan(String value) {
            addCriterion("operation_user_code >", value, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_user_code >=", value, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeLessThan(String value) {
            addCriterion("operation_user_code <", value, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeLessThanOrEqualTo(String value) {
            addCriterion("operation_user_code <=", value, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeLike(String value) {
            addCriterion("operation_user_code like", value, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeNotLike(String value) {
            addCriterion("operation_user_code not like", value, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeIn(List<String> values) {
            addCriterion("operation_user_code in", values, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeNotIn(List<String> values) {
            addCriterion("operation_user_code not in", values, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeBetween(String value1, String value2) {
            addCriterion("operation_user_code between", value1, value2, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserCodeNotBetween(String value1, String value2) {
            addCriterion("operation_user_code not between", value1, value2, "operationUserCode");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameIsNull() {
            addCriterion("operation_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameIsNotNull() {
            addCriterion("operation_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameEqualTo(String value) {
            addCriterion("operation_user_name =", value, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameNotEqualTo(String value) {
            addCriterion("operation_user_name <>", value, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameGreaterThan(String value) {
            addCriterion("operation_user_name >", value, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("operation_user_name >=", value, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameLessThan(String value) {
            addCriterion("operation_user_name <", value, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameLessThanOrEqualTo(String value) {
            addCriterion("operation_user_name <=", value, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameLike(String value) {
            addCriterion("operation_user_name like", value, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameNotLike(String value) {
            addCriterion("operation_user_name not like", value, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameIn(List<String> values) {
            addCriterion("operation_user_name in", values, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameNotIn(List<String> values) {
            addCriterion("operation_user_name not in", values, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameBetween(String value1, String value2) {
            addCriterion("operation_user_name between", value1, value2, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andOperationUserNameNotBetween(String value1, String value2) {
            addCriterion("operation_user_name not between", value1, value2, "operationUserName");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelIsNull() {
            addCriterion("policy_level is null");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelIsNotNull() {
            addCriterion("policy_level is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelEqualTo(Boolean value) {
            addCriterion("policy_level =", value, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelNotEqualTo(Boolean value) {
            addCriterion("policy_level <>", value, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelGreaterThan(Boolean value) {
            addCriterion("policy_level >", value, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("policy_level >=", value, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelLessThan(Boolean value) {
            addCriterion("policy_level <", value, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("policy_level <=", value, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelIn(List<Boolean> values) {
            addCriterion("policy_level in", values, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelNotIn(List<Boolean> values) {
            addCriterion("policy_level not in", values, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("policy_level between", value1, value2, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andPolicyLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("policy_level not between", value1, value2, "policyLevel");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveIsNull() {
            addCriterion("online_preserve is null");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveIsNotNull() {
            addCriterion("online_preserve is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveEqualTo(Boolean value) {
            addCriterion("online_preserve =", value, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveNotEqualTo(Boolean value) {
            addCriterion("online_preserve <>", value, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveGreaterThan(Boolean value) {
            addCriterion("online_preserve >", value, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("online_preserve >=", value, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveLessThan(Boolean value) {
            addCriterion("online_preserve <", value, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveLessThanOrEqualTo(Boolean value) {
            addCriterion("online_preserve <=", value, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveIn(List<Boolean> values) {
            addCriterion("online_preserve in", values, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveNotIn(List<Boolean> values) {
            addCriterion("online_preserve not in", values, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveBetween(Boolean value1, Boolean value2) {
            addCriterion("online_preserve between", value1, value2, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlinePreserveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("online_preserve not between", value1, value2, "onlinePreserve");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalIsNull() {
            addCriterion("online_renewal is null");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalIsNotNull() {
            addCriterion("online_renewal is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalEqualTo(Boolean value) {
            addCriterion("online_renewal =", value, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalNotEqualTo(Boolean value) {
            addCriterion("online_renewal <>", value, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalGreaterThan(Boolean value) {
            addCriterion("online_renewal >", value, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("online_renewal >=", value, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalLessThan(Boolean value) {
            addCriterion("online_renewal <", value, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalLessThanOrEqualTo(Boolean value) {
            addCriterion("online_renewal <=", value, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalIn(List<Boolean> values) {
            addCriterion("online_renewal in", values, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalNotIn(List<Boolean> values) {
            addCriterion("online_renewal not in", values, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalBetween(Boolean value1, Boolean value2) {
            addCriterion("online_renewal between", value1, value2, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andOnlineRenewalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("online_renewal not between", value1, value2, "onlineRenewal");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeIsNull() {
            addCriterion("continued_type is null");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeIsNotNull() {
            addCriterion("continued_type is not null");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeEqualTo(Boolean value) {
            addCriterion("continued_type =", value, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeNotEqualTo(Boolean value) {
            addCriterion("continued_type <>", value, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeGreaterThan(Boolean value) {
            addCriterion("continued_type >", value, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("continued_type >=", value, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeLessThan(Boolean value) {
            addCriterion("continued_type <", value, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("continued_type <=", value, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeIn(List<Boolean> values) {
            addCriterion("continued_type in", values, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeNotIn(List<Boolean> values) {
            addCriterion("continued_type not in", values, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("continued_type between", value1, value2, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("continued_type not between", value1, value2, "continuedType");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsIsNull() {
            addCriterion("continued_policy_is is null");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsIsNotNull() {
            addCriterion("continued_policy_is is not null");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsEqualTo(Boolean value) {
            addCriterion("continued_policy_is =", value, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsNotEqualTo(Boolean value) {
            addCriterion("continued_policy_is <>", value, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsGreaterThan(Boolean value) {
            addCriterion("continued_policy_is >", value, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("continued_policy_is >=", value, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsLessThan(Boolean value) {
            addCriterion("continued_policy_is <", value, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsLessThanOrEqualTo(Boolean value) {
            addCriterion("continued_policy_is <=", value, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsIn(List<Boolean> values) {
            addCriterion("continued_policy_is in", values, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsNotIn(List<Boolean> values) {
            addCriterion("continued_policy_is not in", values, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsBetween(Boolean value1, Boolean value2) {
            addCriterion("continued_policy_is between", value1, value2, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyIsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("continued_policy_is not between", value1, value2, "continuedPolicyIs");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoIsNull() {
            addCriterion("continued_policy_no is null");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoIsNotNull() {
            addCriterion("continued_policy_no is not null");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoEqualTo(String value) {
            addCriterion("continued_policy_no =", value, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoNotEqualTo(String value) {
            addCriterion("continued_policy_no <>", value, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoGreaterThan(String value) {
            addCriterion("continued_policy_no >", value, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoGreaterThanOrEqualTo(String value) {
            addCriterion("continued_policy_no >=", value, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoLessThan(String value) {
            addCriterion("continued_policy_no <", value, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoLessThanOrEqualTo(String value) {
            addCriterion("continued_policy_no <=", value, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoLike(String value) {
            addCriterion("continued_policy_no like", value, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoNotLike(String value) {
            addCriterion("continued_policy_no not like", value, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoIn(List<String> values) {
            addCriterion("continued_policy_no in", values, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoNotIn(List<String> values) {
            addCriterion("continued_policy_no not in", values, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoBetween(String value1, String value2) {
            addCriterion("continued_policy_no between", value1, value2, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedPolicyNoNotBetween(String value1, String value2) {
            addCriterion("continued_policy_no not between", value1, value2, "continuedPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoIsNull() {
            addCriterion("continued_original_policy_no is null");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoIsNotNull() {
            addCriterion("continued_original_policy_no is not null");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoEqualTo(String value) {
            addCriterion("continued_original_policy_no =", value, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoNotEqualTo(String value) {
            addCriterion("continued_original_policy_no <>", value, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoGreaterThan(String value) {
            addCriterion("continued_original_policy_no >", value, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoGreaterThanOrEqualTo(String value) {
            addCriterion("continued_original_policy_no >=", value, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoLessThan(String value) {
            addCriterion("continued_original_policy_no <", value, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoLessThanOrEqualTo(String value) {
            addCriterion("continued_original_policy_no <=", value, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoLike(String value) {
            addCriterion("continued_original_policy_no like", value, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoNotLike(String value) {
            addCriterion("continued_original_policy_no not like", value, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoIn(List<String> values) {
            addCriterion("continued_original_policy_no in", values, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoNotIn(List<String> values) {
            addCriterion("continued_original_policy_no not in", values, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoBetween(String value1, String value2) {
            addCriterion("continued_original_policy_no between", value1, value2, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andContinuedOriginalPolicyNoNotBetween(String value1, String value2) {
            addCriterion("continued_original_policy_no not between", value1, value2, "continuedOriginalPolicyNo");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsIsNull() {
            addCriterion("take_over_receive_is is null");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsIsNotNull() {
            addCriterion("take_over_receive_is is not null");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsEqualTo(Boolean value) {
            addCriterion("take_over_receive_is =", value, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsNotEqualTo(Boolean value) {
            addCriterion("take_over_receive_is <>", value, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsGreaterThan(Boolean value) {
            addCriterion("take_over_receive_is >", value, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("take_over_receive_is >=", value, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsLessThan(Boolean value) {
            addCriterion("take_over_receive_is <", value, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsLessThanOrEqualTo(Boolean value) {
            addCriterion("take_over_receive_is <=", value, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsIn(List<Boolean> values) {
            addCriterion("take_over_receive_is in", values, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsNotIn(List<Boolean> values) {
            addCriterion("take_over_receive_is not in", values, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsBetween(Boolean value1, Boolean value2) {
            addCriterion("take_over_receive_is between", value1, value2, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andTakeOverReceiveIsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("take_over_receive_is not between", value1, value2, "takeOverReceiveIs");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentIsNull() {
            addCriterion("commission_discount_percent is null");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentIsNotNull() {
            addCriterion("commission_discount_percent is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentEqualTo(BigDecimal value) {
            addCriterion("commission_discount_percent =", value, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentNotEqualTo(BigDecimal value) {
            addCriterion("commission_discount_percent <>", value, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentGreaterThan(BigDecimal value) {
            addCriterion("commission_discount_percent >", value, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_discount_percent >=", value, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentLessThan(BigDecimal value) {
            addCriterion("commission_discount_percent <", value, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission_discount_percent <=", value, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentIn(List<BigDecimal> values) {
            addCriterion("commission_discount_percent in", values, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentNotIn(List<BigDecimal> values) {
            addCriterion("commission_discount_percent not in", values, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_discount_percent between", value1, value2, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionDiscountPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission_discount_percent not between", value1, value2, "commissionDiscountPercent");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBigPolicyIsNull() {
            addCriterion("big_policy is null");
            return (Criteria) this;
        }

        public Criteria andBigPolicyIsNotNull() {
            addCriterion("big_policy is not null");
            return (Criteria) this;
        }

        public Criteria andBigPolicyEqualTo(Boolean value) {
            addCriterion("big_policy =", value, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyNotEqualTo(Boolean value) {
            addCriterion("big_policy <>", value, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyGreaterThan(Boolean value) {
            addCriterion("big_policy >", value, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("big_policy >=", value, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyLessThan(Boolean value) {
            addCriterion("big_policy <", value, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyLessThanOrEqualTo(Boolean value) {
            addCriterion("big_policy <=", value, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyIn(List<Boolean> values) {
            addCriterion("big_policy in", values, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyNotIn(List<Boolean> values) {
            addCriterion("big_policy not in", values, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyBetween(Boolean value1, Boolean value2) {
            addCriterion("big_policy between", value1, value2, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andBigPolicyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("big_policy not between", value1, value2, "bigPolicy");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("step is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("step is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(Boolean value) {
            addCriterion("step =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(Boolean value) {
            addCriterion("step <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(Boolean value) {
            addCriterion("step >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(Boolean value) {
            addCriterion("step >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(Boolean value) {
            addCriterion("step <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(Boolean value) {
            addCriterion("step <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<Boolean> values) {
            addCriterion("step in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<Boolean> values) {
            addCriterion("step not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(Boolean value1, Boolean value2) {
            addCriterion("step between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(Boolean value1, Boolean value2) {
            addCriterion("step not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusIsNull() {
            addCriterion("ledger_status is null");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusIsNotNull() {
            addCriterion("ledger_status is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusEqualTo(Boolean value) {
            addCriterion("ledger_status =", value, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusNotEqualTo(Boolean value) {
            addCriterion("ledger_status <>", value, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusGreaterThan(Boolean value) {
            addCriterion("ledger_status >", value, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ledger_status >=", value, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusLessThan(Boolean value) {
            addCriterion("ledger_status <", value, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("ledger_status <=", value, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusIn(List<Boolean> values) {
            addCriterion("ledger_status in", values, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusNotIn(List<Boolean> values) {
            addCriterion("ledger_status not in", values, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("ledger_status between", value1, value2, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andLedgerStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ledger_status not between", value1, value2, "ledgerStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Boolean value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Boolean value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Boolean value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Boolean value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Boolean> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Boolean> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeIsNull() {
            addCriterion("applicant_type is null");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeIsNotNull() {
            addCriterion("applicant_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeEqualTo(Boolean value) {
            addCriterion("applicant_type =", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeNotEqualTo(Boolean value) {
            addCriterion("applicant_type <>", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeGreaterThan(Boolean value) {
            addCriterion("applicant_type >", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("applicant_type >=", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeLessThan(Boolean value) {
            addCriterion("applicant_type <", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("applicant_type <=", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeIn(List<Boolean> values) {
            addCriterion("applicant_type in", values, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeNotIn(List<Boolean> values) {
            addCriterion("applicant_type not in", values, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("applicant_type between", value1, value2, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("applicant_type not between", value1, value2, "applicantType");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNull() {
            addCriterion("sign_status is null");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNotNull() {
            addCriterion("sign_status is not null");
            return (Criteria) this;
        }

        public Criteria andSignStatusEqualTo(Boolean value) {
            addCriterion("sign_status =", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotEqualTo(Boolean value) {
            addCriterion("sign_status <>", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThan(Boolean value) {
            addCriterion("sign_status >", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sign_status >=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThan(Boolean value) {
            addCriterion("sign_status <", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("sign_status <=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusIn(List<Boolean> values) {
            addCriterion("sign_status in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotIn(List<Boolean> values) {
            addCriterion("sign_status not in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("sign_status between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sign_status not between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Boolean value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Boolean value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Boolean value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Boolean value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Boolean> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Boolean> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsIsNull() {
            addCriterion("coinsurance_is is null");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsIsNotNull() {
            addCriterion("coinsurance_is is not null");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsEqualTo(Boolean value) {
            addCriterion("coinsurance_is =", value, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsNotEqualTo(Boolean value) {
            addCriterion("coinsurance_is <>", value, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsGreaterThan(Boolean value) {
            addCriterion("coinsurance_is >", value, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("coinsurance_is >=", value, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsLessThan(Boolean value) {
            addCriterion("coinsurance_is <", value, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsLessThanOrEqualTo(Boolean value) {
            addCriterion("coinsurance_is <=", value, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsIn(List<Boolean> values) {
            addCriterion("coinsurance_is in", values, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsNotIn(List<Boolean> values) {
            addCriterion("coinsurance_is not in", values, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsBetween(Boolean value1, Boolean value2) {
            addCriterion("coinsurance_is between", value1, value2, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andCoinsuranceIsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("coinsurance_is not between", value1, value2, "coinsuranceIs");
            return (Criteria) this;
        }

        public Criteria andSalesCodeIsNull() {
            addCriterion("sales_code is null");
            return (Criteria) this;
        }

        public Criteria andSalesCodeIsNotNull() {
            addCriterion("sales_code is not null");
            return (Criteria) this;
        }

        public Criteria andSalesCodeEqualTo(String value) {
            addCriterion("sales_code =", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeNotEqualTo(String value) {
            addCriterion("sales_code <>", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeGreaterThan(String value) {
            addCriterion("sales_code >", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sales_code >=", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeLessThan(String value) {
            addCriterion("sales_code <", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeLessThanOrEqualTo(String value) {
            addCriterion("sales_code <=", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeLike(String value) {
            addCriterion("sales_code like", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeNotLike(String value) {
            addCriterion("sales_code not like", value, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeIn(List<String> values) {
            addCriterion("sales_code in", values, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeNotIn(List<String> values) {
            addCriterion("sales_code not in", values, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeBetween(String value1, String value2) {
            addCriterion("sales_code between", value1, value2, "salesCode");
            return (Criteria) this;
        }

        public Criteria andSalesCodeNotBetween(String value1, String value2) {
            addCriterion("sales_code not between", value1, value2, "salesCode");
            return (Criteria) this;
        }

        public Criteria andExtendAIsNull() {
            addCriterion("extend_a is null");
            return (Criteria) this;
        }

        public Criteria andExtendAIsNotNull() {
            addCriterion("extend_a is not null");
            return (Criteria) this;
        }

        public Criteria andExtendAEqualTo(String value) {
            addCriterion("extend_a =", value, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendANotEqualTo(String value) {
            addCriterion("extend_a <>", value, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendAGreaterThan(String value) {
            addCriterion("extend_a >", value, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendAGreaterThanOrEqualTo(String value) {
            addCriterion("extend_a >=", value, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendALessThan(String value) {
            addCriterion("extend_a <", value, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendALessThanOrEqualTo(String value) {
            addCriterion("extend_a <=", value, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendALike(String value) {
            addCriterion("extend_a like", value, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendANotLike(String value) {
            addCriterion("extend_a not like", value, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendAIn(List<String> values) {
            addCriterion("extend_a in", values, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendANotIn(List<String> values) {
            addCriterion("extend_a not in", values, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendABetween(String value1, String value2) {
            addCriterion("extend_a between", value1, value2, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendANotBetween(String value1, String value2) {
            addCriterion("extend_a not between", value1, value2, "extendA");
            return (Criteria) this;
        }

        public Criteria andExtendBIsNull() {
            addCriterion("extend_b is null");
            return (Criteria) this;
        }

        public Criteria andExtendBIsNotNull() {
            addCriterion("extend_b is not null");
            return (Criteria) this;
        }

        public Criteria andExtendBEqualTo(String value) {
            addCriterion("extend_b =", value, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBNotEqualTo(String value) {
            addCriterion("extend_b <>", value, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBGreaterThan(String value) {
            addCriterion("extend_b >", value, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBGreaterThanOrEqualTo(String value) {
            addCriterion("extend_b >=", value, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBLessThan(String value) {
            addCriterion("extend_b <", value, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBLessThanOrEqualTo(String value) {
            addCriterion("extend_b <=", value, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBLike(String value) {
            addCriterion("extend_b like", value, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBNotLike(String value) {
            addCriterion("extend_b not like", value, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBIn(List<String> values) {
            addCriterion("extend_b in", values, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBNotIn(List<String> values) {
            addCriterion("extend_b not in", values, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBBetween(String value1, String value2) {
            addCriterion("extend_b between", value1, value2, "extendB");
            return (Criteria) this;
        }

        public Criteria andExtendBNotBetween(String value1, String value2) {
            addCriterion("extend_b not between", value1, value2, "extendB");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}