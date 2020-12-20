package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class NewMembershipProduct implements OrderFilterInterface {
    @Override
    public String applyBusinessRule(int payment) {
        String responseString;
        SlipCreation slip = new SlipCreation();
        ActivateMemberShip status = new ActivateMemberShip();

        responseString = slip.generatePackingSlip(payment);
        responseString = responseString+status.activationOfNewMembership();
        return responseString;
    }
}
