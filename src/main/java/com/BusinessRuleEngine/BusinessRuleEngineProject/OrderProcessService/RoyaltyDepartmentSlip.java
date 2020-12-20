package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class RoyaltyDepartmentSlip extends SlipCreation{
    public String generateRoyaltySlip(int payment) {
        return "Royalty slip generated of Rs. "+payment+". ";
    }
}
