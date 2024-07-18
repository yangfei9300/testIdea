package com.ruoyi.YyGoods.controller;

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
import com.ruoyi.YyGoods.domain.YyGoods;
import com.ruoyi.YyGoods.service.IYyGoodsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品详情Controller
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
@RestController
@RequestMapping("/YyGoods/YyGoods")
public class YyGoodsController extends BaseController
{
    @Autowired
    private IYyGoodsService yyGoodsService;

    /**
     * 查询商品详情列表
     */
    @PreAuthorize("@ss.hasPermi('YyGoods:YyGoods:list')")
    @GetMapping("/list")
    public TableDataInfo list(YyGoods yyGoods)
    {
        startPage();
        List<YyGoods> list = yyGoodsService.selectYyGoodsList(yyGoods);
        return getDataTable(list);
    }

    /**
     * 导出商品详情列表
     */
    @PreAuthorize("@ss.hasPermi('YyGoods:YyGoods:export')")
    @Log(title = "商品详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, YyGoods yyGoods)
    {
        List<YyGoods> list = yyGoodsService.selectYyGoodsList(yyGoods);
        ExcelUtil<YyGoods> util = new ExcelUtil<YyGoods>(YyGoods.class);
        util.exportExcel(response, list, "商品详情数据");
    }

    /**
     * 获取商品详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('YyGoods:YyGoods:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(yyGoodsService.selectYyGoodsById(id));
    }

    /**
     * 新增商品详情
     */
    @PreAuthorize("@ss.hasPermi('YyGoods:YyGoods:add')")
    @Log(title = "商品详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody YyGoods yyGoods)
    {
        return toAjax(yyGoodsService.insertYyGoods(yyGoods));
    }

    /**
     * 修改商品详情
     */
    @PreAuthorize("@ss.hasPermi('YyGoods:YyGoods:edit')")
    @Log(title = "商品详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody YyGoods yyGoods)
    {
        return toAjax(yyGoodsService.updateYyGoods(yyGoods));
    }

    /**
     * 删除商品详情
     */
    @PreAuthorize("@ss.hasPermi('YyGoods:YyGoods:remove')")
    @Log(title = "商品详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(yyGoodsService.deleteYyGoodsByIds(ids));
    }
}
