@US_32
Feature:

	Background:
		#@TR-174
		#Select user type
		#driver/storemanager/salesmanager
		Given the user login as a "driver"
		Then the user should be able to login
		
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to add attachment in vehicle costs
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can add attachment by using Add Attachment button
	#2-Truck Driver should see the update in vehicle cost general information page
	@TR-267 @TR-268
	Scenario: US-032 Vehicle Cost General Information Page Update test
		When the user navigates to "Fleet" , "Vehicle Costs"
		And the user click spesific vehicle which added attachment
		Then verify Attachment File Name is "car.jpg"
		And verify comment is "text comes here"	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to add attachment in vehicle costs
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can add attachment by using Add Attachment button
	#2-Truck Driver should see the update in vehicle cost general information page
	@TR-266 @TR-268
	Scenario: US-032 Truck Driver Vehicle Costs Add Attachment function test
		When the user navigates to "Fleet" , "Vehicle Costs"
		And the user click spesific vehicle
		And the user click "Add Attachment" button
		And the user click "Choose File" button
		And the user select "car.jpg"
		And the user click "open" button
		And the user write Comment "text comes here"
		And the user click "Save" button
		Then verify "Attachment created successfully" message appeared on the top
		