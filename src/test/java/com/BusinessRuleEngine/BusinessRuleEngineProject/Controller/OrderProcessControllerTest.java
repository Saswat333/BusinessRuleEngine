package com.BusinessRuleEngine.BusinessRuleEngineProject.Controller;

import com.BusinessRuleEngine.BusinessRuleEngineProject.OrderProcessService.OrderProcessFactoryService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderProcessControllerTest {

    @InjectMocks
    OrderProcessController orderController;

    @MockBean
    OrderProcessFactoryService orderService;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetResult() throws Exception {
        String uri = "/api/order/100/1";
        String expectedResponse = "Packing Slip generated. Shipping slip generated of Rs. 100. Slip generated of commission payment. ";
        Mockito.when(orderService.processOrder(100,1)).thenReturn(expectedResponse);
        String responseString = orderController.orderProcessor(100,1);
        Assert.assertNotNull(responseString);
    }

    @Test
    public void testGetResultOfOrderNumberOne() throws Exception{
        String expectedResponse = "Packing Slip generated. Shipping slip generated of Rs. 100. Slip generated of commission payment. ";
        Mockito.when(orderService.processOrder(100,1)).thenReturn(expectedResponse);
        String responseString = orderController.orderProcessor(100,1);
        Assert.assertEquals(expectedResponse,responseString);
    }

    @Test
    public void testGetResultOfOrderNumberTwo() throws Exception{
        String expectedResponse = "Packing Slip generated. Shipping slip generated of Rs. 100. Slip generated of commission payment.";
        Mockito.when(orderService.processOrder(100,2)).thenReturn(expectedResponse);
        String responseString = orderController.orderProcessor(100,2);
        Assert.assertEquals(expectedResponse,responseString);
    }
}
