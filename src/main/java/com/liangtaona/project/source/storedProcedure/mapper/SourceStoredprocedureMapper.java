package com.liangtaona.project.source.storedProcedure.mapper;

import java.util.List;
import com.liangtaona.project.source.storedProcedure.domain.SourceStoredprocedure;

/**
 * 工厂配置Mapper接口
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
public interface SourceStoredprocedureMapper 
{
    /**
     * 查询工厂配置
     * 
     * @param id 工厂配置ID
     * @return 工厂配置
     */
    public SourceStoredprocedure selectSourceStoredprocedureById(Long id);

    /**
     * 查询工厂配置列表
     * 
     * @param sourceStoredprocedure 工厂配置
     * @return 工厂配置集合
     */
    public List<SourceStoredprocedure> selectSourceStoredprocedureList(SourceStoredprocedure sourceStoredprocedure);

    /**
     * 新增工厂配置
     * 
     * @param sourceStoredprocedure 工厂配置
     * @return 结果
     */
    public int insertSourceStoredprocedure(SourceStoredprocedure sourceStoredprocedure);

    /**
     * 修改工厂配置
     * 
     * @param sourceStoredprocedure 工厂配置
     * @return 结果
     */
    public int updateSourceStoredprocedure(SourceStoredprocedure sourceStoredprocedure);

    /**
     * 删除工厂配置
     * 
     * @param id 工厂配置ID
     * @return 结果
     */
    public int deleteSourceStoredprocedureById(Long id);

    /**
     * 批量删除工厂配置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSourceStoredprocedureByIds(Long[] ids);
}
