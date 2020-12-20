package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class BookProduct implements OrderFilterInterface {

    @Override
    public String applyBusinessRule(int payment) {
        String responseString;
        RoyaltyDepartmentSlip slip = new RoyaltyDepartmentSlip();
        responseString = slip.generatePackingSlip(payment);
        responseString = responseString+slip.generateRoyaltySlip(100);
        return responseString;
    }
}
