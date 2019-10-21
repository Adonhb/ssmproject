package edu.etime.ssmproject.dao;

import edu.etime.ssmproject.model.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(String odid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(String odid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}