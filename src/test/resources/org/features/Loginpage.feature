Feature: Login page feature

Scenario: Valid Login Page with valid Credentials
Given User Launch chrome brower
When User open URL "http://localhost:90/login.do"
And User enter UserName as "admin"and Password as "manager"
And Click on Login
Then page Tital should be"http://localhost:90/user/submit_tt.do"
When User click on log out link
And close browser

    

