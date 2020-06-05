package com.liangtaona.project.source.sql.service.impl;

import com.liangtaona.project.source.sql.domain.SourceDatabase;
import com.liangtaona.project.source.sql.mapper.SourceDatabaseMapper;
import com.liangtaona.project.source.sql.service.SourceDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liangtaona
 * @version 1.0
 * @date 2020/5/29
 */
@Service
public class SourceDatabaseServiceImpl implements SourceDatabaseService {
    @Autowired
    private SourceDatabaseMapper sourceDatabaseMapper;

    @Override
    public List<SourceDatabase> selectDatabaseList() {
        return sourceDatabaseMapper.selectDatabaseList();
    }
}
