package com.fy.wh.dao;

import com.fy.wh.entity.ProInfo;

import java.util.List;

public interface ProInfoDao {
    List<ProInfo> selectAll();

    void insert(ProInfo proInfo);

}
