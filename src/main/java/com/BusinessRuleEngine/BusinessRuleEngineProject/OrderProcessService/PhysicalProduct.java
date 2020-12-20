package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class PhysicalProduct implements OrderFilterInterface {
    @Override
    public String applyBusinessRule(int payment) {
        String responseString;
        ShippingSlip slipCreate = new ShippingSlip();
        responseString = slipCreate.generatePackingSlip(payment);
        responseString = responseString + slipCreate.generateShippingSlip(100);
        return responseString;
    }
}
