package com.liangtaona.project.source.program.service;

import java.util.List;
import com.liangtaona.project.source.program.domain.SourceProgram;

/**
 * 程序配置Service接口
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
public interface ISourceProgramService 
{
    /**
     * 查询程序配置
     * 
     * @param id 程序配置ID
     * @return 程序配置
     */
    public SourceProgram selectSourceProgramById(Long id);

    /**
     * 查询程序配置列表
     * 
     * @param sourceProgram 程序配置
     * @return 程序配置集合
     */
    public List<SourceProgram> selectSourceProgramList(SourceProgram sourceProgram);

    /**
     * 新增程序配置
     * 
     * @param sourceProgram 程序配置
     * @return 结果
     */
    public int insertSourceProgram(SourceProgram sourceProgram);

    /**
     * 修改程序配置
     * 
     * @param sourceProgram 程序配置
     * @return 结果
     */
    public int updateSourceProgram(SourceProgram sourceProgram);

    /**
     * 批量删除程序配置
     * 
     * @param ids 需要删除的程序配置ID
     * @return 结果
     */
    public int deleteSourceProgramByIds(Long[] ids);

    /**
     * 删除程序配置信息
     * 
     * @param id 程序配置ID
     * @return 结果
     */
    public int deleteSourceProgramById(Long id);
}
