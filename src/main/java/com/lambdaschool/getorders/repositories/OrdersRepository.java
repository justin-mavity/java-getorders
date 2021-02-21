package com.lambdaschool.getorders.repositories;

import com.lambdaschool.getorders.models.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Order, Long> {
    List<Order> findAllByAdvanceamountGreaterThan(Double amount);
}
