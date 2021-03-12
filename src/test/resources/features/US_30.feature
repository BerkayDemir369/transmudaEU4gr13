Feature:

  Background:
		#@TR-185
    Given the user login as a "driver"
    Then the user should be able to login


  @TR-230 @TR-252
  Scenario: 1-Truck Driver can see all information about specific vehicle cost when click on it.
    When navigate "Fleet" to "Vehicle Costs"
    And click on the table row "Depreciation and Interests"
    Then Truck Driver can see all information about specific record "Depreciation and Interests"

  @TR-231 @TR-252
  Scenario: 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
    When navigate "Fleet" to "Vehicle Costs"
    And The truck driver user clicks Filters button
    Then The truck driver user can see Manage Filters Box
    And Click Manage filters link button
    Then The truck driver user should be able to see Manage filters popup
    When The truck driver user select filter option "Type" in the Manage filters popup
    Then Truck driver user should be able to see selected "Type" filter setting on the right side of manage filter
    When Truck driver user Click selected Filter Option "Type" button
    Then Truck driver user should be able to see "Type" in the Filter Option popup
    When Truck driver user Select Condition keyword "is any of" for in the selected Filter Option popup
    And Truck driver user enter data "Vehicle Registration" "" for Condition keyword in the selected Filter Option popup
    And Truck driver user Click Update button in the selected Filter Option popup
    Then Truck driver user should only be able to see results for "is any of" "Vehicle Registration" "" selected filter settings in the Filter settings

#    When The truck driver user clicks Reset button
#    #And The truck driver user clicks Filters button
#    Then The truck driver user can see Manage Filters Box
#    And Click Manage filters link button
#    Then The truck driver user should be able to see Manage filters popup
#    When The truck driver user select filter option "Total Price" in the Manage filters popup
#    Then Truck driver user should be able to see selected "Total Price" filter setting on the right side of manage filter
#    When Truck driver user Click selected Filter Option "Total Price" button
#    Then Truck driver user should be able to see "Total Price" in the Filter Option popup
#    When Truck driver user Select Condition keyword "not between" for in the selected Filter Option popup
#    And Truck driver user enter data "20" "200" for Condition keyword in the selected Filter Option popup
#    And Truck driver user Click Update button in the selected Filter Option popup
#    Then Truck driver user should only be able to see results for "not between" "20" "200" selected filter settings in the Filter settings



    When The truck driver user clicks Reset button
    #And The truck driver user clicks Filters button
    Then The truck driver user can see Manage Filters Box
    And Click Manage filters link button
    Then The truck driver user should be able to see Manage filters popup
    When The truck driver user select filter option "Date" in the Manage filters popup
    Then Truck driver user should be able to see selected "Date" filter setting on the right side of manage filter
    When Truck driver user Click selected Filter Option "Date" button
    Then Truck driver user should be able to see "Date" in the Filter Option popup
    When Truck driver user Select Condition keyword "between" for in the selected Filter Option popup
    And Truck driver user enter data "Jan 1, 2019" "Mar 4, 2021" for Condition keyword in the selected Filter Option popup
    And Truck driver user Click Update button in the selected Filter Option popup
    Then Truck driver user should only be able to see results for "not between" "Jan 1, 2019" "Mar 4, 2021" selected filter settings in the Filter settings
