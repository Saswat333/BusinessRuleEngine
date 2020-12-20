package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class BookProduct implements OrderFilterInterface {

    @Override
    public String applyBusinessRule(int payment) {
        String responseString;
        RoyaltyDepartmentSlip slip = new RoyaltyDepartmentSlip();
        CommissionPayment commission = new CommissionPayment();
        responseString = slip.generatePackingSlip(payment);
        responseString = responseString+slip.generateRoyaltySlip(100);
        responseString = responseString+commission.commissionPaymentForAgent();
        return responseString;
    }
}
