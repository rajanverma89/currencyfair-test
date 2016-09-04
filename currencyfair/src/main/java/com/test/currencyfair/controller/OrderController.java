package com.test.currencyfair.controller;

import com.test.currencyfair.models.Order;
import com.test.currencyfair.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller for Resource Order
 */
@RestController
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public String placeOrder(@RequestBody Order order){
        order = orderService.placeOrder(order);
        this.template.convertAndSend("/queue/orders", order);
        return order.getOrderId();
    }
}
