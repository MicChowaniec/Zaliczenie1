#noinspection GherkinBrokenTableInspection
Feature: New Address

  Scenario Outline: Adding new address
    Given user opens page
    And user clicks on button
    And user enters email <email>
    And user enters password <password>
    And click "Sign in" button.
    Given user clicks "add a new address" button
    And user adds new alias <alias>, firstname <firstname>, surname <lastname>, address <address>, zip code <code>, city <city>, country <country> and phone <phone>
    And clics "save" button
    Then user sees confirmation message
    And browser is closed

    Examples:
      | email                          | firstname | lastname | password  | alias   | address      | code  | city   | country        | phone      |
      | fkfstiucsgasugjlrq@sdvgeft.com | Tester    | Tester   | tester123 | Adress1 | Baker Street | 12345 | London | United Kingdom | 1122334455 |
