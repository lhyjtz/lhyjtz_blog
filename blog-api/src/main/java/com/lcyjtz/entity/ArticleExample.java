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

        public Criteria andArticleIdIsNull() {
            addCriterion("Article_ID is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("Article_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("Article_ID =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("Article_ID <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("Article_ID >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_ID >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("Article_ID <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Article_ID <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("Article_ID in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("Article_ID not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("Article_ID between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_ID not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameIsNull() {
            addCriterion("Article_FileName is null");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameIsNotNull() {
            addCriterion("Article_FileName is not null");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameEqualTo(String value) {
            addCriterion("Article_FileName =", value, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameNotEqualTo(String value) {
            addCriterion("Article_FileName <>", value, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameGreaterThan(String value) {
            addCriterion("Article_FileName >", value, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("Article_FileName >=", value, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameLessThan(String value) {
            addCriterion("Article_FileName <", value, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameLessThanOrEqualTo(String value) {
            addCriterion("Article_FileName <=", value, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameLike(String value) {
            addCriterion("Article_FileName like", value, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameNotLike(String value) {
            addCriterion("Article_FileName not like", value, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameIn(List<String> values) {
            addCriterion("Article_FileName in", values, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameNotIn(List<String> values) {
            addCriterion("Article_FileName not in", values, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameBetween(String value1, String value2) {
            addCriterion("Article_FileName between", value1, value2, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticleFilenameNotBetween(String value1, String value2) {
            addCriterion("Article_FileName not between", value1, value2, "articleFilename");
            return (Criteria) this;
        }

        public Criteria andArticlePathIsNull() {
            addCriterion("Article_Path is null");
            return (Criteria) this;
        }

        public Criteria andArticlePathIsNotNull() {
            addCriterion("Article_Path is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePathEqualTo(String value) {
            addCriterion("Article_Path =", value, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathNotEqualTo(String value) {
            addCriterion("Article_Path <>", value, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathGreaterThan(String value) {
            addCriterion("Article_Path >", value, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Path >=", value, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathLessThan(String value) {
            addCriterion("Article_Path <", value, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathLessThanOrEqualTo(String value) {
            addCriterion("Article_Path <=", value, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathLike(String value) {
            addCriterion("Article_Path like", value, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathNotLike(String value) {
            addCriterion("Article_Path not like", value, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathIn(List<String> values) {
            addCriterion("Article_Path in", values, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathNotIn(List<String> values) {
            addCriterion("Article_Path not in", values, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathBetween(String value1, String value2) {
            addCriterion("Article_Path between", value1, value2, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticlePathNotBetween(String value1, String value2) {
            addCriterion("Article_Path not between", value1, value2, "articlePath");
            return (Criteria) this;
        }

        public Criteria andArticleDataIsNull() {
            addCriterion("Article_Data is null");
            return (Criteria) this;
        }

        public Criteria andArticleDataIsNotNull() {
            addCriterion("Article_Data is not null");
            return (Criteria) this;
        }

        public Criteria andArticleDataEqualTo(String value) {
            addCriterion("Article_Data =", value, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataNotEqualTo(String value) {
            addCriterion("Article_Data <>", value, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataGreaterThan(String value) {
            addCriterion("Article_Data >", value, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Data >=", value, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataLessThan(String value) {
            addCriterion("Article_Data <", value, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataLessThanOrEqualTo(String value) {
            addCriterion("Article_Data <=", value, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataLike(String value) {
            addCriterion("Article_Data like", value, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataNotLike(String value) {
            addCriterion("Article_Data not like", value, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataIn(List<String> values) {
            addCriterion("Article_Data in", values, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataNotIn(List<String> values) {
            addCriterion("Article_Data not in", values, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataBetween(String value1, String value2) {
            addCriterion("Article_Data between", value1, value2, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleDataNotBetween(String value1, String value2) {
            addCriterion("Article_Data not between", value1, value2, "articleData");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("Article_Title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("Article_Title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("Article_Title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("Article_Title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("Article_Title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("Article_Title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("Article_Title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("Article_Title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("Article_Title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("Article_Title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("Article_Title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("Article_Title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("Article_Title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceIsNull() {
            addCriterion("Article_Introduce is null");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceIsNotNull() {
            addCriterion("Article_Introduce is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceEqualTo(String value) {
            addCriterion("Article_Introduce =", value, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceNotEqualTo(String value) {
            addCriterion("Article_Introduce <>", value, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceGreaterThan(String value) {
            addCriterion("Article_Introduce >", value, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Introduce >=", value, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceLessThan(String value) {
            addCriterion("Article_Introduce <", value, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceLessThanOrEqualTo(String value) {
            addCriterion("Article_Introduce <=", value, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceLike(String value) {
            addCriterion("Article_Introduce like", value, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceNotLike(String value) {
            addCriterion("Article_Introduce not like", value, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceIn(List<String> values) {
            addCriterion("Article_Introduce in", values, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceNotIn(List<String> values) {
            addCriterion("Article_Introduce not in", values, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceBetween(String value1, String value2) {
            addCriterion("Article_Introduce between", value1, value2, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleIntroduceNotBetween(String value1, String value2) {
            addCriterion("Article_Introduce not between", value1, value2, "articleIntroduce");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNull() {
            addCriterion("Article_Type is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNotNull() {
            addCriterion("Article_Type is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeEqualTo(String value) {
            addCriterion("Article_Type =", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotEqualTo(String value) {
            addCriterion("Article_Type <>", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThan(String value) {
            addCriterion("Article_Type >", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Type >=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThan(String value) {
            addCriterion("Article_Type <", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThanOrEqualTo(String value) {
            addCriterion("Article_Type <=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLike(String value) {
            addCriterion("Article_Type like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotLike(String value) {
            addCriterion("Article_Type not like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIn(List<String> values) {
            addCriterion("Article_Type in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotIn(List<String> values) {
            addCriterion("Article_Type not in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeBetween(String value1, String value2) {
            addCriterion("Article_Type between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotBetween(String value1, String value2) {
            addCriterion("Article_Type not between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdIsNull() {
            addCriterion("Article_Picture_ID is null");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdIsNotNull() {
            addCriterion("Article_Picture_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdEqualTo(String value) {
            addCriterion("Article_Picture_ID =", value, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdNotEqualTo(String value) {
            addCriterion("Article_Picture_ID <>", value, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdGreaterThan(String value) {
            addCriterion("Article_Picture_ID >", value, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Picture_ID >=", value, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdLessThan(String value) {
            addCriterion("Article_Picture_ID <", value, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdLessThanOrEqualTo(String value) {
            addCriterion("Article_Picture_ID <=", value, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdLike(String value) {
            addCriterion("Article_Picture_ID like", value, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdNotLike(String value) {
            addCriterion("Article_Picture_ID not like", value, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdIn(List<String> values) {
            addCriterion("Article_Picture_ID in", values, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdNotIn(List<String> values) {
            addCriterion("Article_Picture_ID not in", values, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdBetween(String value1, String value2) {
            addCriterion("Article_Picture_ID between", value1, value2, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticlePictureIdNotBetween(String value1, String value2) {
            addCriterion("Article_Picture_ID not between", value1, value2, "articlePictureId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdIsNull() {
            addCriterion("Article_Resource_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdIsNotNull() {
            addCriterion("Article_Resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdEqualTo(Integer value) {
            addCriterion("Article_Resource_id =", value, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdNotEqualTo(Integer value) {
            addCriterion("Article_Resource_id <>", value, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdGreaterThan(Integer value) {
            addCriterion("Article_Resource_id >", value, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_Resource_id >=", value, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdLessThan(Integer value) {
            addCriterion("Article_Resource_id <", value, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("Article_Resource_id <=", value, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdIn(List<Integer> values) {
            addCriterion("Article_Resource_id in", values, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdNotIn(List<Integer> values) {
            addCriterion("Article_Resource_id not in", values, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("Article_Resource_id between", value1, value2, "articleResourceId");
            return (Criteria) this;
        }

        public Criteria andArticleResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_Resource_id not between", value1, value2, "articleResourceId");
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