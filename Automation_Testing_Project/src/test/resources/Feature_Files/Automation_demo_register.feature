Feature: This feature contains Automation_demo_register_form
Scenario Outline: Automation_demo_register_form

Given enter the url of automation demo register
And enter first name <firstname>
And enter last name <lastname>
And enter address <address>
And enter email address <emailid>
And enter phone number <phonenumber>
And select the gender male check box 
And select the hobbies check box cricket
And open the dropdown of languages
And select the languages
And select the skills
And select the country
And select the country name
And select year 
And select month
And select date
And enter the password <firstpassword>
And again enter the password <secoundpassword>
Then click on submit button
And close the browser

Examples:

|firstname|lastname|address|emailid|phonenumber|firstpassword|secoundpassword|
|yugandhar|barhate|Jalgaon|abcd@gmail.com|0000000000|123456789|123456789|

