package com.anji.allways.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Line implements Serializable {
    private Long id;

    private String name;

    private Long supplierId;

    private String srcProvince;

    private String srcCity;

    private String srcDistrict;

    private String destProvince;

    private String destCity;

    private String destDistrict;

    private BigDecimal price;

    private Byte status;

    private String remark;

    private Date createTime;

    private String createUser;

    private Date lastUpdateTime;

    private String lastUpdateUser;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSrcProvince() {
        return srcProvince;
    }

    public void setSrcProvince(String srcProvince) {
        this.srcProvince = srcProvince == null ? null : srcProvince.trim();
    }

    public String getSrcCity() {
        return srcCity;
    }

    public void setSrcCity(String srcCity) {
        this.srcCity = srcCity == null ? null : srcCity.trim();
    }

    public String getSrcDistrict() {
        return srcDistrict;
    }

    public void setSrcDistrict(String srcDistrict) {
        this.srcDistrict = srcDistrict == null ? null : srcDistrict.trim();
    }

    public String getDestProvince() {
        return destProvince;
    }

    public void setDestProvince(String destProvince) {
        this.destProvince = destProvince == null ? null : destProvince.trim();
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity == null ? null : destCity.trim();
    }

    public String getDestDistrict() {
        return destDistrict;
    }

    public void setDestDistrict(String destDistrict) {
        this.destDistrict = destDistrict == null ? null : destDistrict.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", srcProvince=").append(srcProvince);
        sb.append(", srcCity=").append(srcCity);
        sb.append(", srcDistrict=").append(srcDistrict);
        sb.append(", destProvince=").append(destProvince);
        sb.append(", destCity=").append(destCity);
        sb.append(", destDistrict=").append(destDistrict);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append("]");
        return sb.toString();
    }
}