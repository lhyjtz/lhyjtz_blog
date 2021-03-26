package com.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoIdIsNull() {
            addCriterion("Video_ID is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("Video_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Integer value) {
            addCriterion("Video_ID =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Integer value) {
            addCriterion("Video_ID <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Integer value) {
            addCriterion("Video_ID >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Video_ID >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Integer value) {
            addCriterion("Video_ID <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Integer value) {
            addCriterion("Video_ID <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Integer> values) {
            addCriterion("Video_ID in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Integer> values) {
            addCriterion("Video_ID not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Integer value1, Integer value2) {
            addCriterion("Video_ID between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Video_ID not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameIsNull() {
            addCriterion("Video_FileName is null");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameIsNotNull() {
            addCriterion("Video_FileName is not null");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameEqualTo(String value) {
            addCriterion("Video_FileName =", value, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameNotEqualTo(String value) {
            addCriterion("Video_FileName <>", value, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameGreaterThan(String value) {
            addCriterion("Video_FileName >", value, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("Video_FileName >=", value, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameLessThan(String value) {
            addCriterion("Video_FileName <", value, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameLessThanOrEqualTo(String value) {
            addCriterion("Video_FileName <=", value, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameLike(String value) {
            addCriterion("Video_FileName like", value, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameNotLike(String value) {
            addCriterion("Video_FileName not like", value, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameIn(List<String> values) {
            addCriterion("Video_FileName in", values, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameNotIn(List<String> values) {
            addCriterion("Video_FileName not in", values, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameBetween(String value1, String value2) {
            addCriterion("Video_FileName between", value1, value2, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoFilenameNotBetween(String value1, String value2) {
            addCriterion("Video_FileName not between", value1, value2, "videoFilename");
            return (Criteria) this;
        }

        public Criteria andVideoPathIsNull() {
            addCriterion("Video_Path is null");
            return (Criteria) this;
        }

        public Criteria andVideoPathIsNotNull() {
            addCriterion("Video_Path is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPathEqualTo(String value) {
            addCriterion("Video_Path =", value, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathNotEqualTo(String value) {
            addCriterion("Video_Path <>", value, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathGreaterThan(String value) {
            addCriterion("Video_Path >", value, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathGreaterThanOrEqualTo(String value) {
            addCriterion("Video_Path >=", value, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathLessThan(String value) {
            addCriterion("Video_Path <", value, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathLessThanOrEqualTo(String value) {
            addCriterion("Video_Path <=", value, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathLike(String value) {
            addCriterion("Video_Path like", value, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathNotLike(String value) {
            addCriterion("Video_Path not like", value, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathIn(List<String> values) {
            addCriterion("Video_Path in", values, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathNotIn(List<String> values) {
            addCriterion("Video_Path not in", values, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathBetween(String value1, String value2) {
            addCriterion("Video_Path between", value1, value2, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoPathNotBetween(String value1, String value2) {
            addCriterion("Video_Path not between", value1, value2, "videoPath");
            return (Criteria) this;
        }

        public Criteria andVideoDataIsNull() {
            addCriterion("Video_Data is null");
            return (Criteria) this;
        }

        public Criteria andVideoDataIsNotNull() {
            addCriterion("Video_Data is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDataEqualTo(String value) {
            addCriterion("Video_Data =", value, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataNotEqualTo(String value) {
            addCriterion("Video_Data <>", value, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataGreaterThan(String value) {
            addCriterion("Video_Data >", value, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataGreaterThanOrEqualTo(String value) {
            addCriterion("Video_Data >=", value, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataLessThan(String value) {
            addCriterion("Video_Data <", value, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataLessThanOrEqualTo(String value) {
            addCriterion("Video_Data <=", value, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataLike(String value) {
            addCriterion("Video_Data like", value, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataNotLike(String value) {
            addCriterion("Video_Data not like", value, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataIn(List<String> values) {
            addCriterion("Video_Data in", values, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataNotIn(List<String> values) {
            addCriterion("Video_Data not in", values, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataBetween(String value1, String value2) {
            addCriterion("Video_Data between", value1, value2, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoDataNotBetween(String value1, String value2) {
            addCriterion("Video_Data not between", value1, value2, "videoData");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIsNull() {
            addCriterion("Video_Title is null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIsNotNull() {
            addCriterion("Video_Title is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleEqualTo(String value) {
            addCriterion("Video_Title =", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotEqualTo(String value) {
            addCriterion("Video_Title <>", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThan(String value) {
            addCriterion("Video_Title >", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Video_Title >=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThan(String value) {
            addCriterion("Video_Title <", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThanOrEqualTo(String value) {
            addCriterion("Video_Title <=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLike(String value) {
            addCriterion("Video_Title like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotLike(String value) {
            addCriterion("Video_Title not like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIn(List<String> values) {
            addCriterion("Video_Title in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotIn(List<String> values) {
            addCriterion("Video_Title not in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleBetween(String value1, String value2) {
            addCriterion("Video_Title between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotBetween(String value1, String value2) {
            addCriterion("Video_Title not between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdIsNull() {
            addCriterion("Video_Picture_ID is null");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdIsNotNull() {
            addCriterion("Video_Picture_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdEqualTo(String value) {
            addCriterion("Video_Picture_ID =", value, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdNotEqualTo(String value) {
            addCriterion("Video_Picture_ID <>", value, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdGreaterThan(String value) {
            addCriterion("Video_Picture_ID >", value, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdGreaterThanOrEqualTo(String value) {
            addCriterion("Video_Picture_ID >=", value, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdLessThan(String value) {
            addCriterion("Video_Picture_ID <", value, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdLessThanOrEqualTo(String value) {
            addCriterion("Video_Picture_ID <=", value, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdLike(String value) {
            addCriterion("Video_Picture_ID like", value, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdNotLike(String value) {
            addCriterion("Video_Picture_ID not like", value, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdIn(List<String> values) {
            addCriterion("Video_Picture_ID in", values, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdNotIn(List<String> values) {
            addCriterion("Video_Picture_ID not in", values, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdBetween(String value1, String value2) {
            addCriterion("Video_Picture_ID between", value1, value2, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoPictureIdNotBetween(String value1, String value2) {
            addCriterion("Video_Picture_ID not between", value1, value2, "videoPictureId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNull() {
            addCriterion("Video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("Video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(String value) {
            addCriterion("Video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(String value) {
            addCriterion("Video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(String value) {
            addCriterion("Video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(String value) {
            addCriterion("Video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(String value) {
            addCriterion("Video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLike(String value) {
            addCriterion("Video_type like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotLike(String value) {
            addCriterion("Video_type not like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<String> values) {
            addCriterion("Video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<String> values) {
            addCriterion("Video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(String value1, String value2) {
            addCriterion("Video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(String value1, String value2) {
            addCriterion("Video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdIsNull() {
            addCriterion("Video_Resource_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdIsNotNull() {
            addCriterion("Video_Resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdEqualTo(Integer value) {
            addCriterion("Video_Resource_id =", value, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdNotEqualTo(Integer value) {
            addCriterion("Video_Resource_id <>", value, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdGreaterThan(Integer value) {
            addCriterion("Video_Resource_id >", value, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Video_Resource_id >=", value, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdLessThan(Integer value) {
            addCriterion("Video_Resource_id <", value, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("Video_Resource_id <=", value, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdIn(List<Integer> values) {
            addCriterion("Video_Resource_id in", values, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdNotIn(List<Integer> values) {
            addCriterion("Video_Resource_id not in", values, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("Video_Resource_id between", value1, value2, "videoResourceId");
            return (Criteria) this;
        }

        public Criteria andVideoResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Video_Resource_id not between", value1, value2, "videoResourceId");
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