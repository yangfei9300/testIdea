package com.ruoyi.YyGoods.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.YyGoods.mapper.YyGoodsMapper;
import com.ruoyi.YyGoods.domain.YyGoods;
import com.ruoyi.YyGoods.service.IYyGoodsService;

/**
 * 商品详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
@Service
public class YyGoodsServiceImpl implements IYyGoodsService 
{
    @Autowired
    private YyGoodsMapper yyGoodsMapper;

    /**
     * 查询商品详情
     * 
     * @param id 商品详情主键
     * @return 商品详情
     */
    @Override
    public YyGoods selectYyGoodsById(Long id)
    {
        return yyGoodsMapper.selectYyGoodsById(id);
    }

    /**
     * 查询商品详情列表
     * 
     * @param yyGoods 商品详情
     * @return 商品详情
     */
    @Override
    public List<YyGoods> selectYyGoodsList(YyGoods yyGoods)
    {
        return yyGoodsMapper.selectYyGoodsList(yyGoods);
    }

    /**
     * 新增商品详情
     * 
     * @param yyGoods 商品详情
     * @return 结果
     */
    @Override
    public int insertYyGoods(YyGoods yyGoods)
    {
        return yyGoodsMapper.insertYyGoods(yyGoods);
    }

    /**
     * 修改商品详情
     * 
     * @param yyGoods 商品详情
     * @return 结果
     */
    @Override
    public int updateYyGoods(YyGoods yyGoods)
    {
        return yyGoodsMapper.updateYyGoods(yyGoods);
    }

    /**
     * 批量删除商品详情
     * 
     * @param ids 需要删除的商品详情主键
     * @return 结果
     */
    @Override
    public int deleteYyGoodsByIds(Long[] ids)
    {
        return yyGoodsMapper.deleteYyGoodsByIds(ids);
    }

    /**
     * 删除商品详情信息
     * 
     * @param id 商品详情主键
     * @return 结果
     */
    @Override
    public int deleteYyGoodsById(Long id)
    {
        return yyGoodsMapper.deleteYyGoodsById(id);
    }
}
