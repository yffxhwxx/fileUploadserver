package com.bird.file.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleIsNull() {
            addCriterion("goods_onsale is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleIsNotNull() {
            addCriterion("goods_onsale is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleEqualTo(BigDecimal value) {
            addCriterion("goods_onsale =", value, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleNotEqualTo(BigDecimal value) {
            addCriterion("goods_onsale <>", value, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleGreaterThan(BigDecimal value) {
            addCriterion("goods_onsale >", value, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_onsale >=", value, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleLessThan(BigDecimal value) {
            addCriterion("goods_onsale <", value, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_onsale <=", value, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleIn(List<BigDecimal> values) {
            addCriterion("goods_onsale in", values, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleNotIn(List<BigDecimal> values) {
            addCriterion("goods_onsale not in", values, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_onsale between", value1, value2, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnsaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_onsale not between", value1, value2, "goodsOnsale");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockIsNull() {
            addCriterion("goods_onstock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockIsNotNull() {
            addCriterion("goods_onstock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockEqualTo(Integer value) {
            addCriterion("goods_onstock =", value, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockNotEqualTo(Integer value) {
            addCriterion("goods_onstock <>", value, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockGreaterThan(Integer value) {
            addCriterion("goods_onstock >", value, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_onstock >=", value, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockLessThan(Integer value) {
            addCriterion("goods_onstock <", value, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockLessThanOrEqualTo(Integer value) {
            addCriterion("goods_onstock <=", value, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockIn(List<Integer> values) {
            addCriterion("goods_onstock in", values, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockNotIn(List<Integer> values) {
            addCriterion("goods_onstock not in", values, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockBetween(Integer value1, Integer value2) {
            addCriterion("goods_onstock between", value1, value2, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsOnstockNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_onstock not between", value1, value2, "goodsOnstock");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIsNull() {
            addCriterion("goods_sale is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIsNotNull() {
            addCriterion("goods_sale is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleEqualTo(BigDecimal value) {
            addCriterion("goods_sale =", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotEqualTo(BigDecimal value) {
            addCriterion("goods_sale <>", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleGreaterThan(BigDecimal value) {
            addCriterion("goods_sale >", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_sale >=", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleLessThan(BigDecimal value) {
            addCriterion("goods_sale <", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_sale <=", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIn(List<BigDecimal> values) {
            addCriterion("goods_sale in", values, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotIn(List<BigDecimal> values) {
            addCriterion("goods_sale not in", values, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_sale between", value1, value2, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_sale not between", value1, value2, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIsNull() {
            addCriterion("goods_stock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIsNotNull() {
            addCriterion("goods_stock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStockEqualTo(Integer value) {
            addCriterion("goods_stock =", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotEqualTo(Integer value) {
            addCriterion("goods_stock <>", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockGreaterThan(Integer value) {
            addCriterion("goods_stock >", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_stock >=", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockLessThan(Integer value) {
            addCriterion("goods_stock <", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockLessThanOrEqualTo(Integer value) {
            addCriterion("goods_stock <=", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIn(List<Integer> values) {
            addCriterion("goods_stock in", values, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotIn(List<Integer> values) {
            addCriterion("goods_stock not in", values, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockBetween(Integer value1, Integer value2) {
            addCriterion("goods_stock between", value1, value2, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_stock not between", value1, value2, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
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