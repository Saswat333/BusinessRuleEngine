package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class NewMembershipProduct implements OrderFilterInterface {
    @Override
    public String applyBusinessRule(int payment) {
        String responseString;
        SlipCreation slip = new SlipCreation();
        responseString = slip.generatePackingSlip(payment);
        return responseString;
    }
}
