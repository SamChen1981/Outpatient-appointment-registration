package com.medicalsystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPatientExample() {
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

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Long value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Long value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Long value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Long value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Long value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Long> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Long> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Long value1, Long value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Long value1, Long value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatentNameIsNull() {
            addCriterion("patent_name is null");
            return (Criteria) this;
        }

        public Criteria andPatentNameIsNotNull() {
            addCriterion("patent_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatentNameEqualTo(String value) {
            addCriterion("patent_name =", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameNotEqualTo(String value) {
            addCriterion("patent_name <>", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameGreaterThan(String value) {
            addCriterion("patent_name >", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameGreaterThanOrEqualTo(String value) {
            addCriterion("patent_name >=", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameLessThan(String value) {
            addCriterion("patent_name <", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameLessThanOrEqualTo(String value) {
            addCriterion("patent_name <=", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameLike(String value) {
            addCriterion("patent_name like", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameNotLike(String value) {
            addCriterion("patent_name not like", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameIn(List<String> values) {
            addCriterion("patent_name in", values, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameNotIn(List<String> values) {
            addCriterion("patent_name not in", values, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameBetween(String value1, String value2) {
            addCriterion("patent_name between", value1, value2, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameNotBetween(String value1, String value2) {
            addCriterion("patent_name not between", value1, value2, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordIsNull() {
            addCriterion("patient_password is null");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordIsNotNull() {
            addCriterion("patient_password is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordEqualTo(String value) {
            addCriterion("patient_password =", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordNotEqualTo(String value) {
            addCriterion("patient_password <>", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordGreaterThan(String value) {
            addCriterion("patient_password >", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("patient_password >=", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordLessThan(String value) {
            addCriterion("patient_password <", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordLessThanOrEqualTo(String value) {
            addCriterion("patient_password <=", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordLike(String value) {
            addCriterion("patient_password like", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordNotLike(String value) {
            addCriterion("patient_password not like", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordIn(List<String> values) {
            addCriterion("patient_password in", values, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordNotIn(List<String> values) {
            addCriterion("patient_password not in", values, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordBetween(String value1, String value2) {
            addCriterion("patient_password between", value1, value2, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordNotBetween(String value1, String value2) {
            addCriterion("patient_password not between", value1, value2, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNull() {
            addCriterion("patient_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNotNull() {
            addCriterion("patient_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayEqualTo(Date value) {
            addCriterion("patient_birthday =", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotEqualTo(Date value) {
            addCriterion("patient_birthday <>", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThan(Date value) {
            addCriterion("patient_birthday >", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("patient_birthday >=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThan(Date value) {
            addCriterion("patient_birthday <", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("patient_birthday <=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIn(List<Date> values) {
            addCriterion("patient_birthday in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotIn(List<Date> values) {
            addCriterion("patient_birthday not in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayBetween(Date value1, Date value2) {
            addCriterion("patient_birthday between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("patient_birthday not between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNull() {
            addCriterion("patient_sex is null");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNotNull() {
            addCriterion("patient_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSexEqualTo(String value) {
            addCriterion("patient_sex =", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotEqualTo(String value) {
            addCriterion("patient_sex <>", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThan(String value) {
            addCriterion("patient_sex >", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThanOrEqualTo(String value) {
            addCriterion("patient_sex >=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThan(String value) {
            addCriterion("patient_sex <", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThanOrEqualTo(String value) {
            addCriterion("patient_sex <=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLike(String value) {
            addCriterion("patient_sex like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotLike(String value) {
            addCriterion("patient_sex not like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexIn(List<String> values) {
            addCriterion("patient_sex in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotIn(List<String> values) {
            addCriterion("patient_sex not in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexBetween(String value1, String value2) {
            addCriterion("patient_sex between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotBetween(String value1, String value2) {
            addCriterion("patient_sex not between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIsNull() {
            addCriterion("patient_phone is null");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIsNotNull() {
            addCriterion("patient_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneEqualTo(Long value) {
            addCriterion("patient_phone =", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotEqualTo(Long value) {
            addCriterion("patient_phone <>", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneGreaterThan(Long value) {
            addCriterion("patient_phone >", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_phone >=", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneLessThan(Long value) {
            addCriterion("patient_phone <", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneLessThanOrEqualTo(Long value) {
            addCriterion("patient_phone <=", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIn(List<Long> values) {
            addCriterion("patient_phone in", values, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotIn(List<Long> values) {
            addCriterion("patient_phone not in", values, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneBetween(Long value1, Long value2) {
            addCriterion("patient_phone between", value1, value2, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotBetween(Long value1, Long value2) {
            addCriterion("patient_phone not between", value1, value2, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNull() {
            addCriterion("patient_address is null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNotNull() {
            addCriterion("patient_address is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressEqualTo(String value) {
            addCriterion("patient_address =", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotEqualTo(String value) {
            addCriterion("patient_address <>", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThan(String value) {
            addCriterion("patient_address >", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("patient_address >=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThan(String value) {
            addCriterion("patient_address <", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThanOrEqualTo(String value) {
            addCriterion("patient_address <=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLike(String value) {
            addCriterion("patient_address like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotLike(String value) {
            addCriterion("patient_address not like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIn(List<String> values) {
            addCriterion("patient_address in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotIn(List<String> values) {
            addCriterion("patient_address not in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressBetween(String value1, String value2) {
            addCriterion("patient_address between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotBetween(String value1, String value2) {
            addCriterion("patient_address not between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientNationIsNull() {
            addCriterion("patient_nation is null");
            return (Criteria) this;
        }

        public Criteria andPatientNationIsNotNull() {
            addCriterion("patient_nation is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNationEqualTo(String value) {
            addCriterion("patient_nation =", value, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationNotEqualTo(String value) {
            addCriterion("patient_nation <>", value, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationGreaterThan(String value) {
            addCriterion("patient_nation >", value, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationGreaterThanOrEqualTo(String value) {
            addCriterion("patient_nation >=", value, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationLessThan(String value) {
            addCriterion("patient_nation <", value, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationLessThanOrEqualTo(String value) {
            addCriterion("patient_nation <=", value, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationLike(String value) {
            addCriterion("patient_nation like", value, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationNotLike(String value) {
            addCriterion("patient_nation not like", value, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationIn(List<String> values) {
            addCriterion("patient_nation in", values, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationNotIn(List<String> values) {
            addCriterion("patient_nation not in", values, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationBetween(String value1, String value2) {
            addCriterion("patient_nation between", value1, value2, "patientNation");
            return (Criteria) this;
        }

        public Criteria andPatientNationNotBetween(String value1, String value2) {
            addCriterion("patient_nation not between", value1, value2, "patientNation");
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