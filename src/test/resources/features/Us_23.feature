Feature: 

	Background:
		#@TR-185

		Given the user login as a "driver"
		Then the user should be able to login

		When the user navigates to "Fleet" , "Vehicle Odometer"
		And the user click first odometer information on the table



	#*User Story :* 
	#
	#As a Truck Driver I should be able to add attachment to selected specific vehicle odometer. 
	#
	#*_Acceptance Criterias:_*
	#
	#1-Truck Driver can add attachment to selected vehicle odometer
	@TR-177 @TR-178
	Scenario: Us-23 Add attachment to selected specific vehicle odometer Test Case-1

		And the user click Add Attachment Button
		Then user should be able to enter valid input to Add Attachment window
		When the user click Save Button
		Then "Attachment created successfully" message should be displayed	

	#Truck Driver vehicle odometer add attachment function US-023
	#
	#*User Story :* 
	#
	#As a Truck Driver I should be able to add attachment to selected specific vehicle odometer.
	#
	# *_Acceptance Criterias:_*
	#
	#1-Truck Driver can add attachment to selected vehicle odometer
	@TR-179 @TR-178
	Scenario: Us-23 Add attachment to selected specific vehicle odometer Test Case-2

		And the user click Add Attachment Button
		When the user click Save Button without any choose file
		Then "This value should not be blank." error message should be displayed.
		