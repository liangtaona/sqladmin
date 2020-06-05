package com.liangtaona.project.source.program.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.liangtaona.framework.aspectj.lang.annotation.Excel;
import com.liangtaona.framework.web.domain.BaseEntity;

/**
 * 程序配置对象 source_program
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
public class SourceProgram extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 流水号 */
    private Long id;

    /** 模块代码 */
    @Excel(name = "模块代码")
    private String moduleCode;

    /** 模块名称 */
    @Excel(name = "模块名称")
    private String moduleName;

    /** 程序代码 */
    @Excel(name = "程序代码")
    private String programCode;

    /** 程序名称 */
    @Excel(name = "程序名称")
    private String programName;

    /** 执行序号 */
    @Excel(name = "执行序号")
    private String executionO;

    /** 创建人ID */
    @Excel(name = "创建人ID")
    private Long userId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 更新人ID */
    @Excel(name = "更新人ID")
    private Long updateId;

    /** 是否更新 */
    @Excel(name = "是否更新")
    private String updateOrNot;

    /** SQL语句 */
    @Excel(name = "SQL语句")
    private String sql;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setModuleCode(String moduleCode) 
    {
        this.moduleCode = moduleCode;
    }

    public String getModuleCode() 
    {
        return moduleCode;
    }
    public void setModuleName(String moduleName) 
    {
        this.moduleName = moduleName;
    }

    public String getModuleName() 
    {
        return moduleName;
    }
    public void setProgramCode(String programCode) 
    {
        this.programCode = programCode;
    }

    public String getProgramCode() 
    {
        return programCode;
    }
    public void setProgramName(String programName) 
    {
        this.programName = programName;
    }

    public String getProgramName() 
    {
        return programName;
    }
    public void setExecutionO(String executionO) 
    {
        this.executionO = executionO;
    }

    public String getExecutionO() 
    {
        return executionO;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setCreationTime(Date creationTime) 
    {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() 
    {
        return creationTime;
    }
    public void setUpdateId(Long updateId) 
    {
        this.updateId = updateId;
    }

    public Long getUpdateId() 
    {
        return updateId;
    }
    public void setUpdateOrNot(String updateOrNot) 
    {
        this.updateOrNot = updateOrNot;
    }

    public String getUpdateOrNot() 
    {
        return updateOrNot;
    }
    public void setSql(String sql) 
    {
        this.sql = sql;
    }

    public String getSql() 
    {
        return sql;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("moduleCode", getModuleCode())
            .append("moduleName", getModuleName())
            .append("programCode", getProgramCode())
            .append("programName", getProgramName())
            .append("executionO", getExecutionO())
            .append("userId", getUserId())
            .append("creationTime", getCreationTime())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .append("updateOrNot", getUpdateOrNot())
            .append("sql", getSql())
            .toString();
    }
}
