package com.liangtaona.project.source.sql.service.impl;

import java.util.List;
import com.liangtaona.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.liangtaona.project.source.sql.mapper.SourceSqlMapper;
import com.liangtaona.project.source.sql.domain.SourceSql;
import com.liangtaona.project.source.sql.service.ISourceSqlService;

/**
 * SQL执行与结果查询Service业务层处理
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
@Service
public class SourceSqlServiceImpl implements ISourceSqlService 
{
    @Autowired
    private SourceSqlMapper sourceSqlMapper;

    /**
     * 查询SQL执行与结果查询
     * 
     * @param id SQL执行与结果查询ID
     * @return SQL执行与结果查询
     */
    @Override
    public SourceSql selectSourceSqlById(Long id)
    {
        return sourceSqlMapper.selectSourceSqlById(id);
    }

    /**
     * 查询SQL执行与结果查询列表
     * 
     * @param sourceSql SQL执行与结果查询
     * @return SQL执行与结果查询
     */
    @Override
    public List<SourceSql> selectSourceSqlList(SourceSql sourceSql)
    {
        return sourceSqlMapper.selectSourceSqlList(sourceSql);
    }

    /**
     * 新增SQL执行与结果查询
     * 
     * @param sourceSql SQL执行与结果查询
     * @return 结果
     */
    @Override
    public int insertSourceSql(SourceSql sourceSql)
    {
        return sourceSqlMapper.insertSourceSql(sourceSql);
    }

    /**
     * 修改SQL执行与结果查询
     * 
     * @param sourceSql SQL执行与结果查询
     * @return 结果
     */
    @Override
    public int updateSourceSql(SourceSql sourceSql)
    {
        sourceSql.setUpdateTime(DateUtils.getNowDate());
        return sourceSqlMapper.updateSourceSql(sourceSql);
    }

    /**
     * 批量删除SQL执行与结果查询
     * 
     * @param ids 需要删除的SQL执行与结果查询ID
     * @return 结果
     */
    @Override
    public int deleteSourceSqlByIds(Long[] ids)
    {
        return sourceSqlMapper.deleteSourceSqlByIds(ids);
    }

    /**
     * 删除SQL执行与结果查询信息
     * 
     * @param id SQL执行与结果查询ID
     * @return 结果
     */
    @Override
    public int deleteSourceSqlById(Long id)
    {
        return sourceSqlMapper.deleteSourceSqlById(id);
    }
}
