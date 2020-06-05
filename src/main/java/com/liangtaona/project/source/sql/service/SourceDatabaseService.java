package com.liangtaona.project.source.sql.service;

import com.liangtaona.project.source.sql.domain.SourceDatabase;

import java.util.List;

/**
 * @author liangtaona
 * @version 1.0
 * @date 2020/5/29
 */
public interface SourceDatabaseService {

    /**
     * 查询数据库名称列表
     */
    public List<SourceDatabase> selectDatabaseList();
}
