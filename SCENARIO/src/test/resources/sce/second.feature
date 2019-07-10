Feature: login page
Scenario Outline: customer login
Given url2 for login page "http://10.232.237.143:443/TestMeApp/login.htm"
When customer2 enters the username "<username>"
And customer2 enter the  password "<password>"
Then customer2 clicks on login button 
 Examples:
 |username|password|
 |Lalitha |password123 |