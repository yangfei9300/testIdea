package com.ruoyi.YyGoods.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品详情对象 yy_goods
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
public class YyGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Long typeId;

    /** 商品名字 */
    @Excel(name = "商品名字")
    private String name;

    /** 主图 */
    @Excel(name = "主图")
    private String img;

    /** 轮播图 */
    @Excel(name = "轮播图")
    private String banners;

    /** 原价 */
    @Excel(name = "原价")
    private String yPrice;

    /** 现价 */
    @Excel(name = "现价")
    private String xPrice;

    /** 简介 */
    @Excel(name = "简介")
    private String content;

    /** 库存 */
    @Excel(name = "库存")
    private String kucun;

    /** 销量 */
    @Excel(name = "销量")
    private String sale;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setImg(String img) 
    {
        this.img = img;
    }

    public String getImg() 
    {
        return img;
    }
    public void setBanners(String banners) 
    {
        this.banners = banners;
    }

    public String getBanners() 
    {
        return banners;
    }
    public void setyPrice(String yPrice) 
    {
        this.yPrice = yPrice;
    }

    public String getyPrice() 
    {
        return yPrice;
    }
    public void setxPrice(String xPrice) 
    {
        this.xPrice = xPrice;
    }

    public String getxPrice() 
    {
        return xPrice;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setKucun(String kucun) 
    {
        this.kucun = kucun;
    }

    public String getKucun() 
    {
        return kucun;
    }
    public void setSale(String sale) 
    {
        this.sale = sale;
    }

    public String getSale() 
    {
        return sale;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("typeId", getTypeId())
            .append("name", getName())
            .append("img", getImg())
            .append("banners", getBanners())
            .append("yPrice", getyPrice())
            .append("xPrice", getxPrice())
            .append("content", getContent())
            .append("kucun", getKucun())
            .append("sale", getSale())
            .toString();
    }
}
