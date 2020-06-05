package com.liangtaona.project.source.sql.controller;

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
import com.liangtaona.project.source.sql.domain.SourceSql;
import com.liangtaona.project.source.sql.service.ISourceSqlService;
import com.liangtaona.framework.web.controller.BaseController;
import com.liangtaona.framework.web.domain.AjaxResult;
import com.liangtaona.common.utils.poi.ExcelUtil;
import com.liangtaona.framework.web.page.TableDataInfo;

/**
 * SQL执行与结果查询Controller
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
@RestController
@RequestMapping("/sql/sql")
public class SourceSqlController extends BaseController
{
    @Autowired
    private ISourceSqlService sourceSqlService;

    /**
     * 查询SQL执行与结果查询列表
     */
    @PreAuthorize("@ss.hasPermi('sql:sql:list')")
    @GetMapping("/list")
    public TableDataInfo list(SourceSql sourceSql)
    {
        startPage();
        List<SourceSql> list = sourceSqlService.selectSourceSqlList(sourceSql);
        return getDataTable(list);
    }

    /**
     * 导出SQL执行与结果查询列表
     */
    @PreAuthorize("@ss.hasPermi('sql:sql:export')")
    @Log(title = "SQL执行与结果查询", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SourceSql sourceSql)
    {
        List<SourceSql> list = sourceSqlService.selectSourceSqlList(sourceSql);
        ExcelUtil<SourceSql> util = new ExcelUtil<SourceSql>(SourceSql.class);
        return util.exportExcel(list, "sql");
    }

    /**
     * 获取SQL执行与结果查询详细信息
     */
    @PreAuthorize("@ss.hasPermi('sql:sql:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sourceSqlService.selectSourceSqlById(id));
    }

    /**
     * 新增SQL执行与结果查询
     */
    @PreAuthorize("@ss.hasPermi('sql:sql:add')")
    @Log(title = "SQL执行与结果查询", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SourceSql sourceSql)
    {
        return toAjax(sourceSqlService.insertSourceSql(sourceSql));
    }

    /**
     * 修改SQL执行与结果查询
     */
    @PreAuthorize("@ss.hasPermi('sql:sql:edit')")
    @Log(title = "SQL执行与结果查询", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SourceSql sourceSql)
    {
        return toAjax(sourceSqlService.updateSourceSql(sourceSql));
    }

    /**
     * 删除SQL执行与结果查询
     */
    @PreAuthorize("@ss.hasPermi('sql:sql:remove')")
    @Log(title = "SQL执行与结果查询", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sourceSqlService.deleteSourceSqlByIds(ids));
    }
}
