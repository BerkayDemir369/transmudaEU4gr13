Feature:

  Background:
		#@TR-174
    Given the user login as a "driver"
    Then the user should be able to login


		
		

	#User Story : 
	#
	#As a Truck Driver I should be able to view any vehicle costs in the grid.
	#
	# 
	#
	#Acceptance Criterias:
	#
	#"1-Truck Driver can view any vehicle costs in the grid by using eye sign inside … sign.
	#2-Truck Driver can not delete vehicle costs in the grid by using recycle bin inside … sign.
	#3-Truck Driver can not edit vehicle costs in the grid by using edit inside ... sign."
  @TR-247 @TR-246
  Scenario: US-28-Truck Driver view specific vehicle costs Test Case1
    When Navigate to Fleet Vehicle Costs.
    Then the user should be able to see costs information
    When Move to ... sign and click on Eye Button of any Vehicle Costs.
    Then Truck driver can view specific Vehicle Cost.

	#User Story :
	#
	#As a Truck Driver I should be able to view any vehicle costs in the grid.
	#
	#Acceptance Criterias:
	#
	#"1-Truck Driver can view any vehicle costs in the grid by using eye sign inside … sign.
	#2-Truck Driver can not delete vehicle costs in the grid by using recycle bin inside … sign.
	#3-Truck Driver can not edit vehicle costs in the grid by using edit inside ... sign."
  @TR-248 @TR-246
  Scenario: US-28-Truck Driver view specific vehicle costs Test Case2
    When Navigate to Fleet Vehicle Costs.
    Then the user should be able to see costs information
    When Move to ... sign and click on Delete Button of any Vehicle Costs.
    Then Truck driver can not delete Vehicle Cost.
    When Move to ... sign and click on Edit Button of any Vehicle Costs.
    Then Truck driver can not edit Vehicle Cost.