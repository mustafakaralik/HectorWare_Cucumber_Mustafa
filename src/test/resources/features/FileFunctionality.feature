Feature: Add/Move/Copy/Delete File Functionalities

  Scenario: Delete File Functionality
    Given the user logs in with valid credentials
    When the user click on the check box of the file
    Then the Actions link should be displayed
    And the user click on the Actions link
    Then options menu should be displayed
    When the user click on Delete
    Then file should not be displayed