package com.test.currencyfair.services;

import com.test.currencyfair.models.Order;
import com.test.currencyfair.repositories.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class to add/modify orders
 */
@Service
public class OrderServiceImpl implements IOrderService{

    @Autowired
    private IOrderRepository orderRepository;

    @Transactional
    @Override
    public Order placeOrder(Order order) {
        order = orderRepository.save(order);
        return order;
    }
}
