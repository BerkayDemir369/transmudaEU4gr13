Feature:


   @smoke @TR-196
  Scenario: Us-1 Login Functions
    Given the user login as a "driver"
    Then the user should be able to login

#  Scenario: Custom User Login
#    Given the user is on the login page
#    When the user logs in using "User10" and "UserUser123"
#    Then the user should be able to login
#
#  @sales_manager @VYT-123
#  Scenario:  Login as a sales manager
#    Given the user login as a "sales manager"
#    When the user enters the sales manager information
#    Then the user should be able to login
#
#  @store_manager @smoke
#  Scenario: Login as a store manager
#    Given the user login as a "store manager"
#    When the user enters the store manager information
#    Then the user should be able to login
