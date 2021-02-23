@TR-205
Feature:

  Background:
    Given the user login as a "driver"
    Then the user should be able to login


  @TR-188 @TR-204
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

  @TR-201 @TR-204
  Scenario: TR-19 2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
    Given The truck driver user accesses the "Fleet" - "Vehicle Odometer"
    When The truck driver user clicks Filters button
    Then The truck driver user can see Manage Filters Box
    And Click Manage filters link button
    Then The truck driver user should be able to see Manage filters popup
    When The truck driver user select filter option in the Manage filters popup
    Then Truck driver user should be able to see selected filter setting on the right side of manage filter
    When Truck driver user Click selected Filter Option button
    Then Truck driver user should be able to see Filter Option popup
    When Truck driver user Select Condition keyword in the selected Filter Option popup
    And Truck driver user enter data for selected Condition keyword in the selected Filter Option popup
    And Truck driver user Click Update button in the selected Filter Option popup
    Then Truck driver user should be able to see results for selected filter settings in the Filter settings


  @TR-202 @TR-204
  Scenario: TR-19 3-Truck driver can refresh the page by using Refresh button
    Given The truck driver user accesses the "Fleet" - "Vehicle Odometer"
    When The truck driver user clicks Refresh button
    Then The truck driver user should be able to see the page reloaded


  @TR-203 @TR-204
  Scenario: TR-19 4-Truck driver can reset the filtering settings by using Reset button
    Given The truck driver user accesses the "Fleet" - "Vehicle Odometer"
    When The truck driver user clicks Reset button
    Then The truck driver user should be able to see if all filters and settings applied to the page have been reset and reloaded