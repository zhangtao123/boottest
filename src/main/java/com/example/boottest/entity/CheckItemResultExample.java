package com.example.boottest.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckItemResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckItemResultExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchedualIdIsNull() {
            addCriterion("schedual_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedualIdIsNotNull() {
            addCriterion("schedual_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedualIdEqualTo(Long value) {
            addCriterion("schedual_id =", value, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdNotEqualTo(Long value) {
            addCriterion("schedual_id <>", value, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdGreaterThan(Long value) {
            addCriterion("schedual_id >", value, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdGreaterThanOrEqualTo(Long value) {
            addCriterion("schedual_id >=", value, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdLessThan(Long value) {
            addCriterion("schedual_id <", value, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdLessThanOrEqualTo(Long value) {
            addCriterion("schedual_id <=", value, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdIn(List<Long> values) {
            addCriterion("schedual_id in", values, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdNotIn(List<Long> values) {
            addCriterion("schedual_id not in", values, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdBetween(Long value1, Long value2) {
            addCriterion("schedual_id between", value1, value2, "schedualId");
            return (Criteria) this;
        }

        public Criteria andSchedualIdNotBetween(Long value1, Long value2) {
            addCriterion("schedual_id not between", value1, value2, "schedualId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdIsNull() {
            addCriterion("template_content_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdIsNotNull() {
            addCriterion("template_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdEqualTo(Long value) {
            addCriterion("template_content_id =", value, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdNotEqualTo(Long value) {
            addCriterion("template_content_id <>", value, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdGreaterThan(Long value) {
            addCriterion("template_content_id >", value, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("template_content_id >=", value, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdLessThan(Long value) {
            addCriterion("template_content_id <", value, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdLessThanOrEqualTo(Long value) {
            addCriterion("template_content_id <=", value, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdIn(List<Long> values) {
            addCriterion("template_content_id in", values, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdNotIn(List<Long> values) {
            addCriterion("template_content_id not in", values, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdBetween(Long value1, Long value2) {
            addCriterion("template_content_id between", value1, value2, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIdNotBetween(Long value1, Long value2) {
            addCriterion("template_content_id not between", value1, value2, "templateContentId");
            return (Criteria) this;
        }

        public Criteria andIsInvolveIsNull() {
            addCriterion("is_involve is null");
            return (Criteria) this;
        }

        public Criteria andIsInvolveIsNotNull() {
            addCriterion("is_involve is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvolveEqualTo(Byte value) {
            addCriterion("is_involve =", value, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveNotEqualTo(Byte value) {
            addCriterion("is_involve <>", value, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveGreaterThan(Byte value) {
            addCriterion("is_involve >", value, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_involve >=", value, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveLessThan(Byte value) {
            addCriterion("is_involve <", value, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveLessThanOrEqualTo(Byte value) {
            addCriterion("is_involve <=", value, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveIn(List<Byte> values) {
            addCriterion("is_involve in", values, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveNotIn(List<Byte> values) {
            addCriterion("is_involve not in", values, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveBetween(Byte value1, Byte value2) {
            addCriterion("is_involve between", value1, value2, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andIsInvolveNotBetween(Byte value1, Byte value2) {
            addCriterion("is_involve not between", value1, value2, "isInvolve");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNull() {
            addCriterion("check_result is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNotNull() {
            addCriterion("check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultEqualTo(Byte value) {
            addCriterion("check_result =", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotEqualTo(Byte value) {
            addCriterion("check_result <>", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThan(Byte value) {
            addCriterion("check_result >", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_result >=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThan(Byte value) {
            addCriterion("check_result <", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThanOrEqualTo(Byte value) {
            addCriterion("check_result <=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultIn(List<Byte> values) {
            addCriterion("check_result in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotIn(List<Byte> values) {
            addCriterion("check_result not in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultBetween(Byte value1, Byte value2) {
            addCriterion("check_result between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotBetween(Byte value1, Byte value2) {
            addCriterion("check_result not between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugIsNull() {
            addCriterion("first_app_sug is null");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugIsNotNull() {
            addCriterion("first_app_sug is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugEqualTo(String value) {
            addCriterion("first_app_sug =", value, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugNotEqualTo(String value) {
            addCriterion("first_app_sug <>", value, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugGreaterThan(String value) {
            addCriterion("first_app_sug >", value, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugGreaterThanOrEqualTo(String value) {
            addCriterion("first_app_sug >=", value, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugLessThan(String value) {
            addCriterion("first_app_sug <", value, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugLessThanOrEqualTo(String value) {
            addCriterion("first_app_sug <=", value, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugLike(String value) {
            addCriterion("first_app_sug like", value, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugNotLike(String value) {
            addCriterion("first_app_sug not like", value, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugIn(List<String> values) {
            addCriterion("first_app_sug in", values, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugNotIn(List<String> values) {
            addCriterion("first_app_sug not in", values, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugBetween(String value1, String value2) {
            addCriterion("first_app_sug between", value1, value2, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andFirstAppSugNotBetween(String value1, String value2) {
            addCriterion("first_app_sug not between", value1, value2, "firstAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugIsNull() {
            addCriterion("second_app_sug is null");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugIsNotNull() {
            addCriterion("second_app_sug is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugEqualTo(String value) {
            addCriterion("second_app_sug =", value, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugNotEqualTo(String value) {
            addCriterion("second_app_sug <>", value, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugGreaterThan(String value) {
            addCriterion("second_app_sug >", value, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugGreaterThanOrEqualTo(String value) {
            addCriterion("second_app_sug >=", value, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugLessThan(String value) {
            addCriterion("second_app_sug <", value, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugLessThanOrEqualTo(String value) {
            addCriterion("second_app_sug <=", value, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugLike(String value) {
            addCriterion("second_app_sug like", value, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugNotLike(String value) {
            addCriterion("second_app_sug not like", value, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugIn(List<String> values) {
            addCriterion("second_app_sug in", values, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugNotIn(List<String> values) {
            addCriterion("second_app_sug not in", values, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugBetween(String value1, String value2) {
            addCriterion("second_app_sug between", value1, value2, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andSecondAppSugNotBetween(String value1, String value2) {
            addCriterion("second_app_sug not between", value1, value2, "secondAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugIsNull() {
            addCriterion("platform_app_sug is null");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugIsNotNull() {
            addCriterion("platform_app_sug is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugEqualTo(String value) {
            addCriterion("platform_app_sug =", value, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugNotEqualTo(String value) {
            addCriterion("platform_app_sug <>", value, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugGreaterThan(String value) {
            addCriterion("platform_app_sug >", value, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugGreaterThanOrEqualTo(String value) {
            addCriterion("platform_app_sug >=", value, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugLessThan(String value) {
            addCriterion("platform_app_sug <", value, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugLessThanOrEqualTo(String value) {
            addCriterion("platform_app_sug <=", value, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugLike(String value) {
            addCriterion("platform_app_sug like", value, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugNotLike(String value) {
            addCriterion("platform_app_sug not like", value, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugIn(List<String> values) {
            addCriterion("platform_app_sug in", values, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugNotIn(List<String> values) {
            addCriterion("platform_app_sug not in", values, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugBetween(String value1, String value2) {
            addCriterion("platform_app_sug between", value1, value2, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andPlatformAppSugNotBetween(String value1, String value2) {
            addCriterion("platform_app_sug not between", value1, value2, "platformAppSug");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckIsNull() {
            addCriterion("is_no_check is null");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckIsNotNull() {
            addCriterion("is_no_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckEqualTo(Byte value) {
            addCriterion("is_no_check =", value, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckNotEqualTo(Byte value) {
            addCriterion("is_no_check <>", value, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckGreaterThan(Byte value) {
            addCriterion("is_no_check >", value, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_no_check >=", value, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckLessThan(Byte value) {
            addCriterion("is_no_check <", value, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckLessThanOrEqualTo(Byte value) {
            addCriterion("is_no_check <=", value, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckIn(List<Byte> values) {
            addCriterion("is_no_check in", values, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckNotIn(List<Byte> values) {
            addCriterion("is_no_check not in", values, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckBetween(Byte value1, Byte value2) {
            addCriterion("is_no_check between", value1, value2, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("is_no_check not between", value1, value2, "isNoCheck");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDealerCompIsNull() {
            addCriterion("dealer_comp is null");
            return (Criteria) this;
        }

        public Criteria andDealerCompIsNotNull() {
            addCriterion("dealer_comp is not null");
            return (Criteria) this;
        }

        public Criteria andDealerCompEqualTo(String value) {
            addCriterion("dealer_comp =", value, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompNotEqualTo(String value) {
            addCriterion("dealer_comp <>", value, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompGreaterThan(String value) {
            addCriterion("dealer_comp >", value, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_comp >=", value, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompLessThan(String value) {
            addCriterion("dealer_comp <", value, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompLessThanOrEqualTo(String value) {
            addCriterion("dealer_comp <=", value, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompLike(String value) {
            addCriterion("dealer_comp like", value, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompNotLike(String value) {
            addCriterion("dealer_comp not like", value, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompIn(List<String> values) {
            addCriterion("dealer_comp in", values, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompNotIn(List<String> values) {
            addCriterion("dealer_comp not in", values, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompBetween(String value1, String value2) {
            addCriterion("dealer_comp between", value1, value2, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andDealerCompNotBetween(String value1, String value2) {
            addCriterion("dealer_comp not between", value1, value2, "dealerComp");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNull() {
            addCriterion("last_update_user is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNotNull() {
            addCriterion("last_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserEqualTo(String value) {
            addCriterion("last_update_user =", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotEqualTo(String value) {
            addCriterion("last_update_user <>", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThan(String value) {
            addCriterion("last_update_user >", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_user >=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThan(String value) {
            addCriterion("last_update_user <", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("last_update_user <=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLike(String value) {
            addCriterion("last_update_user like", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotLike(String value) {
            addCriterion("last_update_user not like", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIn(List<String> values) {
            addCriterion("last_update_user in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotIn(List<String> values) {
            addCriterion("last_update_user not in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserBetween(String value1, String value2) {
            addCriterion("last_update_user between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotBetween(String value1, String value2) {
            addCriterion("last_update_user not between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
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