package com.haochang.model;

import java.util.Date;

public class FrMenu {
    private Integer id;

    private String nodeNo;

    private String name;

    private String url;

    private String icon;

    private Integer parentId;

    private Integer orderNo;

    private Integer isShortCut;

    private String shortCutName;

    private Integer createUser;

    private String createUserName;

    private Date createDate;

    private Integer updateUser;

    private String updateUserName;

    private Date updateDate;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeNo() {
        return nodeNo;
    }

    public void setNodeNo(String nodeNo) {
        this.nodeNo = nodeNo == null ? null : nodeNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getIsShortCut() {
        return isShortCut;
    }

    public void setIsShortCut(Integer isShortCut) {
        this.isShortCut = isShortCut;
    }

    public String getShortCutName() {
        return shortCutName;
    }

    public void setShortCutName(String shortCutName) {
        this.shortCutName = shortCutName == null ? null : shortCutName.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}