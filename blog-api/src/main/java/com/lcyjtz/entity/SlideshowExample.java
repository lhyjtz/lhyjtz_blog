package com.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class SlideshowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlideshowExample() {
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

        public Criteria andSlideshowNameIsNull() {
            addCriterion("Slideshow_Name is null");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameIsNotNull() {
            addCriterion("Slideshow_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameEqualTo(String value) {
            addCriterion("Slideshow_Name =", value, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameNotEqualTo(String value) {
            addCriterion("Slideshow_Name <>", value, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameGreaterThan(String value) {
            addCriterion("Slideshow_Name >", value, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameGreaterThanOrEqualTo(String value) {
            addCriterion("Slideshow_Name >=", value, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameLessThan(String value) {
            addCriterion("Slideshow_Name <", value, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameLessThanOrEqualTo(String value) {
            addCriterion("Slideshow_Name <=", value, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameLike(String value) {
            addCriterion("Slideshow_Name like", value, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameNotLike(String value) {
            addCriterion("Slideshow_Name not like", value, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameIn(List<String> values) {
            addCriterion("Slideshow_Name in", values, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameNotIn(List<String> values) {
            addCriterion("Slideshow_Name not in", values, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameBetween(String value1, String value2) {
            addCriterion("Slideshow_Name between", value1, value2, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowNameNotBetween(String value1, String value2) {
            addCriterion("Slideshow_Name not between", value1, value2, "slideshowName");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathIsNull() {
            addCriterion("Slideshow_Path is null");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathIsNotNull() {
            addCriterion("Slideshow_Path is not null");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathEqualTo(String value) {
            addCriterion("Slideshow_Path =", value, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathNotEqualTo(String value) {
            addCriterion("Slideshow_Path <>", value, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathGreaterThan(String value) {
            addCriterion("Slideshow_Path >", value, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathGreaterThanOrEqualTo(String value) {
            addCriterion("Slideshow_Path >=", value, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathLessThan(String value) {
            addCriterion("Slideshow_Path <", value, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathLessThanOrEqualTo(String value) {
            addCriterion("Slideshow_Path <=", value, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathLike(String value) {
            addCriterion("Slideshow_Path like", value, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathNotLike(String value) {
            addCriterion("Slideshow_Path not like", value, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathIn(List<String> values) {
            addCriterion("Slideshow_Path in", values, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathNotIn(List<String> values) {
            addCriterion("Slideshow_Path not in", values, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathBetween(String value1, String value2) {
            addCriterion("Slideshow_Path between", value1, value2, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowPathNotBetween(String value1, String value2) {
            addCriterion("Slideshow_Path not between", value1, value2, "slideshowPath");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowIsNull() {
            addCriterion("Slideshow_Show is null");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowIsNotNull() {
            addCriterion("Slideshow_Show is not null");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowEqualTo(Integer value) {
            addCriterion("Slideshow_Show =", value, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowNotEqualTo(Integer value) {
            addCriterion("Slideshow_Show <>", value, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowGreaterThan(Integer value) {
            addCriterion("Slideshow_Show >", value, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("Slideshow_Show >=", value, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowLessThan(Integer value) {
            addCriterion("Slideshow_Show <", value, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowLessThanOrEqualTo(Integer value) {
            addCriterion("Slideshow_Show <=", value, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowIn(List<Integer> values) {
            addCriterion("Slideshow_Show in", values, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowNotIn(List<Integer> values) {
            addCriterion("Slideshow_Show not in", values, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowBetween(Integer value1, Integer value2) {
            addCriterion("Slideshow_Show between", value1, value2, "slideshowShow");
            return (Criteria) this;
        }

        public Criteria andSlideshowShowNotBetween(Integer value1, Integer value2) {
            addCriterion("Slideshow_Show not between", value1, value2, "slideshowShow");
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