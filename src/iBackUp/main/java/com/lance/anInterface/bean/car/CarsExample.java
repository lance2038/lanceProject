package com.lance.anInterface.bean.car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarsExample() {
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

        public Criteria andCarCodeIsNull() {
            addCriterion("CAR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCarCodeIsNotNull() {
            addCriterion("CAR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCarCodeEqualTo(String value) {
            addCriterion("CAR_CODE =", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotEqualTo(String value) {
            addCriterion("CAR_CODE <>", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeGreaterThan(String value) {
            addCriterion("CAR_CODE >", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_CODE >=", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLessThan(String value) {
            addCriterion("CAR_CODE <", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLessThanOrEqualTo(String value) {
            addCriterion("CAR_CODE <=", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLike(String value) {
            addCriterion("CAR_CODE like", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotLike(String value) {
            addCriterion("CAR_CODE not like", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeIn(List<String> values) {
            addCriterion("CAR_CODE in", values, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotIn(List<String> values) {
            addCriterion("CAR_CODE not in", values, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeBetween(String value1, String value2) {
            addCriterion("CAR_CODE between", value1, value2, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotBetween(String value1, String value2) {
            addCriterion("CAR_CODE not between", value1, value2, "carCode");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("EN_NAME =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("EN_NAME <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("EN_NAME >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("EN_NAME >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("EN_NAME <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("EN_NAME <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("EN_NAME like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("EN_NAME not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("EN_NAME in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("EN_NAME not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("EN_NAME between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("EN_NAME not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andZhNameIsNull() {
            addCriterion("ZH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andZhNameIsNotNull() {
            addCriterion("ZH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andZhNameEqualTo(String value) {
            addCriterion("ZH_NAME =", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotEqualTo(String value) {
            addCriterion("ZH_NAME <>", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameGreaterThan(String value) {
            addCriterion("ZH_NAME >", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameGreaterThanOrEqualTo(String value) {
            addCriterion("ZH_NAME >=", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLessThan(String value) {
            addCriterion("ZH_NAME <", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLessThanOrEqualTo(String value) {
            addCriterion("ZH_NAME <=", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLike(String value) {
            addCriterion("ZH_NAME like", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotLike(String value) {
            addCriterion("ZH_NAME not like", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameIn(List<String> values) {
            addCriterion("ZH_NAME in", values, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotIn(List<String> values) {
            addCriterion("ZH_NAME not in", values, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameBetween(String value1, String value2) {
            addCriterion("ZH_NAME between", value1, value2, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotBetween(String value1, String value2) {
            addCriterion("ZH_NAME not between", value1, value2, "zhName");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("POWER is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("POWER is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(BigDecimal value) {
            addCriterion("POWER =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(BigDecimal value) {
            addCriterion("POWER <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(BigDecimal value) {
            addCriterion("POWER >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POWER >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(BigDecimal value) {
            addCriterion("POWER <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POWER <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<BigDecimal> values) {
            addCriterion("POWER in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<BigDecimal> values) {
            addCriterion("POWER not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POWER between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POWER not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andEnginetypeIsNull() {
            addCriterion("ENGINETYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnginetypeIsNotNull() {
            addCriterion("ENGINETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnginetypeEqualTo(String value) {
            addCriterion("ENGINETYPE =", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeNotEqualTo(String value) {
            addCriterion("ENGINETYPE <>", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeGreaterThan(String value) {
            addCriterion("ENGINETYPE >", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINETYPE >=", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeLessThan(String value) {
            addCriterion("ENGINETYPE <", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeLessThanOrEqualTo(String value) {
            addCriterion("ENGINETYPE <=", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeLike(String value) {
            addCriterion("ENGINETYPE like", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeNotLike(String value) {
            addCriterion("ENGINETYPE not like", value, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeIn(List<String> values) {
            addCriterion("ENGINETYPE in", values, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeNotIn(List<String> values) {
            addCriterion("ENGINETYPE not in", values, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeBetween(String value1, String value2) {
            addCriterion("ENGINETYPE between", value1, value2, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginetypeNotBetween(String value1, String value2) {
            addCriterion("ENGINETYPE not between", value1, value2, "enginetype");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementIsNull() {
            addCriterion("ENGINEDISPLACEMENT is null");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementIsNotNull() {
            addCriterion("ENGINEDISPLACEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementEqualTo(BigDecimal value) {
            addCriterion("ENGINEDISPLACEMENT =", value, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementNotEqualTo(BigDecimal value) {
            addCriterion("ENGINEDISPLACEMENT <>", value, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementGreaterThan(BigDecimal value) {
            addCriterion("ENGINEDISPLACEMENT >", value, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENGINEDISPLACEMENT >=", value, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementLessThan(BigDecimal value) {
            addCriterion("ENGINEDISPLACEMENT <", value, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENGINEDISPLACEMENT <=", value, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementIn(List<BigDecimal> values) {
            addCriterion("ENGINEDISPLACEMENT in", values, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementNotIn(List<BigDecimal> values) {
            addCriterion("ENGINEDISPLACEMENT not in", values, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENGINEDISPLACEMENT between", value1, value2, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andEnginedisplacementNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENGINEDISPLACEMENT not between", value1, value2, "enginedisplacement");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIsNull() {
            addCriterion("MAXSPEED is null");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIsNotNull() {
            addCriterion("MAXSPEED is not null");
            return (Criteria) this;
        }

        public Criteria andMaxspeedEqualTo(BigDecimal value) {
            addCriterion("MAXSPEED =", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotEqualTo(BigDecimal value) {
            addCriterion("MAXSPEED <>", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedGreaterThan(BigDecimal value) {
            addCriterion("MAXSPEED >", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXSPEED >=", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLessThan(BigDecimal value) {
            addCriterion("MAXSPEED <", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXSPEED <=", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIn(List<BigDecimal> values) {
            addCriterion("MAXSPEED in", values, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotIn(List<BigDecimal> values) {
            addCriterion("MAXSPEED not in", values, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXSPEED between", value1, value2, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXSPEED not between", value1, value2, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andAccelerateIsNull() {
            addCriterion("ACCELERATE is null");
            return (Criteria) this;
        }

        public Criteria andAccelerateIsNotNull() {
            addCriterion("ACCELERATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccelerateEqualTo(BigDecimal value) {
            addCriterion("ACCELERATE =", value, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateNotEqualTo(BigDecimal value) {
            addCriterion("ACCELERATE <>", value, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateGreaterThan(BigDecimal value) {
            addCriterion("ACCELERATE >", value, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCELERATE >=", value, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateLessThan(BigDecimal value) {
            addCriterion("ACCELERATE <", value, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCELERATE <=", value, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateIn(List<BigDecimal> values) {
            addCriterion("ACCELERATE in", values, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateNotIn(List<BigDecimal> values) {
            addCriterion("ACCELERATE not in", values, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCELERATE between", value1, value2, "accelerate");
            return (Criteria) this;
        }

        public Criteria andAccelerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCELERATE not between", value1, value2, "accelerate");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCarlevelIsNull() {
            addCriterion("CARLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCarlevelIsNotNull() {
            addCriterion("CARLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCarlevelEqualTo(String value) {
            addCriterion("CARLEVEL =", value, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelNotEqualTo(String value) {
            addCriterion("CARLEVEL <>", value, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelGreaterThan(String value) {
            addCriterion("CARLEVEL >", value, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CARLEVEL >=", value, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelLessThan(String value) {
            addCriterion("CARLEVEL <", value, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelLessThanOrEqualTo(String value) {
            addCriterion("CARLEVEL <=", value, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelLike(String value) {
            addCriterion("CARLEVEL like", value, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelNotLike(String value) {
            addCriterion("CARLEVEL not like", value, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelIn(List<String> values) {
            addCriterion("CARLEVEL in", values, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelNotIn(List<String> values) {
            addCriterion("CARLEVEL not in", values, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelBetween(String value1, String value2) {
            addCriterion("CARLEVEL between", value1, value2, "carlevel");
            return (Criteria) this;
        }

        public Criteria andCarlevelNotBetween(String value1, String value2) {
            addCriterion("CARLEVEL not between", value1, value2, "carlevel");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNull() {
            addCriterion("DESIGNER is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNotNull() {
            addCriterion("DESIGNER is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerEqualTo(String value) {
            addCriterion("DESIGNER =", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotEqualTo(String value) {
            addCriterion("DESIGNER <>", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThan(String value) {
            addCriterion("DESIGNER >", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGNER >=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThan(String value) {
            addCriterion("DESIGNER <", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThanOrEqualTo(String value) {
            addCriterion("DESIGNER <=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLike(String value) {
            addCriterion("DESIGNER like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotLike(String value) {
            addCriterion("DESIGNER not like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerIn(List<String> values) {
            addCriterion("DESIGNER in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotIn(List<String> values) {
            addCriterion("DESIGNER not in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerBetween(String value1, String value2) {
            addCriterion("DESIGNER between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotBetween(String value1, String value2) {
            addCriterion("DESIGNER not between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andTunerIsNull() {
            addCriterion("TUNER is null");
            return (Criteria) this;
        }

        public Criteria andTunerIsNotNull() {
            addCriterion("TUNER is not null");
            return (Criteria) this;
        }

        public Criteria andTunerEqualTo(String value) {
            addCriterion("TUNER =", value, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerNotEqualTo(String value) {
            addCriterion("TUNER <>", value, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerGreaterThan(String value) {
            addCriterion("TUNER >", value, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerGreaterThanOrEqualTo(String value) {
            addCriterion("TUNER >=", value, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerLessThan(String value) {
            addCriterion("TUNER <", value, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerLessThanOrEqualTo(String value) {
            addCriterion("TUNER <=", value, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerLike(String value) {
            addCriterion("TUNER like", value, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerNotLike(String value) {
            addCriterion("TUNER not like", value, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerIn(List<String> values) {
            addCriterion("TUNER in", values, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerNotIn(List<String> values) {
            addCriterion("TUNER not in", values, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerBetween(String value1, String value2) {
            addCriterion("TUNER between", value1, value2, "tuner");
            return (Criteria) this;
        }

        public Criteria andTunerNotBetween(String value1, String value2) {
            addCriterion("TUNER not between", value1, value2, "tuner");
            return (Criteria) this;
        }

        public Criteria andManufacturedateIsNull() {
            addCriterion("MANUFACTUREDATE is null");
            return (Criteria) this;
        }

        public Criteria andManufacturedateIsNotNull() {
            addCriterion("MANUFACTUREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturedateEqualTo(String value) {
            addCriterion("MANUFACTUREDATE =", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateNotEqualTo(String value) {
            addCriterion("MANUFACTUREDATE <>", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateGreaterThan(String value) {
            addCriterion("MANUFACTUREDATE >", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTUREDATE >=", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateLessThan(String value) {
            addCriterion("MANUFACTUREDATE <", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTUREDATE <=", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateLike(String value) {
            addCriterion("MANUFACTUREDATE like", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateNotLike(String value) {
            addCriterion("MANUFACTUREDATE not like", value, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateIn(List<String> values) {
            addCriterion("MANUFACTUREDATE in", values, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateNotIn(List<String> values) {
            addCriterion("MANUFACTUREDATE not in", values, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateBetween(String value1, String value2) {
            addCriterion("MANUFACTUREDATE between", value1, value2, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andManufacturedateNotBetween(String value1, String value2) {
            addCriterion("MANUFACTUREDATE not between", value1, value2, "manufacturedate");
            return (Criteria) this;
        }

        public Criteria andDescribIsNull() {
            addCriterion("DESCRIB is null");
            return (Criteria) this;
        }

        public Criteria andDescribIsNotNull() {
            addCriterion("DESCRIB is not null");
            return (Criteria) this;
        }

        public Criteria andDescribEqualTo(String value) {
            addCriterion("DESCRIB =", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribNotEqualTo(String value) {
            addCriterion("DESCRIB <>", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribGreaterThan(String value) {
            addCriterion("DESCRIB >", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIB >=", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribLessThan(String value) {
            addCriterion("DESCRIB <", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribLessThanOrEqualTo(String value) {
            addCriterion("DESCRIB <=", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribLike(String value) {
            addCriterion("DESCRIB like", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribNotLike(String value) {
            addCriterion("DESCRIB not like", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribIn(List<String> values) {
            addCriterion("DESCRIB in", values, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribNotIn(List<String> values) {
            addCriterion("DESCRIB not in", values, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribBetween(String value1, String value2) {
            addCriterion("DESCRIB between", value1, value2, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribNotBetween(String value1, String value2) {
            addCriterion("DESCRIB not between", value1, value2, "describ");
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