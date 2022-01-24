
Feature: Login Functionality

Background: User is successfully logged in
Given user open "Chrome" browser with exe 
Given user open url as

@SmokeTest
Scenario: Login Functionality with valid credential
When user click on Cancel button
When user move on Login DropDown
When user click on My Profile
When user enter "8552979304" as username
When user enter "8552979304" as password
When user click on Login button
Then Application shows user profile to the user


    
     
     
 









                                                                         


