/*
*
* GroupMapper.java
* @date 2018-08-31
*/
package com.yk.dao;

import com.yk.model.Group;

public interface GroupMapper {
    /**
     *
     * @mbg.generated 2018-08-31
     */
    int deleteByPrimaryKey(Integer groupId);

    /**
     *
     * @mbg.generated 2018-08-31
     */
    int insert(Group record);

    /**
     *
     * @mbg.generated 2018-08-31
     */
    int insertSelective(Group record);

    /**
     *
     * @mbg.generated 2018-08-31
     */
    Group selectByPrimaryKey(Integer groupId);

    /**
     *
     * @mbg.generated 2018-08-31
     */
    int updateByPrimaryKeySelective(Group record);

    /**
     *
     * @mbg.generated 2018-08-31
     */
    int updateByPrimaryKey(Group record);
}