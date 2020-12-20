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
        String expectedResponse = "Packing Slip generated. Shipping slip generated of Rs. 100. ";
        String response = service.processOrder(payment,orderId);
        Assert.assertEquals(expectedResponse,response);
    }
}
