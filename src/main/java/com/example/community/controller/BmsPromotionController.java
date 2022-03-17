package com.example.community.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.community.common.api.ApiResult;
import com.example.community.model.entity.BmsBillboard;
import com.example.community.model.entity.BmsPromotion;
import com.example.community.service.IBmsBillboardService;
import com.example.community.service.IBmsPromotionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/promotion")
@RestController //返回的java对象会被转换为json对象
public class BmsPromotionController extends BaseController{
    @Resource
    private IBmsPromotionService iBmsPromotionService;

    @GetMapping("/all")
    public ApiResult<List<BmsPromotion>> list() {
        List<BmsPromotion> list = iBmsPromotionService.list();
        return ApiResult.success(list);
    }
}
