package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Order;

import java.util.List;

public interface OrdersService {
    List<Order> findOrdersWithAdvanceAmount();

    Order findOrdersById(long id);
}
