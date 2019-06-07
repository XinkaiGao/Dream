package generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DoctorExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("`uid` =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("`uid` <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("`uid` >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("`uid` >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("`uid` <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("`uid` <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("`uid` in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("`uid` not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSmallImageIsNull() {
            addCriterion("small_image is null");
            return (Criteria) this;
        }

        public Criteria andSmallImageIsNotNull() {
            addCriterion("small_image is not null");
            return (Criteria) this;
        }

        public Criteria andSmallImageEqualTo(String value) {
            addCriterion("small_image =", value, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageNotEqualTo(String value) {
            addCriterion("small_image <>", value, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageGreaterThan(String value) {
            addCriterion("small_image >", value, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageGreaterThanOrEqualTo(String value) {
            addCriterion("small_image >=", value, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageLessThan(String value) {
            addCriterion("small_image <", value, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageLessThanOrEqualTo(String value) {
            addCriterion("small_image <=", value, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageLike(String value) {
            addCriterion("small_image like", value, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageNotLike(String value) {
            addCriterion("small_image not like", value, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageIn(List<String> values) {
            addCriterion("small_image in", values, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageNotIn(List<String> values) {
            addCriterion("small_image not in", values, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageBetween(String value1, String value2) {
            addCriterion("small_image between", value1, value2, "smallImage");
            return (Criteria) this;
        }

        public Criteria andSmallImageNotBetween(String value1, String value2) {
            addCriterion("small_image not between", value1, value2, "smallImage");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("head is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("head is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("head =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("head <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("head >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("head >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("head <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("head <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("head like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("head not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("head in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("head not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("head between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("head not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<String> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<String> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andBigImageIsNull() {
            addCriterion("big_image is null");
            return (Criteria) this;
        }

        public Criteria andBigImageIsNotNull() {
            addCriterion("big_image is not null");
            return (Criteria) this;
        }

        public Criteria andBigImageEqualTo(String value) {
            addCriterion("big_image =", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageNotEqualTo(String value) {
            addCriterion("big_image <>", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageGreaterThan(String value) {
            addCriterion("big_image >", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageGreaterThanOrEqualTo(String value) {
            addCriterion("big_image >=", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageLessThan(String value) {
            addCriterion("big_image <", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageLessThanOrEqualTo(String value) {
            addCriterion("big_image <=", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageLike(String value) {
            addCriterion("big_image like", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageNotLike(String value) {
            addCriterion("big_image not like", value, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageIn(List<String> values) {
            addCriterion("big_image in", values, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageNotIn(List<String> values) {
            addCriterion("big_image not in", values, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageBetween(String value1, String value2) {
            addCriterion("big_image between", value1, value2, "bigImage");
            return (Criteria) this;
        }

        public Criteria andBigImageNotBetween(String value1, String value2) {
            addCriterion("big_image not between", value1, value2, "bigImage");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(Integer value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(Integer value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(Integer value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(Integer value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<Integer> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<Integer> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNull() {
            addCriterion("hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNotNull() {
            addCriterion("hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameEqualTo(String value) {
            addCriterion("hospital_name =", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotEqualTo(String value) {
            addCriterion("hospital_name <>", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThan(String value) {
            addCriterion("hospital_name >", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_name >=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThan(String value) {
            addCriterion("hospital_name <", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_name <=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLike(String value) {
            addCriterion("hospital_name like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotLike(String value) {
            addCriterion("hospital_name not like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIn(List<String> values) {
            addCriterion("hospital_name in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotIn(List<String> values) {
            addCriterion("hospital_name not in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameBetween(String value1, String value2) {
            addCriterion("hospital_name between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotBetween(String value1, String value2) {
            addCriterion("hospital_name not between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexIsNull() {
            addCriterion("recommend_index is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexIsNotNull() {
            addCriterion("recommend_index is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexEqualTo(Integer value) {
            addCriterion("recommend_index =", value, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexNotEqualTo(Integer value) {
            addCriterion("recommend_index <>", value, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexGreaterThan(Integer value) {
            addCriterion("recommend_index >", value, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_index >=", value, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexLessThan(Integer value) {
            addCriterion("recommend_index <", value, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_index <=", value, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexIn(List<Integer> values) {
            addCriterion("recommend_index in", values, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexNotIn(List<Integer> values) {
            addCriterion("recommend_index not in", values, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexBetween(Integer value1, Integer value2) {
            addCriterion("recommend_index between", value1, value2, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_index not between", value1, value2, "recommendIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexIsNull() {
            addCriterion("service_index is null");
            return (Criteria) this;
        }

        public Criteria andServiceIndexIsNotNull() {
            addCriterion("service_index is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIndexEqualTo(Integer value) {
            addCriterion("service_index =", value, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexNotEqualTo(Integer value) {
            addCriterion("service_index <>", value, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexGreaterThan(Integer value) {
            addCriterion("service_index >", value, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_index >=", value, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexLessThan(Integer value) {
            addCriterion("service_index <", value, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexLessThanOrEqualTo(Integer value) {
            addCriterion("service_index <=", value, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexIn(List<Integer> values) {
            addCriterion("service_index in", values, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexNotIn(List<Integer> values) {
            addCriterion("service_index not in", values, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexBetween(Integer value1, Integer value2) {
            addCriterion("service_index between", value1, value2, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andServiceIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("service_index not between", value1, value2, "serviceIndex");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelIsNull() {
            addCriterion("physic_level is null");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelIsNotNull() {
            addCriterion("physic_level is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelEqualTo(Integer value) {
            addCriterion("physic_level =", value, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelNotEqualTo(Integer value) {
            addCriterion("physic_level <>", value, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelGreaterThan(Integer value) {
            addCriterion("physic_level >", value, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("physic_level >=", value, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelLessThan(Integer value) {
            addCriterion("physic_level <", value, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelLessThanOrEqualTo(Integer value) {
            addCriterion("physic_level <=", value, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelIn(List<Integer> values) {
            addCriterion("physic_level in", values, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelNotIn(List<Integer> values) {
            addCriterion("physic_level not in", values, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelBetween(Integer value1, Integer value2) {
            addCriterion("physic_level between", value1, value2, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andPhysicLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("physic_level not between", value1, value2, "physicLevel");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultIsNull() {
            addCriterion("is_allow_consult is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultIsNotNull() {
            addCriterion("is_allow_consult is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultEqualTo(Boolean value) {
            addCriterion("is_allow_consult =", value, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultNotEqualTo(Boolean value) {
            addCriterion("is_allow_consult <>", value, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultGreaterThan(Boolean value) {
            addCriterion("is_allow_consult >", value, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_allow_consult >=", value, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultLessThan(Boolean value) {
            addCriterion("is_allow_consult <", value, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_allow_consult <=", value, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultIn(List<Boolean> values) {
            addCriterion("is_allow_consult in", values, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultNotIn(List<Boolean> values) {
            addCriterion("is_allow_consult not in", values, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_allow_consult between", value1, value2, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsAllowConsultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_allow_consult not between", value1, value2, "isAllowConsult");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Byte value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Byte value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Byte value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Byte value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Byte value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Byte> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Byte> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Byte value1, Byte value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Byte value1, Byte value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNull() {
            addCriterion("reply_num is null");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNotNull() {
            addCriterion("reply_num is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNumEqualTo(Integer value) {
            addCriterion("reply_num =", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotEqualTo(Integer value) {
            addCriterion("reply_num <>", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThan(Integer value) {
            addCriterion("reply_num >", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_num >=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThan(Integer value) {
            addCriterion("reply_num <", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("reply_num <=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIn(List<Integer> values) {
            addCriterion("reply_num in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotIn(List<Integer> values) {
            addCriterion("reply_num not in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumBetween(Integer value1, Integer value2) {
            addCriterion("reply_num between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_num not between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andFansNumIsNull() {
            addCriterion("fans_num is null");
            return (Criteria) this;
        }

        public Criteria andFansNumIsNotNull() {
            addCriterion("fans_num is not null");
            return (Criteria) this;
        }

        public Criteria andFansNumEqualTo(Integer value) {
            addCriterion("fans_num =", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumNotEqualTo(Integer value) {
            addCriterion("fans_num <>", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumGreaterThan(Integer value) {
            addCriterion("fans_num >", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_num >=", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumLessThan(Integer value) {
            addCriterion("fans_num <", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumLessThanOrEqualTo(Integer value) {
            addCriterion("fans_num <=", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumIn(List<Integer> values) {
            addCriterion("fans_num in", values, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumNotIn(List<Integer> values) {
            addCriterion("fans_num not in", values, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumBetween(Integer value1, Integer value2) {
            addCriterion("fans_num between", value1, value2, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_num not between", value1, value2, "fansNum");
            return (Criteria) this;
        }

        public Criteria andTag1IsNull() {
            addCriterion("tag_1 is null");
            return (Criteria) this;
        }

        public Criteria andTag1IsNotNull() {
            addCriterion("tag_1 is not null");
            return (Criteria) this;
        }

        public Criteria andTag1EqualTo(String value) {
            addCriterion("tag_1 =", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1NotEqualTo(String value) {
            addCriterion("tag_1 <>", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1GreaterThan(String value) {
            addCriterion("tag_1 >", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1GreaterThanOrEqualTo(String value) {
            addCriterion("tag_1 >=", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1LessThan(String value) {
            addCriterion("tag_1 <", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1LessThanOrEqualTo(String value) {
            addCriterion("tag_1 <=", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1Like(String value) {
            addCriterion("tag_1 like", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1NotLike(String value) {
            addCriterion("tag_1 not like", value, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1In(List<String> values) {
            addCriterion("tag_1 in", values, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1NotIn(List<String> values) {
            addCriterion("tag_1 not in", values, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1Between(String value1, String value2) {
            addCriterion("tag_1 between", value1, value2, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag1NotBetween(String value1, String value2) {
            addCriterion("tag_1 not between", value1, value2, "tag1");
            return (Criteria) this;
        }

        public Criteria andTag2IsNull() {
            addCriterion("tag_2 is null");
            return (Criteria) this;
        }

        public Criteria andTag2IsNotNull() {
            addCriterion("tag_2 is not null");
            return (Criteria) this;
        }

        public Criteria andTag2EqualTo(String value) {
            addCriterion("tag_2 =", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2NotEqualTo(String value) {
            addCriterion("tag_2 <>", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2GreaterThan(String value) {
            addCriterion("tag_2 >", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2GreaterThanOrEqualTo(String value) {
            addCriterion("tag_2 >=", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2LessThan(String value) {
            addCriterion("tag_2 <", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2LessThanOrEqualTo(String value) {
            addCriterion("tag_2 <=", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2Like(String value) {
            addCriterion("tag_2 like", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2NotLike(String value) {
            addCriterion("tag_2 not like", value, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2In(List<String> values) {
            addCriterion("tag_2 in", values, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2NotIn(List<String> values) {
            addCriterion("tag_2 not in", values, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2Between(String value1, String value2) {
            addCriterion("tag_2 between", value1, value2, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag2NotBetween(String value1, String value2) {
            addCriterion("tag_2 not between", value1, value2, "tag2");
            return (Criteria) this;
        }

        public Criteria andTag3IsNull() {
            addCriterion("tag_3 is null");
            return (Criteria) this;
        }

        public Criteria andTag3IsNotNull() {
            addCriterion("tag_3 is not null");
            return (Criteria) this;
        }

        public Criteria andTag3EqualTo(String value) {
            addCriterion("tag_3 =", value, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3NotEqualTo(String value) {
            addCriterion("tag_3 <>", value, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3GreaterThan(String value) {
            addCriterion("tag_3 >", value, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3GreaterThanOrEqualTo(String value) {
            addCriterion("tag_3 >=", value, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3LessThan(String value) {
            addCriterion("tag_3 <", value, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3LessThanOrEqualTo(String value) {
            addCriterion("tag_3 <=", value, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3Like(String value) {
            addCriterion("tag_3 like", value, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3NotLike(String value) {
            addCriterion("tag_3 not like", value, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3In(List<String> values) {
            addCriterion("tag_3 in", values, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3NotIn(List<String> values) {
            addCriterion("tag_3 not in", values, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3Between(String value1, String value2) {
            addCriterion("tag_3 between", value1, value2, "tag3");
            return (Criteria) this;
        }

        public Criteria andTag3NotBetween(String value1, String value2) {
            addCriterion("tag_3 not between", value1, value2, "tag3");
            return (Criteria) this;
        }

        public Criteria andImageIdcardIsNull() {
            addCriterion("image_idcard is null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardIsNotNull() {
            addCriterion("image_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardEqualTo(String value) {
            addCriterion("image_idcard =", value, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardNotEqualTo(String value) {
            addCriterion("image_idcard <>", value, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardGreaterThan(String value) {
            addCriterion("image_idcard >", value, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("image_idcard >=", value, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardLessThan(String value) {
            addCriterion("image_idcard <", value, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardLessThanOrEqualTo(String value) {
            addCriterion("image_idcard <=", value, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardLike(String value) {
            addCriterion("image_idcard like", value, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardNotLike(String value) {
            addCriterion("image_idcard not like", value, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardIn(List<String> values) {
            addCriterion("image_idcard in", values, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardNotIn(List<String> values) {
            addCriterion("image_idcard not in", values, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBetween(String value1, String value2) {
            addCriterion("image_idcard between", value1, value2, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardNotBetween(String value1, String value2) {
            addCriterion("image_idcard not between", value1, value2, "imageIdcard");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbIsNull() {
            addCriterion("image_idcard_thumb is null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbIsNotNull() {
            addCriterion("image_idcard_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbEqualTo(String value) {
            addCriterion("image_idcard_thumb =", value, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbNotEqualTo(String value) {
            addCriterion("image_idcard_thumb <>", value, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbGreaterThan(String value) {
            addCriterion("image_idcard_thumb >", value, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbGreaterThanOrEqualTo(String value) {
            addCriterion("image_idcard_thumb >=", value, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbLessThan(String value) {
            addCriterion("image_idcard_thumb <", value, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbLessThanOrEqualTo(String value) {
            addCriterion("image_idcard_thumb <=", value, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbLike(String value) {
            addCriterion("image_idcard_thumb like", value, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbNotLike(String value) {
            addCriterion("image_idcard_thumb not like", value, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbIn(List<String> values) {
            addCriterion("image_idcard_thumb in", values, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbNotIn(List<String> values) {
            addCriterion("image_idcard_thumb not in", values, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbBetween(String value1, String value2) {
            addCriterion("image_idcard_thumb between", value1, value2, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardThumbNotBetween(String value1, String value2) {
            addCriterion("image_idcard_thumb not between", value1, value2, "imageIdcardThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigIsNull() {
            addCriterion("image_idcard_big is null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigIsNotNull() {
            addCriterion("image_idcard_big is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigEqualTo(String value) {
            addCriterion("image_idcard_big =", value, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigNotEqualTo(String value) {
            addCriterion("image_idcard_big <>", value, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigGreaterThan(String value) {
            addCriterion("image_idcard_big >", value, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigGreaterThanOrEqualTo(String value) {
            addCriterion("image_idcard_big >=", value, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigLessThan(String value) {
            addCriterion("image_idcard_big <", value, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigLessThanOrEqualTo(String value) {
            addCriterion("image_idcard_big <=", value, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigLike(String value) {
            addCriterion("image_idcard_big like", value, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigNotLike(String value) {
            addCriterion("image_idcard_big not like", value, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigIn(List<String> values) {
            addCriterion("image_idcard_big in", values, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigNotIn(List<String> values) {
            addCriterion("image_idcard_big not in", values, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigBetween(String value1, String value2) {
            addCriterion("image_idcard_big between", value1, value2, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardBigNotBetween(String value1, String value2) {
            addCriterion("image_idcard_big not between", value1, value2, "imageIdcardBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrIsNull() {
            addCriterion("image_idcardr is null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrIsNotNull() {
            addCriterion("image_idcardr is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrEqualTo(String value) {
            addCriterion("image_idcardr =", value, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrNotEqualTo(String value) {
            addCriterion("image_idcardr <>", value, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrGreaterThan(String value) {
            addCriterion("image_idcardr >", value, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrGreaterThanOrEqualTo(String value) {
            addCriterion("image_idcardr >=", value, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrLessThan(String value) {
            addCriterion("image_idcardr <", value, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrLessThanOrEqualTo(String value) {
            addCriterion("image_idcardr <=", value, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrLike(String value) {
            addCriterion("image_idcardr like", value, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrNotLike(String value) {
            addCriterion("image_idcardr not like", value, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrIn(List<String> values) {
            addCriterion("image_idcardr in", values, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrNotIn(List<String> values) {
            addCriterion("image_idcardr not in", values, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBetween(String value1, String value2) {
            addCriterion("image_idcardr between", value1, value2, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrNotBetween(String value1, String value2) {
            addCriterion("image_idcardr not between", value1, value2, "imageIdcardr");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbIsNull() {
            addCriterion("image_idcardr_thumb is null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbIsNotNull() {
            addCriterion("image_idcardr_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbEqualTo(String value) {
            addCriterion("image_idcardr_thumb =", value, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbNotEqualTo(String value) {
            addCriterion("image_idcardr_thumb <>", value, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbGreaterThan(String value) {
            addCriterion("image_idcardr_thumb >", value, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbGreaterThanOrEqualTo(String value) {
            addCriterion("image_idcardr_thumb >=", value, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbLessThan(String value) {
            addCriterion("image_idcardr_thumb <", value, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbLessThanOrEqualTo(String value) {
            addCriterion("image_idcardr_thumb <=", value, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbLike(String value) {
            addCriterion("image_idcardr_thumb like", value, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbNotLike(String value) {
            addCriterion("image_idcardr_thumb not like", value, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbIn(List<String> values) {
            addCriterion("image_idcardr_thumb in", values, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbNotIn(List<String> values) {
            addCriterion("image_idcardr_thumb not in", values, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbBetween(String value1, String value2) {
            addCriterion("image_idcardr_thumb between", value1, value2, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrThumbNotBetween(String value1, String value2) {
            addCriterion("image_idcardr_thumb not between", value1, value2, "imageIdcardrThumb");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigIsNull() {
            addCriterion("image_idcardr_big is null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigIsNotNull() {
            addCriterion("image_idcardr_big is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigEqualTo(String value) {
            addCriterion("image_idcardr_big =", value, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigNotEqualTo(String value) {
            addCriterion("image_idcardr_big <>", value, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigGreaterThan(String value) {
            addCriterion("image_idcardr_big >", value, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigGreaterThanOrEqualTo(String value) {
            addCriterion("image_idcardr_big >=", value, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigLessThan(String value) {
            addCriterion("image_idcardr_big <", value, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigLessThanOrEqualTo(String value) {
            addCriterion("image_idcardr_big <=", value, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigLike(String value) {
            addCriterion("image_idcardr_big like", value, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigNotLike(String value) {
            addCriterion("image_idcardr_big not like", value, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigIn(List<String> values) {
            addCriterion("image_idcardr_big in", values, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigNotIn(List<String> values) {
            addCriterion("image_idcardr_big not in", values, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigBetween(String value1, String value2) {
            addCriterion("image_idcardr_big between", value1, value2, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageIdcardrBigNotBetween(String value1, String value2) {
            addCriterion("image_idcardr_big not between", value1, value2, "imageIdcardrBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoIsNull() {
            addCriterion("image_profess_no is null");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoIsNotNull() {
            addCriterion("image_profess_no is not null");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoEqualTo(String value) {
            addCriterion("image_profess_no =", value, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoNotEqualTo(String value) {
            addCriterion("image_profess_no <>", value, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoGreaterThan(String value) {
            addCriterion("image_profess_no >", value, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoGreaterThanOrEqualTo(String value) {
            addCriterion("image_profess_no >=", value, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoLessThan(String value) {
            addCriterion("image_profess_no <", value, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoLessThanOrEqualTo(String value) {
            addCriterion("image_profess_no <=", value, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoLike(String value) {
            addCriterion("image_profess_no like", value, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoNotLike(String value) {
            addCriterion("image_profess_no not like", value, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoIn(List<String> values) {
            addCriterion("image_profess_no in", values, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoNotIn(List<String> values) {
            addCriterion("image_profess_no not in", values, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoBetween(String value1, String value2) {
            addCriterion("image_profess_no between", value1, value2, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessNoNotBetween(String value1, String value2) {
            addCriterion("image_profess_no not between", value1, value2, "imageProfessNo");
            return (Criteria) this;
        }

        public Criteria andImageProfessIsNull() {
            addCriterion("image_profess is null");
            return (Criteria) this;
        }

        public Criteria andImageProfessIsNotNull() {
            addCriterion("image_profess is not null");
            return (Criteria) this;
        }

        public Criteria andImageProfessEqualTo(String value) {
            addCriterion("image_profess =", value, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessNotEqualTo(String value) {
            addCriterion("image_profess <>", value, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessGreaterThan(String value) {
            addCriterion("image_profess >", value, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessGreaterThanOrEqualTo(String value) {
            addCriterion("image_profess >=", value, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessLessThan(String value) {
            addCriterion("image_profess <", value, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessLessThanOrEqualTo(String value) {
            addCriterion("image_profess <=", value, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessLike(String value) {
            addCriterion("image_profess like", value, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessNotLike(String value) {
            addCriterion("image_profess not like", value, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessIn(List<String> values) {
            addCriterion("image_profess in", values, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessNotIn(List<String> values) {
            addCriterion("image_profess not in", values, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessBetween(String value1, String value2) {
            addCriterion("image_profess between", value1, value2, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessNotBetween(String value1, String value2) {
            addCriterion("image_profess not between", value1, value2, "imageProfess");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbIsNull() {
            addCriterion("image_profess_thumb is null");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbIsNotNull() {
            addCriterion("image_profess_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbEqualTo(String value) {
            addCriterion("image_profess_thumb =", value, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbNotEqualTo(String value) {
            addCriterion("image_profess_thumb <>", value, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbGreaterThan(String value) {
            addCriterion("image_profess_thumb >", value, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbGreaterThanOrEqualTo(String value) {
            addCriterion("image_profess_thumb >=", value, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbLessThan(String value) {
            addCriterion("image_profess_thumb <", value, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbLessThanOrEqualTo(String value) {
            addCriterion("image_profess_thumb <=", value, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbLike(String value) {
            addCriterion("image_profess_thumb like", value, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbNotLike(String value) {
            addCriterion("image_profess_thumb not like", value, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbIn(List<String> values) {
            addCriterion("image_profess_thumb in", values, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbNotIn(List<String> values) {
            addCriterion("image_profess_thumb not in", values, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbBetween(String value1, String value2) {
            addCriterion("image_profess_thumb between", value1, value2, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessThumbNotBetween(String value1, String value2) {
            addCriterion("image_profess_thumb not between", value1, value2, "imageProfessThumb");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigIsNull() {
            addCriterion("image_profess_big is null");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigIsNotNull() {
            addCriterion("image_profess_big is not null");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigEqualTo(String value) {
            addCriterion("image_profess_big =", value, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigNotEqualTo(String value) {
            addCriterion("image_profess_big <>", value, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigGreaterThan(String value) {
            addCriterion("image_profess_big >", value, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigGreaterThanOrEqualTo(String value) {
            addCriterion("image_profess_big >=", value, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigLessThan(String value) {
            addCriterion("image_profess_big <", value, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigLessThanOrEqualTo(String value) {
            addCriterion("image_profess_big <=", value, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigLike(String value) {
            addCriterion("image_profess_big like", value, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigNotLike(String value) {
            addCriterion("image_profess_big not like", value, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigIn(List<String> values) {
            addCriterion("image_profess_big in", values, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigNotIn(List<String> values) {
            addCriterion("image_profess_big not in", values, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigBetween(String value1, String value2) {
            addCriterion("image_profess_big between", value1, value2, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageProfessBigNotBetween(String value1, String value2) {
            addCriterion("image_profess_big not between", value1, value2, "imageProfessBig");
            return (Criteria) this;
        }

        public Criteria andImageEduIsNull() {
            addCriterion("image_edu is null");
            return (Criteria) this;
        }

        public Criteria andImageEduIsNotNull() {
            addCriterion("image_edu is not null");
            return (Criteria) this;
        }

        public Criteria andImageEduEqualTo(String value) {
            addCriterion("image_edu =", value, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduNotEqualTo(String value) {
            addCriterion("image_edu <>", value, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduGreaterThan(String value) {
            addCriterion("image_edu >", value, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduGreaterThanOrEqualTo(String value) {
            addCriterion("image_edu >=", value, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduLessThan(String value) {
            addCriterion("image_edu <", value, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduLessThanOrEqualTo(String value) {
            addCriterion("image_edu <=", value, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduLike(String value) {
            addCriterion("image_edu like", value, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduNotLike(String value) {
            addCriterion("image_edu not like", value, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduIn(List<String> values) {
            addCriterion("image_edu in", values, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduNotIn(List<String> values) {
            addCriterion("image_edu not in", values, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduBetween(String value1, String value2) {
            addCriterion("image_edu between", value1, value2, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduNotBetween(String value1, String value2) {
            addCriterion("image_edu not between", value1, value2, "imageEdu");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbIsNull() {
            addCriterion("image_edu_thumb is null");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbIsNotNull() {
            addCriterion("image_edu_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbEqualTo(String value) {
            addCriterion("image_edu_thumb =", value, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbNotEqualTo(String value) {
            addCriterion("image_edu_thumb <>", value, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbGreaterThan(String value) {
            addCriterion("image_edu_thumb >", value, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbGreaterThanOrEqualTo(String value) {
            addCriterion("image_edu_thumb >=", value, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbLessThan(String value) {
            addCriterion("image_edu_thumb <", value, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbLessThanOrEqualTo(String value) {
            addCriterion("image_edu_thumb <=", value, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbLike(String value) {
            addCriterion("image_edu_thumb like", value, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbNotLike(String value) {
            addCriterion("image_edu_thumb not like", value, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbIn(List<String> values) {
            addCriterion("image_edu_thumb in", values, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbNotIn(List<String> values) {
            addCriterion("image_edu_thumb not in", values, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbBetween(String value1, String value2) {
            addCriterion("image_edu_thumb between", value1, value2, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduThumbNotBetween(String value1, String value2) {
            addCriterion("image_edu_thumb not between", value1, value2, "imageEduThumb");
            return (Criteria) this;
        }

        public Criteria andImageEduBigIsNull() {
            addCriterion("image_edu_big is null");
            return (Criteria) this;
        }

        public Criteria andImageEduBigIsNotNull() {
            addCriterion("image_edu_big is not null");
            return (Criteria) this;
        }

        public Criteria andImageEduBigEqualTo(String value) {
            addCriterion("image_edu_big =", value, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigNotEqualTo(String value) {
            addCriterion("image_edu_big <>", value, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigGreaterThan(String value) {
            addCriterion("image_edu_big >", value, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigGreaterThanOrEqualTo(String value) {
            addCriterion("image_edu_big >=", value, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigLessThan(String value) {
            addCriterion("image_edu_big <", value, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigLessThanOrEqualTo(String value) {
            addCriterion("image_edu_big <=", value, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigLike(String value) {
            addCriterion("image_edu_big like", value, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigNotLike(String value) {
            addCriterion("image_edu_big not like", value, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigIn(List<String> values) {
            addCriterion("image_edu_big in", values, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigNotIn(List<String> values) {
            addCriterion("image_edu_big not in", values, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigBetween(String value1, String value2) {
            addCriterion("image_edu_big between", value1, value2, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageEduBigNotBetween(String value1, String value2) {
            addCriterion("image_edu_big not between", value1, value2, "imageEduBig");
            return (Criteria) this;
        }

        public Criteria andImageMaritalIsNull() {
            addCriterion("image_marital is null");
            return (Criteria) this;
        }

        public Criteria andImageMaritalIsNotNull() {
            addCriterion("image_marital is not null");
            return (Criteria) this;
        }

        public Criteria andImageMaritalEqualTo(String value) {
            addCriterion("image_marital =", value, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalNotEqualTo(String value) {
            addCriterion("image_marital <>", value, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalGreaterThan(String value) {
            addCriterion("image_marital >", value, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalGreaterThanOrEqualTo(String value) {
            addCriterion("image_marital >=", value, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalLessThan(String value) {
            addCriterion("image_marital <", value, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalLessThanOrEqualTo(String value) {
            addCriterion("image_marital <=", value, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalLike(String value) {
            addCriterion("image_marital like", value, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalNotLike(String value) {
            addCriterion("image_marital not like", value, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalIn(List<String> values) {
            addCriterion("image_marital in", values, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalNotIn(List<String> values) {
            addCriterion("image_marital not in", values, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalBetween(String value1, String value2) {
            addCriterion("image_marital between", value1, value2, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageMaritalNotBetween(String value1, String value2) {
            addCriterion("image_marital not between", value1, value2, "imageMarital");
            return (Criteria) this;
        }

        public Criteria andImageTotalIsNull() {
            addCriterion("image_total is null");
            return (Criteria) this;
        }

        public Criteria andImageTotalIsNotNull() {
            addCriterion("image_total is not null");
            return (Criteria) this;
        }

        public Criteria andImageTotalEqualTo(String value) {
            addCriterion("image_total =", value, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalNotEqualTo(String value) {
            addCriterion("image_total <>", value, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalGreaterThan(String value) {
            addCriterion("image_total >", value, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalGreaterThanOrEqualTo(String value) {
            addCriterion("image_total >=", value, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalLessThan(String value) {
            addCriterion("image_total <", value, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalLessThanOrEqualTo(String value) {
            addCriterion("image_total <=", value, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalLike(String value) {
            addCriterion("image_total like", value, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalNotLike(String value) {
            addCriterion("image_total not like", value, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalIn(List<String> values) {
            addCriterion("image_total in", values, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalNotIn(List<String> values) {
            addCriterion("image_total not in", values, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalBetween(String value1, String value2) {
            addCriterion("image_total between", value1, value2, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalNotBetween(String value1, String value2) {
            addCriterion("image_total not between", value1, value2, "imageTotal");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbIsNull() {
            addCriterion("image_total_thumb is null");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbIsNotNull() {
            addCriterion("image_total_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbEqualTo(String value) {
            addCriterion("image_total_thumb =", value, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbNotEqualTo(String value) {
            addCriterion("image_total_thumb <>", value, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbGreaterThan(String value) {
            addCriterion("image_total_thumb >", value, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbGreaterThanOrEqualTo(String value) {
            addCriterion("image_total_thumb >=", value, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbLessThan(String value) {
            addCriterion("image_total_thumb <", value, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbLessThanOrEqualTo(String value) {
            addCriterion("image_total_thumb <=", value, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbLike(String value) {
            addCriterion("image_total_thumb like", value, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbNotLike(String value) {
            addCriterion("image_total_thumb not like", value, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbIn(List<String> values) {
            addCriterion("image_total_thumb in", values, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbNotIn(List<String> values) {
            addCriterion("image_total_thumb not in", values, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbBetween(String value1, String value2) {
            addCriterion("image_total_thumb between", value1, value2, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalThumbNotBetween(String value1, String value2) {
            addCriterion("image_total_thumb not between", value1, value2, "imageTotalThumb");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigIsNull() {
            addCriterion("image_total_big is null");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigIsNotNull() {
            addCriterion("image_total_big is not null");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigEqualTo(String value) {
            addCriterion("image_total_big =", value, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigNotEqualTo(String value) {
            addCriterion("image_total_big <>", value, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigGreaterThan(String value) {
            addCriterion("image_total_big >", value, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigGreaterThanOrEqualTo(String value) {
            addCriterion("image_total_big >=", value, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigLessThan(String value) {
            addCriterion("image_total_big <", value, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigLessThanOrEqualTo(String value) {
            addCriterion("image_total_big <=", value, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigLike(String value) {
            addCriterion("image_total_big like", value, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigNotLike(String value) {
            addCriterion("image_total_big not like", value, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigIn(List<String> values) {
            addCriterion("image_total_big in", values, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigNotIn(List<String> values) {
            addCriterion("image_total_big not in", values, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigBetween(String value1, String value2) {
            addCriterion("image_total_big between", value1, value2, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTotalBigNotBetween(String value1, String value2) {
            addCriterion("image_total_big not between", value1, value2, "imageTotalBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainIsNull() {
            addCriterion("image_train is null");
            return (Criteria) this;
        }

        public Criteria andImageTrainIsNotNull() {
            addCriterion("image_train is not null");
            return (Criteria) this;
        }

        public Criteria andImageTrainEqualTo(String value) {
            addCriterion("image_train =", value, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainNotEqualTo(String value) {
            addCriterion("image_train <>", value, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainGreaterThan(String value) {
            addCriterion("image_train >", value, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainGreaterThanOrEqualTo(String value) {
            addCriterion("image_train >=", value, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainLessThan(String value) {
            addCriterion("image_train <", value, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainLessThanOrEqualTo(String value) {
            addCriterion("image_train <=", value, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainLike(String value) {
            addCriterion("image_train like", value, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainNotLike(String value) {
            addCriterion("image_train not like", value, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainIn(List<String> values) {
            addCriterion("image_train in", values, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainNotIn(List<String> values) {
            addCriterion("image_train not in", values, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainBetween(String value1, String value2) {
            addCriterion("image_train between", value1, value2, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainNotBetween(String value1, String value2) {
            addCriterion("image_train not between", value1, value2, "imageTrain");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbIsNull() {
            addCriterion("image_train_thumb is null");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbIsNotNull() {
            addCriterion("image_train_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbEqualTo(String value) {
            addCriterion("image_train_thumb =", value, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbNotEqualTo(String value) {
            addCriterion("image_train_thumb <>", value, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbGreaterThan(String value) {
            addCriterion("image_train_thumb >", value, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbGreaterThanOrEqualTo(String value) {
            addCriterion("image_train_thumb >=", value, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbLessThan(String value) {
            addCriterion("image_train_thumb <", value, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbLessThanOrEqualTo(String value) {
            addCriterion("image_train_thumb <=", value, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbLike(String value) {
            addCriterion("image_train_thumb like", value, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbNotLike(String value) {
            addCriterion("image_train_thumb not like", value, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbIn(List<String> values) {
            addCriterion("image_train_thumb in", values, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbNotIn(List<String> values) {
            addCriterion("image_train_thumb not in", values, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbBetween(String value1, String value2) {
            addCriterion("image_train_thumb between", value1, value2, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainThumbNotBetween(String value1, String value2) {
            addCriterion("image_train_thumb not between", value1, value2, "imageTrainThumb");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigIsNull() {
            addCriterion("image_train_big is null");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigIsNotNull() {
            addCriterion("image_train_big is not null");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigEqualTo(String value) {
            addCriterion("image_train_big =", value, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigNotEqualTo(String value) {
            addCriterion("image_train_big <>", value, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigGreaterThan(String value) {
            addCriterion("image_train_big >", value, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigGreaterThanOrEqualTo(String value) {
            addCriterion("image_train_big >=", value, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigLessThan(String value) {
            addCriterion("image_train_big <", value, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigLessThanOrEqualTo(String value) {
            addCriterion("image_train_big <=", value, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigLike(String value) {
            addCriterion("image_train_big like", value, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigNotLike(String value) {
            addCriterion("image_train_big not like", value, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigIn(List<String> values) {
            addCriterion("image_train_big in", values, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigNotIn(List<String> values) {
            addCriterion("image_train_big not in", values, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigBetween(String value1, String value2) {
            addCriterion("image_train_big between", value1, value2, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andImageTrainBigNotBetween(String value1, String value2) {
            addCriterion("image_train_big not between", value1, value2, "imageTrainBig");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIsNull() {
            addCriterion("fee_standard is null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIsNotNull() {
            addCriterion("fee_standard is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardEqualTo(Byte value) {
            addCriterion("fee_standard =", value, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardNotEqualTo(Byte value) {
            addCriterion("fee_standard <>", value, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardGreaterThan(Byte value) {
            addCriterion("fee_standard >", value, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardGreaterThanOrEqualTo(Byte value) {
            addCriterion("fee_standard >=", value, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLessThan(Byte value) {
            addCriterion("fee_standard <", value, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLessThanOrEqualTo(Byte value) {
            addCriterion("fee_standard <=", value, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIn(List<Byte> values) {
            addCriterion("fee_standard in", values, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardNotIn(List<Byte> values) {
            addCriterion("fee_standard not in", values, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardBetween(Byte value1, Byte value2) {
            addCriterion("fee_standard between", value1, value2, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andFeeStandardNotBetween(Byte value1, Byte value2) {
            addCriterion("fee_standard not between", value1, value2, "feeStandard");
            return (Criteria) this;
        }

        public Criteria andIsAuthIsNull() {
            addCriterion("is_auth is null");
            return (Criteria) this;
        }

        public Criteria andIsAuthIsNotNull() {
            addCriterion("is_auth is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuthEqualTo(Byte value) {
            addCriterion("is_auth =", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotEqualTo(Byte value) {
            addCriterion("is_auth <>", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthGreaterThan(Byte value) {
            addCriterion("is_auth >", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_auth >=", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLessThan(Byte value) {
            addCriterion("is_auth <", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLessThanOrEqualTo(Byte value) {
            addCriterion("is_auth <=", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthIn(List<Byte> values) {
            addCriterion("is_auth in", values, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotIn(List<Byte> values) {
            addCriterion("is_auth not in", values, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthBetween(Byte value1, Byte value2) {
            addCriterion("is_auth between", value1, value2, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("is_auth not between", value1, value2, "isAuth");
            return (Criteria) this;
        }

        public Criteria andWecharNumIsNull() {
            addCriterion("wechar_num is null");
            return (Criteria) this;
        }

        public Criteria andWecharNumIsNotNull() {
            addCriterion("wechar_num is not null");
            return (Criteria) this;
        }

        public Criteria andWecharNumEqualTo(String value) {
            addCriterion("wechar_num =", value, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumNotEqualTo(String value) {
            addCriterion("wechar_num <>", value, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumGreaterThan(String value) {
            addCriterion("wechar_num >", value, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumGreaterThanOrEqualTo(String value) {
            addCriterion("wechar_num >=", value, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumLessThan(String value) {
            addCriterion("wechar_num <", value, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumLessThanOrEqualTo(String value) {
            addCriterion("wechar_num <=", value, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumLike(String value) {
            addCriterion("wechar_num like", value, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumNotLike(String value) {
            addCriterion("wechar_num not like", value, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumIn(List<String> values) {
            addCriterion("wechar_num in", values, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumNotIn(List<String> values) {
            addCriterion("wechar_num not in", values, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumBetween(String value1, String value2) {
            addCriterion("wechar_num between", value1, value2, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andWecharNumNotBetween(String value1, String value2) {
            addCriterion("wechar_num not between", value1, value2, "wecharNum");
            return (Criteria) this;
        }

        public Criteria andEduIsNull() {
            addCriterion("edu is null");
            return (Criteria) this;
        }

        public Criteria andEduIsNotNull() {
            addCriterion("edu is not null");
            return (Criteria) this;
        }

        public Criteria andEduEqualTo(Byte value) {
            addCriterion("edu =", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotEqualTo(Byte value) {
            addCriterion("edu <>", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThan(Byte value) {
            addCriterion("edu >", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThanOrEqualTo(Byte value) {
            addCriterion("edu >=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThan(Byte value) {
            addCriterion("edu <", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThanOrEqualTo(Byte value) {
            addCriterion("edu <=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduIn(List<Byte> values) {
            addCriterion("edu in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotIn(List<Byte> values) {
            addCriterion("edu not in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduBetween(Byte value1, Byte value2) {
            addCriterion("edu between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotBetween(Byte value1, Byte value2) {
            addCriterion("edu not between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkIsNull() {
            addCriterion("famous_remark is null");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkIsNotNull() {
            addCriterion("famous_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkEqualTo(String value) {
            addCriterion("famous_remark =", value, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkNotEqualTo(String value) {
            addCriterion("famous_remark <>", value, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkGreaterThan(String value) {
            addCriterion("famous_remark >", value, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("famous_remark >=", value, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkLessThan(String value) {
            addCriterion("famous_remark <", value, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkLessThanOrEqualTo(String value) {
            addCriterion("famous_remark <=", value, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkLike(String value) {
            addCriterion("famous_remark like", value, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkNotLike(String value) {
            addCriterion("famous_remark not like", value, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkIn(List<String> values) {
            addCriterion("famous_remark in", values, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkNotIn(List<String> values) {
            addCriterion("famous_remark not in", values, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkBetween(String value1, String value2) {
            addCriterion("famous_remark between", value1, value2, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andFamousRemarkNotBetween(String value1, String value2) {
            addCriterion("famous_remark not between", value1, value2, "famousRemark");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeIsNull() {
            addCriterion("ask_total_time is null");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeIsNotNull() {
            addCriterion("ask_total_time is not null");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeEqualTo(Integer value) {
            addCriterion("ask_total_time =", value, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeNotEqualTo(Integer value) {
            addCriterion("ask_total_time <>", value, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeGreaterThan(Integer value) {
            addCriterion("ask_total_time >", value, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ask_total_time >=", value, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeLessThan(Integer value) {
            addCriterion("ask_total_time <", value, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ask_total_time <=", value, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeIn(List<Integer> values) {
            addCriterion("ask_total_time in", values, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeNotIn(List<Integer> values) {
            addCriterion("ask_total_time not in", values, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeBetween(Integer value1, Integer value2) {
            addCriterion("ask_total_time between", value1, value2, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andAskTotalTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ask_total_time not between", value1, value2, "askTotalTime");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexIsNull() {
            addCriterion("is_tj_index is null");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexIsNotNull() {
            addCriterion("is_tj_index is not null");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexEqualTo(Byte value) {
            addCriterion("is_tj_index =", value, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexNotEqualTo(Byte value) {
            addCriterion("is_tj_index <>", value, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexGreaterThan(Byte value) {
            addCriterion("is_tj_index >", value, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_tj_index >=", value, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexLessThan(Byte value) {
            addCriterion("is_tj_index <", value, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexLessThanOrEqualTo(Byte value) {
            addCriterion("is_tj_index <=", value, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexIn(List<Byte> values) {
            addCriterion("is_tj_index in", values, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexNotIn(List<Byte> values) {
            addCriterion("is_tj_index not in", values, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexBetween(Byte value1, Byte value2) {
            addCriterion("is_tj_index between", value1, value2, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andIsTjIndexNotBetween(Byte value1, Byte value2) {
            addCriterion("is_tj_index not between", value1, value2, "isTjIndex");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonIsNull() {
            addCriterion("tj_index_reason is null");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonIsNotNull() {
            addCriterion("tj_index_reason is not null");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonEqualTo(String value) {
            addCriterion("tj_index_reason =", value, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonNotEqualTo(String value) {
            addCriterion("tj_index_reason <>", value, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonGreaterThan(String value) {
            addCriterion("tj_index_reason >", value, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonGreaterThanOrEqualTo(String value) {
            addCriterion("tj_index_reason >=", value, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonLessThan(String value) {
            addCriterion("tj_index_reason <", value, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonLessThanOrEqualTo(String value) {
            addCriterion("tj_index_reason <=", value, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonLike(String value) {
            addCriterion("tj_index_reason like", value, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonNotLike(String value) {
            addCriterion("tj_index_reason not like", value, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonIn(List<String> values) {
            addCriterion("tj_index_reason in", values, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonNotIn(List<String> values) {
            addCriterion("tj_index_reason not in", values, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonBetween(String value1, String value2) {
            addCriterion("tj_index_reason between", value1, value2, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andTjIndexReasonNotBetween(String value1, String value2) {
            addCriterion("tj_index_reason not between", value1, value2, "tjIndexReason");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorIsNull() {
            addCriterion("is_supervisor is null");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorIsNotNull() {
            addCriterion("is_supervisor is not null");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorEqualTo(Byte value) {
            addCriterion("is_supervisor =", value, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorNotEqualTo(Byte value) {
            addCriterion("is_supervisor <>", value, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorGreaterThan(Byte value) {
            addCriterion("is_supervisor >", value, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_supervisor >=", value, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorLessThan(Byte value) {
            addCriterion("is_supervisor <", value, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorLessThanOrEqualTo(Byte value) {
            addCriterion("is_supervisor <=", value, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorIn(List<Byte> values) {
            addCriterion("is_supervisor in", values, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorNotIn(List<Byte> values) {
            addCriterion("is_supervisor not in", values, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorBetween(Byte value1, Byte value2) {
            addCriterion("is_supervisor between", value1, value2, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andIsSupervisorNotBetween(Byte value1, Byte value2) {
            addCriterion("is_supervisor not between", value1, value2, "isSupervisor");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenIsNull() {
            addCriterion("is_join_listen is null");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenIsNotNull() {
            addCriterion("is_join_listen is not null");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenEqualTo(Byte value) {
            addCriterion("is_join_listen =", value, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenNotEqualTo(Byte value) {
            addCriterion("is_join_listen <>", value, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenGreaterThan(Byte value) {
            addCriterion("is_join_listen >", value, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_join_listen >=", value, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenLessThan(Byte value) {
            addCriterion("is_join_listen <", value, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenLessThanOrEqualTo(Byte value) {
            addCriterion("is_join_listen <=", value, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenIn(List<Byte> values) {
            addCriterion("is_join_listen in", values, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenNotIn(List<Byte> values) {
            addCriterion("is_join_listen not in", values, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenBetween(Byte value1, Byte value2) {
            addCriterion("is_join_listen between", value1, value2, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andIsJoinListenNotBetween(Byte value1, Byte value2) {
            addCriterion("is_join_listen not between", value1, value2, "isJoinListen");
            return (Criteria) this;
        }

        public Criteria andOrderZanIsNull() {
            addCriterion("order_zan is null");
            return (Criteria) this;
        }

        public Criteria andOrderZanIsNotNull() {
            addCriterion("order_zan is not null");
            return (Criteria) this;
        }

        public Criteria andOrderZanEqualTo(Integer value) {
            addCriterion("order_zan =", value, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanNotEqualTo(Integer value) {
            addCriterion("order_zan <>", value, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanGreaterThan(Integer value) {
            addCriterion("order_zan >", value, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_zan >=", value, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanLessThan(Integer value) {
            addCriterion("order_zan <", value, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanLessThanOrEqualTo(Integer value) {
            addCriterion("order_zan <=", value, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanIn(List<Integer> values) {
            addCriterion("order_zan in", values, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanNotIn(List<Integer> values) {
            addCriterion("order_zan not in", values, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanBetween(Integer value1, Integer value2) {
            addCriterion("order_zan between", value1, value2, "orderZan");
            return (Criteria) this;
        }

        public Criteria andOrderZanNotBetween(Integer value1, Integer value2) {
            addCriterion("order_zan not between", value1, value2, "orderZan");
            return (Criteria) this;
        }

        public Criteria andNohelpNumIsNull() {
            addCriterion("nohelp_num is null");
            return (Criteria) this;
        }

        public Criteria andNohelpNumIsNotNull() {
            addCriterion("nohelp_num is not null");
            return (Criteria) this;
        }

        public Criteria andNohelpNumEqualTo(Integer value) {
            addCriterion("nohelp_num =", value, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumNotEqualTo(Integer value) {
            addCriterion("nohelp_num <>", value, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumGreaterThan(Integer value) {
            addCriterion("nohelp_num >", value, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("nohelp_num >=", value, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumLessThan(Integer value) {
            addCriterion("nohelp_num <", value, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumLessThanOrEqualTo(Integer value) {
            addCriterion("nohelp_num <=", value, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumIn(List<Integer> values) {
            addCriterion("nohelp_num in", values, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumNotIn(List<Integer> values) {
            addCriterion("nohelp_num not in", values, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumBetween(Integer value1, Integer value2) {
            addCriterion("nohelp_num between", value1, value2, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andNohelpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("nohelp_num not between", value1, value2, "nohelpNum");
            return (Criteria) this;
        }

        public Criteria andOrderAnsIsNull() {
            addCriterion("order_ans is null");
            return (Criteria) this;
        }

        public Criteria andOrderAnsIsNotNull() {
            addCriterion("order_ans is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAnsEqualTo(Integer value) {
            addCriterion("order_ans =", value, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsNotEqualTo(Integer value) {
            addCriterion("order_ans <>", value, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsGreaterThan(Integer value) {
            addCriterion("order_ans >", value, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_ans >=", value, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsLessThan(Integer value) {
            addCriterion("order_ans <", value, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsLessThanOrEqualTo(Integer value) {
            addCriterion("order_ans <=", value, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsIn(List<Integer> values) {
            addCriterion("order_ans in", values, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsNotIn(List<Integer> values) {
            addCriterion("order_ans not in", values, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsBetween(Integer value1, Integer value2) {
            addCriterion("order_ans between", value1, value2, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAnsNotBetween(Integer value1, Integer value2) {
            addCriterion("order_ans not between", value1, value2, "orderAns");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeIsNull() {
            addCriterion("order_ava_ans_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeIsNotNull() {
            addCriterion("order_ava_ans_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeEqualTo(Integer value) {
            addCriterion("order_ava_ans_time =", value, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeNotEqualTo(Integer value) {
            addCriterion("order_ava_ans_time <>", value, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeGreaterThan(Integer value) {
            addCriterion("order_ava_ans_time >", value, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_ava_ans_time >=", value, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeLessThan(Integer value) {
            addCriterion("order_ava_ans_time <", value, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeLessThanOrEqualTo(Integer value) {
            addCriterion("order_ava_ans_time <=", value, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeIn(List<Integer> values) {
            addCriterion("order_ava_ans_time in", values, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeNotIn(List<Integer> values) {
            addCriterion("order_ava_ans_time not in", values, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeBetween(Integer value1, Integer value2) {
            addCriterion("order_ava_ans_time between", value1, value2, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andOrderAvaAnsTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_ava_ans_time not between", value1, value2, "orderAvaAnsTime");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIsNull() {
            addCriterion("work_years is null");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIsNotNull() {
            addCriterion("work_years is not null");
            return (Criteria) this;
        }

        public Criteria andWorkYearsEqualTo(Byte value) {
            addCriterion("work_years =", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotEqualTo(Byte value) {
            addCriterion("work_years <>", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsGreaterThan(Byte value) {
            addCriterion("work_years >", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsGreaterThanOrEqualTo(Byte value) {
            addCriterion("work_years >=", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsLessThan(Byte value) {
            addCriterion("work_years <", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsLessThanOrEqualTo(Byte value) {
            addCriterion("work_years <=", value, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsIn(List<Byte> values) {
            addCriterion("work_years in", values, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotIn(List<Byte> values) {
            addCriterion("work_years not in", values, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsBetween(Byte value1, Byte value2) {
            addCriterion("work_years between", value1, value2, "workYears");
            return (Criteria) this;
        }

        public Criteria andWorkYearsNotBetween(Byte value1, Byte value2) {
            addCriterion("work_years not between", value1, value2, "workYears");
            return (Criteria) this;
        }

        public Criteria andTempSceneIsNull() {
            addCriterion("temp_scene is null");
            return (Criteria) this;
        }

        public Criteria andTempSceneIsNotNull() {
            addCriterion("temp_scene is not null");
            return (Criteria) this;
        }

        public Criteria andTempSceneEqualTo(String value) {
            addCriterion("temp_scene =", value, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneNotEqualTo(String value) {
            addCriterion("temp_scene <>", value, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneGreaterThan(String value) {
            addCriterion("temp_scene >", value, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_scene >=", value, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneLessThan(String value) {
            addCriterion("temp_scene <", value, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneLessThanOrEqualTo(String value) {
            addCriterion("temp_scene <=", value, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneLike(String value) {
            addCriterion("temp_scene like", value, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneNotLike(String value) {
            addCriterion("temp_scene not like", value, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneIn(List<String> values) {
            addCriterion("temp_scene in", values, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneNotIn(List<String> values) {
            addCriterion("temp_scene not in", values, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneBetween(String value1, String value2) {
            addCriterion("temp_scene between", value1, value2, "tempScene");
            return (Criteria) this;
        }

        public Criteria andTempSceneNotBetween(String value1, String value2) {
            addCriterion("temp_scene not between", value1, value2, "tempScene");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentIsNull() {
            addCriterion("line_default_content is null");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentIsNotNull() {
            addCriterion("line_default_content is not null");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentEqualTo(String value) {
            addCriterion("line_default_content =", value, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentNotEqualTo(String value) {
            addCriterion("line_default_content <>", value, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentGreaterThan(String value) {
            addCriterion("line_default_content >", value, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentGreaterThanOrEqualTo(String value) {
            addCriterion("line_default_content >=", value, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentLessThan(String value) {
            addCriterion("line_default_content <", value, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentLessThanOrEqualTo(String value) {
            addCriterion("line_default_content <=", value, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentLike(String value) {
            addCriterion("line_default_content like", value, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentNotLike(String value) {
            addCriterion("line_default_content not like", value, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentIn(List<String> values) {
            addCriterion("line_default_content in", values, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentNotIn(List<String> values) {
            addCriterion("line_default_content not in", values, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentBetween(String value1, String value2) {
            addCriterion("line_default_content between", value1, value2, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andLineDefaultContentNotBetween(String value1, String value2) {
            addCriterion("line_default_content not between", value1, value2, "lineDefaultContent");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeIsNull() {
            addCriterion("consult_room_type is null");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeIsNotNull() {
            addCriterion("consult_room_type is not null");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeEqualTo(Byte value) {
            addCriterion("consult_room_type =", value, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeNotEqualTo(Byte value) {
            addCriterion("consult_room_type <>", value, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeGreaterThan(Byte value) {
            addCriterion("consult_room_type >", value, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("consult_room_type >=", value, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeLessThan(Byte value) {
            addCriterion("consult_room_type <", value, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeLessThanOrEqualTo(Byte value) {
            addCriterion("consult_room_type <=", value, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeIn(List<Byte> values) {
            addCriterion("consult_room_type in", values, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeNotIn(List<Byte> values) {
            addCriterion("consult_room_type not in", values, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeBetween(Byte value1, Byte value2) {
            addCriterion("consult_room_type between", value1, value2, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andConsultRoomTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("consult_room_type not between", value1, value2, "consultRoomType");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressIsNull() {
            addCriterion("face_consult_address is null");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressIsNotNull() {
            addCriterion("face_consult_address is not null");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressEqualTo(String value) {
            addCriterion("face_consult_address =", value, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressNotEqualTo(String value) {
            addCriterion("face_consult_address <>", value, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressGreaterThan(String value) {
            addCriterion("face_consult_address >", value, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressGreaterThanOrEqualTo(String value) {
            addCriterion("face_consult_address >=", value, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressLessThan(String value) {
            addCriterion("face_consult_address <", value, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressLessThanOrEqualTo(String value) {
            addCriterion("face_consult_address <=", value, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressLike(String value) {
            addCriterion("face_consult_address like", value, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressNotLike(String value) {
            addCriterion("face_consult_address not like", value, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressIn(List<String> values) {
            addCriterion("face_consult_address in", values, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressNotIn(List<String> values) {
            addCriterion("face_consult_address not in", values, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressBetween(String value1, String value2) {
            addCriterion("face_consult_address between", value1, value2, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andFaceConsultAddressNotBetween(String value1, String value2) {
            addCriterion("face_consult_address not between", value1, value2, "faceConsultAddress");
            return (Criteria) this;
        }

        public Criteria andSpecialPushIsNull() {
            addCriterion("special_push is null");
            return (Criteria) this;
        }

        public Criteria andSpecialPushIsNotNull() {
            addCriterion("special_push is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialPushEqualTo(Byte value) {
            addCriterion("special_push =", value, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushNotEqualTo(Byte value) {
            addCriterion("special_push <>", value, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushGreaterThan(Byte value) {
            addCriterion("special_push >", value, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushGreaterThanOrEqualTo(Byte value) {
            addCriterion("special_push >=", value, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushLessThan(Byte value) {
            addCriterion("special_push <", value, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushLessThanOrEqualTo(Byte value) {
            addCriterion("special_push <=", value, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushIn(List<Byte> values) {
            addCriterion("special_push in", values, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushNotIn(List<Byte> values) {
            addCriterion("special_push not in", values, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushBetween(Byte value1, Byte value2) {
            addCriterion("special_push between", value1, value2, "specialPush");
            return (Criteria) this;
        }

        public Criteria andSpecialPushNotBetween(Byte value1, Byte value2) {
            addCriterion("special_push not between", value1, value2, "specialPush");
            return (Criteria) this;
        }

        public Criteria andShowPositionIsNull() {
            addCriterion("show_position is null");
            return (Criteria) this;
        }

        public Criteria andShowPositionIsNotNull() {
            addCriterion("show_position is not null");
            return (Criteria) this;
        }

        public Criteria andShowPositionEqualTo(Byte value) {
            addCriterion("show_position =", value, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionNotEqualTo(Byte value) {
            addCriterion("show_position <>", value, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionGreaterThan(Byte value) {
            addCriterion("show_position >", value, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_position >=", value, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionLessThan(Byte value) {
            addCriterion("show_position <", value, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionLessThanOrEqualTo(Byte value) {
            addCriterion("show_position <=", value, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionIn(List<Byte> values) {
            addCriterion("show_position in", values, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionNotIn(List<Byte> values) {
            addCriterion("show_position not in", values, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionBetween(Byte value1, Byte value2) {
            addCriterion("show_position between", value1, value2, "showPosition");
            return (Criteria) this;
        }

        public Criteria andShowPositionNotBetween(Byte value1, Byte value2) {
            addCriterion("show_position not between", value1, value2, "showPosition");
            return (Criteria) this;
        }

        public Criteria andYunClientIdIsNull() {
            addCriterion("yun_client_id is null");
            return (Criteria) this;
        }

        public Criteria andYunClientIdIsNotNull() {
            addCriterion("yun_client_id is not null");
            return (Criteria) this;
        }

        public Criteria andYunClientIdEqualTo(String value) {
            addCriterion("yun_client_id =", value, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdNotEqualTo(String value) {
            addCriterion("yun_client_id <>", value, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdGreaterThan(String value) {
            addCriterion("yun_client_id >", value, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("yun_client_id >=", value, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdLessThan(String value) {
            addCriterion("yun_client_id <", value, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdLessThanOrEqualTo(String value) {
            addCriterion("yun_client_id <=", value, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdLike(String value) {
            addCriterion("yun_client_id like", value, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdNotLike(String value) {
            addCriterion("yun_client_id not like", value, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdIn(List<String> values) {
            addCriterion("yun_client_id in", values, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdNotIn(List<String> values) {
            addCriterion("yun_client_id not in", values, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdBetween(String value1, String value2) {
            addCriterion("yun_client_id between", value1, value2, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andYunClientIdNotBetween(String value1, String value2) {
            addCriterion("yun_client_id not between", value1, value2, "yunClientId");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(Integer value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(Integer value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(Integer value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(Integer value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(Integer value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<Integer> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<Integer> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(Integer value1, Integer value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(Integer value1, Integer value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNull() {
            addCriterion("fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNotNull() {
            addCriterion("fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRateEqualTo(Integer value) {
            addCriterion("fee_rate =", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotEqualTo(Integer value) {
            addCriterion("fee_rate <>", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThan(Integer value) {
            addCriterion("fee_rate >", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_rate >=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThan(Integer value) {
            addCriterion("fee_rate <", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThanOrEqualTo(Integer value) {
            addCriterion("fee_rate <=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateIn(List<Integer> values) {
            addCriterion("fee_rate in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotIn(List<Integer> values) {
            addCriterion("fee_rate not in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateBetween(Integer value1, Integer value2) {
            addCriterion("fee_rate between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_rate not between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatIsNull() {
            addCriterion("fee_rate_wechat is null");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatIsNotNull() {
            addCriterion("fee_rate_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatEqualTo(Integer value) {
            addCriterion("fee_rate_wechat =", value, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatNotEqualTo(Integer value) {
            addCriterion("fee_rate_wechat <>", value, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatGreaterThan(Integer value) {
            addCriterion("fee_rate_wechat >", value, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_rate_wechat >=", value, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatLessThan(Integer value) {
            addCriterion("fee_rate_wechat <", value, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatLessThanOrEqualTo(Integer value) {
            addCriterion("fee_rate_wechat <=", value, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatIn(List<Integer> values) {
            addCriterion("fee_rate_wechat in", values, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatNotIn(List<Integer> values) {
            addCriterion("fee_rate_wechat not in", values, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatBetween(Integer value1, Integer value2) {
            addCriterion("fee_rate_wechat between", value1, value2, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andFeeRateWechatNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_rate_wechat not between", value1, value2, "feeRateWechat");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdIsNull() {
            addCriterion("organize_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdIsNotNull() {
            addCriterion("organize_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdEqualTo(Integer value) {
            addCriterion("organize_id =", value, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdNotEqualTo(Integer value) {
            addCriterion("organize_id <>", value, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdGreaterThan(Integer value) {
            addCriterion("organize_id >", value, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organize_id >=", value, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdLessThan(Integer value) {
            addCriterion("organize_id <", value, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("organize_id <=", value, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdIn(List<Integer> values) {
            addCriterion("organize_id in", values, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdNotIn(List<Integer> values) {
            addCriterion("organize_id not in", values, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdBetween(Integer value1, Integer value2) {
            addCriterion("organize_id between", value1, value2, "organizeId");
            return (Criteria) this;
        }

        public Criteria andOrganizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organize_id not between", value1, value2, "organizeId");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNull() {
            addCriterion("referrer is null");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNotNull() {
            addCriterion("referrer is not null");
            return (Criteria) this;
        }

        public Criteria andReferrerEqualTo(String value) {
            addCriterion("referrer =", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotEqualTo(String value) {
            addCriterion("referrer <>", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThan(String value) {
            addCriterion("referrer >", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThanOrEqualTo(String value) {
            addCriterion("referrer >=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThan(String value) {
            addCriterion("referrer <", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThanOrEqualTo(String value) {
            addCriterion("referrer <=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLike(String value) {
            addCriterion("referrer like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotLike(String value) {
            addCriterion("referrer not like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerIn(List<String> values) {
            addCriterion("referrer in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotIn(List<String> values) {
            addCriterion("referrer not in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerBetween(String value1, String value2) {
            addCriterion("referrer between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotBetween(String value1, String value2) {
            addCriterion("referrer not between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayIsNull() {
            addCriterion("is_taobao_sunday is null");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayIsNotNull() {
            addCriterion("is_taobao_sunday is not null");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayEqualTo(Byte value) {
            addCriterion("is_taobao_sunday =", value, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayNotEqualTo(Byte value) {
            addCriterion("is_taobao_sunday <>", value, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayGreaterThan(Byte value) {
            addCriterion("is_taobao_sunday >", value, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_taobao_sunday >=", value, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayLessThan(Byte value) {
            addCriterion("is_taobao_sunday <", value, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayLessThanOrEqualTo(Byte value) {
            addCriterion("is_taobao_sunday <=", value, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayIn(List<Byte> values) {
            addCriterion("is_taobao_sunday in", values, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayNotIn(List<Byte> values) {
            addCriterion("is_taobao_sunday not in", values, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayBetween(Byte value1, Byte value2) {
            addCriterion("is_taobao_sunday between", value1, value2, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsTaobaoSundayNotBetween(Byte value1, Byte value2) {
            addCriterion("is_taobao_sunday not between", value1, value2, "isTaobaoSunday");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineIsNull() {
            addCriterion("is_chat_online is null");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineIsNotNull() {
            addCriterion("is_chat_online is not null");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineEqualTo(Boolean value) {
            addCriterion("is_chat_online =", value, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineNotEqualTo(Boolean value) {
            addCriterion("is_chat_online <>", value, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineGreaterThan(Boolean value) {
            addCriterion("is_chat_online >", value, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_chat_online >=", value, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineLessThan(Boolean value) {
            addCriterion("is_chat_online <", value, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineLessThanOrEqualTo(Boolean value) {
            addCriterion("is_chat_online <=", value, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineIn(List<Boolean> values) {
            addCriterion("is_chat_online in", values, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineNotIn(List<Boolean> values) {
            addCriterion("is_chat_online not in", values, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineBetween(Boolean value1, Boolean value2) {
            addCriterion("is_chat_online between", value1, value2, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andIsChatOnlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_chat_online not between", value1, value2, "isChatOnline");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeIsNull() {
            addCriterion("set_online_time is null");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeIsNotNull() {
            addCriterion("set_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeEqualTo(Integer value) {
            addCriterion("set_online_time =", value, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeNotEqualTo(Integer value) {
            addCriterion("set_online_time <>", value, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeGreaterThan(Integer value) {
            addCriterion("set_online_time >", value, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_online_time >=", value, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeLessThan(Integer value) {
            addCriterion("set_online_time <", value, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeLessThanOrEqualTo(Integer value) {
            addCriterion("set_online_time <=", value, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeIn(List<Integer> values) {
            addCriterion("set_online_time in", values, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeNotIn(List<Integer> values) {
            addCriterion("set_online_time not in", values, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeBetween(Integer value1, Integer value2) {
            addCriterion("set_online_time between", value1, value2, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andSetOnlineTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("set_online_time not between", value1, value2, "setOnlineTime");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyIsNull() {
            addCriterion("chat_auto_reply is null");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyIsNotNull() {
            addCriterion("chat_auto_reply is not null");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyEqualTo(String value) {
            addCriterion("chat_auto_reply =", value, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyNotEqualTo(String value) {
            addCriterion("chat_auto_reply <>", value, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyGreaterThan(String value) {
            addCriterion("chat_auto_reply >", value, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyGreaterThanOrEqualTo(String value) {
            addCriterion("chat_auto_reply >=", value, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyLessThan(String value) {
            addCriterion("chat_auto_reply <", value, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyLessThanOrEqualTo(String value) {
            addCriterion("chat_auto_reply <=", value, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyLike(String value) {
            addCriterion("chat_auto_reply like", value, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyNotLike(String value) {
            addCriterion("chat_auto_reply not like", value, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyIn(List<String> values) {
            addCriterion("chat_auto_reply in", values, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyNotIn(List<String> values) {
            addCriterion("chat_auto_reply not in", values, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyBetween(String value1, String value2) {
            addCriterion("chat_auto_reply between", value1, value2, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andChatAutoReplyNotBetween(String value1, String value2) {
            addCriterion("chat_auto_reply not between", value1, value2, "chatAutoReply");
            return (Criteria) this;
        }

        public Criteria andJobCatIsNull() {
            addCriterion("job_cat is null");
            return (Criteria) this;
        }

        public Criteria andJobCatIsNotNull() {
            addCriterion("job_cat is not null");
            return (Criteria) this;
        }

        public Criteria andJobCatEqualTo(Byte value) {
            addCriterion("job_cat =", value, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatNotEqualTo(Byte value) {
            addCriterion("job_cat <>", value, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatGreaterThan(Byte value) {
            addCriterion("job_cat >", value, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatGreaterThanOrEqualTo(Byte value) {
            addCriterion("job_cat >=", value, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatLessThan(Byte value) {
            addCriterion("job_cat <", value, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatLessThanOrEqualTo(Byte value) {
            addCriterion("job_cat <=", value, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatIn(List<Byte> values) {
            addCriterion("job_cat in", values, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatNotIn(List<Byte> values) {
            addCriterion("job_cat not in", values, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatBetween(Byte value1, Byte value2) {
            addCriterion("job_cat between", value1, value2, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobCatNotBetween(Byte value1, Byte value2) {
            addCriterion("job_cat not between", value1, value2, "jobCat");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIsNull() {
            addCriterion("job_remark is null");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIsNotNull() {
            addCriterion("job_remark is not null");
            return (Criteria) this;
        }

        public Criteria andJobRemarkEqualTo(String value) {
            addCriterion("job_remark =", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotEqualTo(String value) {
            addCriterion("job_remark <>", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkGreaterThan(String value) {
            addCriterion("job_remark >", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("job_remark >=", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLessThan(String value) {
            addCriterion("job_remark <", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLessThanOrEqualTo(String value) {
            addCriterion("job_remark <=", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLike(String value) {
            addCriterion("job_remark like", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotLike(String value) {
            addCriterion("job_remark not like", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIn(List<String> values) {
            addCriterion("job_remark in", values, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotIn(List<String> values) {
            addCriterion("job_remark not in", values, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkBetween(String value1, String value2) {
            addCriterion("job_remark between", value1, value2, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotBetween(String value1, String value2) {
            addCriterion("job_remark not between", value1, value2, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andRecAppIsNull() {
            addCriterion("rec_app is null");
            return (Criteria) this;
        }

        public Criteria andRecAppIsNotNull() {
            addCriterion("rec_app is not null");
            return (Criteria) this;
        }

        public Criteria andRecAppEqualTo(Byte value) {
            addCriterion("rec_app =", value, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppNotEqualTo(Byte value) {
            addCriterion("rec_app <>", value, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppGreaterThan(Byte value) {
            addCriterion("rec_app >", value, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppGreaterThanOrEqualTo(Byte value) {
            addCriterion("rec_app >=", value, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppLessThan(Byte value) {
            addCriterion("rec_app <", value, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppLessThanOrEqualTo(Byte value) {
            addCriterion("rec_app <=", value, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppIn(List<Byte> values) {
            addCriterion("rec_app in", values, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppNotIn(List<Byte> values) {
            addCriterion("rec_app not in", values, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppBetween(Byte value1, Byte value2) {
            addCriterion("rec_app between", value1, value2, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecAppNotBetween(Byte value1, Byte value2) {
            addCriterion("rec_app not between", value1, value2, "recApp");
            return (Criteria) this;
        }

        public Criteria andRecRemarkIsNull() {
            addCriterion("rec_remark is null");
            return (Criteria) this;
        }

        public Criteria andRecRemarkIsNotNull() {
            addCriterion("rec_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRecRemarkEqualTo(String value) {
            addCriterion("rec_remark =", value, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkNotEqualTo(String value) {
            addCriterion("rec_remark <>", value, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkGreaterThan(String value) {
            addCriterion("rec_remark >", value, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("rec_remark >=", value, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkLessThan(String value) {
            addCriterion("rec_remark <", value, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkLessThanOrEqualTo(String value) {
            addCriterion("rec_remark <=", value, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkLike(String value) {
            addCriterion("rec_remark like", value, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkNotLike(String value) {
            addCriterion("rec_remark not like", value, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkIn(List<String> values) {
            addCriterion("rec_remark in", values, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkNotIn(List<String> values) {
            addCriterion("rec_remark not in", values, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkBetween(String value1, String value2) {
            addCriterion("rec_remark between", value1, value2, "recRemark");
            return (Criteria) this;
        }

        public Criteria andRecRemarkNotBetween(String value1, String value2) {
            addCriterion("rec_remark not between", value1, value2, "recRemark");
            return (Criteria) this;
        }

        public Criteria andGroupIsNull() {
            addCriterion("`group` is null");
            return (Criteria) this;
        }

        public Criteria andGroupIsNotNull() {
            addCriterion("`group` is not null");
            return (Criteria) this;
        }

        public Criteria andGroupEqualTo(Integer value) {
            addCriterion("`group` =", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotEqualTo(Integer value) {
            addCriterion("`group` <>", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupGreaterThan(Integer value) {
            addCriterion("`group` >", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("`group` >=", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupLessThan(Integer value) {
            addCriterion("`group` <", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupLessThanOrEqualTo(Integer value) {
            addCriterion("`group` <=", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupIn(List<Integer> values) {
            addCriterion("`group` in", values, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotIn(List<Integer> values) {
            addCriterion("`group` not in", values, "group");
            return (Criteria) this;
        }

        public Criteria andGroupBetween(Integer value1, Integer value2) {
            addCriterion("`group` between", value1, value2, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("`group` not between", value1, value2, "group");
            return (Criteria) this;
        }

        public Criteria andReplyViolateIsNull() {
            addCriterion("reply_violate is null");
            return (Criteria) this;
        }

        public Criteria andReplyViolateIsNotNull() {
            addCriterion("reply_violate is not null");
            return (Criteria) this;
        }

        public Criteria andReplyViolateEqualTo(Boolean value) {
            addCriterion("reply_violate =", value, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateNotEqualTo(Boolean value) {
            addCriterion("reply_violate <>", value, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateGreaterThan(Boolean value) {
            addCriterion("reply_violate >", value, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reply_violate >=", value, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateLessThan(Boolean value) {
            addCriterion("reply_violate <", value, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateLessThanOrEqualTo(Boolean value) {
            addCriterion("reply_violate <=", value, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateIn(List<Boolean> values) {
            addCriterion("reply_violate in", values, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateNotIn(List<Boolean> values) {
            addCriterion("reply_violate not in", values, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateBetween(Boolean value1, Boolean value2) {
            addCriterion("reply_violate between", value1, value2, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andReplyViolateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reply_violate not between", value1, value2, "replyViolate");
            return (Criteria) this;
        }

        public Criteria andPseudonymIsNull() {
            addCriterion("pseudonym is null");
            return (Criteria) this;
        }

        public Criteria andPseudonymIsNotNull() {
            addCriterion("pseudonym is not null");
            return (Criteria) this;
        }

        public Criteria andPseudonymEqualTo(String value) {
            addCriterion("pseudonym =", value, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymNotEqualTo(String value) {
            addCriterion("pseudonym <>", value, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymGreaterThan(String value) {
            addCriterion("pseudonym >", value, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymGreaterThanOrEqualTo(String value) {
            addCriterion("pseudonym >=", value, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymLessThan(String value) {
            addCriterion("pseudonym <", value, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymLessThanOrEqualTo(String value) {
            addCriterion("pseudonym <=", value, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymLike(String value) {
            addCriterion("pseudonym like", value, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymNotLike(String value) {
            addCriterion("pseudonym not like", value, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymIn(List<String> values) {
            addCriterion("pseudonym in", values, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymNotIn(List<String> values) {
            addCriterion("pseudonym not in", values, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymBetween(String value1, String value2) {
            addCriterion("pseudonym between", value1, value2, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andPseudonymNotBetween(String value1, String value2) {
            addCriterion("pseudonym not between", value1, value2, "pseudonym");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Byte value) {
            addCriterion("`level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Byte value) {
            addCriterion("`level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Byte value) {
            addCriterion("`level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("`level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Byte value) {
            addCriterion("`level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Byte value) {
            addCriterion("`level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Byte> values) {
            addCriterion("`level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Byte> values) {
            addCriterion("`level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Byte value1, Byte value2) {
            addCriterion("`level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("`level` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelIsNull() {
            addCriterion("ability_level is null");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelIsNotNull() {
            addCriterion("ability_level is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelEqualTo(Byte value) {
            addCriterion("ability_level =", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelNotEqualTo(Byte value) {
            addCriterion("ability_level <>", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelGreaterThan(Byte value) {
            addCriterion("ability_level >", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("ability_level >=", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelLessThan(Byte value) {
            addCriterion("ability_level <", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelLessThanOrEqualTo(Byte value) {
            addCriterion("ability_level <=", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelIn(List<Byte> values) {
            addCriterion("ability_level in", values, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelNotIn(List<Byte> values) {
            addCriterion("ability_level not in", values, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelBetween(Byte value1, Byte value2) {
            addCriterion("ability_level between", value1, value2, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("ability_level not between", value1, value2, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelIsNull() {
            addCriterion("business_level is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelIsNotNull() {
            addCriterion("business_level is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelEqualTo(Byte value) {
            addCriterion("business_level =", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelNotEqualTo(Byte value) {
            addCriterion("business_level <>", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelGreaterThan(Byte value) {
            addCriterion("business_level >", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("business_level >=", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelLessThan(Byte value) {
            addCriterion("business_level <", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelLessThanOrEqualTo(Byte value) {
            addCriterion("business_level <=", value, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelIn(List<Byte> values) {
            addCriterion("business_level in", values, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelNotIn(List<Byte> values) {
            addCriterion("business_level not in", values, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelBetween(Byte value1, Byte value2) {
            addCriterion("business_level between", value1, value2, "businessLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("business_level not between", value1, value2, "businessLevel");
            return (Criteria) this;
        }
    }

    /**
     */
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