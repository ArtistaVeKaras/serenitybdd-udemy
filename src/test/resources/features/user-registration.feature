Feature:  User Registration to the pet-store application

  Scenario: As a shopper, I need to register myseld as a new user to the pet store application
    Given I navigate to the registration page
    And I add new user information
    And I add acount information
    And I add profile information
    And I click save information
    When I login with my credentials
    Then I must b able to view the welcome greeting with my name