package com.ruoyi.YyGsInfo.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.YyGsInfo.mapper.YyGsInfoMapper;
import com.ruoyi.YyGsInfo.domain.YyGsInfo;
import com.ruoyi.YyGsInfo.service.IYyGsInfoService;

/**
 * 公司信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
@Service
public class YyGsInfoServiceImpl implements IYyGsInfoService 
{
    @Autowired
    private YyGsInfoMapper yyGsInfoMapper;

    /**
     * 查询公司信息
     * 
     * @param id 公司信息主键
     * @return 公司信息
     */
    @Override
    public YyGsInfo selectYyGsInfoById(Long id)
    {
        return yyGsInfoMapper.selectYyGsInfoById(id);
    }

    /**
     * 查询公司信息列表
     * 
     * @param yyGsInfo 公司信息
     * @return 公司信息
     */
    @Override
    public List<YyGsInfo> selectYyGsInfoList(YyGsInfo yyGsInfo)
    {
        return yyGsInfoMapper.selectYyGsInfoList(yyGsInfo);
    }

    /**
     * 新增公司信息
     * 
     * @param yyGsInfo 公司信息
     * @return 结果
     */
    @Override
    public int insertYyGsInfo(YyGsInfo yyGsInfo)
    {
        yyGsInfo.setCreateTime(DateUtils.getNowDate());
        return yyGsInfoMapper.insertYyGsInfo(yyGsInfo);
    }

    /**
     * 修改公司信息
     * 
     * @param yyGsInfo 公司信息
     * @return 结果
     */
    @Override
    public int updateYyGsInfo(YyGsInfo yyGsInfo)
    {
        return yyGsInfoMapper.updateYyGsInfo(yyGsInfo);
    }

    /**
     * 批量删除公司信息
     * 
     * @param ids 需要删除的公司信息主键
     * @return 结果
     */
    @Override
    public int deleteYyGsInfoByIds(Long[] ids)
    {
        return yyGsInfoMapper.deleteYyGsInfoByIds(ids);
    }

    /**
     * 删除公司信息信息
     * 
     * @param id 公司信息主键
     * @return 结果
     */
    @Override
    public int deleteYyGsInfoById(Long id)
    {
        return yyGsInfoMapper.deleteYyGsInfoById(id);
    }
}
