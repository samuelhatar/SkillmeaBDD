Feature: Bank

  Scenario: Bank account balance
    Given Bank account with 1000 euro
    Then A user account balance is 1000 euro

    Scenario Outline: Bank account transfer
      Given Bank account with <inicialBalance> euro
      When A user with withdraw <withdrawAmout> euro
      And A user transfer <tranfereAmount> euro to this account
      Then A user account balance is <expectedBalance> euro

      Examples:
        | inicialBalance | withdrawAmout | tranfereAmount | expectedBalance |
        | 500            | 250           | 1250           | 1500            |
        | 1000           | 500           | 1000           | 1500            |
        | 5000           | 6000          | 500            | -500            |
        | -5000          | 0             | 6000           | 1000            |

  Scenario Outline: Bank account transfer - 2
    Given Bank account with <inicialBalance> euro
    When A user transfer <tranfereAmount> euro to this account
    And A user with withdraw <withdrawAmout> euro
    Then A user account balance is <expectedBalance> euro

    Examples:
      | inicialBalance | withdrawAmout | tranfereAmount | expectedBalance |
      | 500            | 250           | 1250           | 1500            |
      | 1000           | 500           | 1000           | 1500            |
      | 5000           | 6000          | 500            | -500            |
      | -5000          | 0             | 6000           | 1000            |


    Scenario: Multiple bank account transfere
      Given Bank account with 1000 euro
      And another Bank account with 2000 euro
      When A user transfere from first bank account to second one 500 euro
      Then A user account balance is 500 euro
      And A user second account balance is 2500 euro