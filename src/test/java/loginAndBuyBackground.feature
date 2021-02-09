Feature: Login and Buy Test

  Background:

    Given Navigate to website
    And Click My Account button
  
      Scenario Outline:

        And Click logIn Button
        And Write Login Email "<emailLogin>"
        And Write Login Password "<passwordLogin>"
        And Click Login Button
        And Search Product "<searchProduct>"
        And Click Search Button
        And Select Lowest by Price
        And Click Buy Product Button
        And Click Complete the Order Button
        And Click Continue Button

        Examples:
          | emailLogin | passwordLogin | searchProduct |

          | test123@gmail.com | 123test123 | Headphone |

