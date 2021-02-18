@test
Feature: 

	Background:
		#@TR-185
		
		    Given the user is on the login page
		    When the user logs in using "User10" and "UserUser123"
		    Then the user should be able to login
		

	#*{color:#00875a}User story:{color}*
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-176 @TR-171
	Scenario: US-19  Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer (3)
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see Licence Plate information window
		When  truck driver select license plate from the top the list and click the select button
		Then  truck driver can see selected license plate on the list	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-170 @TR-171
	Scenario: US-19 Truck driver should be able to  create vehicle odometer test case(1)
		Given  navigate Fleet to Vehicle Odometer
		When   click on the Create Vehicle Odometer button on the Vehicle Odometer page
		Then  truck driver can see create vehicle odometer page
		
		
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-181 @TR-171
	Scenario: US- 19  Truck Driver  should be able to create vehicle odometer test case(2)
		Given  navigate Fleet to Vehicle Odometer
		When   click on the Create Vehicle Odometer button on the Vehicle Odometer page
		Then   truck driver can see create vehicle odometer page
		When   truck driver enter the valid informations on the vehicle odometer page 
		And    truck driver click on the Save and Close button on the Vehicle Odometer page
		Then   truck driver can create Vehicle Odometer	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-182 @TR-171
	Scenario: US-19 Truck Driver should be able to create vehicle odometer (negative scenario) test case (4) 
		Given  navigate Fleet to Vehicle Odometer
		When   click on the Create Vehicle Odometer button on the Vehicle Odometer page
		Then   truck driver can see create vehicle odometer page
		When   truck driver enter the invalid informations on the vehicle odometer page
		And    truck driver click on the Save and Close button on the Vehicle Odometer page
		Then  "This value is invalid" information should display and truck driver can not create Vehicle Odometer	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-183 @TR-171
	Scenario: US-19 Truck driver can click the assigned button on the licence plate information window test case
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see Licence Plate information window
		When  truck driver click on the assigned button on the licence plate information window
		Then  truck driver can assign license plate on the licence plate information window
		
		
		
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-186 @TR-171
	Scenario: US-19 Truck Driver should be able to click the page backward and forward button on the license plate information window test case (6)  
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see licence plate information window
		When  truck driver click on page backward and forward button on the licence plate information window
		Then  truck driver can change page number by clicking on the page backward and forward button on the licence plate information window
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-187 @TR-171
	Scenario: US-19 Truck Driver should be able to click the view per page dropdown button on the license plate information window test case 
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see licence plate information window
		When  truck driver click on the view per page dropdown button on the licence plate information window
		Then  truck driver can see the view per page options by clicking on the view per page dropdown button on the licence plate information window
		When  truck driver select the per page number options
		Then  truck driver can select number of options per page on the licence plate information window	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-189 @TR-171
	Scenario: US-19 Truck Driver should be able to click on the Filters button on the license plate information window test case 
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see licence plate information window
		When  truck driver click on the Filters button on the licence plate information window
		Then  truck driver can manage license plate by clicking on Filters button on the licence plate information window	

	#*User Story :* 
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	# 2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-190 @TR-171
	Scenario: US-19 Truck Driver should be able to click  on the  Refresh button on the license plate information window test case
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see licence plate information window
		When  truck driver click on Refresh button on the licence plate information window
		Then  truck driver refresh the licence plate information window
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-191 @TR-171
	Scenario: US-19 Truck Driver should be able to click on the Reset button on the license plate information window test case 
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see licence plate information window
		When  truck driver select any license plate on the license plate information window
		And   truck driver click on the Reset button 
		Then  truck driver can see reset confirmation window 
		When  truck driver click on the OK button on the reset confirmation window 
		Then  truck driver can reset the license plate 	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-192 @TR-171
	Scenario: US-19 truck driver should be able to add license plate by clicking on Grid Settings button on the license plate information window
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see licence plate information window
		When  truck driver click on the Grid Settings button on the licence plate information window
		Then  truck driver can see Grid Settings window 
		When  truck driver click on the Select All on the Grid Settings window 
		Then  truck driver can see assinged and license plate on the table
		When  truck driver unclick on the Select All on the Grid Settings window 
		Then  truck driver can see only license plate on the table	

	#*{color:#00875a}User story:{color}*
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@TR-193 @TR-171
	Scenario: US-19 truck driver should be able to also remove the license plate by clicking on multiple sign after adding license when the license plate information shown in the list test case
		Given navigate Fleet to Vehicle Odometer
		When  truck driver click on the Create Vehicle Odometer button
		And   truck driver click on the Add button on the Create Vehicle Odometer page
		Then  truck driver can see Licence Plate information window
		When  truck driver select license plate from the top the list and click the select button
		Then  truck driver can see selected license plate on the list
		When  truck driver click on the any license plate information on the selected license plate list
		And   truck driver click on the Multiple Sign the clicked license plate information
		Then  truck driver can remove the any license plate information on the selected license plate list