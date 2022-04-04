package top.dumbzarro.flyticket.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(Integer value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(Integer value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(Integer value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(Integer value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<Integer> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<Integer> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andFlightIdIsNull() {
            addCriterion("flight_id is null");
            return (Criteria) this;
        }

        public Criteria andFlightIdIsNotNull() {
            addCriterion("flight_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlightIdEqualTo(Integer value) {
            addCriterion("flight_id =", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotEqualTo(Integer value) {
            addCriterion("flight_id <>", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdGreaterThan(Integer value) {
            addCriterion("flight_id >", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flight_id >=", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdLessThan(Integer value) {
            addCriterion("flight_id <", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdLessThanOrEqualTo(Integer value) {
            addCriterion("flight_id <=", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdIn(List<Integer> values) {
            addCriterion("flight_id in", values, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotIn(List<Integer> values) {
            addCriterion("flight_id not in", values, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdBetween(Integer value1, Integer value2) {
            addCriterion("flight_id between", value1, value2, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flight_id not between", value1, value2, "flightId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Integer value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Integer value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Integer value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Integer value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Integer value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Integer> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Integer> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Integer value1, Integer value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Integer value1, Integer value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andOrderTIsNull() {
            addCriterion("order_t is null");
            return (Criteria) this;
        }

        public Criteria andOrderTIsNotNull() {
            addCriterion("order_t is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTEqualTo(Date value) {
            addCriterion("order_t =", value, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTNotEqualTo(Date value) {
            addCriterion("order_t <>", value, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTGreaterThan(Date value) {
            addCriterion("order_t >", value, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTGreaterThanOrEqualTo(Date value) {
            addCriterion("order_t >=", value, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTLessThan(Date value) {
            addCriterion("order_t <", value, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTLessThanOrEqualTo(Date value) {
            addCriterion("order_t <=", value, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTIn(List<Date> values) {
            addCriterion("order_t in", values, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTNotIn(List<Date> values) {
            addCriterion("order_t not in", values, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTBetween(Date value1, Date value2) {
            addCriterion("order_t between", value1, value2, "orderT");
            return (Criteria) this;
        }

        public Criteria andOrderTNotBetween(Date value1, Date value2) {
            addCriterion("order_t not between", value1, value2, "orderT");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(Boolean value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(Boolean value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(Boolean value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(Boolean value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(Boolean value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<Boolean> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<Boolean> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
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