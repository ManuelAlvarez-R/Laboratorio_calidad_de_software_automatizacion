Feature:  As a store customer I want to buy products So that I can use them



Scenario Outline: Adding a product to the cart
  Given I am a customer who has already entered the store
  When I add "<product>" to the cart
  Then "<product>" is in the shopping cart
  Examples:
    | product       |
    | Blue Top      |
    | Men Tshirt    |
    | Stylish Dress |

Scenario: Confirming the purchase order
 Given I am a customer who has already entered the store
 And I have a product in the shopping cart
 When I complete the purchase details and confirm the order
 Then I see the message that the order has been placed

Scenario Outline: Removing a product from the cart
  Given I am a customer who has already entered the store
  And I have "<product>" in the shopping cart
  When I remove "<product>" from the cart
  Then the cart no longer contains "<product>"
  Examples:
    | product       |
    | Blue Top      |
    | Men Tshirt    |
    | Stylish Dress |
