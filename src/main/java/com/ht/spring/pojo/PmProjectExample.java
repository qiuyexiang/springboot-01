package com.ht.spring.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PmProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmProjectExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andConstructionidIsNull() {
            addCriterion("constructionId is null");
            return (Criteria) this;
        }

        public Criteria andConstructionidIsNotNull() {
            addCriterion("constructionId is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionidEqualTo(Integer value) {
            addCriterion("constructionId =", value, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidNotEqualTo(Integer value) {
            addCriterion("constructionId <>", value, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidGreaterThan(Integer value) {
            addCriterion("constructionId >", value, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("constructionId >=", value, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidLessThan(Integer value) {
            addCriterion("constructionId <", value, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidLessThanOrEqualTo(Integer value) {
            addCriterion("constructionId <=", value, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidIn(List<Integer> values) {
            addCriterion("constructionId in", values, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidNotIn(List<Integer> values) {
            addCriterion("constructionId not in", values, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidBetween(Integer value1, Integer value2) {
            addCriterion("constructionId between", value1, value2, "constructionid");
            return (Criteria) this;
        }

        public Criteria andConstructionidNotBetween(Integer value1, Integer value2) {
            addCriterion("constructionId not between", value1, value2, "constructionid");
            return (Criteria) this;
        }

        public Criteria andDesignidIsNull() {
            addCriterion("designId is null");
            return (Criteria) this;
        }

        public Criteria andDesignidIsNotNull() {
            addCriterion("designId is not null");
            return (Criteria) this;
        }

        public Criteria andDesignidEqualTo(Integer value) {
            addCriterion("designId =", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotEqualTo(Integer value) {
            addCriterion("designId <>", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidGreaterThan(Integer value) {
            addCriterion("designId >", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidGreaterThanOrEqualTo(Integer value) {
            addCriterion("designId >=", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidLessThan(Integer value) {
            addCriterion("designId <", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidLessThanOrEqualTo(Integer value) {
            addCriterion("designId <=", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidIn(List<Integer> values) {
            addCriterion("designId in", values, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotIn(List<Integer> values) {
            addCriterion("designId not in", values, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidBetween(Integer value1, Integer value2) {
            addCriterion("designId between", value1, value2, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotBetween(Integer value1, Integer value2) {
            addCriterion("designId not between", value1, value2, "designid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridIsNull() {
            addCriterion("supervisorId is null");
            return (Criteria) this;
        }

        public Criteria andSupervisoridIsNotNull() {
            addCriterion("supervisorId is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisoridEqualTo(Integer value) {
            addCriterion("supervisorId =", value, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridNotEqualTo(Integer value) {
            addCriterion("supervisorId <>", value, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridGreaterThan(Integer value) {
            addCriterion("supervisorId >", value, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervisorId >=", value, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridLessThan(Integer value) {
            addCriterion("supervisorId <", value, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridLessThanOrEqualTo(Integer value) {
            addCriterion("supervisorId <=", value, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridIn(List<Integer> values) {
            addCriterion("supervisorId in", values, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridNotIn(List<Integer> values) {
            addCriterion("supervisorId not in", values, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridBetween(Integer value1, Integer value2) {
            addCriterion("supervisorId between", value1, value2, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andSupervisoridNotBetween(Integer value1, Integer value2) {
            addCriterion("supervisorId not between", value1, value2, "supervisorid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidIsNull() {
            addCriterion("powerSupplyContractId is null");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidIsNotNull() {
            addCriterion("powerSupplyContractId is not null");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidEqualTo(Integer value) {
            addCriterion("powerSupplyContractId =", value, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidNotEqualTo(Integer value) {
            addCriterion("powerSupplyContractId <>", value, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidGreaterThan(Integer value) {
            addCriterion("powerSupplyContractId >", value, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidGreaterThanOrEqualTo(Integer value) {
            addCriterion("powerSupplyContractId >=", value, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidLessThan(Integer value) {
            addCriterion("powerSupplyContractId <", value, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidLessThanOrEqualTo(Integer value) {
            addCriterion("powerSupplyContractId <=", value, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidIn(List<Integer> values) {
            addCriterion("powerSupplyContractId in", values, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidNotIn(List<Integer> values) {
            addCriterion("powerSupplyContractId not in", values, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidBetween(Integer value1, Integer value2) {
            addCriterion("powerSupplyContractId between", value1, value2, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andPowersupplycontractidNotBetween(Integer value1, Integer value2) {
            addCriterion("powerSupplyContractId not between", value1, value2, "powersupplycontractid");
            return (Criteria) this;
        }

        public Criteria andNumberdateIsNull() {
            addCriterion("numberDate is null");
            return (Criteria) this;
        }

        public Criteria andNumberdateIsNotNull() {
            addCriterion("numberDate is not null");
            return (Criteria) this;
        }

        public Criteria andNumberdateEqualTo(Date value) {
            addCriterion("numberDate =", value, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateNotEqualTo(Date value) {
            addCriterion("numberDate <>", value, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateGreaterThan(Date value) {
            addCriterion("numberDate >", value, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateGreaterThanOrEqualTo(Date value) {
            addCriterion("numberDate >=", value, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateLessThan(Date value) {
            addCriterion("numberDate <", value, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateLessThanOrEqualTo(Date value) {
            addCriterion("numberDate <=", value, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateIn(List<Date> values) {
            addCriterion("numberDate in", values, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateNotIn(List<Date> values) {
            addCriterion("numberDate not in", values, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateBetween(Date value1, Date value2) {
            addCriterion("numberDate between", value1, value2, "numberdate");
            return (Criteria) this;
        }

        public Criteria andNumberdateNotBetween(Date value1, Date value2) {
            addCriterion("numberDate not between", value1, value2, "numberdate");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andPactmoneyIsNull() {
            addCriterion("pactmoney is null");
            return (Criteria) this;
        }

        public Criteria andPactmoneyIsNotNull() {
            addCriterion("pactmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPactmoneyEqualTo(Double value) {
            addCriterion("pactmoney =", value, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyNotEqualTo(Double value) {
            addCriterion("pactmoney <>", value, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyGreaterThan(Double value) {
            addCriterion("pactmoney >", value, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("pactmoney >=", value, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyLessThan(Double value) {
            addCriterion("pactmoney <", value, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyLessThanOrEqualTo(Double value) {
            addCriterion("pactmoney <=", value, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyIn(List<Double> values) {
            addCriterion("pactmoney in", values, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyNotIn(List<Double> values) {
            addCriterion("pactmoney not in", values, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyBetween(Double value1, Double value2) {
            addCriterion("pactmoney between", value1, value2, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andPactmoneyNotBetween(Double value1, Double value2) {
            addCriterion("pactmoney not between", value1, value2, "pactmoney");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsIsNull() {
            addCriterion("settleAccounts is null");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsIsNotNull() {
            addCriterion("settleAccounts is not null");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsEqualTo(Double value) {
            addCriterion("settleAccounts =", value, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsNotEqualTo(Double value) {
            addCriterion("settleAccounts <>", value, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsGreaterThan(Double value) {
            addCriterion("settleAccounts >", value, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsGreaterThanOrEqualTo(Double value) {
            addCriterion("settleAccounts >=", value, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsLessThan(Double value) {
            addCriterion("settleAccounts <", value, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsLessThanOrEqualTo(Double value) {
            addCriterion("settleAccounts <=", value, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsIn(List<Double> values) {
            addCriterion("settleAccounts in", values, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsNotIn(List<Double> values) {
            addCriterion("settleAccounts not in", values, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsBetween(Double value1, Double value2) {
            addCriterion("settleAccounts between", value1, value2, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andSettleaccountsNotBetween(Double value1, Double value2) {
            addCriterion("settleAccounts not between", value1, value2, "settleaccounts");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNull() {
            addCriterion("receipt is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNotNull() {
            addCriterion("receipt is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptEqualTo(Double value) {
            addCriterion("receipt =", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotEqualTo(Double value) {
            addCriterion("receipt <>", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThan(Double value) {
            addCriterion("receipt >", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThanOrEqualTo(Double value) {
            addCriterion("receipt >=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThan(Double value) {
            addCriterion("receipt <", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThanOrEqualTo(Double value) {
            addCriterion("receipt <=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptIn(List<Double> values) {
            addCriterion("receipt in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotIn(List<Double> values) {
            addCriterion("receipt not in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptBetween(Double value1, Double value2) {
            addCriterion("receipt between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotBetween(Double value1, Double value2) {
            addCriterion("receipt not between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andGeldIsNull() {
            addCriterion("geld is null");
            return (Criteria) this;
        }

        public Criteria andGeldIsNotNull() {
            addCriterion("geld is not null");
            return (Criteria) this;
        }

        public Criteria andGeldEqualTo(Double value) {
            addCriterion("geld =", value, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldNotEqualTo(Double value) {
            addCriterion("geld <>", value, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldGreaterThan(Double value) {
            addCriterion("geld >", value, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldGreaterThanOrEqualTo(Double value) {
            addCriterion("geld >=", value, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldLessThan(Double value) {
            addCriterion("geld <", value, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldLessThanOrEqualTo(Double value) {
            addCriterion("geld <=", value, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldIn(List<Double> values) {
            addCriterion("geld in", values, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldNotIn(List<Double> values) {
            addCriterion("geld not in", values, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldBetween(Double value1, Double value2) {
            addCriterion("geld between", value1, value2, "geld");
            return (Criteria) this;
        }

        public Criteria andGeldNotBetween(Double value1, Double value2) {
            addCriterion("geld not between", value1, value2, "geld");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNull() {
            addCriterion("details is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("details is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("details =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("details <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("details >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("details >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("details <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("details <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("details like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("details not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("details in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("details not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("details between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("details not between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateIsNull() {
            addCriterion("completionDate is null");
            return (Criteria) this;
        }

        public Criteria andCompletiondateIsNotNull() {
            addCriterion("completionDate is not null");
            return (Criteria) this;
        }

        public Criteria andCompletiondateEqualTo(Date value) {
            addCriterionForJDBCDate("completionDate =", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotEqualTo(Date value) {
            addCriterionForJDBCDate("completionDate <>", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateGreaterThan(Date value) {
            addCriterionForJDBCDate("completionDate >", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("completionDate >=", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateLessThan(Date value) {
            addCriterionForJDBCDate("completionDate <", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("completionDate <=", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateIn(List<Date> values) {
            addCriterionForJDBCDate("completionDate in", values, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotIn(List<Date> values) {
            addCriterionForJDBCDate("completionDate not in", values, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("completionDate between", value1, value2, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("completionDate not between", value1, value2, "completiondate");
            return (Criteria) this;
        }

        public Criteria andClientprincipalIsNull() {
            addCriterion("clientPrincipal is null");
            return (Criteria) this;
        }

        public Criteria andClientprincipalIsNotNull() {
            addCriterion("clientPrincipal is not null");
            return (Criteria) this;
        }

        public Criteria andClientprincipalEqualTo(Integer value) {
            addCriterion("clientPrincipal =", value, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalNotEqualTo(Integer value) {
            addCriterion("clientPrincipal <>", value, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalGreaterThan(Integer value) {
            addCriterion("clientPrincipal >", value, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientPrincipal >=", value, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalLessThan(Integer value) {
            addCriterion("clientPrincipal <", value, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalLessThanOrEqualTo(Integer value) {
            addCriterion("clientPrincipal <=", value, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalIn(List<Integer> values) {
            addCriterion("clientPrincipal in", values, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalNotIn(List<Integer> values) {
            addCriterion("clientPrincipal not in", values, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalBetween(Integer value1, Integer value2) {
            addCriterion("clientPrincipal between", value1, value2, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andClientprincipalNotBetween(Integer value1, Integer value2) {
            addCriterion("clientPrincipal not between", value1, value2, "clientprincipal");
            return (Criteria) this;
        }

        public Criteria andBidderidIsNull() {
            addCriterion("bidderId is null");
            return (Criteria) this;
        }

        public Criteria andBidderidIsNotNull() {
            addCriterion("bidderId is not null");
            return (Criteria) this;
        }

        public Criteria andBidderidEqualTo(Integer value) {
            addCriterion("bidderId =", value, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidNotEqualTo(Integer value) {
            addCriterion("bidderId <>", value, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidGreaterThan(Integer value) {
            addCriterion("bidderId >", value, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bidderId >=", value, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidLessThan(Integer value) {
            addCriterion("bidderId <", value, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidLessThanOrEqualTo(Integer value) {
            addCriterion("bidderId <=", value, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidIn(List<Integer> values) {
            addCriterion("bidderId in", values, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidNotIn(List<Integer> values) {
            addCriterion("bidderId not in", values, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidBetween(Integer value1, Integer value2) {
            addCriterion("bidderId between", value1, value2, "bidderid");
            return (Criteria) this;
        }

        public Criteria andBidderidNotBetween(Integer value1, Integer value2) {
            addCriterion("bidderId not between", value1, value2, "bidderid");
            return (Criteria) this;
        }

        public Criteria andManageridIsNull() {
            addCriterion("managerId is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerId is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(Integer value) {
            addCriterion("managerId =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(Integer value) {
            addCriterion("managerId <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(Integer value) {
            addCriterion("managerId >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("managerId >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(Integer value) {
            addCriterion("managerId <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(Integer value) {
            addCriterion("managerId <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<Integer> values) {
            addCriterion("managerId in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<Integer> values) {
            addCriterion("managerId not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(Integer value1, Integer value2) {
            addCriterion("managerId between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(Integer value1, Integer value2) {
            addCriterion("managerId not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidIsNull() {
            addCriterion("supervisorSupervisionId is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidIsNotNull() {
            addCriterion("supervisorSupervisionId is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidEqualTo(Integer value) {
            addCriterion("supervisorSupervisionId =", value, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidNotEqualTo(Integer value) {
            addCriterion("supervisorSupervisionId <>", value, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidGreaterThan(Integer value) {
            addCriterion("supervisorSupervisionId >", value, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervisorSupervisionId >=", value, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidLessThan(Integer value) {
            addCriterion("supervisorSupervisionId <", value, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidLessThanOrEqualTo(Integer value) {
            addCriterion("supervisorSupervisionId <=", value, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidIn(List<Integer> values) {
            addCriterion("supervisorSupervisionId in", values, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidNotIn(List<Integer> values) {
            addCriterion("supervisorSupervisionId not in", values, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidBetween(Integer value1, Integer value2) {
            addCriterion("supervisorSupervisionId between", value1, value2, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andSupervisorsupervisionidNotBetween(Integer value1, Integer value2) {
            addCriterion("supervisorSupervisionId not between", value1, value2, "supervisorsupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidIsNull() {
            addCriterion("asideSupervisionId is null");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidIsNotNull() {
            addCriterion("asideSupervisionId is not null");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidEqualTo(Integer value) {
            addCriterion("asideSupervisionId =", value, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidNotEqualTo(Integer value) {
            addCriterion("asideSupervisionId <>", value, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidGreaterThan(Integer value) {
            addCriterion("asideSupervisionId >", value, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("asideSupervisionId >=", value, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidLessThan(Integer value) {
            addCriterion("asideSupervisionId <", value, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidLessThanOrEqualTo(Integer value) {
            addCriterion("asideSupervisionId <=", value, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidIn(List<Integer> values) {
            addCriterion("asideSupervisionId in", values, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidNotIn(List<Integer> values) {
            addCriterion("asideSupervisionId not in", values, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidBetween(Integer value1, Integer value2) {
            addCriterion("asideSupervisionId between", value1, value2, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andAsidesupervisionidNotBetween(Integer value1, Integer value2) {
            addCriterion("asideSupervisionId not between", value1, value2, "asidesupervisionid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidIsNull() {
            addCriterion("roadworkDeptId is null");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidIsNotNull() {
            addCriterion("roadworkDeptId is not null");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidEqualTo(Integer value) {
            addCriterion("roadworkDeptId =", value, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidNotEqualTo(Integer value) {
            addCriterion("roadworkDeptId <>", value, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidGreaterThan(Integer value) {
            addCriterion("roadworkDeptId >", value, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roadworkDeptId >=", value, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidLessThan(Integer value) {
            addCriterion("roadworkDeptId <", value, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("roadworkDeptId <=", value, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidIn(List<Integer> values) {
            addCriterion("roadworkDeptId in", values, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidNotIn(List<Integer> values) {
            addCriterion("roadworkDeptId not in", values, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidBetween(Integer value1, Integer value2) {
            addCriterion("roadworkDeptId between", value1, value2, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andRoadworkdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("roadworkDeptId not between", value1, value2, "roadworkdeptid");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityIsNull() {
            addCriterion("substationCapacity is null");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityIsNotNull() {
            addCriterion("substationCapacity is not null");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityEqualTo(Double value) {
            addCriterion("substationCapacity =", value, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityNotEqualTo(Double value) {
            addCriterion("substationCapacity <>", value, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityGreaterThan(Double value) {
            addCriterion("substationCapacity >", value, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityGreaterThanOrEqualTo(Double value) {
            addCriterion("substationCapacity >=", value, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityLessThan(Double value) {
            addCriterion("substationCapacity <", value, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityLessThanOrEqualTo(Double value) {
            addCriterion("substationCapacity <=", value, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityIn(List<Double> values) {
            addCriterion("substationCapacity in", values, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityNotIn(List<Double> values) {
            addCriterion("substationCapacity not in", values, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityBetween(Double value1, Double value2) {
            addCriterion("substationCapacity between", value1, value2, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andSubstationcapacityNotBetween(Double value1, Double value2) {
            addCriterion("substationCapacity not between", value1, value2, "substationcapacity");
            return (Criteria) this;
        }

        public Criteria andLinellengthIsNull() {
            addCriterion("lineLlength is null");
            return (Criteria) this;
        }

        public Criteria andLinellengthIsNotNull() {
            addCriterion("lineLlength is not null");
            return (Criteria) this;
        }

        public Criteria andLinellengthEqualTo(Double value) {
            addCriterion("lineLlength =", value, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthNotEqualTo(Double value) {
            addCriterion("lineLlength <>", value, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthGreaterThan(Double value) {
            addCriterion("lineLlength >", value, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthGreaterThanOrEqualTo(Double value) {
            addCriterion("lineLlength >=", value, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthLessThan(Double value) {
            addCriterion("lineLlength <", value, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthLessThanOrEqualTo(Double value) {
            addCriterion("lineLlength <=", value, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthIn(List<Double> values) {
            addCriterion("lineLlength in", values, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthNotIn(List<Double> values) {
            addCriterion("lineLlength not in", values, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthBetween(Double value1, Double value2) {
            addCriterion("lineLlength between", value1, value2, "linellength");
            return (Criteria) this;
        }

        public Criteria andLinellengthNotBetween(Double value1, Double value2) {
            addCriterion("lineLlength not between", value1, value2, "linellength");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Double value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Double value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Double value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Double value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Double value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Double> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Double> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Double value1, Double value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Double value1, Double value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andQualityIsNull() {
            addCriterion("quality is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("quality is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(Double value) {
            addCriterion("quality =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(Double value) {
            addCriterion("quality <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(Double value) {
            addCriterion("quality >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(Double value) {
            addCriterion("quality >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(Double value) {
            addCriterion("quality <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(Double value) {
            addCriterion("quality <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<Double> values) {
            addCriterion("quality in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<Double> values) {
            addCriterion("quality not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(Double value1, Double value2) {
            addCriterion("quality between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(Double value1, Double value2) {
            addCriterion("quality not between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andProgressofworksIsNull() {
            addCriterion("progressofworks is null");
            return (Criteria) this;
        }

        public Criteria andProgressofworksIsNotNull() {
            addCriterion("progressofworks is not null");
            return (Criteria) this;
        }

        public Criteria andProgressofworksEqualTo(String value) {
            addCriterion("progressofworks =", value, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksNotEqualTo(String value) {
            addCriterion("progressofworks <>", value, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksGreaterThan(String value) {
            addCriterion("progressofworks >", value, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksGreaterThanOrEqualTo(String value) {
            addCriterion("progressofworks >=", value, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksLessThan(String value) {
            addCriterion("progressofworks <", value, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksLessThanOrEqualTo(String value) {
            addCriterion("progressofworks <=", value, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksLike(String value) {
            addCriterion("progressofworks like", value, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksNotLike(String value) {
            addCriterion("progressofworks not like", value, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksIn(List<String> values) {
            addCriterion("progressofworks in", values, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksNotIn(List<String> values) {
            addCriterion("progressofworks not in", values, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksBetween(String value1, String value2) {
            addCriterion("progressofworks between", value1, value2, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksNotBetween(String value1, String value2) {
            addCriterion("progressofworks not between", value1, value2, "progressofworks");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateIsNull() {
            addCriterion("progressofworksState is null");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateIsNotNull() {
            addCriterion("progressofworksState is not null");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateEqualTo(String value) {
            addCriterion("progressofworksState =", value, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateNotEqualTo(String value) {
            addCriterion("progressofworksState <>", value, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateGreaterThan(String value) {
            addCriterion("progressofworksState >", value, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateGreaterThanOrEqualTo(String value) {
            addCriterion("progressofworksState >=", value, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateLessThan(String value) {
            addCriterion("progressofworksState <", value, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateLessThanOrEqualTo(String value) {
            addCriterion("progressofworksState <=", value, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateLike(String value) {
            addCriterion("progressofworksState like", value, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateNotLike(String value) {
            addCriterion("progressofworksState not like", value, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateIn(List<String> values) {
            addCriterion("progressofworksState in", values, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateNotIn(List<String> values) {
            addCriterion("progressofworksState not in", values, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateBetween(String value1, String value2) {
            addCriterion("progressofworksState between", value1, value2, "progressofworksstate");
            return (Criteria) this;
        }

        public Criteria andProgressofworksstateNotBetween(String value1, String value2) {
            addCriterion("progressofworksState not between", value1, value2, "progressofworksstate");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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