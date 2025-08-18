Feature: Flight Search and Price Comparison

  Scenario: Search flights, filter airlines, and compare prices
    Given I open the browser for flight search
    When I navigate to the flight booking site "https://firsttrip.com/flight"
    And I search flights from "Chattogram" to "Dhaka" on "23 September, 2025" for "2 Adults" travelers in "Economy / Premium Economy" class
    And I filter flights by airline "US-Bangla Airlines"
    And I select the last flight in the list
    Then I should see the Sign In page modal and close the Sign In modal
    And I capture the prices of "US-Bangla Airlines"
    And I deselect "US-Bangla Airlines" and select "Novo Air"
    And I capture the prices of Novo Air
    Then I compare both captured prices and assert they differ