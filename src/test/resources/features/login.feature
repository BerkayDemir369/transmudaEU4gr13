Feature:


  @TR-196
  Scenario: Us-1 Login Functions
    Given the user login as a "driver/storemanager/salesmanager"
    Then the user should be able to login

  Scenario: Custom User Login
    Given the user is on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login

