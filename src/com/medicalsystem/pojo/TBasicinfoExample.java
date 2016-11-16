package com.medicalsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class TBasicinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBasicinfoExample() {
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

        public Criteria andBasicIdIsNull() {
            addCriterion("basic_id is null");
            return (Criteria) this;
        }

        public Criteria andBasicIdIsNotNull() {
            addCriterion("basic_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasicIdEqualTo(Long value) {
            addCriterion("basic_id =", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotEqualTo(Long value) {
            addCriterion("basic_id <>", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThan(Long value) {
            addCriterion("basic_id >", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("basic_id >=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThan(Long value) {
            addCriterion("basic_id <", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThanOrEqualTo(Long value) {
            addCriterion("basic_id <=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdIn(List<Long> values) {
            addCriterion("basic_id in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotIn(List<Long> values) {
            addCriterion("basic_id not in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdBetween(Long value1, Long value2) {
            addCriterion("basic_id between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotBetween(Long value1, Long value2) {
            addCriterion("basic_id not between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityIsNull() {
            addCriterion("basic_humidity is null");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityIsNotNull() {
            addCriterion("basic_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityEqualTo(String value) {
            addCriterion("basic_humidity =", value, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityNotEqualTo(String value) {
            addCriterion("basic_humidity <>", value, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityGreaterThan(String value) {
            addCriterion("basic_humidity >", value, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("basic_humidity >=", value, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityLessThan(String value) {
            addCriterion("basic_humidity <", value, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityLessThanOrEqualTo(String value) {
            addCriterion("basic_humidity <=", value, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityLike(String value) {
            addCriterion("basic_humidity like", value, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityNotLike(String value) {
            addCriterion("basic_humidity not like", value, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityIn(List<String> values) {
            addCriterion("basic_humidity in", values, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityNotIn(List<String> values) {
            addCriterion("basic_humidity not in", values, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityBetween(String value1, String value2) {
            addCriterion("basic_humidity between", value1, value2, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicHumidityNotBetween(String value1, String value2) {
            addCriterion("basic_humidity not between", value1, value2, "basicHumidity");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureIsNull() {
            addCriterion("basic_temperature is null");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureIsNotNull() {
            addCriterion("basic_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureEqualTo(String value) {
            addCriterion("basic_temperature =", value, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureNotEqualTo(String value) {
            addCriterion("basic_temperature <>", value, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureGreaterThan(String value) {
            addCriterion("basic_temperature >", value, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("basic_temperature >=", value, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureLessThan(String value) {
            addCriterion("basic_temperature <", value, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureLessThanOrEqualTo(String value) {
            addCriterion("basic_temperature <=", value, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureLike(String value) {
            addCriterion("basic_temperature like", value, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureNotLike(String value) {
            addCriterion("basic_temperature not like", value, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureIn(List<String> values) {
            addCriterion("basic_temperature in", values, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureNotIn(List<String> values) {
            addCriterion("basic_temperature not in", values, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureBetween(String value1, String value2) {
            addCriterion("basic_temperature between", value1, value2, "basicTemperature");
            return (Criteria) this;
        }

        public Criteria andBasicTemperatureNotBetween(String value1, String value2) {
            addCriterion("basic_temperature not between", value1, value2, "basicTemperature");
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

        public Criteria andCostIdIsNull() {
            addCriterion("cost_id is null");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNotNull() {
            addCriterion("cost_id is not null");
            return (Criteria) this;
        }

        public Criteria andCostIdEqualTo(Long value) {
            addCriterion("cost_id =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(Long value) {
            addCriterion("cost_id <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(Long value) {
            addCriterion("cost_id >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cost_id >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(Long value) {
            addCriterion("cost_id <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(Long value) {
            addCriterion("cost_id <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<Long> values) {
            addCriterion("cost_id in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<Long> values) {
            addCriterion("cost_id not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(Long value1, Long value2) {
            addCriterion("cost_id between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(Long value1, Long value2) {
            addCriterion("cost_id not between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andBasicTitleIsNull() {
            addCriterion("basic_title is null");
            return (Criteria) this;
        }

        public Criteria andBasicTitleIsNotNull() {
            addCriterion("basic_title is not null");
            return (Criteria) this;
        }

        public Criteria andBasicTitleEqualTo(String value) {
            addCriterion("basic_title =", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleNotEqualTo(String value) {
            addCriterion("basic_title <>", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleGreaterThan(String value) {
            addCriterion("basic_title >", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("basic_title >=", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleLessThan(String value) {
            addCriterion("basic_title <", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleLessThanOrEqualTo(String value) {
            addCriterion("basic_title <=", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleLike(String value) {
            addCriterion("basic_title like", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleNotLike(String value) {
            addCriterion("basic_title not like", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleIn(List<String> values) {
            addCriterion("basic_title in", values, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleNotIn(List<String> values) {
            addCriterion("basic_title not in", values, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleBetween(String value1, String value2) {
            addCriterion("basic_title between", value1, value2, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleNotBetween(String value1, String value2) {
            addCriterion("basic_title not between", value1, value2, "basicTitle");
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