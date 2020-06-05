package com.liangtaona.project.source.storedProcedure.controller;

import java.util.List;
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
import com.liangtaona.project.source.storedProcedure.domain.SourceStoredprocedure;
import com.liangtaona.project.source.storedProcedure.service.ISourceStoredprocedureService;
import com.liangtaona.framework.web.controller.BaseController;
import com.liangtaona.framework.web.domain.AjaxResult;
import com.liangtaona.common.utils.poi.ExcelUtil;
import com.liangtaona.framework.web.page.TableDataInfo;

/**
 * 工厂配置Controller
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
@RestController
@RequestMapping("/storedProcedure/storedProcedure")
public class SourceStoredprocedureController extends BaseController
{
    @Autowired
    private ISourceStoredprocedureService sourceStoredprocedureService;

    /**
     * 查询工厂配置列表
     */
    @PreAuthorize("@ss.hasPermi('storedProcedure:storedProcedure:list')")
    @GetMapping("/list")
    public TableDataInfo list(SourceStoredprocedure sourceStoredprocedure)
    {
        startPage();
        List<SourceStoredprocedure> list = sourceStoredprocedureService.selectSourceStoredprocedureList(sourceStoredprocedure);
        return getDataTable(list);
    }

    /**
     * 导出工厂配置列表
     */
    @PreAuthorize("@ss.hasPermi('storedProcedure:storedProcedure:export')")
    @Log(title = "工厂配置", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SourceStoredprocedure sourceStoredprocedure)
    {
        List<SourceStoredprocedure> list = sourceStoredprocedureService.selectSourceStoredprocedureList(sourceStoredprocedure);
        ExcelUtil<SourceStoredprocedure> util = new ExcelUtil<SourceStoredprocedure>(SourceStoredprocedure.class);
        return util.exportExcel(list, "storedProcedure");
    }

    /**
     * 获取工厂配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('storedProcedure:storedProcedure:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sourceStoredprocedureService.selectSourceStoredprocedureById(id));
    }

    /**
     * 新增工厂配置
     */
    @PreAuthorize("@ss.hasPermi('storedProcedure:storedProcedure:add')")
    @Log(title = "工厂配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SourceStoredprocedure sourceStoredprocedure)
    {
        return toAjax(sourceStoredprocedureService.insertSourceStoredprocedure(sourceStoredprocedure));
    }

    /**
     * 修改工厂配置
     */
    @PreAuthorize("@ss.hasPermi('storedProcedure:storedProcedure:edit')")
    @Log(title = "工厂配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SourceStoredprocedure sourceStoredprocedure)
    {
        return toAjax(sourceStoredprocedureService.updateSourceStoredprocedure(sourceStoredprocedure));
    }

    /**
     * 删除工厂配置
     */
    @PreAuthorize("@ss.hasPermi('storedProcedure:storedProcedure:remove')")
    @Log(title = "工厂配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sourceStoredprocedureService.deleteSourceStoredprocedureByIds(ids));
    }
}
