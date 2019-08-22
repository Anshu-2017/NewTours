Feature: NewToursApplication Test

  Background: Environment SetUp and Launch the Url
    Given I set the environment variale
    And I launch the URL


  Scenario Outline: Login to Application
    When I enter the <username> in the userEditBox
    And I enter the <password> in the passwordEditBox
    And I click login button
    Then signoffBtn is present
    And I close the browser


    Examples:
      |username|password|
      |batman	|batman	|
      |Test		|Test	|


   Scenario: To book flight for Round trip
    When I enter the username in the editBox and password in passwordBox
    And I click login button
    And I select Paris from the fromPort dropdown
    And I select New York from the toPort dropdown
    And I click findFlights button
    And I close the browser


    Scenario: To book flight for OneWay trip
    When I enter the username in the editBox and password in passwordBox
    And I click login button
    And I click on Oneway RadioBtn
    And I select Paris from the fromPort dropdown
    And I select New York from the toPort dropdown
    And I click findFlights button
    And I close the browser



