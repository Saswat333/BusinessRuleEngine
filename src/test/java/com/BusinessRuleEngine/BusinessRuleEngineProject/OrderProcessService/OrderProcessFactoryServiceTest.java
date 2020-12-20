package com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderProcessFactoryServiceTest {

    OrderProcessFactoryService service;
    @Before
    public void setUp() throws Exception{
        this.service = new OrderProcessFactoryService();
    }

    @Test
    public void testOrderForPhysicalProduct(){
        int payment=100, orderId=1;
        String expectedResponse = "Packing Slip generated. Shipping slip generated of Rs. 100. Slip generated of commission payment.";
        String response = service.processOrder(payment,orderId);
        Assert.assertEquals(expectedResponse,response);
    }

    @Test
    public void testOrderForBookProduct(){
        int payment=100, orderId=2;
        String expectedResponse = "Packing Slip generated. Royalty slip generated of Rs. 100. Slip generated of commission payment.";
        String response = service.processOrder(payment,orderId);
        Assert.assertEquals(expectedResponse,response);
    }

    @Test
    public void testOrderForNewMembershipProduct(){
        int payment=100, orderId=3;
        String expectedResponse = "Packing Slip generated. Activated Membership. Welcome Aboard, Membership activated.";
        String response = service.processOrder(payment,orderId);
        Assert.assertEquals(expectedResponse,response);
    }

    @Test
    public void testOrderForExistingMembershipProduct(){
        int payment=100, orderId=4;
        String expectedResponse = "Packing Slip generated. ";
        String response = service.processOrder(payment,orderId);
        Assert.assertEquals(expectedResponse,response);
    }
}
