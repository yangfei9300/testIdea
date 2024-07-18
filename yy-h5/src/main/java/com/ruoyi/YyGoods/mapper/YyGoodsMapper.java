package com.ruoyi.YyGoods.mapper;

import java.util.List;
import com.ruoyi.YyGoods.domain.YyGoods;

/**
 * 商品详情Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
public interface YyGoodsMapper 
{
    /**
     * 查询商品详情
     * 
     * @param id 商品详情主键
     * @return 商品详情
     */
    public YyGoods selectYyGoodsById(Long id);

    /**
     * 查询商品详情列表
     * 
     * @param yyGoods 商品详情
     * @return 商品详情集合
     */
    public List<YyGoods> selectYyGoodsList(YyGoods yyGoods);

    /**
     * 新增商品详情
     * 
     * @param yyGoods 商品详情
     * @return 结果
     */
    public int insertYyGoods(YyGoods yyGoods);

    /**
     * 修改商品详情
     * 
     * @param yyGoods 商品详情
     * @return 结果
     */
    public int updateYyGoods(YyGoods yyGoods);

    /**
     * 删除商品详情
     * 
     * @param id 商品详情主键
     * @return 结果
     */
    public int deleteYyGoodsById(Long id);

    /**
     * 批量删除商品详情
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteYyGoodsByIds(Long[] ids);
}
