package top.dumbzarro.flyticket.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
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

        public Criteria andPlaneIdIsNull() {
            addCriterion("plane_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaneIdIsNotNull() {
            addCriterion("plane_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneIdEqualTo(Integer value) {
            addCriterion("plane_id =", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdNotEqualTo(Integer value) {
            addCriterion("plane_id <>", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdGreaterThan(Integer value) {
            addCriterion("plane_id >", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plane_id >=", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdLessThan(Integer value) {
            addCriterion("plane_id <", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdLessThanOrEqualTo(Integer value) {
            addCriterion("plane_id <=", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdIn(List<Integer> values) {
            addCriterion("plane_id in", values, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdNotIn(List<Integer> values) {
            addCriterion("plane_id not in", values, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdBetween(Integer value1, Integer value2) {
            addCriterion("plane_id between", value1, value2, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plane_id not between", value1, value2, "planeId");
            return (Criteria) this;
        }

        public Criteria andStartTIsNull() {
            addCriterion("start_t is null");
            return (Criteria) this;
        }

        public Criteria andStartTIsNotNull() {
            addCriterion("start_t is not null");
            return (Criteria) this;
        }

        public Criteria andStartTEqualTo(Date value) {
            addCriterion("start_t =", value, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTNotEqualTo(Date value) {
            addCriterion("start_t <>", value, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTGreaterThan(Date value) {
            addCriterion("start_t >", value, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTGreaterThanOrEqualTo(Date value) {
            addCriterion("start_t >=", value, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTLessThan(Date value) {
            addCriterion("start_t <", value, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTLessThanOrEqualTo(Date value) {
            addCriterion("start_t <=", value, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTIn(List<Date> values) {
            addCriterion("start_t in", values, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTNotIn(List<Date> values) {
            addCriterion("start_t not in", values, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTBetween(Date value1, Date value2) {
            addCriterion("start_t between", value1, value2, "startT");
            return (Criteria) this;
        }

        public Criteria andStartTNotBetween(Date value1, Date value2) {
            addCriterion("start_t not between", value1, value2, "startT");
            return (Criteria) this;
        }

        public Criteria andEndTIsNull() {
            addCriterion("end_t is null");
            return (Criteria) this;
        }

        public Criteria andEndTIsNotNull() {
            addCriterion("end_t is not null");
            return (Criteria) this;
        }

        public Criteria andEndTEqualTo(Date value) {
            addCriterion("end_t =", value, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTNotEqualTo(Date value) {
            addCriterion("end_t <>", value, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTGreaterThan(Date value) {
            addCriterion("end_t >", value, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTGreaterThanOrEqualTo(Date value) {
            addCriterion("end_t >=", value, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTLessThan(Date value) {
            addCriterion("end_t <", value, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTLessThanOrEqualTo(Date value) {
            addCriterion("end_t <=", value, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTIn(List<Date> values) {
            addCriterion("end_t in", values, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTNotIn(List<Date> values) {
            addCriterion("end_t not in", values, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTBetween(Date value1, Date value2) {
            addCriterion("end_t between", value1, value2, "endT");
            return (Criteria) this;
        }

        public Criteria andEndTNotBetween(Date value1, Date value2) {
            addCriterion("end_t not between", value1, value2, "endT");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
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