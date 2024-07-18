package com.ruoyi.YyGsInfo.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.YyGsInfo.domain.YyGsInfo;
import com.ruoyi.YyGsInfo.service.IYyGsInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公司信息Controller
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
@RestController
@RequestMapping("/YyGsInfo/YyGsInfo")
public class YyGsInfoController extends BaseController
{
    @Autowired
    private IYyGsInfoService yyGsInfoService;

    /**
     * 查询公司信息列表
     */
    @PreAuthorize("@ss.hasPermi('YyGsInfo:YyGsInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(YyGsInfo yyGsInfo)
    {
        startPage();
        List<YyGsInfo> list = yyGsInfoService.selectYyGsInfoList(yyGsInfo);
        return getDataTable(list);
    }

    /**
     * 导出公司信息列表
     */
    @PreAuthorize("@ss.hasPermi('YyGsInfo:YyGsInfo:export')")
    @Log(title = "公司信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, YyGsInfo yyGsInfo)
    {
        List<YyGsInfo> list = yyGsInfoService.selectYyGsInfoList(yyGsInfo);
        ExcelUtil<YyGsInfo> util = new ExcelUtil<YyGsInfo>(YyGsInfo.class);
        util.exportExcel(response, list, "公司信息数据");
    }

    /**
     * 获取公司信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('YyGsInfo:YyGsInfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(yyGsInfoService.selectYyGsInfoById(id));
    }

    /**
     * 新增公司信息
     */
    @PreAuthorize("@ss.hasPermi('YyGsInfo:YyGsInfo:add')")
    @Log(title = "公司信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody YyGsInfo yyGsInfo)
    {
        return toAjax(yyGsInfoService.insertYyGsInfo(yyGsInfo));
    }

    /**
     * 修改公司信息
     */
    @PreAuthorize("@ss.hasPermi('YyGsInfo:YyGsInfo:edit')")
    @Log(title = "公司信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody YyGsInfo yyGsInfo)
    {
        return toAjax(yyGsInfoService.updateYyGsInfo(yyGsInfo));
    }

    /**
     * 删除公司信息
     */
    @PreAuthorize("@ss.hasPermi('YyGsInfo:YyGsInfo:remove')")
    @Log(title = "公司信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(yyGsInfoService.deleteYyGsInfoByIds(ids));
    }
}
