Feature:  As a store customer I want to buy products So that I can use them


Scenario: Adding a product to the cart
 Given I am a customer who has already entered the store
 When I add a product that interests me
 Then the product is in the shopping cart

Scenario: Confirming the purchase order
 Given I am a customer who has already entered the store
 And I have a product in the shopping cart
 When I complete the purchase details and confirm the order
 Then I see the message that the order has been placed

Scenario: Removing a product from the cart
 Given I am a customer who has already entered the store
 And I have a product in the shopping cart
 When I remove that product from the cart
 Then the cart no longer contains that product
