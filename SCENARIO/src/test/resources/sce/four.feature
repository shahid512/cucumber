Feature: check chart icon 
Scenario: chartt ion
Given URL is loaded "http://10.232.237.143:443/TestMeApp/login.htm"
When custm enters the username "Lalitha"
And custm enters the password "password123"
And custm clicks on login button
And custm searches  for "headphone"
And custm clicks on find button
Then  custm checks for chart icon