
Feature:Profile settings

  Background:
    Given the user is on home page
    And the user logs in with valid credentials
  @HEC-139
  Scenario:Display personal info under Profile Settings page
    When the user is able click the profile icon or picture button at the top right
    And the user is able to click the Settings button under the profile icon or picture button
    Then the user is able to see the profile settings page

  @nahsen
  Scenario Outline: User can change any info under Profile Settings page
    When the user is able click the profile icon or picture button at the top right
    And the user is able to click the Settings button under the profile icon or picture button
    When the user is able to write or assign following full name to this text box
      |Full Name| <full name> |
    When the user is able to write or assign following email address to this text box
      |Email| <email address> |

    Examples:
      | full name    | email address           |
      | Mehmet Fatih | Mehmetfatih@hotmail.com |
      | Ersin Tatli  | Ersintatli@gmail.com    |
      | Gunay Yigit  | Gunayyigit@yahoo.com    |

