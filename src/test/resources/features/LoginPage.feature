Feature: Login to Saucedemo Application

#Scenario: Login Functionality
#
#Given User is on login page
#When User submit email and password
#Then User should be able to login sucessfully and new page open


#  Scenario: Validate google serach functionality
#
#    Given User is on googleHome page
#    When User enter "Selenium" in Serach area
#    And User clicks on serach button
#    Then User verify the selenium links
#  And User validates 1 value

  Scenario Outline: Validate data for 3 diff data sets
    When I add <a> and <b>
    Then I validtae <c>
    Examples:
    |a|b|c|
    |2|3|5|
    |1|2|3|
    |4|5|9|




