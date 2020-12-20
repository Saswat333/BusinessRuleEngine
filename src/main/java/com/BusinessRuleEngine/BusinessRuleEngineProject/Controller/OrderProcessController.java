package com.BusinessRuleEngine.BusinessRuleEngineProject.Controller;

import com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService.OrderProcessFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderProcessController {
    private OrderProcessFactoryService orderProcessor;

    @Autowired
    public OrderProcessController(OrderProcessFactoryService process){
        this.orderProcessor = process;
    }

    @GetMapping("/order/{payment}/{orderId}")
    public String orderProcessor(@PathVariable Integer payment, @PathVariable Integer orderId){
        String response = orderProcessor.processOrder(payment,orderId);
        return response;
    }
}
