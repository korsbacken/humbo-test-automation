Feature: Humbo - Find places to visit
  This feature contains tests to verify the Top 100 page of Humbo.com

  Background: User is on Top 100 page
    Given user has navigated to the Top 100 page "http://dev.humbo.com/top100"

  Scenario: User should see correct page title
    Then user should see correct page title of top "Best places to visit in the world 🌎"