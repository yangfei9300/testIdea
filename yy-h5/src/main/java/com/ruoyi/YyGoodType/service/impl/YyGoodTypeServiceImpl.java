package com.ruoyi.YyGoodType.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.YyGoodType.mapper.YyGoodTypeMapper;
import com.ruoyi.YyGoodType.domain.YyGoodType;
import com.ruoyi.YyGoodType.service.IYyGoodTypeService;

/**
 * 商品分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
@Service
public class YyGoodTypeServiceImpl implements IYyGoodTypeService 
{
    @Autowired
    private YyGoodTypeMapper yyGoodTypeMapper;

    /**
     * 查询商品分类
     * 
     * @param id 商品分类主键
     * @return 商品分类
     */
    @Override
    public YyGoodType selectYyGoodTypeById(Long id)
    {
        return yyGoodTypeMapper.selectYyGoodTypeById(id);
    }

    /**
     * 查询商品分类列表
     * 
     * @param yyGoodType 商品分类
     * @return 商品分类
     */
    @Override
    public List<YyGoodType> selectYyGoodTypeList(YyGoodType yyGoodType)
    {
        return yyGoodTypeMapper.selectYyGoodTypeList(yyGoodType);
    }

    /**
     * 新增商品分类
     * 
     * @param yyGoodType 商品分类
     * @return 结果
     */
    @Override
    public int insertYyGoodType(YyGoodType yyGoodType)
    {
        return yyGoodTypeMapper.insertYyGoodType(yyGoodType);
    }

    /**
     * 修改商品分类
     * 
     * @param yyGoodType 商品分类
     * @return 结果
     */
    @Override
    public int updateYyGoodType(YyGoodType yyGoodType)
    {
        return yyGoodTypeMapper.updateYyGoodType(yyGoodType);
    }

    /**
     * 批量删除商品分类
     * 
     * @param ids 需要删除的商品分类主键
     * @return 结果
     */
    @Override
    public int deleteYyGoodTypeByIds(Long[] ids)
    {
        return yyGoodTypeMapper.deleteYyGoodTypeByIds(ids);
    }

    /**
     * 删除商品分类信息
     * 
     * @param id 商品分类主键
     * @return 结果
     */
    @Override
    public int deleteYyGoodTypeById(Long id)
    {
        return yyGoodTypeMapper.deleteYyGoodTypeById(id);
    }
}
