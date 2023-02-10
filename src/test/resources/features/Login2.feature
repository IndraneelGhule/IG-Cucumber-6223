#Author: IG
@SmokeScenario
Feature: Feature to Test Login functionality

  @SmokeTest
  Scenario: Check Login is successfull after providing correct credentials

    Given user is on Login page
    When user enters Username and Password
    And clicks on login button
    Then user is navigated to Home Page
