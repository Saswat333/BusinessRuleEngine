package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class LearningVideoProduct implements OrderFilterInterface {
    @Override
    public String applyBusinessRule(int payment) {
        String responseString;
        SlipCreation slip = new SlipCreation();
        responseString = slip.generatePackingSlip(payment);
        responseString = responseString+slip.ComplimentaryVideo();
        return responseString;
    }
}
