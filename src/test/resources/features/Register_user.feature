Feature:  As a new user I want to register on the website So that I can use its services

Scenario: Arriving at the store
 Given I am a new user
 When I open the Automation Exercise store
 Then I see the home page
 And I see the option to sign up

Scenario outline: Successful registration
 Given I am a new user on the store home page
 When I register my details using a new email address
 Then I see the successful registration message

  Examples:
    | name | email                    |
    | Ana  | ana.qa.001@test.com      |
    | Luis | luis.qa.002@test.com     |

Scenario: Registration with an email address that already exists
 Given I am a user on the store home page
 When I register my details using an email address that is already registered
 Then I see the message that the email address already exists
 And I am not registered
