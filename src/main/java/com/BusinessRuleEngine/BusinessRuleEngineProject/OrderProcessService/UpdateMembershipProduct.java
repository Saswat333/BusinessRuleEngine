package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class UpdateMembershipProduct implements OrderFilterInterface {
    @Override
    public String applyBusinessRule(int payment) {
        String responseString;
        SlipCreation slip = new SlipCreation();
        UpdateMemberShip status = new UpdateMemberShip();

        responseString = slip.generatePackingSlip(payment);
        responseString = responseString+status.updateOfExistingMembership();
        return responseString;
    }
}
