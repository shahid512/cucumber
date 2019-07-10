Feature: add to chart and checkout
Scenario: checkout
Given url to login "http://10.232.237.143:443/TestMeApp/login.htm" 
When cust enters the username "Lalitha"
And  cust enters the password "password123"
And  cust clicks on the login button
And  cust searches for "headphone"
And cust clicks on search button
And cust adds the item to chart
And cust clicks on chart symbol
And cust clicks on checkout button 
And cust clicks on procced to pay
And cust clicks on the bank to pay with
And cust clicks on the continue button
And Acust enters the username "123457"
And Acust enters the password "Pass@457"
And cust clicks on login button
And cust enters the transaction password "Trans@457"
And cust clicks on enter button