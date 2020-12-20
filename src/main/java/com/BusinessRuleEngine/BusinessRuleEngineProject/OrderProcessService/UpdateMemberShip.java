package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

public class UpdateMemberShip {
    public String updateOfExistingMembership(){
        String responseStr ;
        NotificationClass notify = new NotificationClass();
        responseStr = "Renewed Membership. ";
        responseStr = responseStr + notify.notificationOfUpdatedMembership();
        return responseStr;
    }
}
