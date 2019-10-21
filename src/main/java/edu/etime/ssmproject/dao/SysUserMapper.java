package edu.etime.ssmproject.dao;

import edu.etime.ssmproject.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}