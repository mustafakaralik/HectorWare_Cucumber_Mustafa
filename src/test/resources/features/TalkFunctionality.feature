
Feature: Users should be able to

  Background:
    Given the user is on home page
    When the user logs in with valid credentials
    When the user should  be able to enter talk functionality page

  @HEC-137
  Scenario: the user is on talk functionality page
    Then page should be	"Talk - Hectorware - QA" as title

  @HEC-149
  Scenario: the user is able to search conversation left console
    When the user able to search any "Employee10" in search box
    Then the user is able to select user searched under list
  @HEC-151
  Scenario: the user is able to add several conversation feature
    When the user should be able to Add and Remove from Favorites the users
    Then the user should be able to Leave from conversation
    And the user should be able to Delete conversation
  @HEC-153
  Scenario: the user is able to create new group conversation
    And the user should be able to create new group conversation
    Then the user is able to mute microphone
    Then the user is able to open camera
  @HEC-154
  Scenario: the user is able to add several participant from right panel
    When the user should be able to Add and Remove from right panel
    Then the user should be able to promote and demote participants from right panel

