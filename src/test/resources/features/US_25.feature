Feature: 

	Background:
		#@TR-185

		Given the user login as a "driver"
		Then the user should be able to login
		

	#User Story : 
	#
	#As a Truck Driver I should be able to get Vehicle Costs informations
	#
	# 
	#
	#Acceptance Criterias:
	#
	#1-Truck driver can see vehicle costs informations once navigate to vehicle page
	#2-Truck driver can change page number for getting following vehicle costs informations
	#3-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TR-199 @TR-200
	Scenario: US-025-Truck Driver Vehicle Costs Page Test Case
		
		Given navigate "Fleet" to "Vehicle Costs"
		When  click on the Page button on the Vehicle Costs page
		Then truck driver can change page number 
		When click on the View Per Page button on the Vehicle Costs page
		Then truck driver can change the entity number
		When click on the Export Grid CSV button on the Vehicle Costs page
		Then truck driver can get all informations to own email adress
		When click on the Export Grid XLSX button on the Vehicle Costs page
		Then truck driver can get all informations to own email adress