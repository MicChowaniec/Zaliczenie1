#noinspection GherkinBrokenTableInspection
Feature: New Address

  Scenario Outline: Adding new address
    Given user opens page
    And user clicks on button
    Given user enters email <email>
    And user enters password <password>
    Given click Sign in button.
    Given user clicks add a new address button
    And user adds new alias <alias>, address <address>, zip code <code>, city <city>, country <country> and phone <phone>
    Given clics save button
    Then user sees confirmation message
    And browser is closed

    Examples:
      | email                          | firstname | lastname | password  | alias    | address      | code   | city   | country        | phone      |
      | fkfstiucsgasugjlrq@sdvgeft.com | Tester    | Tester   | tester123 | address1 | Baker Street | A12345 | London | United Kingdom | 1122334455 |
