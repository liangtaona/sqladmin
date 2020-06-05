package com.liangtaona.project.source.sql.controller;

import com.liangtaona.framework.web.controller.BaseController;
import com.liangtaona.project.source.sql.domain.SourceDatabase;
import com.liangtaona.project.source.sql.service.SourceDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liangtaona
 * @version 1.0
 * @date 2020/5/29
 */
@RestController
@RequestMapping("/sql/database")
public class SourceDatabaseController extends BaseController {

    @Autowired
    private SourceDatabaseService sourceDatabaseService;

    /**
     * 查询数据库名称
     */
    @PreAuthorize("@ss.hasPermi('sql:sql:databaseList')")
    @PostMapping("/databaseList")
    public List<SourceDatabase> list()
    {
        startPage();
        List<SourceDatabase> list = sourceDatabaseService.selectDatabaseList();
        for (SourceDatabase s : list) {
            System.out.println(s.getDatabase()); }
        return list;
    }



}
