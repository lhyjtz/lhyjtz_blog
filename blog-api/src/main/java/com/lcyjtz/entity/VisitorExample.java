package com.lcyjtz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class VisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitorExample() {
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

        public Criteria andVisitoridIsNull() {
            addCriterion("VisitorID is null");
            return (Criteria) this;
        }

        public Criteria andVisitoridIsNotNull() {
            addCriterion("VisitorID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitoridEqualTo(Integer value) {
            addCriterion("VisitorID =", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotEqualTo(Integer value) {
            addCriterion("VisitorID <>", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridGreaterThan(Integer value) {
            addCriterion("VisitorID >", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisitorID >=", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridLessThan(Integer value) {
            addCriterion("VisitorID <", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridLessThanOrEqualTo(Integer value) {
            addCriterion("VisitorID <=", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridIn(List<Integer> values) {
            addCriterion("VisitorID in", values, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotIn(List<Integer> values) {
            addCriterion("VisitorID not in", values, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridBetween(Integer value1, Integer value2) {
            addCriterion("VisitorID between", value1, value2, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotBetween(Integer value1, Integer value2) {
            addCriterion("VisitorID not between", value1, value2, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitornameIsNull() {
            addCriterion("VisitorName is null");
            return (Criteria) this;
        }

        public Criteria andVisitornameIsNotNull() {
            addCriterion("VisitorName is not null");
            return (Criteria) this;
        }

        public Criteria andVisitornameEqualTo(String value) {
            addCriterion("VisitorName =", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotEqualTo(String value) {
            addCriterion("VisitorName <>", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameGreaterThan(String value) {
            addCriterion("VisitorName >", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameGreaterThanOrEqualTo(String value) {
            addCriterion("VisitorName >=", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLessThan(String value) {
            addCriterion("VisitorName <", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLessThanOrEqualTo(String value) {
            addCriterion("VisitorName <=", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLike(String value) {
            addCriterion("VisitorName like", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotLike(String value) {
            addCriterion("VisitorName not like", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameIn(List<String> values) {
            addCriterion("VisitorName in", values, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotIn(List<String> values) {
            addCriterion("VisitorName not in", values, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameBetween(String value1, String value2) {
            addCriterion("VisitorName between", value1, value2, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotBetween(String value1, String value2) {
            addCriterion("VisitorName not between", value1, value2, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdIsNull() {
            addCriterion("Visitorpwd is null");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdIsNotNull() {
            addCriterion("Visitorpwd is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdEqualTo(String value) {
            addCriterion("Visitorpwd =", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdNotEqualTo(String value) {
            addCriterion("Visitorpwd <>", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdGreaterThan(String value) {
            addCriterion("Visitorpwd >", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdGreaterThanOrEqualTo(String value) {
            addCriterion("Visitorpwd >=", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdLessThan(String value) {
            addCriterion("Visitorpwd <", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdLessThanOrEqualTo(String value) {
            addCriterion("Visitorpwd <=", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdLike(String value) {
            addCriterion("Visitorpwd like", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdNotLike(String value) {
            addCriterion("Visitorpwd not like", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdIn(List<String> values) {
            addCriterion("Visitorpwd in", values, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdNotIn(List<String> values) {
            addCriterion("Visitorpwd not in", values, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdBetween(String value1, String value2) {
            addCriterion("Visitorpwd between", value1, value2, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdNotBetween(String value1, String value2) {
            addCriterion("Visitorpwd not between", value1, value2, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidIsNull() {
            addCriterion("VisitorRoleID is null");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidIsNotNull() {
            addCriterion("VisitorRoleID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidEqualTo(Integer value) {
            addCriterion("VisitorRoleID =", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidNotEqualTo(Integer value) {
            addCriterion("VisitorRoleID <>", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidGreaterThan(Integer value) {
            addCriterion("VisitorRoleID >", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisitorRoleID >=", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidLessThan(Integer value) {
            addCriterion("VisitorRoleID <", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidLessThanOrEqualTo(Integer value) {
            addCriterion("VisitorRoleID <=", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidIn(List<Integer> values) {
            addCriterion("VisitorRoleID in", values, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidNotIn(List<Integer> values) {
            addCriterion("VisitorRoleID not in", values, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidBetween(Integer value1, Integer value2) {
            addCriterion("VisitorRoleID between", value1, value2, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("VisitorRoleID not between", value1, value2, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andVisitorstateIsNull() {
            addCriterion("VisitorState is null");
            return (Criteria) this;
        }

        public Criteria andVisitorstateIsNotNull() {
            addCriterion("VisitorState is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorstateEqualTo(Integer value) {
            addCriterion("VisitorState =", value, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateNotEqualTo(Integer value) {
            addCriterion("VisitorState <>", value, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateGreaterThan(Integer value) {
            addCriterion("VisitorState >", value, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisitorState >=", value, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateLessThan(Integer value) {
            addCriterion("VisitorState <", value, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateLessThanOrEqualTo(Integer value) {
            addCriterion("VisitorState <=", value, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateIn(List<Integer> values) {
            addCriterion("VisitorState in", values, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateNotIn(List<Integer> values) {
            addCriterion("VisitorState not in", values, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateBetween(Integer value1, Integer value2) {
            addCriterion("VisitorState between", value1, value2, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorstateNotBetween(Integer value1, Integer value2) {
            addCriterion("VisitorState not between", value1, value2, "visitorstate");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeIsNull() {
            addCriterion("VisitorResume is null");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeIsNotNull() {
            addCriterion("VisitorResume is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeEqualTo(String value) {
            addCriterion("VisitorResume =", value, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeNotEqualTo(String value) {
            addCriterion("VisitorResume <>", value, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeGreaterThan(String value) {
            addCriterion("VisitorResume >", value, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeGreaterThanOrEqualTo(String value) {
            addCriterion("VisitorResume >=", value, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeLessThan(String value) {
            addCriterion("VisitorResume <", value, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeLessThanOrEqualTo(String value) {
            addCriterion("VisitorResume <=", value, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeLike(String value) {
            addCriterion("VisitorResume like", value, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeNotLike(String value) {
            addCriterion("VisitorResume not like", value, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeIn(List<String> values) {
            addCriterion("VisitorResume in", values, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeNotIn(List<String> values) {
            addCriterion("VisitorResume not in", values, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeBetween(String value1, String value2) {
            addCriterion("VisitorResume between", value1, value2, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andVisitorresumeNotBetween(String value1, String value2) {
            addCriterion("VisitorResume not between", value1, value2, "visitorresume");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIssilenceIsNull() {
            addCriterion("IsSilence is null");
            return (Criteria) this;
        }

        public Criteria andIssilenceIsNotNull() {
            addCriterion("IsSilence is not null");
            return (Criteria) this;
        }

        public Criteria andIssilenceEqualTo(Boolean value) {
            addCriterion("IsSilence =", value, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceNotEqualTo(Boolean value) {
            addCriterion("IsSilence <>", value, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceGreaterThan(Boolean value) {
            addCriterion("IsSilence >", value, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSilence >=", value, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceLessThan(Boolean value) {
            addCriterion("IsSilence <", value, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSilence <=", value, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceIn(List<Boolean> values) {
            addCriterion("IsSilence in", values, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceNotIn(List<Boolean> values) {
            addCriterion("IsSilence not in", values, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSilence between", value1, value2, "issilence");
            return (Criteria) this;
        }

        public Criteria andIssilenceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSilence not between", value1, value2, "issilence");
            return (Criteria) this;
        }

        public Criteria andLogindeleteIsNull() {
            addCriterion("LoginDelete is null");
            return (Criteria) this;
        }

        public Criteria andLogindeleteIsNotNull() {
            addCriterion("LoginDelete is not null");
            return (Criteria) this;
        }

        public Criteria andLogindeleteEqualTo(Boolean value) {
            addCriterion("LoginDelete =", value, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteNotEqualTo(Boolean value) {
            addCriterion("LoginDelete <>", value, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteGreaterThan(Boolean value) {
            addCriterion("LoginDelete >", value, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("LoginDelete >=", value, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteLessThan(Boolean value) {
            addCriterion("LoginDelete <", value, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("LoginDelete <=", value, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteIn(List<Boolean> values) {
            addCriterion("LoginDelete in", values, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteNotIn(List<Boolean> values) {
            addCriterion("LoginDelete not in", values, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("LoginDelete between", value1, value2, "logindelete");
            return (Criteria) this;
        }

        public Criteria andLogindeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("LoginDelete not between", value1, value2, "logindelete");
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