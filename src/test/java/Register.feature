Feature: Register Test

  Scenario Outline: Create An Account

    Given Navigate to website
    And Click My Account button
    And Click Register button
    And Choose Gender
    And Write Firstname "<firstname>"
    And Write Lastname "<lastname>"
    And Write PhoneNumber "<phoneNumber>"
    And Write Email "<email>"
    And Write Password <"password">
    And Write Confirm Password <"confirmPassword">
    And Choose Privacy and Policy
    And Click Save button

    Examples:
      | firstname | lastname | phoneNumber | email | "password" | "confirmPassword" |

      | Hakan | Ozcan | 3213223232 | hakan.ozcan44@hotmail.com | "123test123" | "123test123" |