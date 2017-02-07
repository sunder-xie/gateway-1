package com.ehsy.svccfg.svc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SvcAccessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SvcAccessExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNull() {
            addCriterion("COMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNotNull() {
            addCriterion("COMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompIdEqualTo(String value) {
            addCriterion("COMP_ID =", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotEqualTo(String value) {
            addCriterion("COMP_ID <>", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThan(String value) {
            addCriterion("COMP_ID >", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ID >=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThan(String value) {
            addCriterion("COMP_ID <", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThanOrEqualTo(String value) {
            addCriterion("COMP_ID <=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLike(String value) {
            addCriterion("COMP_ID like", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotLike(String value) {
            addCriterion("COMP_ID not like", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdIn(List<String> values) {
            addCriterion("COMP_ID in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotIn(List<String> values) {
            addCriterion("COMP_ID not in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdBetween(String value1, String value2) {
            addCriterion("COMP_ID between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotBetween(String value1, String value2) {
            addCriterion("COMP_ID not between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompAbbIsNull() {
            addCriterion("COMP_ABB is null");
            return (Criteria) this;
        }

        public Criteria andCompAbbIsNotNull() {
            addCriterion("COMP_ABB is not null");
            return (Criteria) this;
        }

        public Criteria andCompAbbEqualTo(String value) {
            addCriterion("COMP_ABB =", value, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbNotEqualTo(String value) {
            addCriterion("COMP_ABB <>", value, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbGreaterThan(String value) {
            addCriterion("COMP_ABB >", value, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ABB >=", value, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbLessThan(String value) {
            addCriterion("COMP_ABB <", value, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbLessThanOrEqualTo(String value) {
            addCriterion("COMP_ABB <=", value, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbLike(String value) {
            addCriterion("COMP_ABB like", value, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbNotLike(String value) {
            addCriterion("COMP_ABB not like", value, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbIn(List<String> values) {
            addCriterion("COMP_ABB in", values, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbNotIn(List<String> values) {
            addCriterion("COMP_ABB not in", values, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbBetween(String value1, String value2) {
            addCriterion("COMP_ABB between", value1, value2, "compAbb");
            return (Criteria) this;
        }

        public Criteria andCompAbbNotBetween(String value1, String value2) {
            addCriterion("COMP_ABB not between", value1, value2, "compAbb");
            return (Criteria) this;
        }

        public Criteria andSvrIdIsNull() {
            addCriterion("SVR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSvrIdIsNotNull() {
            addCriterion("SVR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSvrIdEqualTo(String value) {
            addCriterion("SVR_ID =", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotEqualTo(String value) {
            addCriterion("SVR_ID <>", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdGreaterThan(String value) {
            addCriterion("SVR_ID >", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_ID >=", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLessThan(String value) {
            addCriterion("SVR_ID <", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLessThanOrEqualTo(String value) {
            addCriterion("SVR_ID <=", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLike(String value) {
            addCriterion("SVR_ID like", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotLike(String value) {
            addCriterion("SVR_ID not like", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdIn(List<String> values) {
            addCriterion("SVR_ID in", values, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotIn(List<String> values) {
            addCriterion("SVR_ID not in", values, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdBetween(String value1, String value2) {
            addCriterion("SVR_ID between", value1, value2, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotBetween(String value1, String value2) {
            addCriterion("SVR_ID not between", value1, value2, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrCodeIsNull() {
            addCriterion("SVR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSvrCodeIsNotNull() {
            addCriterion("SVR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSvrCodeEqualTo(String value) {
            addCriterion("SVR_CODE =", value, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeNotEqualTo(String value) {
            addCriterion("SVR_CODE <>", value, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeGreaterThan(String value) {
            addCriterion("SVR_CODE >", value, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_CODE >=", value, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeLessThan(String value) {
            addCriterion("SVR_CODE <", value, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeLessThanOrEqualTo(String value) {
            addCriterion("SVR_CODE <=", value, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeLike(String value) {
            addCriterion("SVR_CODE like", value, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeNotLike(String value) {
            addCriterion("SVR_CODE not like", value, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeIn(List<String> values) {
            addCriterion("SVR_CODE in", values, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeNotIn(List<String> values) {
            addCriterion("SVR_CODE not in", values, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeBetween(String value1, String value2) {
            addCriterion("SVR_CODE between", value1, value2, "svrCode");
            return (Criteria) this;
        }

        public Criteria andSvrCodeNotBetween(String value1, String value2) {
            addCriterion("SVR_CODE not between", value1, value2, "svrCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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