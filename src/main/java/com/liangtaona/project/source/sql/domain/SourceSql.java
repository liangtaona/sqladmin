package com.liangtaona.project.source.sql.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.liangtaona.framework.aspectj.lang.annotation.Excel;
import com.liangtaona.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * SQL执行与结果查询对象 source_sql
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
public class SourceSql extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 流水号主键自增 */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 执行语句 */
    @Excel(name = "执行语句")
    private String executeTatement;

    /** 预计影响行数 */
    @Excel(name = "预计影响行数")
    private Long rows;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 状态 */
    @Excel(name = "状态")
    private String state;

    /** 错误描述 */
    @Excel(name = "错误描述")
    private String errorDescription;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setExecuteTatement(String executeTatement) 
    {
        this.executeTatement = executeTatement;
    }

    public String getExecuteTatement() 
    {
        return executeTatement;
    }
    public void setRows(Long rows) 
    {
        this.rows = rows;
    }

    public Long getRows() 
    {
        return rows;
    }
    public void setCreationTime(Date creationTime) 
    {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() 
    {
        return creationTime;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setErrorDescription(String errorDescription) 
    {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() 
    {
        return errorDescription;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("executeTatement", getExecuteTatement())
            .append("rows", getRows())
            .append("creationTime", getCreationTime())
            .append("updateTime", getUpdateTime())
            .append("state", getState())
            .append("errorDescription", getErrorDescription())
            .toString();
    }
}
