package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class PhysicalProduct implements OrderFilterInterface {
    @Override
    public String applyBusinessRule(int payment) {
        String responseString;
        ShippingSlip slipCreate = new ShippingSlip();
        CommissionPayment commission = new CommissionPayment();
        responseString = slipCreate.generatePackingSlip(payment);
        responseString = responseString + slipCreate.generateShippingSlip(100);
        responseString = responseString + commission.commissionPaymentForAgent();
        return responseString;
    }
}
