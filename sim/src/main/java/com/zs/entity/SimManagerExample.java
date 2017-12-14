package com.zs.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SimManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimManagerExample() {
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStanoIsNull() {
            addCriterion("STANO is null");
            return (Criteria) this;
        }

        public Criteria andStanoIsNotNull() {
            addCriterion("STANO is not null");
            return (Criteria) this;
        }

        public Criteria andStanoEqualTo(String value) {
            addCriterion("STANO =", value, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoNotEqualTo(String value) {
            addCriterion("STANO <>", value, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoGreaterThan(String value) {
            addCriterion("STANO >", value, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoGreaterThanOrEqualTo(String value) {
            addCriterion("STANO >=", value, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoLessThan(String value) {
            addCriterion("STANO <", value, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoLessThanOrEqualTo(String value) {
            addCriterion("STANO <=", value, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoLike(String value) {
            addCriterion("STANO like", value, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoNotLike(String value) {
            addCriterion("STANO not like", value, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoIn(List<String> values) {
            addCriterion("STANO in", values, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoNotIn(List<String> values) {
            addCriterion("STANO not in", values, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoBetween(String value1, String value2) {
            addCriterion("STANO between", value1, value2, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoNotBetween(String value1, String value2) {
            addCriterion("STANO not between", value1, value2, "stano");
            return (Criteria) this;
        }

        public Criteria andStanoManIsNull() {
            addCriterion("STANO_MAN is null");
            return (Criteria) this;
        }

        public Criteria andStanoManIsNotNull() {
            addCriterion("STANO_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andStanoManEqualTo(String value) {
            addCriterion("STANO_MAN =", value, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManNotEqualTo(String value) {
            addCriterion("STANO_MAN <>", value, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManGreaterThan(String value) {
            addCriterion("STANO_MAN >", value, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManGreaterThanOrEqualTo(String value) {
            addCriterion("STANO_MAN >=", value, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManLessThan(String value) {
            addCriterion("STANO_MAN <", value, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManLessThanOrEqualTo(String value) {
            addCriterion("STANO_MAN <=", value, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManLike(String value) {
            addCriterion("STANO_MAN like", value, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManNotLike(String value) {
            addCriterion("STANO_MAN not like", value, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManIn(List<String> values) {
            addCriterion("STANO_MAN in", values, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManNotIn(List<String> values) {
            addCriterion("STANO_MAN not in", values, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManBetween(String value1, String value2) {
            addCriterion("STANO_MAN between", value1, value2, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andStanoManNotBetween(String value1, String value2) {
            addCriterion("STANO_MAN not between", value1, value2, "stanoMan");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSimNumberIsNull() {
            addCriterion("SIM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSimNumberIsNotNull() {
            addCriterion("SIM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSimNumberEqualTo(String value) {
            addCriterion("SIM_NUMBER =", value, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberNotEqualTo(String value) {
            addCriterion("SIM_NUMBER <>", value, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberGreaterThan(String value) {
            addCriterion("SIM_NUMBER >", value, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SIM_NUMBER >=", value, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberLessThan(String value) {
            addCriterion("SIM_NUMBER <", value, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberLessThanOrEqualTo(String value) {
            addCriterion("SIM_NUMBER <=", value, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberLike(String value) {
            addCriterion("SIM_NUMBER like", value, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberNotLike(String value) {
            addCriterion("SIM_NUMBER not like", value, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberIn(List<String> values) {
            addCriterion("SIM_NUMBER in", values, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberNotIn(List<String> values) {
            addCriterion("SIM_NUMBER not in", values, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberBetween(String value1, String value2) {
            addCriterion("SIM_NUMBER between", value1, value2, "simNumber");
            return (Criteria) this;
        }

        public Criteria andSimNumberNotBetween(String value1, String value2) {
            addCriterion("SIM_NUMBER not between", value1, value2, "simNumber");
            return (Criteria) this;
        }

        public Criteria andCreateManIsNull() {
            addCriterion("CREATE_MAN is null");
            return (Criteria) this;
        }

        public Criteria andCreateManIsNotNull() {
            addCriterion("CREATE_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andCreateManEqualTo(String value) {
            addCriterion("CREATE_MAN =", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotEqualTo(String value) {
            addCriterion("CREATE_MAN <>", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManGreaterThan(String value) {
            addCriterion("CREATE_MAN >", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_MAN >=", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManLessThan(String value) {
            addCriterion("CREATE_MAN <", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManLessThanOrEqualTo(String value) {
            addCriterion("CREATE_MAN <=", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManLike(String value) {
            addCriterion("CREATE_MAN like", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotLike(String value) {
            addCriterion("CREATE_MAN not like", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManIn(List<String> values) {
            addCriterion("CREATE_MAN in", values, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotIn(List<String> values) {
            addCriterion("CREATE_MAN not in", values, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManBetween(String value1, String value2) {
            addCriterion("CREATE_MAN between", value1, value2, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotBetween(String value1, String value2) {
            addCriterion("CREATE_MAN not between", value1, value2, "createMan");
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

        public Criteria andIsHistoryIsNull() {
            addCriterion("IS_HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andIsHistoryIsNotNull() {
            addCriterion("IS_HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andIsHistoryEqualTo(BigDecimal value) {
            addCriterion("IS_HISTORY =", value, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryNotEqualTo(BigDecimal value) {
            addCriterion("IS_HISTORY <>", value, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryGreaterThan(BigDecimal value) {
            addCriterion("IS_HISTORY >", value, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_HISTORY >=", value, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryLessThan(BigDecimal value) {
            addCriterion("IS_HISTORY <", value, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_HISTORY <=", value, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryIn(List<BigDecimal> values) {
            addCriterion("IS_HISTORY in", values, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryNotIn(List<BigDecimal> values) {
            addCriterion("IS_HISTORY not in", values, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_HISTORY between", value1, value2, "isHistory");
            return (Criteria) this;
        }

        public Criteria andIsHistoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_HISTORY not between", value1, value2, "isHistory");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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