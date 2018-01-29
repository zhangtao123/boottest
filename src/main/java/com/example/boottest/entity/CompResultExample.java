package com.example.boottest.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompResultExample() {
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

        public Criteria andTemplateContentDetailIdIsNull() {
            addCriterion("template_content_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdIsNotNull() {
            addCriterion("template_content_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdEqualTo(Long value) {
            addCriterion("template_content_detail_id =", value, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdNotEqualTo(Long value) {
            addCriterion("template_content_detail_id <>", value, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdGreaterThan(Long value) {
            addCriterion("template_content_detail_id >", value, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("template_content_detail_id >=", value, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdLessThan(Long value) {
            addCriterion("template_content_detail_id <", value, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("template_content_detail_id <=", value, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdIn(List<Long> values) {
            addCriterion("template_content_detail_id in", values, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdNotIn(List<Long> values) {
            addCriterion("template_content_detail_id not in", values, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdBetween(Long value1, Long value2) {
            addCriterion("template_content_detail_id between", value1, value2, "templateContentDetailId");
            return (Criteria) this;
        }

        public Criteria andTemplateContentDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("template_content_detail_id not between", value1, value2, "templateContentDetailId");
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

        public Criteria andCompExplainIsNull() {
            addCriterion("comp_explain is null");
            return (Criteria) this;
        }

        public Criteria andCompExplainIsNotNull() {
            addCriterion("comp_explain is not null");
            return (Criteria) this;
        }

        public Criteria andCompExplainEqualTo(String value) {
            addCriterion("comp_explain =", value, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainNotEqualTo(String value) {
            addCriterion("comp_explain <>", value, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainGreaterThan(String value) {
            addCriterion("comp_explain >", value, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainGreaterThanOrEqualTo(String value) {
            addCriterion("comp_explain >=", value, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainLessThan(String value) {
            addCriterion("comp_explain <", value, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainLessThanOrEqualTo(String value) {
            addCriterion("comp_explain <=", value, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainLike(String value) {
            addCriterion("comp_explain like", value, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainNotLike(String value) {
            addCriterion("comp_explain not like", value, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainIn(List<String> values) {
            addCriterion("comp_explain in", values, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainNotIn(List<String> values) {
            addCriterion("comp_explain not in", values, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainBetween(String value1, String value2) {
            addCriterion("comp_explain between", value1, value2, "compExplain");
            return (Criteria) this;
        }

        public Criteria andCompExplainNotBetween(String value1, String value2) {
            addCriterion("comp_explain not between", value1, value2, "compExplain");
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

        public Criteria andFirstCompFlagIsNull() {
            addCriterion("first_comp_flag is null");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagIsNotNull() {
            addCriterion("first_comp_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagEqualTo(Byte value) {
            addCriterion("first_comp_flag =", value, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagNotEqualTo(Byte value) {
            addCriterion("first_comp_flag <>", value, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagGreaterThan(Byte value) {
            addCriterion("first_comp_flag >", value, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("first_comp_flag >=", value, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagLessThan(Byte value) {
            addCriterion("first_comp_flag <", value, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagLessThanOrEqualTo(Byte value) {
            addCriterion("first_comp_flag <=", value, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagIn(List<Byte> values) {
            addCriterion("first_comp_flag in", values, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagNotIn(List<Byte> values) {
            addCriterion("first_comp_flag not in", values, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagBetween(Byte value1, Byte value2) {
            addCriterion("first_comp_flag between", value1, value2, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("first_comp_flag not between", value1, value2, "firstCompFlag");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescIsNull() {
            addCriterion("first_comp_desc is null");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescIsNotNull() {
            addCriterion("first_comp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescEqualTo(String value) {
            addCriterion("first_comp_desc =", value, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescNotEqualTo(String value) {
            addCriterion("first_comp_desc <>", value, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescGreaterThan(String value) {
            addCriterion("first_comp_desc >", value, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescGreaterThanOrEqualTo(String value) {
            addCriterion("first_comp_desc >=", value, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescLessThan(String value) {
            addCriterion("first_comp_desc <", value, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescLessThanOrEqualTo(String value) {
            addCriterion("first_comp_desc <=", value, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescLike(String value) {
            addCriterion("first_comp_desc like", value, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescNotLike(String value) {
            addCriterion("first_comp_desc not like", value, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescIn(List<String> values) {
            addCriterion("first_comp_desc in", values, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescNotIn(List<String> values) {
            addCriterion("first_comp_desc not in", values, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescBetween(String value1, String value2) {
            addCriterion("first_comp_desc between", value1, value2, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andFirstCompDescNotBetween(String value1, String value2) {
            addCriterion("first_comp_desc not between", value1, value2, "firstCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagIsNull() {
            addCriterion("second_comp_flag is null");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagIsNotNull() {
            addCriterion("second_comp_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagEqualTo(Byte value) {
            addCriterion("second_comp_flag =", value, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagNotEqualTo(Byte value) {
            addCriterion("second_comp_flag <>", value, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagGreaterThan(Byte value) {
            addCriterion("second_comp_flag >", value, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("second_comp_flag >=", value, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagLessThan(Byte value) {
            addCriterion("second_comp_flag <", value, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagLessThanOrEqualTo(Byte value) {
            addCriterion("second_comp_flag <=", value, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagIn(List<Byte> values) {
            addCriterion("second_comp_flag in", values, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagNotIn(List<Byte> values) {
            addCriterion("second_comp_flag not in", values, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagBetween(Byte value1, Byte value2) {
            addCriterion("second_comp_flag between", value1, value2, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("second_comp_flag not between", value1, value2, "secondCompFlag");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescIsNull() {
            addCriterion("second_comp_desc is null");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescIsNotNull() {
            addCriterion("second_comp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescEqualTo(String value) {
            addCriterion("second_comp_desc =", value, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescNotEqualTo(String value) {
            addCriterion("second_comp_desc <>", value, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescGreaterThan(String value) {
            addCriterion("second_comp_desc >", value, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescGreaterThanOrEqualTo(String value) {
            addCriterion("second_comp_desc >=", value, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescLessThan(String value) {
            addCriterion("second_comp_desc <", value, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescLessThanOrEqualTo(String value) {
            addCriterion("second_comp_desc <=", value, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescLike(String value) {
            addCriterion("second_comp_desc like", value, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescNotLike(String value) {
            addCriterion("second_comp_desc not like", value, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescIn(List<String> values) {
            addCriterion("second_comp_desc in", values, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescNotIn(List<String> values) {
            addCriterion("second_comp_desc not in", values, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescBetween(String value1, String value2) {
            addCriterion("second_comp_desc between", value1, value2, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andSecondCompDescNotBetween(String value1, String value2) {
            addCriterion("second_comp_desc not between", value1, value2, "secondCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagIsNull() {
            addCriterion("platform_comp_flag is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagIsNotNull() {
            addCriterion("platform_comp_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagEqualTo(Byte value) {
            addCriterion("platform_comp_flag =", value, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagNotEqualTo(Byte value) {
            addCriterion("platform_comp_flag <>", value, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagGreaterThan(Byte value) {
            addCriterion("platform_comp_flag >", value, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("platform_comp_flag >=", value, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagLessThan(Byte value) {
            addCriterion("platform_comp_flag <", value, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagLessThanOrEqualTo(Byte value) {
            addCriterion("platform_comp_flag <=", value, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagIn(List<Byte> values) {
            addCriterion("platform_comp_flag in", values, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagNotIn(List<Byte> values) {
            addCriterion("platform_comp_flag not in", values, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagBetween(Byte value1, Byte value2) {
            addCriterion("platform_comp_flag between", value1, value2, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("platform_comp_flag not between", value1, value2, "platformCompFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescIsNull() {
            addCriterion("platform_comp_desc is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescIsNotNull() {
            addCriterion("platform_comp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescEqualTo(String value) {
            addCriterion("platform_comp_desc =", value, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescNotEqualTo(String value) {
            addCriterion("platform_comp_desc <>", value, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescGreaterThan(String value) {
            addCriterion("platform_comp_desc >", value, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescGreaterThanOrEqualTo(String value) {
            addCriterion("platform_comp_desc >=", value, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescLessThan(String value) {
            addCriterion("platform_comp_desc <", value, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescLessThanOrEqualTo(String value) {
            addCriterion("platform_comp_desc <=", value, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescLike(String value) {
            addCriterion("platform_comp_desc like", value, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescNotLike(String value) {
            addCriterion("platform_comp_desc not like", value, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescIn(List<String> values) {
            addCriterion("platform_comp_desc in", values, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescNotIn(List<String> values) {
            addCriterion("platform_comp_desc not in", values, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescBetween(String value1, String value2) {
            addCriterion("platform_comp_desc between", value1, value2, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andPlatformCompDescNotBetween(String value1, String value2) {
            addCriterion("platform_comp_desc not between", value1, value2, "platformCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagIsNull() {
            addCriterion("brand_comp_flag is null");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagIsNotNull() {
            addCriterion("brand_comp_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagEqualTo(Byte value) {
            addCriterion("brand_comp_flag =", value, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagNotEqualTo(Byte value) {
            addCriterion("brand_comp_flag <>", value, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagGreaterThan(Byte value) {
            addCriterion("brand_comp_flag >", value, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("brand_comp_flag >=", value, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagLessThan(Byte value) {
            addCriterion("brand_comp_flag <", value, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagLessThanOrEqualTo(Byte value) {
            addCriterion("brand_comp_flag <=", value, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagIn(List<Byte> values) {
            addCriterion("brand_comp_flag in", values, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagNotIn(List<Byte> values) {
            addCriterion("brand_comp_flag not in", values, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagBetween(Byte value1, Byte value2) {
            addCriterion("brand_comp_flag between", value1, value2, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("brand_comp_flag not between", value1, value2, "brandCompFlag");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescIsNull() {
            addCriterion("brand_comp_desc is null");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescIsNotNull() {
            addCriterion("brand_comp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescEqualTo(String value) {
            addCriterion("brand_comp_desc =", value, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescNotEqualTo(String value) {
            addCriterion("brand_comp_desc <>", value, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescGreaterThan(String value) {
            addCriterion("brand_comp_desc >", value, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescGreaterThanOrEqualTo(String value) {
            addCriterion("brand_comp_desc >=", value, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescLessThan(String value) {
            addCriterion("brand_comp_desc <", value, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescLessThanOrEqualTo(String value) {
            addCriterion("brand_comp_desc <=", value, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescLike(String value) {
            addCriterion("brand_comp_desc like", value, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescNotLike(String value) {
            addCriterion("brand_comp_desc not like", value, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescIn(List<String> values) {
            addCriterion("brand_comp_desc in", values, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescNotIn(List<String> values) {
            addCriterion("brand_comp_desc not in", values, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescBetween(String value1, String value2) {
            addCriterion("brand_comp_desc between", value1, value2, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andBrandCompDescNotBetween(String value1, String value2) {
            addCriterion("brand_comp_desc not between", value1, value2, "brandCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagIsNull() {
            addCriterion("third_party_comp_flag is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagIsNotNull() {
            addCriterion("third_party_comp_flag is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagEqualTo(Byte value) {
            addCriterion("third_party_comp_flag =", value, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagNotEqualTo(Byte value) {
            addCriterion("third_party_comp_flag <>", value, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagGreaterThan(Byte value) {
            addCriterion("third_party_comp_flag >", value, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("third_party_comp_flag >=", value, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagLessThan(Byte value) {
            addCriterion("third_party_comp_flag <", value, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagLessThanOrEqualTo(Byte value) {
            addCriterion("third_party_comp_flag <=", value, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagIn(List<Byte> values) {
            addCriterion("third_party_comp_flag in", values, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagNotIn(List<Byte> values) {
            addCriterion("third_party_comp_flag not in", values, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagBetween(Byte value1, Byte value2) {
            addCriterion("third_party_comp_flag between", value1, value2, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("third_party_comp_flag not between", value1, value2, "thirdPartyCompFlag");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescIsNull() {
            addCriterion("third_party_comp_desc is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescIsNotNull() {
            addCriterion("third_party_comp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescEqualTo(String value) {
            addCriterion("third_party_comp_desc =", value, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescNotEqualTo(String value) {
            addCriterion("third_party_comp_desc <>", value, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescGreaterThan(String value) {
            addCriterion("third_party_comp_desc >", value, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescGreaterThanOrEqualTo(String value) {
            addCriterion("third_party_comp_desc >=", value, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescLessThan(String value) {
            addCriterion("third_party_comp_desc <", value, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescLessThanOrEqualTo(String value) {
            addCriterion("third_party_comp_desc <=", value, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescLike(String value) {
            addCriterion("third_party_comp_desc like", value, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescNotLike(String value) {
            addCriterion("third_party_comp_desc not like", value, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescIn(List<String> values) {
            addCriterion("third_party_comp_desc in", values, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescNotIn(List<String> values) {
            addCriterion("third_party_comp_desc not in", values, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescBetween(String value1, String value2) {
            addCriterion("third_party_comp_desc between", value1, value2, "thirdPartyCompDesc");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDescNotBetween(String value1, String value2) {
            addCriterion("third_party_comp_desc not between", value1, value2, "thirdPartyCompDesc");
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