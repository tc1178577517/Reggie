package com.tc.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tc.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {
    public void submit(Orders orders);
}
