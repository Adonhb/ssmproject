package edu.etime.ssmproject.dao;

import edu.etime.ssmproject.model.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(String cusid);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String cusid);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}