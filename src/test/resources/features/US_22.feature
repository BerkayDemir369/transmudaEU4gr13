@test
Feature:

	Background:
		#@TR-185

		Given the user login as a "driver"
		Then the user should be able to login
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver, I should be able to delete selected specific vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#
	#1-Truck Driver can delete selected vehicle odometer.
	@TR-186 @TR-209
	Scenario: US-22 Truck Driver should be able to deleted selected  vehicle odometer test case 
		Given navigate Fleet to Vehicle Odometer
		When  select any vehicle odometer on the Vehicle Odometer list
		And   click on the Delete Button to delete Vehicle Odometer
		Then  can see the delete confirmation window 
		When  click on the Yes, Delete Button on the delete confirmation window
		Then  vehicle odometer deleted from the list


