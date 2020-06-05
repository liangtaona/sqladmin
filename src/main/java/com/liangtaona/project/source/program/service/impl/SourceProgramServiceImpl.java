package com.liangtaona.project.source.program.service.impl;

import java.util.List;
import com.liangtaona.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.liangtaona.project.source.program.mapper.SourceProgramMapper;
import com.liangtaona.project.source.program.domain.SourceProgram;
import com.liangtaona.project.source.program.service.ISourceProgramService;

/**
 * 程序配置Service业务层处理
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
@Service
public class SourceProgramServiceImpl implements ISourceProgramService 
{
    @Autowired
    private SourceProgramMapper sourceProgramMapper;

    /**
     * 查询程序配置
     * 
     * @param id 程序配置ID
     * @return 程序配置
     */
    @Override
    public SourceProgram selectSourceProgramById(Long id)
    {
        return sourceProgramMapper.selectSourceProgramById(id);
    }

    /**
     * 查询程序配置列表
     * 
     * @param sourceProgram 程序配置
     * @return 程序配置
     */
    @Override
    public List<SourceProgram> selectSourceProgramList(SourceProgram sourceProgram)
    {
        return sourceProgramMapper.selectSourceProgramList(sourceProgram);
    }

    /**
     * 新增程序配置
     * 
     * @param sourceProgram 程序配置
     * @return 结果
     */
    @Override
    public int insertSourceProgram(SourceProgram sourceProgram)
    {
        return sourceProgramMapper.insertSourceProgram(sourceProgram);
    }

    /**
     * 修改程序配置
     * 
     * @param sourceProgram 程序配置
     * @return 结果
     */
    @Override
    public int updateSourceProgram(SourceProgram sourceProgram)
    {
        sourceProgram.setUpdateTime(DateUtils.getNowDate());
        return sourceProgramMapper.updateSourceProgram(sourceProgram);
    }

    /**
     * 批量删除程序配置
     * 
     * @param ids 需要删除的程序配置ID
     * @return 结果
     */
    @Override
    public int deleteSourceProgramByIds(Long[] ids)
    {
        return sourceProgramMapper.deleteSourceProgramByIds(ids);
    }

    /**
     * 删除程序配置信息
     * 
     * @param id 程序配置ID
     * @return 结果
     */
    @Override
    public int deleteSourceProgramById(Long id)
    {
        return sourceProgramMapper.deleteSourceProgramById(id);
    }
}
