package com.example.boottest.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MissionSchedualExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionSchedualExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMissionIdIsNull() {
            addCriterion("mission_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNotNull() {
            addCriterion("mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIdEqualTo(Long value) {
            addCriterion("mission_id =", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotEqualTo(Long value) {
            addCriterion("mission_id <>", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThan(Long value) {
            addCriterion("mission_id >", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mission_id >=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThan(Long value) {
            addCriterion("mission_id <", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThanOrEqualTo(Long value) {
            addCriterion("mission_id <=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdIn(List<Long> values) {
            addCriterion("mission_id in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotIn(List<Long> values) {
            addCriterion("mission_id not in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdBetween(Long value1, Long value2) {
            addCriterion("mission_id between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotBetween(Long value1, Long value2) {
            addCriterion("mission_id not between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(Long value) {
            addCriterion("dealer_id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(Long value) {
            addCriterion("dealer_id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(Long value) {
            addCriterion("dealer_id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dealer_id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(Long value) {
            addCriterion("dealer_id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(Long value) {
            addCriterion("dealer_id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<Long> values) {
            addCriterion("dealer_id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<Long> values) {
            addCriterion("dealer_id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(Long value1, Long value2) {
            addCriterion("dealer_id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(Long value1, Long value2) {
            addCriterion("dealer_id not between", value1, value2, "dealerId");
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

        public Criteria andComplainDateIsNull() {
            addCriterion("complain_date is null");
            return (Criteria) this;
        }

        public Criteria andComplainDateIsNotNull() {
            addCriterion("complain_date is not null");
            return (Criteria) this;
        }

        public Criteria andComplainDateEqualTo(Date value) {
            addCriterionForJDBCDate("complain_date =", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("complain_date <>", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateGreaterThan(Date value) {
            addCriterionForJDBCDate("complain_date >", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("complain_date >=", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateLessThan(Date value) {
            addCriterionForJDBCDate("complain_date <", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("complain_date <=", value, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateIn(List<Date> values) {
            addCriterionForJDBCDate("complain_date in", values, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("complain_date not in", values, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("complain_date between", value1, value2, "complainDate");
            return (Criteria) this;
        }

        public Criteria andComplainDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("complain_date not between", value1, value2, "complainDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("check_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("check_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterionForJDBCDate("check_date =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("check_date <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterionForJDBCDate("check_date >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_date >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterionForJDBCDate("check_date <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_date <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterionForJDBCDate("check_date in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("check_date not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_date between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_date not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIsNull() {
            addCriterion("approve_status is null");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIsNotNull() {
            addCriterion("approve_status is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStatusEqualTo(Byte value) {
            addCriterion("approve_status =", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotEqualTo(Byte value) {
            addCriterion("approve_status <>", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusGreaterThan(Byte value) {
            addCriterion("approve_status >", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("approve_status >=", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLessThan(Byte value) {
            addCriterion("approve_status <", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLessThanOrEqualTo(Byte value) {
            addCriterion("approve_status <=", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIn(List<Byte> values) {
            addCriterion("approve_status in", values, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotIn(List<Byte> values) {
            addCriterion("approve_status not in", values, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusBetween(Byte value1, Byte value2) {
            addCriterion("approve_status between", value1, value2, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("approve_status not between", value1, value2, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugIsNull() {
            addCriterion("first_appr_sug is null");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugIsNotNull() {
            addCriterion("first_appr_sug is not null");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugEqualTo(String value) {
            addCriterion("first_appr_sug =", value, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugNotEqualTo(String value) {
            addCriterion("first_appr_sug <>", value, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugGreaterThan(String value) {
            addCriterion("first_appr_sug >", value, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugGreaterThanOrEqualTo(String value) {
            addCriterion("first_appr_sug >=", value, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugLessThan(String value) {
            addCriterion("first_appr_sug <", value, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugLessThanOrEqualTo(String value) {
            addCriterion("first_appr_sug <=", value, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugLike(String value) {
            addCriterion("first_appr_sug like", value, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugNotLike(String value) {
            addCriterion("first_appr_sug not like", value, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugIn(List<String> values) {
            addCriterion("first_appr_sug in", values, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugNotIn(List<String> values) {
            addCriterion("first_appr_sug not in", values, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugBetween(String value1, String value2) {
            addCriterion("first_appr_sug between", value1, value2, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andFirstApprSugNotBetween(String value1, String value2) {
            addCriterion("first_appr_sug not between", value1, value2, "firstApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugIsNull() {
            addCriterion("repeat_appr_sug is null");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugIsNotNull() {
            addCriterion("repeat_appr_sug is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugEqualTo(String value) {
            addCriterion("repeat_appr_sug =", value, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugNotEqualTo(String value) {
            addCriterion("repeat_appr_sug <>", value, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugGreaterThan(String value) {
            addCriterion("repeat_appr_sug >", value, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_appr_sug >=", value, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugLessThan(String value) {
            addCriterion("repeat_appr_sug <", value, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugLessThanOrEqualTo(String value) {
            addCriterion("repeat_appr_sug <=", value, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugLike(String value) {
            addCriterion("repeat_appr_sug like", value, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugNotLike(String value) {
            addCriterion("repeat_appr_sug not like", value, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugIn(List<String> values) {
            addCriterion("repeat_appr_sug in", values, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugNotIn(List<String> values) {
            addCriterion("repeat_appr_sug not in", values, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugBetween(String value1, String value2) {
            addCriterion("repeat_appr_sug between", value1, value2, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andRepeatApprSugNotBetween(String value1, String value2) {
            addCriterion("repeat_appr_sug not between", value1, value2, "repeatApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugIsNull() {
            addCriterion("platform_appr_sug is null");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugIsNotNull() {
            addCriterion("platform_appr_sug is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugEqualTo(String value) {
            addCriterion("platform_appr_sug =", value, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugNotEqualTo(String value) {
            addCriterion("platform_appr_sug <>", value, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugGreaterThan(String value) {
            addCriterion("platform_appr_sug >", value, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugGreaterThanOrEqualTo(String value) {
            addCriterion("platform_appr_sug >=", value, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugLessThan(String value) {
            addCriterion("platform_appr_sug <", value, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugLessThanOrEqualTo(String value) {
            addCriterion("platform_appr_sug <=", value, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugLike(String value) {
            addCriterion("platform_appr_sug like", value, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugNotLike(String value) {
            addCriterion("platform_appr_sug not like", value, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugIn(List<String> values) {
            addCriterion("platform_appr_sug in", values, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugNotIn(List<String> values) {
            addCriterion("platform_appr_sug not in", values, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugBetween(String value1, String value2) {
            addCriterion("platform_appr_sug between", value1, value2, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andPlatformApprSugNotBetween(String value1, String value2) {
            addCriterion("platform_appr_sug not between", value1, value2, "platformApprSug");
            return (Criteria) this;
        }

        public Criteria andArriveDateIsNull() {
            addCriterion("arrive_date is null");
            return (Criteria) this;
        }

        public Criteria andArriveDateIsNotNull() {
            addCriterion("arrive_date is not null");
            return (Criteria) this;
        }

        public Criteria andArriveDateEqualTo(Date value) {
            addCriterion("arrive_date =", value, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateNotEqualTo(Date value) {
            addCriterion("arrive_date <>", value, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateGreaterThan(Date value) {
            addCriterion("arrive_date >", value, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_date >=", value, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateLessThan(Date value) {
            addCriterion("arrive_date <", value, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateLessThanOrEqualTo(Date value) {
            addCriterion("arrive_date <=", value, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateIn(List<Date> values) {
            addCriterion("arrive_date in", values, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateNotIn(List<Date> values) {
            addCriterion("arrive_date not in", values, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateBetween(Date value1, Date value2) {
            addCriterion("arrive_date between", value1, value2, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andArriveDateNotBetween(Date value1, Date value2) {
            addCriterion("arrive_date not between", value1, value2, "arriveDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateIsNull() {
            addCriterion("left_date is null");
            return (Criteria) this;
        }

        public Criteria andLeftDateIsNotNull() {
            addCriterion("left_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeftDateEqualTo(Date value) {
            addCriterion("left_date =", value, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateNotEqualTo(Date value) {
            addCriterion("left_date <>", value, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateGreaterThan(Date value) {
            addCriterion("left_date >", value, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateGreaterThanOrEqualTo(Date value) {
            addCriterion("left_date >=", value, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateLessThan(Date value) {
            addCriterion("left_date <", value, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateLessThanOrEqualTo(Date value) {
            addCriterion("left_date <=", value, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateIn(List<Date> values) {
            addCriterion("left_date in", values, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateNotIn(List<Date> values) {
            addCriterion("left_date not in", values, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateBetween(Date value1, Date value2) {
            addCriterion("left_date between", value1, value2, "leftDate");
            return (Criteria) this;
        }

        public Criteria andLeftDateNotBetween(Date value1, Date value2) {
            addCriterion("left_date not between", value1, value2, "leftDate");
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

        public Criteria andComplainStatusIsNull() {
            addCriterion("complain_status is null");
            return (Criteria) this;
        }

        public Criteria andComplainStatusIsNotNull() {
            addCriterion("complain_status is not null");
            return (Criteria) this;
        }

        public Criteria andComplainStatusEqualTo(Byte value) {
            addCriterion("complain_status =", value, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusNotEqualTo(Byte value) {
            addCriterion("complain_status <>", value, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusGreaterThan(Byte value) {
            addCriterion("complain_status >", value, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("complain_status >=", value, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusLessThan(Byte value) {
            addCriterion("complain_status <", value, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusLessThanOrEqualTo(Byte value) {
            addCriterion("complain_status <=", value, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusIn(List<Byte> values) {
            addCriterion("complain_status in", values, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusNotIn(List<Byte> values) {
            addCriterion("complain_status not in", values, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusBetween(Byte value1, Byte value2) {
            addCriterion("complain_status between", value1, value2, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andComplainStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("complain_status not between", value1, value2, "complainStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserIsNull() {
            addCriterion("first_comp_user is null");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserIsNotNull() {
            addCriterion("first_comp_user is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserEqualTo(String value) {
            addCriterion("first_comp_user =", value, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserNotEqualTo(String value) {
            addCriterion("first_comp_user <>", value, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserGreaterThan(String value) {
            addCriterion("first_comp_user >", value, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserGreaterThanOrEqualTo(String value) {
            addCriterion("first_comp_user >=", value, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserLessThan(String value) {
            addCriterion("first_comp_user <", value, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserLessThanOrEqualTo(String value) {
            addCriterion("first_comp_user <=", value, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserLike(String value) {
            addCriterion("first_comp_user like", value, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserNotLike(String value) {
            addCriterion("first_comp_user not like", value, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserIn(List<String> values) {
            addCriterion("first_comp_user in", values, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserNotIn(List<String> values) {
            addCriterion("first_comp_user not in", values, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserBetween(String value1, String value2) {
            addCriterion("first_comp_user between", value1, value2, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompUserNotBetween(String value1, String value2) {
            addCriterion("first_comp_user not between", value1, value2, "firstCompUser");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateIsNull() {
            addCriterion("first_comp_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateIsNotNull() {
            addCriterion("first_comp_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateEqualTo(Date value) {
            addCriterion("first_comp_date =", value, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateNotEqualTo(Date value) {
            addCriterion("first_comp_date <>", value, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateGreaterThan(Date value) {
            addCriterion("first_comp_date >", value, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateGreaterThanOrEqualTo(Date value) {
            addCriterion("first_comp_date >=", value, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateLessThan(Date value) {
            addCriterion("first_comp_date <", value, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateLessThanOrEqualTo(Date value) {
            addCriterion("first_comp_date <=", value, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateIn(List<Date> values) {
            addCriterion("first_comp_date in", values, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateNotIn(List<Date> values) {
            addCriterion("first_comp_date not in", values, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateBetween(Date value1, Date value2) {
            addCriterion("first_comp_date between", value1, value2, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andFirstCompDateNotBetween(Date value1, Date value2) {
            addCriterion("first_comp_date not between", value1, value2, "firstCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserIsNull() {
            addCriterion("second_comp_user is null");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserIsNotNull() {
            addCriterion("second_comp_user is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserEqualTo(String value) {
            addCriterion("second_comp_user =", value, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserNotEqualTo(String value) {
            addCriterion("second_comp_user <>", value, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserGreaterThan(String value) {
            addCriterion("second_comp_user >", value, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserGreaterThanOrEqualTo(String value) {
            addCriterion("second_comp_user >=", value, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserLessThan(String value) {
            addCriterion("second_comp_user <", value, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserLessThanOrEqualTo(String value) {
            addCriterion("second_comp_user <=", value, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserLike(String value) {
            addCriterion("second_comp_user like", value, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserNotLike(String value) {
            addCriterion("second_comp_user not like", value, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserIn(List<String> values) {
            addCriterion("second_comp_user in", values, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserNotIn(List<String> values) {
            addCriterion("second_comp_user not in", values, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserBetween(String value1, String value2) {
            addCriterion("second_comp_user between", value1, value2, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompUserNotBetween(String value1, String value2) {
            addCriterion("second_comp_user not between", value1, value2, "secondCompUser");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateIsNull() {
            addCriterion("second_comp_date is null");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateIsNotNull() {
            addCriterion("second_comp_date is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateEqualTo(Date value) {
            addCriterion("second_comp_date =", value, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateNotEqualTo(Date value) {
            addCriterion("second_comp_date <>", value, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateGreaterThan(Date value) {
            addCriterion("second_comp_date >", value, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateGreaterThanOrEqualTo(Date value) {
            addCriterion("second_comp_date >=", value, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateLessThan(Date value) {
            addCriterion("second_comp_date <", value, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateLessThanOrEqualTo(Date value) {
            addCriterion("second_comp_date <=", value, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateIn(List<Date> values) {
            addCriterion("second_comp_date in", values, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateNotIn(List<Date> values) {
            addCriterion("second_comp_date not in", values, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateBetween(Date value1, Date value2) {
            addCriterion("second_comp_date between", value1, value2, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andSecondCompDateNotBetween(Date value1, Date value2) {
            addCriterion("second_comp_date not between", value1, value2, "secondCompDate");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserIsNull() {
            addCriterion("platform_comp_user is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserIsNotNull() {
            addCriterion("platform_comp_user is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserEqualTo(String value) {
            addCriterion("platform_comp_user =", value, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserNotEqualTo(String value) {
            addCriterion("platform_comp_user <>", value, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserGreaterThan(String value) {
            addCriterion("platform_comp_user >", value, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserGreaterThanOrEqualTo(String value) {
            addCriterion("platform_comp_user >=", value, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserLessThan(String value) {
            addCriterion("platform_comp_user <", value, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserLessThanOrEqualTo(String value) {
            addCriterion("platform_comp_user <=", value, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserLike(String value) {
            addCriterion("platform_comp_user like", value, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserNotLike(String value) {
            addCriterion("platform_comp_user not like", value, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserIn(List<String> values) {
            addCriterion("platform_comp_user in", values, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserNotIn(List<String> values) {
            addCriterion("platform_comp_user not in", values, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserBetween(String value1, String value2) {
            addCriterion("platform_comp_user between", value1, value2, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformCompUserNotBetween(String value1, String value2) {
            addCriterion("platform_comp_user not between", value1, value2, "platformCompUser");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateIsNull() {
            addCriterion("platform_com_date is null");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateIsNotNull() {
            addCriterion("platform_com_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateEqualTo(Date value) {
            addCriterion("platform_com_date =", value, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateNotEqualTo(Date value) {
            addCriterion("platform_com_date <>", value, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateGreaterThan(Date value) {
            addCriterion("platform_com_date >", value, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateGreaterThanOrEqualTo(Date value) {
            addCriterion("platform_com_date >=", value, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateLessThan(Date value) {
            addCriterion("platform_com_date <", value, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateLessThanOrEqualTo(Date value) {
            addCriterion("platform_com_date <=", value, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateIn(List<Date> values) {
            addCriterion("platform_com_date in", values, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateNotIn(List<Date> values) {
            addCriterion("platform_com_date not in", values, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateBetween(Date value1, Date value2) {
            addCriterion("platform_com_date between", value1, value2, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andPlatformComDateNotBetween(Date value1, Date value2) {
            addCriterion("platform_com_date not between", value1, value2, "platformComDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserIsNull() {
            addCriterion("third_party_comp_user is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserIsNotNull() {
            addCriterion("third_party_comp_user is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserEqualTo(String value) {
            addCriterion("third_party_comp_user =", value, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserNotEqualTo(String value) {
            addCriterion("third_party_comp_user <>", value, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserGreaterThan(String value) {
            addCriterion("third_party_comp_user >", value, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserGreaterThanOrEqualTo(String value) {
            addCriterion("third_party_comp_user >=", value, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserLessThan(String value) {
            addCriterion("third_party_comp_user <", value, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserLessThanOrEqualTo(String value) {
            addCriterion("third_party_comp_user <=", value, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserLike(String value) {
            addCriterion("third_party_comp_user like", value, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserNotLike(String value) {
            addCriterion("third_party_comp_user not like", value, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserIn(List<String> values) {
            addCriterion("third_party_comp_user in", values, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserNotIn(List<String> values) {
            addCriterion("third_party_comp_user not in", values, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserBetween(String value1, String value2) {
            addCriterion("third_party_comp_user between", value1, value2, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompUserNotBetween(String value1, String value2) {
            addCriterion("third_party_comp_user not between", value1, value2, "thirdPartyCompUser");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateIsNull() {
            addCriterion("third_party_comp_date is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateIsNotNull() {
            addCriterion("third_party_comp_date is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateEqualTo(Date value) {
            addCriterion("third_party_comp_date =", value, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateNotEqualTo(Date value) {
            addCriterion("third_party_comp_date <>", value, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateGreaterThan(Date value) {
            addCriterion("third_party_comp_date >", value, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateGreaterThanOrEqualTo(Date value) {
            addCriterion("third_party_comp_date >=", value, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateLessThan(Date value) {
            addCriterion("third_party_comp_date <", value, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateLessThanOrEqualTo(Date value) {
            addCriterion("third_party_comp_date <=", value, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateIn(List<Date> values) {
            addCriterion("third_party_comp_date in", values, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateNotIn(List<Date> values) {
            addCriterion("third_party_comp_date not in", values, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateBetween(Date value1, Date value2) {
            addCriterion("third_party_comp_date between", value1, value2, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCompDateNotBetween(Date value1, Date value2) {
            addCriterion("third_party_comp_date not between", value1, value2, "thirdPartyCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserIsNull() {
            addCriterion("brand_comp_user is null");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserIsNotNull() {
            addCriterion("brand_comp_user is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserEqualTo(String value) {
            addCriterion("brand_comp_user =", value, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserNotEqualTo(String value) {
            addCriterion("brand_comp_user <>", value, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserGreaterThan(String value) {
            addCriterion("brand_comp_user >", value, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserGreaterThanOrEqualTo(String value) {
            addCriterion("brand_comp_user >=", value, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserLessThan(String value) {
            addCriterion("brand_comp_user <", value, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserLessThanOrEqualTo(String value) {
            addCriterion("brand_comp_user <=", value, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserLike(String value) {
            addCriterion("brand_comp_user like", value, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserNotLike(String value) {
            addCriterion("brand_comp_user not like", value, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserIn(List<String> values) {
            addCriterion("brand_comp_user in", values, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserNotIn(List<String> values) {
            addCriterion("brand_comp_user not in", values, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserBetween(String value1, String value2) {
            addCriterion("brand_comp_user between", value1, value2, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompUserNotBetween(String value1, String value2) {
            addCriterion("brand_comp_user not between", value1, value2, "brandCompUser");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateIsNull() {
            addCriterion("brand_comp_date is null");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateIsNotNull() {
            addCriterion("brand_comp_date is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateEqualTo(Date value) {
            addCriterion("brand_comp_date =", value, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateNotEqualTo(Date value) {
            addCriterion("brand_comp_date <>", value, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateGreaterThan(Date value) {
            addCriterion("brand_comp_date >", value, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateGreaterThanOrEqualTo(Date value) {
            addCriterion("brand_comp_date >=", value, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateLessThan(Date value) {
            addCriterion("brand_comp_date <", value, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateLessThanOrEqualTo(Date value) {
            addCriterion("brand_comp_date <=", value, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateIn(List<Date> values) {
            addCriterion("brand_comp_date in", values, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateNotIn(List<Date> values) {
            addCriterion("brand_comp_date not in", values, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateBetween(Date value1, Date value2) {
            addCriterion("brand_comp_date between", value1, value2, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andBrandCompDateNotBetween(Date value1, Date value2) {
            addCriterion("brand_comp_date not between", value1, value2, "brandCompDate");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIsNull() {
            addCriterion("is_release is null");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIsNotNull() {
            addCriterion("is_release is not null");
            return (Criteria) this;
        }

        public Criteria andIsReleaseEqualTo(Byte value) {
            addCriterion("is_release =", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotEqualTo(Byte value) {
            addCriterion("is_release <>", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseGreaterThan(Byte value) {
            addCriterion("is_release >", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_release >=", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLessThan(Byte value) {
            addCriterion("is_release <", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLessThanOrEqualTo(Byte value) {
            addCriterion("is_release <=", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIn(List<Byte> values) {
            addCriterion("is_release in", values, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotIn(List<Byte> values) {
            addCriterion("is_release not in", values, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseBetween(Byte value1, Byte value2) {
            addCriterion("is_release between", value1, value2, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotBetween(Byte value1, Byte value2) {
            addCriterion("is_release not between", value1, value2, "isRelease");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterion("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterion("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterion("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterion("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterion("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterion("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterion("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterion("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterion("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineIsNull() {
            addCriterion("commit_comp_deadline is null");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineIsNotNull() {
            addCriterion("commit_comp_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineEqualTo(Date value) {
            addCriterion("commit_comp_deadline =", value, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineNotEqualTo(Date value) {
            addCriterion("commit_comp_deadline <>", value, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineGreaterThan(Date value) {
            addCriterion("commit_comp_deadline >", value, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("commit_comp_deadline >=", value, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineLessThan(Date value) {
            addCriterion("commit_comp_deadline <", value, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("commit_comp_deadline <=", value, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineIn(List<Date> values) {
            addCriterion("commit_comp_deadline in", values, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineNotIn(List<Date> values) {
            addCriterion("commit_comp_deadline not in", values, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineBetween(Date value1, Date value2) {
            addCriterion("commit_comp_deadline between", value1, value2, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andCommitCompDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("commit_comp_deadline not between", value1, value2, "commitCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineIsNull() {
            addCriterion("first_comp_deadline is null");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineIsNotNull() {
            addCriterion("first_comp_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineEqualTo(Date value) {
            addCriterion("first_comp_deadline =", value, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineNotEqualTo(Date value) {
            addCriterion("first_comp_deadline <>", value, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineGreaterThan(Date value) {
            addCriterion("first_comp_deadline >", value, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("first_comp_deadline >=", value, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineLessThan(Date value) {
            addCriterion("first_comp_deadline <", value, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("first_comp_deadline <=", value, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineIn(List<Date> values) {
            addCriterion("first_comp_deadline in", values, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineNotIn(List<Date> values) {
            addCriterion("first_comp_deadline not in", values, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineBetween(Date value1, Date value2) {
            addCriterion("first_comp_deadline between", value1, value2, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andFirstCompDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("first_comp_deadline not between", value1, value2, "firstCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineIsNull() {
            addCriterion("second_comp_deadline is null");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineIsNotNull() {
            addCriterion("second_comp_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineEqualTo(Date value) {
            addCriterion("second_comp_deadline =", value, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineNotEqualTo(Date value) {
            addCriterion("second_comp_deadline <>", value, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineGreaterThan(Date value) {
            addCriterion("second_comp_deadline >", value, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("second_comp_deadline >=", value, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineLessThan(Date value) {
            addCriterion("second_comp_deadline <", value, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("second_comp_deadline <=", value, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineIn(List<Date> values) {
            addCriterion("second_comp_deadline in", values, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineNotIn(List<Date> values) {
            addCriterion("second_comp_deadline not in", values, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineBetween(Date value1, Date value2) {
            addCriterion("second_comp_deadline between", value1, value2, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andSecondCompDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("second_comp_deadline not between", value1, value2, "secondCompDeadline");
            return (Criteria) this;
        }

        public Criteria andIsApproveIsNull() {
            addCriterion("is_approve is null");
            return (Criteria) this;
        }

        public Criteria andIsApproveIsNotNull() {
            addCriterion("is_approve is not null");
            return (Criteria) this;
        }

        public Criteria andIsApproveEqualTo(Byte value) {
            addCriterion("is_approve =", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotEqualTo(Byte value) {
            addCriterion("is_approve <>", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveGreaterThan(Byte value) {
            addCriterion("is_approve >", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_approve >=", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveLessThan(Byte value) {
            addCriterion("is_approve <", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveLessThanOrEqualTo(Byte value) {
            addCriterion("is_approve <=", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveIn(List<Byte> values) {
            addCriterion("is_approve in", values, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotIn(List<Byte> values) {
            addCriterion("is_approve not in", values, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveBetween(Byte value1, Byte value2) {
            addCriterion("is_approve between", value1, value2, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotBetween(Byte value1, Byte value2) {
            addCriterion("is_approve not between", value1, value2, "isApprove");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyIsNull() {
            addCriterion("inp_unqualified_qty is null");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyIsNotNull() {
            addCriterion("inp_unqualified_qty is not null");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyEqualTo(Byte value) {
            addCriterion("inp_unqualified_qty =", value, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyNotEqualTo(Byte value) {
            addCriterion("inp_unqualified_qty <>", value, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyGreaterThan(Byte value) {
            addCriterion("inp_unqualified_qty >", value, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyGreaterThanOrEqualTo(Byte value) {
            addCriterion("inp_unqualified_qty >=", value, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyLessThan(Byte value) {
            addCriterion("inp_unqualified_qty <", value, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyLessThanOrEqualTo(Byte value) {
            addCriterion("inp_unqualified_qty <=", value, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyIn(List<Byte> values) {
            addCriterion("inp_unqualified_qty in", values, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyNotIn(List<Byte> values) {
            addCriterion("inp_unqualified_qty not in", values, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyBetween(Byte value1, Byte value2) {
            addCriterion("inp_unqualified_qty between", value1, value2, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andInpUnqualifiedQtyNotBetween(Byte value1, Byte value2) {
            addCriterion("inp_unqualified_qty not between", value1, value2, "inpUnqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyIsNull() {
            addCriterion("first_comp_unqlf_qty is null");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyIsNotNull() {
            addCriterion("first_comp_unqlf_qty is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyEqualTo(Byte value) {
            addCriterion("first_comp_unqlf_qty =", value, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyNotEqualTo(Byte value) {
            addCriterion("first_comp_unqlf_qty <>", value, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyGreaterThan(Byte value) {
            addCriterion("first_comp_unqlf_qty >", value, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyGreaterThanOrEqualTo(Byte value) {
            addCriterion("first_comp_unqlf_qty >=", value, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyLessThan(Byte value) {
            addCriterion("first_comp_unqlf_qty <", value, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyLessThanOrEqualTo(Byte value) {
            addCriterion("first_comp_unqlf_qty <=", value, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyIn(List<Byte> values) {
            addCriterion("first_comp_unqlf_qty in", values, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyNotIn(List<Byte> values) {
            addCriterion("first_comp_unqlf_qty not in", values, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyBetween(Byte value1, Byte value2) {
            addCriterion("first_comp_unqlf_qty between", value1, value2, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFirstCompUnqlfQtyNotBetween(Byte value1, Byte value2) {
            addCriterion("first_comp_unqlf_qty not between", value1, value2, "firstCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyIsNull() {
            addCriterion("second_comp_unqlf_qty is null");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyIsNotNull() {
            addCriterion("second_comp_unqlf_qty is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyEqualTo(Byte value) {
            addCriterion("second_comp_unqlf_qty =", value, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyNotEqualTo(Byte value) {
            addCriterion("second_comp_unqlf_qty <>", value, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyGreaterThan(Byte value) {
            addCriterion("second_comp_unqlf_qty >", value, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyGreaterThanOrEqualTo(Byte value) {
            addCriterion("second_comp_unqlf_qty >=", value, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyLessThan(Byte value) {
            addCriterion("second_comp_unqlf_qty <", value, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyLessThanOrEqualTo(Byte value) {
            addCriterion("second_comp_unqlf_qty <=", value, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyIn(List<Byte> values) {
            addCriterion("second_comp_unqlf_qty in", values, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyNotIn(List<Byte> values) {
            addCriterion("second_comp_unqlf_qty not in", values, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyBetween(Byte value1, Byte value2) {
            addCriterion("second_comp_unqlf_qty between", value1, value2, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andSecondCompUnqlfQtyNotBetween(Byte value1, Byte value2) {
            addCriterion("second_comp_unqlf_qty not between", value1, value2, "secondCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyIsNull() {
            addCriterion("final_comp_unqlf_qty is null");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyIsNotNull() {
            addCriterion("final_comp_unqlf_qty is not null");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyEqualTo(Byte value) {
            addCriterion("final_comp_unqlf_qty =", value, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyNotEqualTo(Byte value) {
            addCriterion("final_comp_unqlf_qty <>", value, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyGreaterThan(Byte value) {
            addCriterion("final_comp_unqlf_qty >", value, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyGreaterThanOrEqualTo(Byte value) {
            addCriterion("final_comp_unqlf_qty >=", value, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyLessThan(Byte value) {
            addCriterion("final_comp_unqlf_qty <", value, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyLessThanOrEqualTo(Byte value) {
            addCriterion("final_comp_unqlf_qty <=", value, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyIn(List<Byte> values) {
            addCriterion("final_comp_unqlf_qty in", values, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyNotIn(List<Byte> values) {
            addCriterion("final_comp_unqlf_qty not in", values, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyBetween(Byte value1, Byte value2) {
            addCriterion("final_comp_unqlf_qty between", value1, value2, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andFinalCompUnqlfQtyNotBetween(Byte value1, Byte value2) {
            addCriterion("final_comp_unqlf_qty not between", value1, value2, "finalCompUnqlfQty");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreIsNull() {
            addCriterion("rssc_avg_score is null");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreIsNotNull() {
            addCriterion("rssc_avg_score is not null");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreEqualTo(BigDecimal value) {
            addCriterion("rssc_avg_score =", value, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreNotEqualTo(BigDecimal value) {
            addCriterion("rssc_avg_score <>", value, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreGreaterThan(BigDecimal value) {
            addCriterion("rssc_avg_score >", value, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rssc_avg_score >=", value, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreLessThan(BigDecimal value) {
            addCriterion("rssc_avg_score <", value, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rssc_avg_score <=", value, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreIn(List<BigDecimal> values) {
            addCriterion("rssc_avg_score in", values, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreNotIn(List<BigDecimal> values) {
            addCriterion("rssc_avg_score not in", values, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rssc_avg_score between", value1, value2, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andRsscAvgScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rssc_avg_score not between", value1, value2, "rsscAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreIsNull() {
            addCriterion("country_avg_score is null");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreIsNotNull() {
            addCriterion("country_avg_score is not null");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreEqualTo(BigDecimal value) {
            addCriterion("country_avg_score =", value, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreNotEqualTo(BigDecimal value) {
            addCriterion("country_avg_score <>", value, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreGreaterThan(BigDecimal value) {
            addCriterion("country_avg_score >", value, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("country_avg_score >=", value, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreLessThan(BigDecimal value) {
            addCriterion("country_avg_score <", value, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("country_avg_score <=", value, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreIn(List<BigDecimal> values) {
            addCriterion("country_avg_score in", values, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreNotIn(List<BigDecimal> values) {
            addCriterion("country_avg_score not in", values, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("country_avg_score between", value1, value2, "countryAvgScore");
            return (Criteria) this;
        }

        public Criteria andCountryAvgScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("country_avg_score not between", value1, value2, "countryAvgScore");
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

        public Criteria andQuestionareImgUrlIsNull() {
            addCriterion("questionare_img_url is null");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlIsNotNull() {
            addCriterion("questionare_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlEqualTo(String value) {
            addCriterion("questionare_img_url =", value, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlNotEqualTo(String value) {
            addCriterion("questionare_img_url <>", value, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlGreaterThan(String value) {
            addCriterion("questionare_img_url >", value, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("questionare_img_url >=", value, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlLessThan(String value) {
            addCriterion("questionare_img_url <", value, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlLessThanOrEqualTo(String value) {
            addCriterion("questionare_img_url <=", value, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlLike(String value) {
            addCriterion("questionare_img_url like", value, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlNotLike(String value) {
            addCriterion("questionare_img_url not like", value, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlIn(List<String> values) {
            addCriterion("questionare_img_url in", values, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlNotIn(List<String> values) {
            addCriterion("questionare_img_url not in", values, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlBetween(String value1, String value2) {
            addCriterion("questionare_img_url between", value1, value2, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andQuestionareImgUrlNotBetween(String value1, String value2) {
            addCriterion("questionare_img_url not between", value1, value2, "questionareImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlIsNull() {
            addCriterion("report_img_url is null");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlIsNotNull() {
            addCriterion("report_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlEqualTo(String value) {
            addCriterion("report_img_url =", value, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlNotEqualTo(String value) {
            addCriterion("report_img_url <>", value, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlGreaterThan(String value) {
            addCriterion("report_img_url >", value, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("report_img_url >=", value, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlLessThan(String value) {
            addCriterion("report_img_url <", value, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlLessThanOrEqualTo(String value) {
            addCriterion("report_img_url <=", value, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlLike(String value) {
            addCriterion("report_img_url like", value, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlNotLike(String value) {
            addCriterion("report_img_url not like", value, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlIn(List<String> values) {
            addCriterion("report_img_url in", values, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlNotIn(List<String> values) {
            addCriterion("report_img_url not in", values, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlBetween(String value1, String value2) {
            addCriterion("report_img_url between", value1, value2, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andReportImgUrlNotBetween(String value1, String value2) {
            addCriterion("report_img_url not between", value1, value2, "reportImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlIsNull() {
            addCriterion("accompany_img_url is null");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlIsNotNull() {
            addCriterion("accompany_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlEqualTo(String value) {
            addCriterion("accompany_img_url =", value, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlNotEqualTo(String value) {
            addCriterion("accompany_img_url <>", value, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlGreaterThan(String value) {
            addCriterion("accompany_img_url >", value, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("accompany_img_url >=", value, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlLessThan(String value) {
            addCriterion("accompany_img_url <", value, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlLessThanOrEqualTo(String value) {
            addCriterion("accompany_img_url <=", value, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlLike(String value) {
            addCriterion("accompany_img_url like", value, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlNotLike(String value) {
            addCriterion("accompany_img_url not like", value, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlIn(List<String> values) {
            addCriterion("accompany_img_url in", values, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlNotIn(List<String> values) {
            addCriterion("accompany_img_url not in", values, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlBetween(String value1, String value2) {
            addCriterion("accompany_img_url between", value1, value2, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andAccompanyImgUrlNotBetween(String value1, String value2) {
            addCriterion("accompany_img_url not between", value1, value2, "accompanyImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlIsNull() {
            addCriterion("group_photo_img_url is null");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlIsNotNull() {
            addCriterion("group_photo_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlEqualTo(String value) {
            addCriterion("group_photo_img_url =", value, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlNotEqualTo(String value) {
            addCriterion("group_photo_img_url <>", value, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlGreaterThan(String value) {
            addCriterion("group_photo_img_url >", value, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("group_photo_img_url >=", value, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlLessThan(String value) {
            addCriterion("group_photo_img_url <", value, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlLessThanOrEqualTo(String value) {
            addCriterion("group_photo_img_url <=", value, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlLike(String value) {
            addCriterion("group_photo_img_url like", value, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlNotLike(String value) {
            addCriterion("group_photo_img_url not like", value, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlIn(List<String> values) {
            addCriterion("group_photo_img_url in", values, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlNotIn(List<String> values) {
            addCriterion("group_photo_img_url not in", values, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlBetween(String value1, String value2) {
            addCriterion("group_photo_img_url between", value1, value2, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andGroupPhotoImgUrlNotBetween(String value1, String value2) {
            addCriterion("group_photo_img_url not between", value1, value2, "groupPhotoImgUrl");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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