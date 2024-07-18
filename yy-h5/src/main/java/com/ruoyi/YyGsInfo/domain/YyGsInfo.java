package com.ruoyi.YyGsInfo.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公司信息对象 yy_gs_info
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
public class YyGsInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String gsm;

    /** 公司电话 */
    @Excel(name = "公司电话")
    private String phone;

    /** 公司logo */
    @Excel(name = "公司logo")
    private String icon;

    /** 营业时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "营业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date yysjTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGsm(String gsm) 
    {
        this.gsm = gsm;
    }

    public String getGsm() 
    {
        return gsm;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setYysjTime(Date yysjTime) 
    {
        this.yysjTime = yysjTime;
    }

    public Date getYysjTime() 
    {
        return yysjTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("gsm", getGsm())
            .append("phone", getPhone())
            .append("icon", getIcon())
            .append("yysjTime", getYysjTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
