Feature: login into testme app
   Scenario Outline: successful login
     Given user is on the login page
     When user enters "<username>" and "<password>" 
     Then user does succesful login
     
     Examples:
     | username | password |
     | Lalitha  | Password123    |