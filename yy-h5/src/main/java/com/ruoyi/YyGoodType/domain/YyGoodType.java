package com.ruoyi.YyGoodType.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品分类对象 yy_good_type
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
public class YyGoodType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String typeName;

    /** 分类图标 */
    @Excel(name = "分类图标")
    private String typeIcon;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTypeName(String typeName) 
    {
        this.typeName = typeName;
    }

    public String getTypeName() 
    {
        return typeName;
    }
    public void setTypeIcon(String typeIcon) 
    {
        this.typeIcon = typeIcon;
    }

    public String getTypeIcon() 
    {
        return typeIcon;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("typeName", getTypeName())
            .append("typeIcon", getTypeIcon())
            .toString();
    }
}
