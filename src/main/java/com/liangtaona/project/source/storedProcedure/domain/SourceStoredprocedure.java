package com.liangtaona.project.source.storedProcedure.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.liangtaona.framework.aspectj.lang.annotation.Excel;
import com.liangtaona.framework.web.domain.BaseEntity;

/**
 * 工厂配置对象 source_storedProcedure
 * 
 * @author liangtaona
 * @date 2020-05-26
 */
public class SourceStoredprocedure extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 工厂代码 */
    @Excel(name = "工厂代码")
    private String factoryCode;

    /** 工厂名称 */
    @Excel(name = "工厂名称")
    private String factoryName;

    /** 组代码 */
    @Excel(name = "组代码")
    private String groupCode;

    /** 组序号 */
    @Excel(name = "组序号")
    private String groupName;

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

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFactoryCode(String factoryCode) 
    {
        this.factoryCode = factoryCode;
    }

    public String getFactoryCode() 
    {
        return factoryCode;
    }
    public void setFactoryName(String factoryName) 
    {
        this.factoryName = factoryName;
    }

    public String getFactoryName() 
    {
        return factoryName;
    }
    public void setGroupCode(String groupCode) 
    {
        this.groupCode = groupCode;
    }

    public String getGroupCode() 
    {
        return groupCode;
    }
    public void setGroupName(String groupName) 
    {
        this.groupName = groupName;
    }

    public String getGroupName() 
    {
        return groupName;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("factoryCode", getFactoryCode())
            .append("factoryName", getFactoryName())
            .append("groupCode", getGroupCode())
            .append("groupName", getGroupName())
            .append("userId", getUserId())
            .append("creationTime", getCreationTime())
            .append("updateId", getUpdateId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
