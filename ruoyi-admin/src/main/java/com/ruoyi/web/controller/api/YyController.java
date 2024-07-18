package com.ruoyi.web.controller.api;

import com.ruoyi.YyGoodType.domain.YyGoodType;
import com.ruoyi.YyGoodType.service.IYyGoodTypeService;
import com.ruoyi.YyGoods.domain.YyGoods;
import com.ruoyi.YyGoods.service.IYyGoodsService;
import com.ruoyi.YyGsInfo.domain.YyGsInfo;
import com.ruoyi.YyGsInfo.service.IYyGsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/Yy")
public class YyController {

    @Autowired
    private IYyGoodsService yyGoodsService;
    @Autowired
    private IYyGsInfoService gsInfoService;
    @Autowired
    private IYyGoodTypeService typeService;

    //    获取公司信息
    @PostMapping("/getGsInfo")
    public Map<String,Object> getGsInfo(@RequestBody YyGsInfo yyGsInfo)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        yyGsInfo=  gsInfoService.selectYyGsInfoById(1L);
        map.put("data",yyGsInfo);
        map.put("code",1);
        return map;
    }
    @PostMapping("/gettype")
    public Map<String,Object> gettype(@RequestBody YyGoodType yyGoodType)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        List<YyGoodType> yyGoodTypeList=  typeService.selectYyGoodTypeList(yyGoodType);
        map.put("data",yyGoodTypeList);
        map.put("code",1);
        return map;
    }
    @PostMapping("/getgoodList")
    public Map<String,Object> getgoodList(@RequestBody YyGoods yyGoods)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        List<YyGoods> yyGoodTypeList=  yyGoodsService.selectYyGoodsList(yyGoods);
        map.put("data",yyGoodTypeList);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        map.put("code",1);
        return map;
    }
}
