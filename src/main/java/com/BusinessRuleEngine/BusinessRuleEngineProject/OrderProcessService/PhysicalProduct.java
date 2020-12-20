package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class PhysicalProduct implements OrderFilterInterface {
    @Override
    public String applyBusinessRule(int payment) {
        return "Packing Slip generated.";
    }
}
