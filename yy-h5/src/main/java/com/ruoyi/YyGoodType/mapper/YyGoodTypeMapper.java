package com.ruoyi.YyGoodType.mapper;

import java.util.List;
import com.ruoyi.YyGoodType.domain.YyGoodType;

/**
 * 商品分类Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
public interface YyGoodTypeMapper 
{
    /**
     * 查询商品分类
     * 
     * @param id 商品分类主键
     * @return 商品分类
     */
    public YyGoodType selectYyGoodTypeById(Long id);

    /**
     * 查询商品分类列表
     * 
     * @param yyGoodType 商品分类
     * @return 商品分类集合
     */
    public List<YyGoodType> selectYyGoodTypeList(YyGoodType yyGoodType);

    /**
     * 新增商品分类
     * 
     * @param yyGoodType 商品分类
     * @return 结果
     */
    public int insertYyGoodType(YyGoodType yyGoodType);

    /**
     * 修改商品分类
     * 
     * @param yyGoodType 商品分类
     * @return 结果
     */
    public int updateYyGoodType(YyGoodType yyGoodType);

    /**
     * 删除商品分类
     * 
     * @param id 商品分类主键
     * @return 结果
     */
    public int deleteYyGoodTypeById(Long id);

    /**
     * 批量删除商品分类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteYyGoodTypeByIds(Long[] ids);
}
