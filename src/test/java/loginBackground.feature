Feature: Login Test

  Background:

    Given Navigate to website
    And Click My Account button

      Scenario Outline:

        And Click logIn button
        And Write Login Email "<emailLogin>"
        And Write Login Password "<passwordLogin>"
        And Click Login Button

        Examples:
          | emailLogin | passwordLogin |

          | test@gmail.com | 123test123 |