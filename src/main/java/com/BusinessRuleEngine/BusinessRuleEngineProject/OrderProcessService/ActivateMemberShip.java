package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class ActivateMemberShip {
    public String activationOfNewMembership() {
        String responseStr ;
        NotificationClass notify = new NotificationClass();
        responseStr = "Activated Membership. ";
        responseStr = responseStr + notify.notificationOfUpdatedMembership();
        return responseStr;
    }
}
