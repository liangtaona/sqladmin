package com.liangtaona.project.source.program.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.liangtaona.framework.aspectj.lang.annotation.Log;
import com.liangtaona.framework.aspectj.lang.enums.BusinessType;
import com.liangtaona.project.source.program.domain.SourceProgram;
import com.liangtaona.project.source.program.service.ISourceProgramService;
import com.liangtaona.framework.web.controller.BaseController;
import com.liangtaona.framework.web.domain.AjaxResult;
import com.liangtaona.common.utils.poi.ExcelUtil;
import com.liangtaona.framework.web.page.TableDataInfo;

/**
 * 程序配置Controller
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
@Api("程序配置")
@RestController
@RequestMapping("/source/program")
public class SourceProgramController extends BaseController
{
    @Autowired
    private ISourceProgramService sourceProgramService;

    /**
     * 查询程序配置列表
     */
    @ApiOperation("获取列表")
    @PreAuthorize("@ss.hasPermi('source:program:list')")
    @GetMapping("/list")
    public TableDataInfo list(SourceProgram sourceProgram)
    {
        startPage();
        List<SourceProgram> list = sourceProgramService.selectSourceProgramList(sourceProgram);
        return getDataTable(list);
    }

    /**
     * 导出程序配置列表
     */
    @PreAuthorize("@ss.hasPermi('source:program:export')")
    @Log(title = "程序配置", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SourceProgram sourceProgram)
    {
        List<SourceProgram> list = sourceProgramService.selectSourceProgramList(sourceProgram);
        ExcelUtil<SourceProgram> util = new ExcelUtil<SourceProgram>(SourceProgram.class);
        return util.exportExcel(list, "program");
    }

    /**
     * 获取程序配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('source:program:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sourceProgramService.selectSourceProgramById(id));
    }

    /**
     * 新增程序配置
     */
    @PreAuthorize("@ss.hasPermi('source:program:add')")
    @Log(title = "程序配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SourceProgram sourceProgram)
    {
        return toAjax(sourceProgramService.insertSourceProgram(sourceProgram));
    }

    /**
     * 修改程序配置
     */
    @PreAuthorize("@ss.hasPermi('source:program:edit')")
    @Log(title = "程序配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SourceProgram sourceProgram)
    {
        return toAjax(sourceProgramService.updateSourceProgram(sourceProgram));
    }

    /**
     * 删除程序配置
     */
    @PreAuthorize("@ss.hasPermi('source:program:remove')")
    @Log(title = "程序配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sourceProgramService.deleteSourceProgramByIds(ids));
    }
}
