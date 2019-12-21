Feature: To verify login the functionality
Backgorund: EnterURL
Scenario: Login with valid credentils

Given User enter url
When user enter username
And user enter password
And user clicks on button
Then Home page is displayed

@Smoke1
Scenario: Login with valid credentils
Given User enter url
When user enter username
And user enter password
And user clicks on button
Then Home page is displayed

@Smoke2
Scenario Outline: Login with valid credentils multiple times
Given User enter url
When user enter username "<username>"
And user enter password "<passowrd>"
And user clicks on button
Then Home page is displayed

Examples:
|username|passowrd|
|sunita|123|
|sunita22|12345|










