package com.anji.allways.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private Long id;

    private String number;

    private Byte status;

    private String srcName;

    private String srcPhoneNumber;

    private String srcAddress;

    private String srcDetailAddress;

    private String destName;

    private String destPhoneNumber;

    private String destAddress;

    private String destDetailAddress;

    private String customerBrand;

    private Long dealerId;

    private Byte orderType;

    private Byte shippingType;

    private BigDecimal expectedPrice;

    private BigDecimal actualPrice;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName == null ? null : srcName.trim();
    }

    public String getSrcPhoneNumber() {
        return srcPhoneNumber;
    }

    public void setSrcPhoneNumber(String srcPhoneNumber) {
        this.srcPhoneNumber = srcPhoneNumber == null ? null : srcPhoneNumber.trim();
    }

    public String getSrcAddress() {
        return srcAddress;
    }

    public void setSrcAddress(String srcAddress) {
        this.srcAddress = srcAddress == null ? null : srcAddress.trim();
    }

    public String getSrcDetailAddress() {
        return srcDetailAddress;
    }

    public void setSrcDetailAddress(String srcDetailAddress) {
        this.srcDetailAddress = srcDetailAddress == null ? null : srcDetailAddress.trim();
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName == null ? null : destName.trim();
    }

    public String getDestPhoneNumber() {
        return destPhoneNumber;
    }

    public void setDestPhoneNumber(String destPhoneNumber) {
        this.destPhoneNumber = destPhoneNumber == null ? null : destPhoneNumber.trim();
    }

    public String getDestAddress() {
        return destAddress;
    }

    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress == null ? null : destAddress.trim();
    }

    public String getDestDetailAddress() {
        return destDetailAddress;
    }

    public void setDestDetailAddress(String destDetailAddress) {
        this.destDetailAddress = destDetailAddress == null ? null : destDetailAddress.trim();
    }

    public String getCustomerBrand() {
        return customerBrand;
    }

    public void setCustomerBrand(String customerBrand) {
        this.customerBrand = customerBrand == null ? null : customerBrand.trim();
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Byte getShippingType() {
        return shippingType;
    }

    public void setShippingType(Byte shippingType) {
        this.shippingType = shippingType;
    }

    public BigDecimal getExpectedPrice() {
        return expectedPrice;
    }

    public void setExpectedPrice(BigDecimal expectedPrice) {
        this.expectedPrice = expectedPrice;
    }

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
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
        sb.append(", number=").append(number);
        sb.append(", status=").append(status);
        sb.append(", srcName=").append(srcName);
        sb.append(", srcPhoneNumber=").append(srcPhoneNumber);
        sb.append(", srcAddress=").append(srcAddress);
        sb.append(", srcDetailAddress=").append(srcDetailAddress);
        sb.append(", destName=").append(destName);
        sb.append(", destPhoneNumber=").append(destPhoneNumber);
        sb.append(", destAddress=").append(destAddress);
        sb.append(", destDetailAddress=").append(destDetailAddress);
        sb.append(", customerBrand=").append(customerBrand);
        sb.append(", dealerId=").append(dealerId);
        sb.append(", orderType=").append(orderType);
        sb.append(", shippingType=").append(shippingType);
        sb.append(", expectedPrice=").append(expectedPrice);
        sb.append(", actualPrice=").append(actualPrice);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append("]");
        return sb.toString();
    }
}