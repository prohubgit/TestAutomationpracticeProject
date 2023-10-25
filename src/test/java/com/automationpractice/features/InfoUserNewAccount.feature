Feature: User can access sign-up page
  As a customer
  i want the ability to access the sign-up page
  so that i can know the information required for sign-up.
@TestDB
# Scenario: 1:
  Scenario: Customer can access the signup page
    Given i navigate to Home Page
    And I can click on Sign-Up or Login link
    When I enter the Name
    And  I enter the Email Address
    And I click on Sign-up button
    Then sing-up page should be dispaly

## Scenario: Test Case1: Register User
#Scenario Outline: Customer can successfully create a new Account
#
#  Given I navigate to Home page
#  When  I click on tile radio button
#  When I enter user <"Password">  in to password field
#  And I select <"Day"> from the day dropdown
#  And I select <"Month"> from the month dropdown
#  And I select <"Year"> from the year dropdown
#  And I click on newsleter check bok
#  And I click on receive offers from our partners checkbox
#  And I enter <"Fist Name"> in to first name field
#  And I enter <"Last Name"> in to last name field
#  And I enter company name in to company field
#  And I enter address in to address field
#  And I select <"Country"> from the country dropdown
#  And I enter <"State"> from the state dropdown
#  And I enter <"City"> in to the city field
#  And I enter <"ZipCode"> in to zip code field
#  And I enter <"Mobile"> in to Mobile field
#  And I click on create Account button
#  Then new Account confirmation message is displayed
#
#  Examples:
#            |Password     |Day  |Month|Year|First Name |Last Name|Country     |State|City    |ZipCode     |Mobile        |
#            |2023PassPrack|   01| 12  |2000|Alex       |Flame    |united state |NY   |New York|NY10001     | 0012125941964|