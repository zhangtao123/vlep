package com.anji.allways.entity;

import java.io.Serializable;
import java.util.Date;

public class Truck implements Serializable {
    private Long id;

    private Long supplierId;

    private String type;

    private String number;

    private String drivingPermit;

    private Byte status;

    private String remark;

    private Date createTime;

    private String createUser;

    private Date lastUpdateTime;

    private String lastUpdateUse;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getDrivingPermit() {
        return drivingPermit;
    }

    public void setDrivingPermit(String drivingPermit) {
        this.drivingPermit = drivingPermit == null ? null : drivingPermit.trim();
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

    public String getLastUpdateUse() {
        return lastUpdateUse;
    }

    public void setLastUpdateUse(String lastUpdateUse) {
        this.lastUpdateUse = lastUpdateUse == null ? null : lastUpdateUse.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", type=").append(type);
        sb.append(", number=").append(number);
        sb.append(", drivingPermit=").append(drivingPermit);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastUpdateUse=").append(lastUpdateUse);
        sb.append("]");
        return sb.toString();
    }
}