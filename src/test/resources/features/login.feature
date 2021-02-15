
  Feature: Login
    Scenario Outline: login as a given user <user>
      Given the user is on the login page
      When the user logs in using following credentials
        | username  | <user>      |
        | password  | UserUser123 |
        | firstname | <firstName> |
        | lastname  | <lastName>  |
      Then the user should be able to login

      Examples:
        | user           | firstName | lastName  |
        | user10         | Brenden   | Schneider |
        | storemanager85 | Stephan   | Haley     |