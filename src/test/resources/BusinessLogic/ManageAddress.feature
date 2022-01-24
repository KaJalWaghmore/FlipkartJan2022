Feature: Manage Address Functionality

Background: User is successfully logged in
Given user open "Chrome" browser with exe 
Given user open url as
Given user click on Cancel button
Given user move on Login DropDown
Given user click on My Profile
Given user enter "8552979304" as username
Given user enter "8552979304" as password
Given user click on Login button

@SmokeTest
Scenario: Manage Address Functionality with valid data
When user click on Manage Address
When user click on Add new Address
When user enter "Kajal waghmore" as name
When user enter "8552979304" as mobile number
When user enter "414005" as pin code
When user enter "dudhsagar society arangaon" as locality
When user enter "kedgaon" as address
When user select Home as address type
When user click on save button
Then Application shows New Address Added to successfully


