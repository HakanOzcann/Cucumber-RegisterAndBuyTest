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
        And Write Home Address "<homeAddress>"
        And Write Door Number "<writeDoorNumber>"
        And Choose City
        And Choose District
        And Choose Neighborhood
        Examples:
          | emailLogin | passwordLogin | searchProduct | homeAddress | writeDoorNumber |

          | test123@gmail.com | 13123123 | Headphone | testHometest | 2 |