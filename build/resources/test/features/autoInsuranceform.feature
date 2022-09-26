Feature: validation of form Automobile Insurance
  @test
  Scenario: fill out form
    Given administrator user goes to login screen
    And fill out form Vehicle Data
    And fill out form Insurant Data
    And fill out form Product Data
    And fill out form Price Option
    And fill out form Send Quote
    When sends the completed form
    Then a successful message appears