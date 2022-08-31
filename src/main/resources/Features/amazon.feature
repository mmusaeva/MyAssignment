@amazon

Feature: Buy shoes from amazon
  As a user, I should be able to search shoes for men, add to shopping cart and delete the item from the cart

  Scenario: User search shoes for men
    Given User in the Amazon homepage
    When User enters "shoes for men" in search bar
    And Users selects the last auto-complete option from dropdown menu suggestions
    And  among results the user selects the first shoe from list
    And the user selects 3 from quantity dropdown
    And User should be able to click add_to_cart button
    And User should be able to go to shopping cart
    Then Item quantity should be as 3
    And Item price should be correct
    Then User deletes the item from the cart
    Then User validates shopping cart is empty