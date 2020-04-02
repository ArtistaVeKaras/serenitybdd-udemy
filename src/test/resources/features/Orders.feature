Feature: Purchase pets form the store

  Scenario Outline: As a user, I must be able to search pets from the stoe and purchase them
                    by entering my details

    Given I login to the application with valid bob and bob
    When  I search for a "<petType>" it must show up in the search results
    And I view details about the pet "<pet>" and add it to cart
    And I proceed to the chekcout
    And I enter my payment details "<cardType>","<cardNumber>","<expireDate>","<firstName>","<lastName>","<addr1>","<addr2>","<city>","<state>","<zip>","<code>","<country>"
    When I click on the continue button
    Then I submit the order, the store must provide me with a confirmation message on the placed order

    Examples:

      |         pet         |        petType     |    cardType     |    cardNumber    |    expireDate  |    firstName    |   lastName  |   addr1  |  addr2   |   city    | state  |   zip  |   code  |  country  |
      | Male Adult Bulldog  |       Buldog       |    Visa         |    97897979879878|   09/08/202    |    Jonh         |    Docker   |   kael   |   road   |  london   |  clai  |  kjjj  |  4324   |    uk     |
      | Fe,ale Adult Bulldog|  german shepard    |    Visa         |    11197979879878|   09/08/202    |    Phil         |    postma   |   road   |   viaa   |  london   |  la    |  2333  |  3333   |   France  |
