package com.fy.wh.dao;

import com.fy.wh.entity.SysUser;

import java.util.List;

public interface SysUserDao {
    List<SysUser> queryAllUser();

    List<SysUser> queryByName(String name);

    void updateUser(SysUser sysUser);

    void deleteUser(int id);
}
