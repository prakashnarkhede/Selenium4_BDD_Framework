Feature: LoginPageTests

Background: user opens browsers

Given user opens chrome browser
Scenario: verify if all fields exist on login page
Given User opens demowebshop application
When user navigates to login page
Then user sees login, password field and login button

Scenario: verify user is able to login successfully with valid username and password
Given User opens demowebshop application
When user navigates to login page
And user enters valid username, valid password and hit enter button
Then user login is success and user navigated to dashboard page.

Scenario: verify user recieves error message for invalid username and password
Given User opens demowebshop application
When user navigates to login page
And user enters invalid username, invalid password and hit enter button
Then user login is failed with error message.