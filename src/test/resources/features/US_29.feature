@TR-262
Feature: 

	Background:
		#@TR-174
		Given the user login as a "driver"
		Then the user should be able to login
		
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able create vehicle costs
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck driver can create vehicle costs by using Create Vehicle Costs button
	#2-Truck driver can add chasis number and licence plate by using + Add buttons when creating vehicle costs"
	@TR-260 @TR-261
	Scenario: US-029 Create Vehicle Costs button negative test
		When the user navigates to "Fleet" , "Vehicle Costs"
		And the user click "Create Vehicle Costs"
		And the user select Type as "Tax Roll"
		And the user enter value to Total Price as "text"
		And the user click "Save And Close"
		Then verify "This value is not valid." validation message appeared 
		When the user enter value to Total Price as 1000
		And the user choose date as "text"
		And the user click "Save And Close"
		Then verify "This value is not valid." validation message appeared
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able create vehicle costs
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck driver can create vehicle costs by using Create Vehicle Costs button
	#2-Truck driver can add chasis number and licence plate by using + Add buttons when creating vehicle costs"
	@TR-259 @TR-261
	Scenario: US-029 Chasis number and Licance plate adding test
		When the user navigates to "Fleet" , "Vehicle Costs"
		And the user click Create Vehicle Costs
		And the user select Type as "Tax Roll"
		And the user enter value to Total Price as 1000
		And the user choose date as "current date"
		And the user write Cost Description "description comes here"
		When the user click chassis number add button
		And the user select first chassis number
		And the user click Select button
		When the user click license plate add button
		And the user select first license plate
		And the user click Select button
		And the user click Save And Close
		Then verify "Entity saved" message apper on the top of the page
		Then verify Chasis Number and License Plate added successfully
		
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able create vehicle costs
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck driver can create vehicle costs by using Create Vehicle Costs button
	#2-Truck driver can add chasis number and licence plate by using + Add buttons when creating vehicle costs"
	@TR-257 @TR-261
	Scenario: US-029 Create Vehicle Costs button test
		When the user navigates to "Fleet" , "Vehicle Costs"
		And the user click Create Vehicle Costs
		And the user select Type as "Tax Roll"
		And the user enter value to Total Price as 1000
		And the user choose date as "Mar 11, 2021"
		And the user write Cost Description "description comes here"
		And the user click Save And Close
		Then verify "Entity saved" message apper on the top of the page