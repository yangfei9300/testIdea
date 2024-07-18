package com.ruoyi.YyGsInfo.service;

import java.util.List;
import com.ruoyi.YyGsInfo.domain.YyGsInfo;

/**
 * 公司信息Service接口
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
public interface IYyGsInfoService 
{
    /**
     * 查询公司信息
     * 
     * @param id 公司信息主键
     * @return 公司信息
     */
    public YyGsInfo selectYyGsInfoById(Long id);

    /**
     * 查询公司信息列表
     * 
     * @param yyGsInfo 公司信息
     * @return 公司信息集合
     */
    public List<YyGsInfo> selectYyGsInfoList(YyGsInfo yyGsInfo);

    /**
     * 新增公司信息
     * 
     * @param yyGsInfo 公司信息
     * @return 结果
     */
    public int insertYyGsInfo(YyGsInfo yyGsInfo);

    /**
     * 修改公司信息
     * 
     * @param yyGsInfo 公司信息
     * @return 结果
     */
    public int updateYyGsInfo(YyGsInfo yyGsInfo);

    /**
     * 批量删除公司信息
     * 
     * @param ids 需要删除的公司信息主键集合
     * @return 结果
     */
    public int deleteYyGsInfoByIds(Long[] ids);

    /**
     * 删除公司信息信息
     * 
     * @param id 公司信息主键
     * @return 结果
     */
    public int deleteYyGsInfoById(Long id);
}
