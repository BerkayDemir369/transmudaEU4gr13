@TR-218
Feature: 

	Background:
		#@TR-185
		
		    Given the user is on the login page
		    When the user logs in using "User10" and "UserUser123"
		    Then the user should be able to login
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to get Vehicle Odometer
	#informations
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can see vehicle odometer informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle odometer informations
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TR-216 @TR-217
	Scenario: US-016 Get all informations to email test
		When the user navigates to "Fleet" , "Vehicle Odometer"
		And the user click export grid
		Then verify options are CSV, XLSX
		When the user click CSV
		Then verify "Export started successfully" message appear on the top
		When the user click XLSX
		Then verify "Export started successfully" message appear on the top	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to get Vehicle Odometer
	#informations
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can see vehicle odometer informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle odometer informations
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TR-215 @TR-217
	Scenario: US-016  Changing the entity number test
		When the user navigates to "Fleet" , "Vehicle Odometer"
		And the user click view per page dropdown button
		Then verify options are 10, 25, 50, 100
		When the user select 10
		Then verify record table content decrease 10
		When the user select 25
		Then verify record table content decrease 25
			

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to get Vehicle Odometer
	#informations
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can see vehicle odometer informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle odometer informations
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TR-214 @TR-217
	Scenario: US-016 change page number at vehicle odometer test
		When the user navigates to "Fleet" , "Vehicle Odometer"
		When the user click next page arrow
		Then verify page changed to second page	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to get Vehicle Odometer
	#informations
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can see vehicle odometer informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle odometer informations
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TR-213 @TR-217
	Scenario: US016 - Vehicle odometre informations test
		When the user navigates to "Fleet" , "Vehicle Odometer"
		Then the user can see vehicle odometre page
		