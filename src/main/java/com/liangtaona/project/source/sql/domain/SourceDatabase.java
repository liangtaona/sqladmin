package com.liangtaona.project.source.sql.domain;

import com.liangtaona.framework.aspectj.lang.annotation.Excel;
import com.liangtaona.framework.web.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;


/**
 * @author liangtaona
 * @version 1.0
 * @date 2020/5/29
 */
@Getter
@Setter
public class SourceDatabase extends BaseEntity {


    /** 数据库名 */
    @Excel(name = "数据库名")
    private String Database;

}
