package com.liangtaona.project.source.storedProcedure.service.impl;

import java.util.List;
import com.liangtaona.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.liangtaona.project.source.storedProcedure.mapper.SourceStoredprocedureMapper;
import com.liangtaona.project.source.storedProcedure.domain.SourceStoredprocedure;
import com.liangtaona.project.source.storedProcedure.service.ISourceStoredprocedureService;

/**
 * 工厂配置Service业务层处理
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
@Service
public class SourceStoredprocedureServiceImpl implements ISourceStoredprocedureService 
{
    @Autowired
    private SourceStoredprocedureMapper sourceStoredprocedureMapper;

    /**
     * 查询工厂配置
     * 
     * @param id 工厂配置ID
     * @return 工厂配置
     */
    @Override
    public SourceStoredprocedure selectSourceStoredprocedureById(Long id)
    {
        return sourceStoredprocedureMapper.selectSourceStoredprocedureById(id);
    }

    /**
     * 查询工厂配置列表
     * 
     * @param sourceStoredprocedure 工厂配置
     * @return 工厂配置
     */
    @Override
    public List<SourceStoredprocedure> selectSourceStoredprocedureList(SourceStoredprocedure sourceStoredprocedure)
    {
        return sourceStoredprocedureMapper.selectSourceStoredprocedureList(sourceStoredprocedure);
    }

    /**
     * 新增工厂配置
     * 
     * @param sourceStoredprocedure 工厂配置
     * @return 结果
     */
    @Override
    public int insertSourceStoredprocedure(SourceStoredprocedure sourceStoredprocedure)
    {
        return sourceStoredprocedureMapper.insertSourceStoredprocedure(sourceStoredprocedure);
    }

    /**
     * 修改工厂配置
     * 
     * @param sourceStoredprocedure 工厂配置
     * @return 结果
     */
    @Override
    public int updateSourceStoredprocedure(SourceStoredprocedure sourceStoredprocedure)
    {
        sourceStoredprocedure.setUpdateTime(DateUtils.getNowDate());
        return sourceStoredprocedureMapper.updateSourceStoredprocedure(sourceStoredprocedure);
    }

    /**
     * 批量删除工厂配置
     * 
     * @param ids 需要删除的工厂配置ID
     * @return 结果
     */
    @Override
    public int deleteSourceStoredprocedureByIds(Long[] ids)
    {
        return sourceStoredprocedureMapper.deleteSourceStoredprocedureByIds(ids);
    }

    /**
     * 删除工厂配置信息
     * 
     * @param id 工厂配置ID
     * @return 结果
     */
    @Override
    public int deleteSourceStoredprocedureById(Long id)
    {
        return sourceStoredprocedureMapper.deleteSourceStoredprocedureById(id);
    }
}
