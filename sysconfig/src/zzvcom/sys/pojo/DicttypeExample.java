package zzvcom.sys.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DicttypeExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    public DicttypeExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    protected DicttypeExample(DicttypeExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table dicttype
     *
     * @abatorgenerated Fri Dec 10 13:58:07 CST 2010
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andTypecodeIsNull() {
            addCriterion("typecode is null");
            return this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typecode is not null");
            return this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("typecode =", value, "typecode");
            return this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("typecode <>", value, "typecode");
            return this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("typecode >", value, "typecode");
            return this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("typecode >=", value, "typecode");
            return this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("typecode <", value, "typecode");
            return this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("typecode <=", value, "typecode");
            return this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("typecode like", value, "typecode");
            return this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("typecode not like", value, "typecode");
            return this;
        }

        public Criteria andTypecodeIn(List values) {
            addCriterion("typecode in", values, "typecode");
            return this;
        }

        public Criteria andTypecodeNotIn(List values) {
            addCriterion("typecode not in", values, "typecode");
            return this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("typecode between", value1, value2, "typecode");
            return this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("typecode not between", value1, value2, "typecode");
            return this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typename is null");
            return this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typename is not null");
            return this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typename =", value, "typename");
            return this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typename <>", value, "typename");
            return this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typename >", value, "typename");
            return this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typename >=", value, "typename");
            return this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typename <", value, "typename");
            return this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typename <=", value, "typename");
            return this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typename like", value, "typename");
            return this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typename not like", value, "typename");
            return this;
        }

        public Criteria andTypenameIn(List values) {
            addCriterion("typename in", values, "typename");
            return this;
        }

        public Criteria andTypenameNotIn(List values) {
            addCriterion("typename not in", values, "typename");
            return this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typename between", value1, value2, "typename");
            return this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typename not between", value1, value2, "typename");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List values) {
            addCriterion("remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List values) {
            addCriterion("remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return this;
        }

        public Criteria andTypesortIsNull() {
            addCriterion("typesort is null");
            return this;
        }

        public Criteria andTypesortIsNotNull() {
            addCriterion("typesort is not null");
            return this;
        }

        public Criteria andTypesortEqualTo(Integer value) {
            addCriterion("typesort =", value, "typesort");
            return this;
        }

        public Criteria andTypesortNotEqualTo(Integer value) {
            addCriterion("typesort <>", value, "typesort");
            return this;
        }

        public Criteria andTypesortGreaterThan(Integer value) {
            addCriterion("typesort >", value, "typesort");
            return this;
        }

        public Criteria andTypesortGreaterThanOrEqualTo(Integer value) {
            addCriterion("typesort >=", value, "typesort");
            return this;
        }

        public Criteria andTypesortLessThan(Integer value) {
            addCriterion("typesort <", value, "typesort");
            return this;
        }

        public Criteria andTypesortLessThanOrEqualTo(Integer value) {
            addCriterion("typesort <=", value, "typesort");
            return this;
        }

        public Criteria andTypesortIn(List values) {
            addCriterion("typesort in", values, "typesort");
            return this;
        }

        public Criteria andTypesortNotIn(List values) {
            addCriterion("typesort not in", values, "typesort");
            return this;
        }

        public Criteria andTypesortBetween(Integer value1, Integer value2) {
            addCriterion("typesort between", value1, value2, "typesort");
            return this;
        }

        public Criteria andTypesortNotBetween(Integer value1, Integer value2) {
            addCriterion("typesort not between", value1, value2, "typesort");
            return this;
        }
        public Criteria andCodelengthIsNull() {
            addCriterion("codelength is null");
            return this;
        }

        public Criteria andCodelengthIsNotNull() {
            addCriterion("codelength is not null");
            return this;
        }

        public Criteria andCodelengthEqualTo(String value) {
            addCriterion("codelength =", value, "codelength");
            return this;
        }

        public Criteria andCodelengthNotEqualTo(String value) {
            addCriterion("codelength <>", value, "codelength");
            return this;
        }

        public Criteria andCodelengthGreaterThan(String value) {
            addCriterion("codelength >", value, "codelength");
            return this;
        }

        public Criteria andCodelengthGreaterThanOrEqualTo(String value) {
            addCriterion("codelength >=", value, "codelength");
            return this;
        }

        public Criteria andCodelengthLessThan(String value) {
            addCriterion("codelength <", value, "codelength");
            return this;
        }

        public Criteria andCodelengthLessThanOrEqualTo(String value) {
            addCriterion("codelength <=", value, "codelength");
            return this;
        }

        public Criteria andCodelengthLike(String value) {
            addCriterion("codelength like", value, "codelength");
            return this;
        }

        public Criteria andCodelengthNotLike(String value) {
            addCriterion("codelength not like", value, "codelength");
            return this;
        }

        public Criteria andCodelengthIn(List values) {
            addCriterion("codelength in", values, "codelength");
            return this;
        }

        public Criteria andCodelengthNotIn(List values) {
            addCriterion("codelength not in", values, "codelength");
            return this;
        }

        public Criteria andCodelengthBetween(String value1, String value2) {
            addCriterion("codelength between", value1, value2, "codelength");
            return this;
        }

        public Criteria andCodelengthNotBetween(String value1, String value2) {
            addCriterion("codelength not between", value1, value2, "codelength");
            return this;
        }
    }
}