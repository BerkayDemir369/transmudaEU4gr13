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

  @TR-231 @TR-252 @grid
  Scenario: 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
    When navigate "Fleet" to "Vehicle Costs"
    And click on the table row "Depreciation and Interests"
    Then Truck Driver can see all information about specific record "Depreciation and Interests"
    When  Click on Activity Tab
    Then The user should be able to see Activity tab
    When The user click on "Activity Type" filter button
    Then  The user should be able to see "Activity Type" filter popup
    When The user select "Calendar event" on the opened filter popup
    Then The user should be able to see "Calendar event" records on the table

  Scenario: 3-Truck Driver can refresh the activities by using refresh button
    When navigate "Fleet" to "Vehicle Costs"
    And click on the table row "Depreciation and Interests"
    Then Truck Driver can see all information about specific record "Depreciation and Interests"
    When  Click on Activity Tab
    Then The user should be able to see Activity tab
    When The user open the new browser tab
    And The user click on refresh button
    Then The user should be able to see page reloaded