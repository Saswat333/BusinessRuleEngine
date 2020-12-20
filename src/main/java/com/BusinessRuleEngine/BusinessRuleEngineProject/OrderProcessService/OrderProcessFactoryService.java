package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

import org.springframework.stereotype.Service;

@Service
public class OrderProcessFactoryService {
    public String processOrder(int payment, int orderNumber) {
        String responseString=null;
        OrderFilterInterface product;

        if(orderNumber == 1){
            product = new PhysicalProduct();
            responseString = product.applyBusinessRule(payment);
        }

        return responseString;
    }
}
