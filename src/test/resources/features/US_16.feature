Feature: Vehicle functionality

#  1-Truck driver can see vehicle odometer informations once navigate to vehicle page
#  2-Truck driver can change page number for getting following vehicle odometer informations
#  3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
#  4-Truck driver can get all informations to her/his own email address by using Export Grid button
#  in csv and xlsx formats

  Scenario: Truck driver can see vehicle odometer
    
    Given  the user is on the login page
    When the user login as a "driver"
    And the user navigates to "Fleet" , "Vehicle"
    Then the user can see vehicle odometre column
