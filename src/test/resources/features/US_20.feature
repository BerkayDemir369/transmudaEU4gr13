Feature: 

	#User Story : 
	#
	#As a Truck Driver When I click on any vehicle odometers in the grid, I should be able to see general information.
	#
	# 
	#
	#Acceptance Criteria:
	#
	#1-Truck Driver can see all informations about specific vehicle odometer
	@TR-269
	Scenario: US-020 Truck Driver specific vehicle odometer function 
		 Given the user login as a "driver"
		    Then the user should be able to login
		        Given navigate  Fleet to  Vehicle Odometer
		        Then The user should see all information Vehicle Odometer page
		