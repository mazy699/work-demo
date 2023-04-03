package com.example.workdemo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public ProductsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
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

        public Criteria andProductcodeIsNull() {
            addCriterion("productCode is null");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNotNull() {
            addCriterion("productCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcodeEqualTo(String value) {
            addCriterion("productCode =", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotEqualTo(String value) {
            addCriterion("productCode <>", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThan(String value) {
            addCriterion("productCode >", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("productCode >=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThan(String value) {
            addCriterion("productCode <", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThanOrEqualTo(String value) {
            addCriterion("productCode <=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLike(String value) {
            addCriterion("productCode like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotLike(String value) {
            addCriterion("productCode not like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeIn(List<String> values) {
            addCriterion("productCode in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotIn(List<String> values) {
            addCriterion("productCode not in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeBetween(String value1, String value2) {
            addCriterion("productCode between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotBetween(String value1, String value2) {
            addCriterion("productCode not between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductlineIsNull() {
            addCriterion("productLine is null");
            return (Criteria) this;
        }

        public Criteria andProductlineIsNotNull() {
            addCriterion("productLine is not null");
            return (Criteria) this;
        }

        public Criteria andProductlineEqualTo(String value) {
            addCriterion("productLine =", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotEqualTo(String value) {
            addCriterion("productLine <>", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineGreaterThan(String value) {
            addCriterion("productLine >", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineGreaterThanOrEqualTo(String value) {
            addCriterion("productLine >=", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLessThan(String value) {
            addCriterion("productLine <", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLessThanOrEqualTo(String value) {
            addCriterion("productLine <=", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLike(String value) {
            addCriterion("productLine like", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotLike(String value) {
            addCriterion("productLine not like", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineIn(List<String> values) {
            addCriterion("productLine in", values, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotIn(List<String> values) {
            addCriterion("productLine not in", values, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineBetween(String value1, String value2) {
            addCriterion("productLine between", value1, value2, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotBetween(String value1, String value2) {
            addCriterion("productLine not between", value1, value2, "productline");
            return (Criteria) this;
        }

        public Criteria andProductscaleIsNull() {
            addCriterion("productScale is null");
            return (Criteria) this;
        }

        public Criteria andProductscaleIsNotNull() {
            addCriterion("productScale is not null");
            return (Criteria) this;
        }

        public Criteria andProductscaleEqualTo(String value) {
            addCriterion("productScale =", value, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleNotEqualTo(String value) {
            addCriterion("productScale <>", value, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleGreaterThan(String value) {
            addCriterion("productScale >", value, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleGreaterThanOrEqualTo(String value) {
            addCriterion("productScale >=", value, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleLessThan(String value) {
            addCriterion("productScale <", value, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleLessThanOrEqualTo(String value) {
            addCriterion("productScale <=", value, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleLike(String value) {
            addCriterion("productScale like", value, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleNotLike(String value) {
            addCriterion("productScale not like", value, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleIn(List<String> values) {
            addCriterion("productScale in", values, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleNotIn(List<String> values) {
            addCriterion("productScale not in", values, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleBetween(String value1, String value2) {
            addCriterion("productScale between", value1, value2, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductscaleNotBetween(String value1, String value2) {
            addCriterion("productScale not between", value1, value2, "productscale");
            return (Criteria) this;
        }

        public Criteria andProductvendorIsNull() {
            addCriterion("productVendor is null");
            return (Criteria) this;
        }

        public Criteria andProductvendorIsNotNull() {
            addCriterion("productVendor is not null");
            return (Criteria) this;
        }

        public Criteria andProductvendorEqualTo(String value) {
            addCriterion("productVendor =", value, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorNotEqualTo(String value) {
            addCriterion("productVendor <>", value, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorGreaterThan(String value) {
            addCriterion("productVendor >", value, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorGreaterThanOrEqualTo(String value) {
            addCriterion("productVendor >=", value, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorLessThan(String value) {
            addCriterion("productVendor <", value, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorLessThanOrEqualTo(String value) {
            addCriterion("productVendor <=", value, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorLike(String value) {
            addCriterion("productVendor like", value, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorNotLike(String value) {
            addCriterion("productVendor not like", value, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorIn(List<String> values) {
            addCriterion("productVendor in", values, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorNotIn(List<String> values) {
            addCriterion("productVendor not in", values, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorBetween(String value1, String value2) {
            addCriterion("productVendor between", value1, value2, "productvendor");
            return (Criteria) this;
        }

        public Criteria andProductvendorNotBetween(String value1, String value2) {
            addCriterion("productVendor not between", value1, value2, "productvendor");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockIsNull() {
            addCriterion("quantityInStock is null");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockIsNotNull() {
            addCriterion("quantityInStock is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockEqualTo(Short value) {
            addCriterion("quantityInStock =", value, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockNotEqualTo(Short value) {
            addCriterion("quantityInStock <>", value, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockGreaterThan(Short value) {
            addCriterion("quantityInStock >", value, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockGreaterThanOrEqualTo(Short value) {
            addCriterion("quantityInStock >=", value, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockLessThan(Short value) {
            addCriterion("quantityInStock <", value, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockLessThanOrEqualTo(Short value) {
            addCriterion("quantityInStock <=", value, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockIn(List<Short> values) {
            addCriterion("quantityInStock in", values, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockNotIn(List<Short> values) {
            addCriterion("quantityInStock not in", values, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockBetween(Short value1, Short value2) {
            addCriterion("quantityInStock between", value1, value2, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andQuantityinstockNotBetween(Short value1, Short value2) {
            addCriterion("quantityInStock not between", value1, value2, "quantityinstock");
            return (Criteria) this;
        }

        public Criteria andBuypriceIsNull() {
            addCriterion("buyPrice is null");
            return (Criteria) this;
        }

        public Criteria andBuypriceIsNotNull() {
            addCriterion("buyPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBuypriceEqualTo(BigDecimal value) {
            addCriterion("buyPrice =", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceNotEqualTo(BigDecimal value) {
            addCriterion("buyPrice <>", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceGreaterThan(BigDecimal value) {
            addCriterion("buyPrice >", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buyPrice >=", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceLessThan(BigDecimal value) {
            addCriterion("buyPrice <", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buyPrice <=", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceIn(List<BigDecimal> values) {
            addCriterion("buyPrice in", values, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceNotIn(List<BigDecimal> values) {
            addCriterion("buyPrice not in", values, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buyPrice between", value1, value2, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buyPrice not between", value1, value2, "buyprice");
            return (Criteria) this;
        }

        public Criteria andMsrpIsNull() {
            addCriterion("MSRP is null");
            return (Criteria) this;
        }

        public Criteria andMsrpIsNotNull() {
            addCriterion("MSRP is not null");
            return (Criteria) this;
        }

        public Criteria andMsrpEqualTo(BigDecimal value) {
            addCriterion("MSRP =", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpNotEqualTo(BigDecimal value) {
            addCriterion("MSRP <>", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpGreaterThan(BigDecimal value) {
            addCriterion("MSRP >", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MSRP >=", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpLessThan(BigDecimal value) {
            addCriterion("MSRP <", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MSRP <=", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpIn(List<BigDecimal> values) {
            addCriterion("MSRP in", values, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpNotIn(List<BigDecimal> values) {
            addCriterion("MSRP not in", values, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MSRP between", value1, value2, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MSRP not between", value1, value2, "msrp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table products
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 03 22:56:19 HKT 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table products
     *
     * @mbg.generated Mon Apr 03 22:56:19 HKT 2023
     */
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