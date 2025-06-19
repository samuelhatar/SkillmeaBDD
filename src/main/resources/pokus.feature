Feature: pokus

  #Toto je komentar

  Scenario: Pokusny test 1
    Given nastavenie pociatocnych podmienok
    And dalsi nastavovaci krok
    When toto je niaka akcia
    And toto je dalsia akcia
    Then overenie vysledku
    And dalsie overenie vysledku

    Scenario: pokusny test 2
      Given nastavenie pociatocnych podmienok
      When toto je dalsia akcia
      Then dalsie overenie vysledku

      Scenario: Kalkulacka - sucet dvoch cisliel
        Given Uzivatel ma priradene dve cisla 5 a 8
        When Uzivatel scita tieto dve cisla
        Then Uzivatel vidi na kalkulacke vysledok 13
        
        Scenario: Kalkulacka - delenie dvoch cisel
          Given Uzivatel scita tieto dve cisla
          When  Uzivatel vydeli tieto dve cisla
          Then Uzivatel vidi na kalkulacke vysledok 3

          Scenario Outline: Kalkulacks - scitanie viac scenarov
            #Given Uzivatel ma priradene dve cisla <prveCislo> a <druheCislo>
            Given Uzivatel ma priradene dve cisla 5 a 8
            When Uzivatel scita tieto dve cisla
            #Then Uzivatel vidi na kalkulacke vysledok <vysledok>
            Then Uzivatel vidi na kalkulacke vysledok 13

            Examples:
            | prveCislo | druheCislo | vysledok |
            | 120       | 24         | 144      |
            | 1011      | 10         | 1021     |
            | 0         | -24        | -24      |
          