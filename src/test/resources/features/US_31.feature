Feature: 

	Background:
		#@TR-174
		Given the user login as a "driver/storemanager/salesmanager"
		Then the user should be able to login
		
		

	#User Story : 
	#
	#As a Truck Driver I should be able to add event
	#
	# 
	#
	#Acceptance Criterias:
	#
	#"1-Truck Driver can add event by using Add Event button
	#2-Truck Driver should see the update in both general information page and Activity tab related
	#add event."
	@TR-250 @TR-249
	Scenario: US-31-Truck Driver Add Event function Test Case1
		Given Navigate to Fleet Vehicle Costs.
		When  Click on any Vehicle Cost.
		And   Click on Add Event Button on the specific Vehicle Cost Page.
		Then  Truck driver can see Add Event Window.
		And   Fill all information on the Add Event Window and click on Save Button.
		Then  Truck driver can see new calendar event on that specific vehicle cost page.	

	#User Story :
	#
	#As a Truck Driver I should be able to add event
	#
	#Acceptance Criterias:
	#
	#"1-Truck Driver can add event by using Add Event button
	#2-Truck Driver should see the update in both general information page and Activity tab related
	#add event."
	@TR-251 @TR-249
	Scenario: US-31-Truck Driver Add Event function Test Case2
		Given Navigate to Fleet Vehicle Costs.
		When  Click on any Vehicle Cost.
		And   Click on Add Event Button on the specific Vehicle Cost Page.
		Then  Truck driver can see Add Event Window.
		And   Click on Save Button without filling any information.
		Then  "This value should not be blank." error message should be displayed.	

	#User Story :
	#
	#As a Truck Driver I should be able to add event
	#
	#Acceptance Criterias:
	#
	#"1-Truck Driver can add event by using Add Event button
	#2-Truck Driver should see the update in both general information page and Activity tab related
	#add event."
	@TR-263 @TR-249
	Scenario: US-31-Truck Driver Add Event function Test Case3
		Given Navigate to Fleet Vehicle Costs.
		When  Click on that specific Vehicle Cost.
		Then  Truck driver can see the Event under the General.
		When  Click on the Activity Button on that specific VehiclVehicle Cost page.e Cost page.
		Then  Truck driver can see the Event under the Activity.
		