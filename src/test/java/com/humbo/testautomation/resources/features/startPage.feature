Feature: Humbo - Find places to visit
  This feature contains tests to verify the start page of Humbo.com

  Background: User is on start page
    Given user has navigated to the start page "http://dev.humbo.com"

  Scenario: User should see correct page title
    Then user should see correct page title "Humbo - Find places to visit. Share where you have been!"