package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author linyu902
 * @email linyu902@atguigu.com
 * @date 2019-12-02 10:21:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

    int closeOrder(String orderToken);

    Integer setStatus(String orderToken);
}
