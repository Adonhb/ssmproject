package edu.etime.ssmproject.dao;

import edu.etime.ssmproject.model.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}