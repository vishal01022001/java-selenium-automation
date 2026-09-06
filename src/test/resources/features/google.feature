Feature: Google Search

  Scenario: Verify Google homepage title
    Given I open the Google homepage
    And Type Cars image
    Then the page title should be "Google"
