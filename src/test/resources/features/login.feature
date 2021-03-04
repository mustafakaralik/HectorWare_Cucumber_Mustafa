@login
Feature:Users should be able to

  Background:
    Given the user is on home page

  @HEC-123
  Scenario: Login as authorized
    When the user logs in with valid credentials
    Then Hectorware - QA page should be	Account "Files - Hectorware - QA" as title

  @HEC-125
  Scenario: Try to Login as unauthorized
    When the user should not be able to login with invalid "username" valid "password"
    Then error message should be displayed

  @HEC-127
  Scenario: Try to Login as unauthorized
    When the user should not be able to login with valid "username" invalid "password"
    Then error message should be displayed

  @HEC-129
  Scenario: Try to Login as unauthorized
    When the user should not be able to login with invalid credentials
    Then error message should be displayed


  @outlineLogin # instead --> HEC-125/127/129
  Scenario Outline: try using invalid credentials
    When the user logs in using following credentials
      | username | <user>     |
      | password | <password> |
    Then error message should be displayed

    Examples:
      | user  | password    |
      | asdfg | Userpass123 |
      | User1 | asdfg       |
      | asdfg | asdfg       |


  @HEC-131
  Scenario: Try to Login as unauthorized
    And the user should not be able to login with blank "username and password"
    Then should not be blanked message should be displayed on "username" textBox

  @HEC-133
  Scenario: Try to Login as unauthorized
    And the user should not be able to login with blank "username"
    Then should not be blanked message should be displayed on "username" textBox

#  @outlineLogin --> for blank credentials however unresolved --> instead HEC-131/133 (how can I send keys empty)
#  Scenario Outline: try using some blank credentials
#    When the user logs in using following credentials
#      | username | <user>     |
#      | password | <password> |
#    Then should not be blanked message should be displayed on "username" textBox
#
#    Examples:
#      | user | password    |
#      |      |             |
#      |      | Userpass123 |


  @HEC-135
  Scenario: Try to Login as unauthorized
    And the user should not be able to login with blank "password"
    Then should not be blanked message should be displayed on "password" textBox

