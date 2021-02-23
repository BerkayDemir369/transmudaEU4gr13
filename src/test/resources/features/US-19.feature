
Feature:

	Background:
		#@TR-185
		Given the user login as a "driver"
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

	Scenario: US-19  Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer (3)
		Given navigate  Fleet to  Vehicle Odometer
		When click on the Create Vehicle Odometer button
		And click on the Add button on the Create Vehicle Odometer page
		Then can see Licence Plate information window
		When select license plate from the top the list and click the select button
		Then can see selected license plate on the list


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

		Given navigate  Fleet to  Vehicle Odometer
		When   truck driver enter the valid information on the vehicle odometer page
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
		Given navigate  Fleet to  Vehicle Odometer
		When   truck driver enter the invalid information on the vehicle odometer page
		And    truck driver click on the Save and Close button on the Vehicle Odometer page
		Then  This value is invalid  information should display and truck driver can not create Vehicle Odometer

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odomete
		
		
			

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
		Given navigate  Fleet to  Vehicle Odometer
		When  truck driver click on the view per page dropdown button on the licence plate information window
		And  truck driver select the per page number options
		Then  truck driver can select number of options per page on the licence plate information window	



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
		Given navigate  Fleet to  Vehicle Odometer
		When click on the Create Vehicle Odometer button
		And click on the Add button on the Create Vehicle Odometer page
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

		Given navigate  Fleet to  Vehicle Odometer
		When click on the Create Vehicle Odometer button
		And click on the Add button on the Create Vehicle Odometer page
		When   truck driver click on the Reset button
		Then  truck driver can see reset confirmation window 
		When  truck driver click on the OK button on the reset confirmation window 
		Then  truck driver can reset the license plate 	

	#{color:#00875a}*User Story :* {color}
	#
	#
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
	Scenario: US-19  add license plate by clicking on Grid Settings button 
		
		When   click on the Grid Settings button on the licence plate information window
		Then   can see Grid Settings window 
		When   click on the Select All on the Grid Settings window 
		Then   can see assinged and license plate on the table
