@TR-205
Feature:

  Background:
    Given the user login as a "driver"
    Then the user should be able to login


  @TR-188 @TR-204 @smoke
  Scenario: TR-19 1-Truck driver can use Grid Settings button for arranging demanded columns.
    Given The truck driver user accesses the "Fleet" - "Vehicle Odometer"
    When The truck driver click Grid Settings button
    Then The truck driver can see Grid Settings Popup
    And The truck driver should only be able to see the column headings selected from the grid settings popup in the odometer table
    When The truck driver change selected header "Odometer Value" in the grid settings popup
    Then The truck driver should only be able to see the column headings selected from the grid settings popup in the odometer table
    When the truck driver clicks on the Selected link in the grid settings popup
    Then Truck driver should be able to see only those with checkboxes in popup table
    When the truck driver clicks on the Select All link in the grid settings popup
    Then The truck driver should be able to see in the popup table that all checkboxes have been marked
    And The truck driver should only be able to see the column headings selected from the grid settings popup in the odometer table

  @TR-201 @TR-204 @smoke
  Scenario: TR-19 2-Truck driver can use Filters sign with opening Manage Filters button for filtering information
    Given The truck driver user accesses the "Fleet" - "Vehicle Odometer"
    When The truck driver user clicks Filters button
    Then The truck driver user can see Manage Filters Box
    And Click Manage filters link button
    Then The truck driver user should be able to see Manage filters popup
    When The truck driver user select filter option "Odometer Value" in the Manage filters popup
    Then Truck driver user should be able to see selected "Odometer Value" filter setting on the right side of manage filter
    When Truck driver user Click selected Filter Option "Odometer Value" button
    Then Truck driver user should be able to see "Odometer Value" in the Filter Option popup
    When Truck driver user Select Condition keyword "Equal" for in the selected Filter Option popup
    And Truck driver user enter data "123" "" for Condition keyword in the selected Filter Option popup
    And Truck driver user Click Update button in the selected Filter Option popup
    Then Truck driver user should only be able to see results for "Equal" "123" "" selected filter settings in the Filter settings


  @TR-202 @TR-204
  Scenario: TR-19 3-Truck driver can refresh the page by using Refresh button
    Given The truck driver user accesses the "Fleet" - "Vehicle Odometer"
    When The truck driver user open new browser tab and create a vehicle odometer record
    And The truck driver user clicks Refresh button
    Then The truck driver user should be able to see the page reloaded


  @TR-203 @TR-204 @smoke
  Scenario: TR-19 4-Truck driver can reset the filtering settings by using Reset button
    Given The truck driver user accesses the "Fleet" - "Vehicle Odometer"
    When The truck driver click Grid Settings button
    Then The truck driver can see Grid Settings Popup
    And The truck driver should only be able to see the column headings selected from the grid settings popup in the odometer table
    When The truck driver change selected header "Odometer Value" in the grid settings popup
    And The truck driver close the grid settings popup
    When The truck driver user clicks Reset button
    Then The truck driver user should be able to see if all filters and settings applied to the page have been reset and reloaded


#    When navigate "Fleet" to "Vehicle Costs"
#    And The truck driver user clicks Filters button
#    Then The truck driver user can see Manage Filters Box
#    And Click Manage filters link button
#    Then The truck driver user should be able to see Manage filters popup
#    When The truck driver user select filter option "Type" in the Manage filters popup
#    Then Truck driver user should be able to see selected "Type" filter setting on the right side of manage filter
#    When Truck driver user Click selected Filter Option "Type" button
#    Then Truck driver user should be able to see "Type" in the Filter Option popup
#    When Truck driver user Select Condition keyword "is any of" for in the selected Filter Option popup
#    And Truck driver user enter data "Vehicle Registration" "" for Condition keyword in the selected Filter Option popup
#    And Truck driver user Click Update button in the selected Filter Option popup
#    Then Truck driver user should only be able to see results for "is any of" "Vehicle Registration" "" selected filter settings in the Filter settings
#
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
#
#
#
#    When The truck driver user clicks Reset button
#    #And The truck driver user clicks Filters button
#    Then The truck driver user can see Manage Filters Box
#    And Click Manage filters link button
#    Then The truck driver user should be able to see Manage filters popup
#    When The truck driver user select filter option "Date" in the Manage filters popup
#    Then Truck driver user should be able to see selected "Date" filter setting on the right side of manage filter
#    When Truck driver user Click selected Filter Option "Date" button
#    Then Truck driver user should be able to see "Date" in the Filter Option popup
#    When Truck driver user Select Condition keyword "between" for in the selected Filter Option popup
#    And Truck driver user enter data "Jan 1, 2019" "Mar 4, 2021" for Condition keyword in the selected Filter Option popup
#    And Truck driver user Click Update button in the selected Filter Option popup
#    Then Truck driver user should only be able to see results for "between" "Jan 1, 2019" "Mar 4, 2021" selected filter settings in the Filter settings