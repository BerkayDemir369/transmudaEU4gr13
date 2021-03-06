@smoke
Feature:

	Background:
		#@TR-185
		Given the user login as a "driver"
		Then the user should be able to login
		

	
	@TR-230 @TR-274 @TR-252
	Scenario: 1-Truck Driver can see all informations about specific vehicle cost when click on it.
		When navigate "Fleet" to "Vehicle Costs"
		And click on the table row "Depreciation and Interests"
		Then Truck Driver can see all information about specific record "Depreciation and Interests"

	
	@TR-231 @TR-274 @TR-252 @grid
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
		    When Truck driver user Select Condition keyword "Is Any Of" for in the selected Filter Option popup
		    And Truck driver user enter data "Vehicle Registration" "" for Condition keyword in the selected Filter Option popup
		    And Truck driver user Click Update button in the selected Filter Option popup
		    Then Truck driver user should only be able to see results for "Is Any Of" "Vehicle Registration" "" selected filter settings in the Filter settings
		
		    When The truck driver user clicks Reset button
		    #And The truck driver user clicks Filters button
		    #Then The truck driver user can see Manage Filters Box
		    And Click Manage filters link button
		    Then The truck driver user should be able to see Manage filters popup
		    When The truck driver user select filter option "Date" in the Manage filters popup
		    Then Truck driver user should be able to see selected "Date" filter setting on the right side of manage filter
		    When Truck driver user Click selected Filter Option "Date" button
		    Then Truck driver user should be able to see "Date" in the Filter Option popup
		    When Truck driver user Select Condition keyword "between" for in the selected Filter Option popup
		    And Truck driver user enter data "Jan 1, 2019" "Mar 4, 2021" for Condition keyword in the selected Filter Option popup
		    And Truck driver user Click Update button in the selected Filter Option popup
		    Then Truck driver user should only be able to see results for "between" "Jan 1, 2019" "Mar 4, 2021" selected filter settings in the Filter settings	

	
	@TR-232 @TR-274 @TR-252
	Scenario: 3-Truck Driver can refresh the activities by using refresh button
		When the user navigates to "Fleet" , "Vehicle Costs"
		Then the user should be able to see costs information
		When the user click Refresh Button
		Then system should be able to refresh the page

	@TR-233 @TR-274 @TR-252
	Scenario: 4-Truck Driver can reach the all activities by using Newer and Older buttons



	@TR-234 @TR-274 @TR-252
	Scenario: 5-Truck driver can change page number for getting following attachment informations