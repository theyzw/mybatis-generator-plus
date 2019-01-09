/*
*
* Group.java
* @date 2018-08-31
*/
package com.yk.model;

import java.util.Date;

public class Group {
    /**
     * 编号
     */
    private Integer groupId;

    /**
     * 组名
     */
    private String name;

    /**
     * 人数
     */
    private Integer count;

    /**
     * 1正常，2停用
     */
    private Boolean status;

    /**
     * xxx
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 编号
     * @return group_id 编号
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 编号
     * @param groupId 编号
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 组名
     * @return name 组名
     */
    public String getName() {
        return name;
    }

    /**
     * 组名
     * @param name 组名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 人数
     * @return count 人数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 人数
     * @param count 人数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 1正常，2停用
     * @return status 1正常，2停用
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 1正常，2停用
     * @param status 1正常，2停用
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * xxx
     * @return create_time xxx
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * xxx
     * @param createTime xxx
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}