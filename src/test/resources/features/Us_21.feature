Feature:

	Background:
		#@TR-185
		Scenario Outline: login as a given user <user>
		Given the user is on the login page
		When the user login as a TruckDriver
		| username  | <user>      |
		| password  | UserUser123 |

		Then the user should be able to login

		Examples:
		| user           | firstName | lastName  |
		| user10         | Brenden   | Schneider |
		
		
		

	#*User Story :* 
	#
	#As a Truck Driver I should be able to edit selected specific vehicle odometer
	#
	#*_Acceptance Criterias:_*
	#
	#1-Truck Driver can edit selected vehicle odometer.
	@TR-172 @TR-173
	Scenario: Us-21 Edit selected specific vehicle odometer Test Case

		When the user navigates to "Fleet" , "Vehicle Odometer"
		And the user click first odometer information on the table
		When the user click Edit button
		Then information  Edit page should be open
		When the user enter the valid values
		And click Save And Close button
		Then the user should be able to see "Entity saved" message
		
		
			

	#*User Story :* 
	#
	#As a Truck Driver I should be able to edit selected specific vehicle odometer
	#
	#*_Acceptance Criterias:_*
	#
	#1-Truck Driver can edit selected vehicle odometer.
	@TR-175 @TR-173
	Scenario: Us-21 Edit selected specific vehicle odometer Test Case-2
		Scenario:user enter value for Vehicle Odometer
		When the user enter letter as a Odometer Value
		Then "This value is not valid" error message should be displayed
		When the user should click date box
		Then The user should be able to select any date
		