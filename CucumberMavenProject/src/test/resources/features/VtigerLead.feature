Feature: Test Lead functionality of Vtiger application
Background:
Given user is having valid url
And enter username
And enter password
And click  on sign in button
And click on app navigator
And click on marketing
And select lead
Scenario Outline: Verify new lead creation

When user click on add lead button
And enter first name as <fname>
And enter last name as <lname>
And enter phone number as <number>
And click on save button
And search created lead by first name <fname>
Then user should be able to get created lead which has first name as <fname>
Examples:
|fname|lname|number|
|vishal|wani|123456789|
Scenario: Verify Lead modification


Scenario: Verify Lead deletion