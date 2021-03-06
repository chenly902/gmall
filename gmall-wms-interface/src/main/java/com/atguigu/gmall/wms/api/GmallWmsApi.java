package com.atguigu.gmall.wms.api;

import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.atguigu.gmall.wms.vo.SkuLockVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @description:
 * @author: 十一。
 * @date: Created in 2019-12-09 19:28
 * @version: 1.0
 * @modified By:十一。
 */
public interface GmallWmsApi {
    /**
     * 根据skuId获取库存信息
     * @param skuId
     * @return
     */
    @GetMapping("wms/waresku/{skuId}")
    public Resp<List<WareSkuEntity>> queryWareSkuBySkuId(@PathVariable("skuId") Long skuId);

    @PostMapping("wms/waresku")
    public Resp<Object> checkStore(@RequestBody List<SkuLockVO> skuLockVOS);
}
