package com.lance.anInterface.bean.manufacturersBean;

import java.util.ArrayList;
import java.util.List;

public class ManufacturersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManufacturersExample() {
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

        public Criteria andOcdeIsNull() {
            addCriterion("OCDE is null");
            return (Criteria) this;
        }

        public Criteria andOcdeIsNotNull() {
            addCriterion("OCDE is not null");
            return (Criteria) this;
        }

        public Criteria andOcdeEqualTo(String value) {
            addCriterion("OCDE =", value, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeNotEqualTo(String value) {
            addCriterion("OCDE <>", value, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeGreaterThan(String value) {
            addCriterion("OCDE >", value, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeGreaterThanOrEqualTo(String value) {
            addCriterion("OCDE >=", value, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeLessThan(String value) {
            addCriterion("OCDE <", value, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeLessThanOrEqualTo(String value) {
            addCriterion("OCDE <=", value, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeLike(String value) {
            addCriterion("OCDE like", value, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeNotLike(String value) {
            addCriterion("OCDE not like", value, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeIn(List<String> values) {
            addCriterion("OCDE in", values, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeNotIn(List<String> values) {
            addCriterion("OCDE not in", values, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeBetween(String value1, String value2) {
            addCriterion("OCDE between", value1, value2, "ocde");
            return (Criteria) this;
        }

        public Criteria andOcdeNotBetween(String value1, String value2) {
            addCriterion("OCDE not between", value1, value2, "ocde");
            return (Criteria) this;
        }

        public Criteria andRacinglevelIsNull() {
            addCriterion("RACINGLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRacinglevelIsNotNull() {
            addCriterion("RACINGLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRacinglevelEqualTo(String value) {
            addCriterion("RACINGLEVEL =", value, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelNotEqualTo(String value) {
            addCriterion("RACINGLEVEL <>", value, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelGreaterThan(String value) {
            addCriterion("RACINGLEVEL >", value, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelGreaterThanOrEqualTo(String value) {
            addCriterion("RACINGLEVEL >=", value, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelLessThan(String value) {
            addCriterion("RACINGLEVEL <", value, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelLessThanOrEqualTo(String value) {
            addCriterion("RACINGLEVEL <=", value, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelLike(String value) {
            addCriterion("RACINGLEVEL like", value, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelNotLike(String value) {
            addCriterion("RACINGLEVEL not like", value, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelIn(List<String> values) {
            addCriterion("RACINGLEVEL in", values, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelNotIn(List<String> values) {
            addCriterion("RACINGLEVEL not in", values, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelBetween(String value1, String value2) {
            addCriterion("RACINGLEVEL between", value1, value2, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andRacinglevelNotBetween(String value1, String value2) {
            addCriterion("RACINGLEVEL not between", value1, value2, "racinglevel");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("NAME_EN =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("NAME_EN <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("NAME_EN >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("NAME_EN <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("NAME_EN like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("NAME_EN not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("NAME_EN in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("NAME_EN not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("NAME_EN between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("NAME_EN not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNull() {
            addCriterion("NAME_ZH is null");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNotNull() {
            addCriterion("NAME_ZH is not null");
            return (Criteria) this;
        }

        public Criteria andNameZhEqualTo(String value) {
            addCriterion("NAME_ZH =", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotEqualTo(String value) {
            addCriterion("NAME_ZH <>", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThan(String value) {
            addCriterion("NAME_ZH >", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_ZH >=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThan(String value) {
            addCriterion("NAME_ZH <", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThanOrEqualTo(String value) {
            addCriterion("NAME_ZH <=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLike(String value) {
            addCriterion("NAME_ZH like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotLike(String value) {
            addCriterion("NAME_ZH not like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhIn(List<String> values) {
            addCriterion("NAME_ZH in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotIn(List<String> values) {
            addCriterion("NAME_ZH not in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhBetween(String value1, String value2) {
            addCriterion("NAME_ZH between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotBetween(String value1, String value2) {
            addCriterion("NAME_ZH not between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
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

        public Criteria andLogoIsNull() {
            addCriterion("LOGO is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("LOGO =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("LOGO <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("LOGO >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("LOGO <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("LOGO <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("LOGO like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("LOGO not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("LOGO in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("LOGO not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("LOGO between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("LOGO not between", value1, value2, "logo");
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