# BusinessRuleEngine
Order processing application.

## Test Results
	• Order Id: 1
		○ API: http://localhost:8080/api/order/200/1 
		○ Result: Packing Slip generated. Shipping slip generated of Rs. 100. Slip generated of commission payment. 
	• Order Id: 2
		○ API: http://localhost:8080/api/order/200/2 
		○ Result: Packing Slip generated. Royalty slip generated of Rs. 100. Slip generated of commission payment. 
	• Order id: 3
		○ API: http://localhost:8080/api/order/200/3 
		○ Result: Packing Slip generated. Activated Membership. Welcome Back, Membership Renewed. 
	• Order id: 4
		○ API: http://localhost:8080/api/order/200/4 
		○ Result: Packing Slip generated. Renewed Membership. Welcome Back, Membership Renewed. 
	• Order id: 5
		○ API: http://localhost:8080/api/order/200/5 
    ○ Result: Packing Slip generated. FirstAid Video added. 
