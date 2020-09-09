package com.fy.wh.dao;

import com.fy.wh.entity.SysDept;

import java.util.List;

public interface SysDeptDao {
    List<SysDept> queryALlDept();

    List<SysDept> queryByName(String deptName);

    void updateDept(SysDept sysDept);

    void deleteDept(int deptId);
}
