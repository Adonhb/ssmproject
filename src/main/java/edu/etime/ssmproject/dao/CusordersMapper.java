package edu.etime.ssmproject.dao;

import edu.etime.ssmproject.model.Cusorders;

public interface CusordersMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(Cusorders record);

    int insertSelective(Cusorders record);

    Cusorders selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(Cusorders record);

    int updateByPrimaryKey(Cusorders record);
}