package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

import org.springframework.stereotype.Service;

@Service
public class OrderProcessFactoryService {
    public String processOrder(int payment, int orderNumber) {
        String responseString = null;
        OrderFilterInterface product;

        if (orderNumber >= 1 && orderNumber <= 5) {
            if (orderNumber == 1) {
                product = new PhysicalProduct();
                responseString = product.applyBusinessRule(payment);
            } else if (orderNumber == 2) {
                product = new BookProduct();
                responseString = product.applyBusinessRule(payment);
            }
            else if(orderNumber == 3){
                product =  new NewMembershipProduct();
                responseString = product.applyBusinessRule(payment);
            }
            else if(orderNumber == 4){
                product = new UpdateMembershipProduct();
                responseString = product.applyBusinessRule(payment);
            }
            else if(orderNumber == 5){
                product = new LearningVideoProduct();
                responseString = product.applyBusinessRule(payment);
            }
        }
        return responseString;
    }
}
