package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuSaleAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

import java.util.List;


/**
 * sku销售属性&值
 *
 * @author linyu902
 * @email linyu902@atguigu.com
 * @date 2019-12-03 13:44:41
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageVo queryPage(QueryCondition params);

    List<SkuSaleAttrValueEntity> querySaleAttrsBySkuId(Long skuId);
}

