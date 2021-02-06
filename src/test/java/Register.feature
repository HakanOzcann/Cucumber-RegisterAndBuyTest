Feature: Register Test

  Scenario: Create An Account

    Given Navigate to Website
    And Click My Account Button
    And Click Register Button
    And Choose Gender
    And Write "<Name>"
    And Write "<Surname>"
    And Write "<Phone Number>"
    And Write "<Email>"
    And Write "<Password>"
    And Write "<PasswordConfirm>"
    And Choose Be aware of the opportunities!
    And Choose Privacy Policy
