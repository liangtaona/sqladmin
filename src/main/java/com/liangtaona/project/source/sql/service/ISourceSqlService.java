package com.liangtaona.project.source.sql.service;

import java.util.List;
import com.liangtaona.project.source.sql.domain.SourceSql;

/**
 * SQL执行与结果查询Service接口
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
public interface ISourceSqlService 
{
    /**
     * 查询SQL执行与结果查询
     * 
     * @param id SQL执行与结果查询ID
     * @return SQL执行与结果查询
     */
    public SourceSql selectSourceSqlById(Long id);

    /**
     * 查询SQL执行与结果查询列表
     * 
     * @param sourceSql SQL执行与结果查询
     * @return SQL执行与结果查询集合
     */
    public List<SourceSql> selectSourceSqlList(SourceSql sourceSql);

    /**
     * 新增SQL执行与结果查询
     * 
     * @param sourceSql SQL执行与结果查询
     * @return 结果
     */
    public int insertSourceSql(SourceSql sourceSql);

    /**
     * 修改SQL执行与结果查询
     * 
     * @param sourceSql SQL执行与结果查询
     * @return 结果
     */
    public int updateSourceSql(SourceSql sourceSql);

    /**
     * 批量删除SQL执行与结果查询
     * 
     * @param ids 需要删除的SQL执行与结果查询ID
     * @return 结果
     */
    public int deleteSourceSqlByIds(Long[] ids);

    /**
     * 删除SQL执行与结果查询信息
     * 
     * @param id SQL执行与结果查询ID
     * @return 结果
     */
    public int deleteSourceSqlById(Long id);
}
