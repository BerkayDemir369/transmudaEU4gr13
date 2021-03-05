Feature: 

	Background:
		#@TR-185

		Given the user login as a "driver"
		Then the user should be able to login
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use sidebar widget, pins and favorite pages
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Truck driver can pin the page by using pin sign
	#3-Truck driver can make the page favorite by using favorite sign
	# 
	@TR-241 @TR-243
	Scenario: US-027 Truck driver can add Recent Email, Sticky Note, Task List  test case
		
		Given truck driver navigate Fleet to Vehicle Costs
		When  click on the Add sign on the Vehicle Costs page
		And   click on the Recent emails Add Button on the  Sidebar Widgets 
		And   click on the Sticky Note Add Button on the Sidebar Widgets 
		And   click on the Task list Add Button on the Sidebar Widgets 
		And   clikc on the close button on the Sidebar Widgets 
		Then  truck driver can add Recent Email, Sticky Note and Task list	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to use sidebar widget, pins and favorite pages
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Truck driver can pin the page by using pin sign
	#3-Truck driver can make the page favorite by using favorite sign
	# 
	@TR-242 @TR-243
	Scenario: US-27  Truck Driver I should be able to page pin, favorite test case
		Given truck driver navigate Fleet to Vehicle Costs
		When click on the pin sign on the Vehicle Costs page
		And  click on the Favorite sign on the Vehicle Costs page
		Then truck driver can pin, favorite the page 