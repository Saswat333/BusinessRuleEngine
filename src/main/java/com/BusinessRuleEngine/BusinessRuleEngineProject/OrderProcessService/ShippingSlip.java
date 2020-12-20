package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class ShippingSlip extends SlipCreation{
    public String generateShippingSlip(int payment) {
        return "Shipping slip generated of Rs. "+payment+". ";
    }
}
