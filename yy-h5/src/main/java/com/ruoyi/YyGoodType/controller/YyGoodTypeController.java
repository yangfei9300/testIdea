package com.ruoyi.YyGoodType.controller;

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
import com.ruoyi.YyGoodType.domain.YyGoodType;
import com.ruoyi.YyGoodType.service.IYyGoodTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品分类Controller
 * 
 * @author ruoyi
 * @date 2024-04-09
 */
@RestController
@RequestMapping("/YyGoodType/YyGoodType")
public class YyGoodTypeController extends BaseController
{
    @Autowired
    private IYyGoodTypeService yyGoodTypeService;

    /**
     * 查询商品分类列表
     */
    @PreAuthorize("@ss.hasPermi('YyGoodType:YyGoodType:list')")
    @GetMapping("/list")
    public TableDataInfo list(YyGoodType yyGoodType)
    {
        startPage();
        List<YyGoodType> list = yyGoodTypeService.selectYyGoodTypeList(yyGoodType);
        return getDataTable(list);
    }

    /**
     * 导出商品分类列表
     */
    @PreAuthorize("@ss.hasPermi('YyGoodType:YyGoodType:export')")
    @Log(title = "商品分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, YyGoodType yyGoodType)
    {
        List<YyGoodType> list = yyGoodTypeService.selectYyGoodTypeList(yyGoodType);
        ExcelUtil<YyGoodType> util = new ExcelUtil<YyGoodType>(YyGoodType.class);
        util.exportExcel(response, list, "商品分类数据");
    }

    /**
     * 获取商品分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('YyGoodType:YyGoodType:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(yyGoodTypeService.selectYyGoodTypeById(id));
    }

    /**
     * 新增商品分类
     */
    @PreAuthorize("@ss.hasPermi('YyGoodType:YyGoodType:add')")
    @Log(title = "商品分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody YyGoodType yyGoodType)
    {
        return toAjax(yyGoodTypeService.insertYyGoodType(yyGoodType));
    }

    /**
     * 修改商品分类
     */
    @PreAuthorize("@ss.hasPermi('YyGoodType:YyGoodType:edit')")
    @Log(title = "商品分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody YyGoodType yyGoodType)
    {
        return toAjax(yyGoodTypeService.updateYyGoodType(yyGoodType));
    }

    /**
     * 删除商品分类
     */
    @PreAuthorize("@ss.hasPermi('YyGoodType:YyGoodType:remove')")
    @Log(title = "商品分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(yyGoodTypeService.deleteYyGoodTypeByIds(ids));
    }
}
