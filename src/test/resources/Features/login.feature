#Author: IG
@SmokeScenario
Feature: Feature to Test Login functionality

@SmokeTest
Scenario: Check Login is successfull after providing correct credentials

Given user is on Login page
When user enters Username and Password
And clicks on login button
Then user is navigated to Home Page

Scenario Outline: Check Login is successfull after providing correct credentials

Given user is on Login page
When user enters <Username> and <Password>
And clicks on login button
Then user is navigated to Home Page

Examples:
|Username | Password|
|user1 | pass1|
|user2 | pass2|
