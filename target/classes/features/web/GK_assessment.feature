Feature: Technical Test

  @testing1
  Scenario Outline: Web assessment
    Given I navigate to login page "<Url>"
    When I enter username and password "<Username>" "<Password>"
    And I click login button
    And I click add to cart
    And I view Cart
    And I click checkout
    And I enter customer details "<FirstName>" "<LastName>" "<PostalCode>"
    And I click continue
    And I click finish button
    And I assert the results "<Results>"
    Then I logout Application



    Examples:
      | Url | Username      | Password     | FirstName | LastName | PostalCode | Results                  |
      | url | standard_user | secret_sauce | Alex      | Kwenene  | 1619       | THANK YOU FOR YOUR ORDER |
