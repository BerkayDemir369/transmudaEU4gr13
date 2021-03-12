Feature: 

	#*User Story :* 
	#
	#As a Store manager/Sales Manager I should not be able to access Vehicle odometer page
	#
	# *_Acceptance Criterias:_*
	#
	#1-Only truck driver can access to vehicle odometer page
	# 2-Sales manager or store manager can not access vehicle odometer page
	@TR-207 @TR-208
	Scenario: Us-24  Only truck driver can access Vehicle Odometer Page Test Case-1
		Given the user login as a "driver"
		Then the user should be able to login
		When the user navigates to "Fleet" , "Vehicle Odometer"
		Then expected title should be "Vehicle Odometer - Entities - System - Car - Entities - System"

	#*User Story :* 
	#
	#As a Store manager/Sales Manager I should not be able to access Vehicle odometer page
	#
	# *_Acceptance Criterias:_*
	#
	#1-Only truck driver can access to vehicle odometer page
	# 2-Sales manager or store manager can not access vehicle odometer page
	@TR-206 @TR-208
	Scenario: Us-24 Store manager/Sales Manager Vehicle Odometer Page  Test Case-2
		Given the user login as a "sales manager"
		Then the user should be able to login
		When the user navigates to "Fleet" , "Vehicle Odometer"
		Then "You do not have permission to perform this action." message should be displayed
		
		