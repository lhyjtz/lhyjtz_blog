package com.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleidIsNull() {
            addCriterion("ArticleID is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("ArticleID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(Integer value) {
            addCriterion("ArticleID =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(Integer value) {
            addCriterion("ArticleID <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(Integer value) {
            addCriterion("ArticleID >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ArticleID >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(Integer value) {
            addCriterion("ArticleID <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(Integer value) {
            addCriterion("ArticleID <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<Integer> values) {
            addCriterion("ArticleID in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<Integer> values) {
            addCriterion("ArticleID not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(Integer value1, Integer value2) {
            addCriterion("ArticleID between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(Integer value1, Integer value2) {
            addCriterion("ArticleID not between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameIsNull() {
            addCriterion("ArticleFileName is null");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameIsNotNull() {
            addCriterion("ArticleFileName is not null");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameEqualTo(String value) {
            addCriterion("ArticleFileName =", value, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameNotEqualTo(String value) {
            addCriterion("ArticleFileName <>", value, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameGreaterThan(String value) {
            addCriterion("ArticleFileName >", value, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameGreaterThanOrEqualTo(String value) {
            addCriterion("ArticleFileName >=", value, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameLessThan(String value) {
            addCriterion("ArticleFileName <", value, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameLessThanOrEqualTo(String value) {
            addCriterion("ArticleFileName <=", value, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameLike(String value) {
            addCriterion("ArticleFileName like", value, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameNotLike(String value) {
            addCriterion("ArticleFileName not like", value, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameIn(List<String> values) {
            addCriterion("ArticleFileName in", values, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameNotIn(List<String> values) {
            addCriterion("ArticleFileName not in", values, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameBetween(String value1, String value2) {
            addCriterion("ArticleFileName between", value1, value2, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticlefilenameNotBetween(String value1, String value2) {
            addCriterion("ArticleFileName not between", value1, value2, "articlefilename");
            return (Criteria) this;
        }

        public Criteria andArticledataIsNull() {
            addCriterion("ArticleData is null");
            return (Criteria) this;
        }

        public Criteria andArticledataIsNotNull() {
            addCriterion("ArticleData is not null");
            return (Criteria) this;
        }

        public Criteria andArticledataEqualTo(String value) {
            addCriterion("ArticleData =", value, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataNotEqualTo(String value) {
            addCriterion("ArticleData <>", value, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataGreaterThan(String value) {
            addCriterion("ArticleData >", value, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataGreaterThanOrEqualTo(String value) {
            addCriterion("ArticleData >=", value, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataLessThan(String value) {
            addCriterion("ArticleData <", value, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataLessThanOrEqualTo(String value) {
            addCriterion("ArticleData <=", value, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataLike(String value) {
            addCriterion("ArticleData like", value, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataNotLike(String value) {
            addCriterion("ArticleData not like", value, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataIn(List<String> values) {
            addCriterion("ArticleData in", values, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataNotIn(List<String> values) {
            addCriterion("ArticleData not in", values, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataBetween(String value1, String value2) {
            addCriterion("ArticleData between", value1, value2, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticledataNotBetween(String value1, String value2) {
            addCriterion("ArticleData not between", value1, value2, "articledata");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNull() {
            addCriterion("ArticleTitle is null");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNotNull() {
            addCriterion("ArticleTitle is not null");
            return (Criteria) this;
        }

        public Criteria andArticletitleEqualTo(String value) {
            addCriterion("ArticleTitle =", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotEqualTo(String value) {
            addCriterion("ArticleTitle <>", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThan(String value) {
            addCriterion("ArticleTitle >", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThanOrEqualTo(String value) {
            addCriterion("ArticleTitle >=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThan(String value) {
            addCriterion("ArticleTitle <", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThanOrEqualTo(String value) {
            addCriterion("ArticleTitle <=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLike(String value) {
            addCriterion("ArticleTitle like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotLike(String value) {
            addCriterion("ArticleTitle not like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleIn(List<String> values) {
            addCriterion("ArticleTitle in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotIn(List<String> values) {
            addCriterion("ArticleTitle not in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleBetween(String value1, String value2) {
            addCriterion("ArticleTitle between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotBetween(String value1, String value2) {
            addCriterion("ArticleTitle not between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryIsNull() {
            addCriterion("ArticleCategcry is null");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryIsNotNull() {
            addCriterion("ArticleCategcry is not null");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryEqualTo(Integer value) {
            addCriterion("ArticleCategcry =", value, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryNotEqualTo(Integer value) {
            addCriterion("ArticleCategcry <>", value, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryGreaterThan(Integer value) {
            addCriterion("ArticleCategcry >", value, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryGreaterThanOrEqualTo(Integer value) {
            addCriterion("ArticleCategcry >=", value, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryLessThan(Integer value) {
            addCriterion("ArticleCategcry <", value, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryLessThanOrEqualTo(Integer value) {
            addCriterion("ArticleCategcry <=", value, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryIn(List<Integer> values) {
            addCriterion("ArticleCategcry in", values, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryNotIn(List<Integer> values) {
            addCriterion("ArticleCategcry not in", values, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryBetween(Integer value1, Integer value2) {
            addCriterion("ArticleCategcry between", value1, value2, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticlecategcryNotBetween(Integer value1, Integer value2) {
            addCriterion("ArticleCategcry not between", value1, value2, "articlecategcry");
            return (Criteria) this;
        }

        public Criteria andArticletypeidIsNull() {
            addCriterion("ArticleTypeID is null");
            return (Criteria) this;
        }

        public Criteria andArticletypeidIsNotNull() {
            addCriterion("ArticleTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andArticletypeidEqualTo(Integer value) {
            addCriterion("ArticleTypeID =", value, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidNotEqualTo(Integer value) {
            addCriterion("ArticleTypeID <>", value, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidGreaterThan(Integer value) {
            addCriterion("ArticleTypeID >", value, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ArticleTypeID >=", value, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidLessThan(Integer value) {
            addCriterion("ArticleTypeID <", value, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidLessThanOrEqualTo(Integer value) {
            addCriterion("ArticleTypeID <=", value, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidIn(List<Integer> values) {
            addCriterion("ArticleTypeID in", values, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidNotIn(List<Integer> values) {
            addCriterion("ArticleTypeID not in", values, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidBetween(Integer value1, Integer value2) {
            addCriterion("ArticleTypeID between", value1, value2, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticletypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ArticleTypeID not between", value1, value2, "articletypeid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidIsNull() {
            addCriterion("ArticleResourceID is null");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidIsNotNull() {
            addCriterion("ArticleResourceID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidEqualTo(Integer value) {
            addCriterion("ArticleResourceID =", value, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidNotEqualTo(Integer value) {
            addCriterion("ArticleResourceID <>", value, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidGreaterThan(Integer value) {
            addCriterion("ArticleResourceID >", value, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ArticleResourceID >=", value, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidLessThan(Integer value) {
            addCriterion("ArticleResourceID <", value, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidLessThanOrEqualTo(Integer value) {
            addCriterion("ArticleResourceID <=", value, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidIn(List<Integer> values) {
            addCriterion("ArticleResourceID in", values, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidNotIn(List<Integer> values) {
            addCriterion("ArticleResourceID not in", values, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidBetween(Integer value1, Integer value2) {
            addCriterion("ArticleResourceID between", value1, value2, "articleresourceid");
            return (Criteria) this;
        }

        public Criteria andArticleresourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("ArticleResourceID not between", value1, value2, "articleresourceid");
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