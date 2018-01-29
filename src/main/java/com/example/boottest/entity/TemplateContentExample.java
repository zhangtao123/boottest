package com.example.boottest.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TemplateContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemplateContentExample() {
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Long value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Long value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Long value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Long value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Long> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Long> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Long value1, Long value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryIsNull() {
            addCriterion("check_category is null");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryIsNotNull() {
            addCriterion("check_category is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryEqualTo(String value) {
            addCriterion("check_category =", value, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryNotEqualTo(String value) {
            addCriterion("check_category <>", value, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryGreaterThan(String value) {
            addCriterion("check_category >", value, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("check_category >=", value, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryLessThan(String value) {
            addCriterion("check_category <", value, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryLessThanOrEqualTo(String value) {
            addCriterion("check_category <=", value, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryLike(String value) {
            addCriterion("check_category like", value, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryNotLike(String value) {
            addCriterion("check_category not like", value, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryIn(List<String> values) {
            addCriterion("check_category in", values, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryNotIn(List<String> values) {
            addCriterion("check_category not in", values, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryBetween(String value1, String value2) {
            addCriterion("check_category between", value1, value2, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andCheckCategoryNotBetween(String value1, String value2) {
            addCriterion("check_category not between", value1, value2, "checkCategory");
            return (Criteria) this;
        }

        public Criteria andContentNumIsNull() {
            addCriterion("content_num is null");
            return (Criteria) this;
        }

        public Criteria andContentNumIsNotNull() {
            addCriterion("content_num is not null");
            return (Criteria) this;
        }

        public Criteria andContentNumEqualTo(String value) {
            addCriterion("content_num =", value, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumNotEqualTo(String value) {
            addCriterion("content_num <>", value, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumGreaterThan(String value) {
            addCriterion("content_num >", value, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumGreaterThanOrEqualTo(String value) {
            addCriterion("content_num >=", value, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumLessThan(String value) {
            addCriterion("content_num <", value, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumLessThanOrEqualTo(String value) {
            addCriterion("content_num <=", value, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumLike(String value) {
            addCriterion("content_num like", value, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumNotLike(String value) {
            addCriterion("content_num not like", value, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumIn(List<String> values) {
            addCriterion("content_num in", values, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumNotIn(List<String> values) {
            addCriterion("content_num not in", values, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumBetween(String value1, String value2) {
            addCriterion("content_num between", value1, value2, "contentNum");
            return (Criteria) this;
        }

        public Criteria andContentNumNotBetween(String value1, String value2) {
            addCriterion("content_num not between", value1, value2, "contentNum");
            return (Criteria) this;
        }

        public Criteria andCheckContentIsNull() {
            addCriterion("check_content is null");
            return (Criteria) this;
        }

        public Criteria andCheckContentIsNotNull() {
            addCriterion("check_content is not null");
            return (Criteria) this;
        }

        public Criteria andCheckContentEqualTo(String value) {
            addCriterion("check_content =", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotEqualTo(String value) {
            addCriterion("check_content <>", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentGreaterThan(String value) {
            addCriterion("check_content >", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentGreaterThanOrEqualTo(String value) {
            addCriterion("check_content >=", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLessThan(String value) {
            addCriterion("check_content <", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLessThanOrEqualTo(String value) {
            addCriterion("check_content <=", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLike(String value) {
            addCriterion("check_content like", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotLike(String value) {
            addCriterion("check_content not like", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentIn(List<String> values) {
            addCriterion("check_content in", values, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotIn(List<String> values) {
            addCriterion("check_content not in", values, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentBetween(String value1, String value2) {
            addCriterion("check_content between", value1, value2, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotBetween(String value1, String value2) {
            addCriterion("check_content not between", value1, value2, "checkContent");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("item_desc is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("item_desc is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("item_desc =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("item_desc <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("item_desc >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("item_desc >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("item_desc <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("item_desc <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("item_desc like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("item_desc not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("item_desc in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("item_desc not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("item_desc between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("item_desc not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponIsNull() {
            addCriterion("is_touch_upon is null");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponIsNotNull() {
            addCriterion("is_touch_upon is not null");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponEqualTo(Byte value) {
            addCriterion("is_touch_upon =", value, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponNotEqualTo(Byte value) {
            addCriterion("is_touch_upon <>", value, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponGreaterThan(Byte value) {
            addCriterion("is_touch_upon >", value, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_touch_upon >=", value, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponLessThan(Byte value) {
            addCriterion("is_touch_upon <", value, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponLessThanOrEqualTo(Byte value) {
            addCriterion("is_touch_upon <=", value, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponIn(List<Byte> values) {
            addCriterion("is_touch_upon in", values, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponNotIn(List<Byte> values) {
            addCriterion("is_touch_upon not in", values, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponBetween(Byte value1, Byte value2) {
            addCriterion("is_touch_upon between", value1, value2, "isTouchUpon");
            return (Criteria) this;
        }

        public Criteria andIsTouchUponNotBetween(Byte value1, Byte value2) {
            addCriterion("is_touch_upon not between", value1, value2, "isTouchUpon");
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andIsBackIsNull() {
            addCriterion("is_back is null");
            return (Criteria) this;
        }

        public Criteria andIsBackIsNotNull() {
            addCriterion("is_back is not null");
            return (Criteria) this;
        }

        public Criteria andIsBackEqualTo(Byte value) {
            addCriterion("is_back =", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackNotEqualTo(Byte value) {
            addCriterion("is_back <>", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackGreaterThan(Byte value) {
            addCriterion("is_back >", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_back >=", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackLessThan(Byte value) {
            addCriterion("is_back <", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackLessThanOrEqualTo(Byte value) {
            addCriterion("is_back <=", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackIn(List<Byte> values) {
            addCriterion("is_back in", values, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackNotIn(List<Byte> values) {
            addCriterion("is_back not in", values, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackBetween(Byte value1, Byte value2) {
            addCriterion("is_back between", value1, value2, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackNotBetween(Byte value1, Byte value2) {
            addCriterion("is_back not between", value1, value2, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsSplitIsNull() {
            addCriterion("is_split is null");
            return (Criteria) this;
        }

        public Criteria andIsSplitIsNotNull() {
            addCriterion("is_split is not null");
            return (Criteria) this;
        }

        public Criteria andIsSplitEqualTo(Byte value) {
            addCriterion("is_split =", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotEqualTo(Byte value) {
            addCriterion("is_split <>", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitGreaterThan(Byte value) {
            addCriterion("is_split >", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_split >=", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitLessThan(Byte value) {
            addCriterion("is_split <", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitLessThanOrEqualTo(Byte value) {
            addCriterion("is_split <=", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitIn(List<Byte> values) {
            addCriterion("is_split in", values, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotIn(List<Byte> values) {
            addCriterion("is_split not in", values, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitBetween(Byte value1, Byte value2) {
            addCriterion("is_split between", value1, value2, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotBetween(Byte value1, Byte value2) {
            addCriterion("is_split not between", value1, value2, "isSplit");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Byte value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Byte value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Byte value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Byte value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Byte value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Byte> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Byte> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Byte value1, Byte value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Byte value1, Byte value2) {
            addCriterion("sort not between", value1, value2, "sort");
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