package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.vo.SaleVO;
import com.atguigu.gmall.vo.SkuSmsVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SkuBoundsEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

import java.util.List;


/**
 * 商品sku积分设置
 *
 * @author linyu902
 * @email linyu902@atguigu.com
 * @date 2019-12-02 10:42:38
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageVo queryPage(QueryCondition params);

    void saveSms(SkuSmsVO skuSmsVO);

    List<SaleVO> queryBoundsAndFullAndLadder(Long skuId);
}

