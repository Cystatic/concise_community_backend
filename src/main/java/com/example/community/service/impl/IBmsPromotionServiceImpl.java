package com.example.community.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.community.mapper.BmsBillboardMapper;
import com.example.community.mapper.BmsPromotionMapper;
import com.example.community.model.entity.BmsBillboard;
import com.example.community.model.entity.BmsPromotion;
import com.example.community.service.IBmsBillboardService;
import com.example.community.service.IBmsPromotionService;
import org.springframework.stereotype.Service;

@Service
public class IBmsPromotionServiceImpl extends ServiceImpl<BmsPromotionMapper
        , BmsPromotion> implements IBmsPromotionService {

}