package com.medicalsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class TDoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDoctorExample() {
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

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Long value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Long value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Long value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Long value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Long value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Long> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Long> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Long value1, Long value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Long value1, Long value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctor_name like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIsNull() {
            addCriterion("doctor_sex is null");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIsNotNull() {
            addCriterion("doctor_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorSexEqualTo(String value) {
            addCriterion("doctor_sex =", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotEqualTo(String value) {
            addCriterion("doctor_sex <>", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexGreaterThan(String value) {
            addCriterion("doctor_sex >", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_sex >=", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLessThan(String value) {
            addCriterion("doctor_sex <", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLessThanOrEqualTo(String value) {
            addCriterion("doctor_sex <=", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLike(String value) {
            addCriterion("doctor_sex like", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotLike(String value) {
            addCriterion("doctor_sex not like", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIn(List<String> values) {
            addCriterion("doctor_sex in", values, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotIn(List<String> values) {
            addCriterion("doctor_sex not in", values, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexBetween(String value1, String value2) {
            addCriterion("doctor_sex between", value1, value2, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotBetween(String value1, String value2) {
            addCriterion("doctor_sex not between", value1, value2, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorDescIsNull() {
            addCriterion("doctor_desc is null");
            return (Criteria) this;
        }

        public Criteria andDoctorDescIsNotNull() {
            addCriterion("doctor_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorDescEqualTo(String value) {
            addCriterion("doctor_desc =", value, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescNotEqualTo(String value) {
            addCriterion("doctor_desc <>", value, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescGreaterThan(String value) {
            addCriterion("doctor_desc >", value, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_desc >=", value, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescLessThan(String value) {
            addCriterion("doctor_desc <", value, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescLessThanOrEqualTo(String value) {
            addCriterion("doctor_desc <=", value, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescLike(String value) {
            addCriterion("doctor_desc like", value, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescNotLike(String value) {
            addCriterion("doctor_desc not like", value, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescIn(List<String> values) {
            addCriterion("doctor_desc in", values, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescNotIn(List<String> values) {
            addCriterion("doctor_desc not in", values, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescBetween(String value1, String value2) {
            addCriterion("doctor_desc between", value1, value2, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDoctorDescNotBetween(String value1, String value2) {
            addCriterion("doctor_desc not between", value1, value2, "doctorDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
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