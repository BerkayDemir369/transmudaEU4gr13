Feature: 

	Background:
		#@TR-185

		Given the user login as a "driver"
		Then the user should be able to login
		

	#User Story : 
	#
	#As a Truck Driver I should be able to use sidebar, widget, pins and favourite pages
	#
	# 
	#
	#Acceptance Criterias:
	#
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using  plus sign
	#2-Truck driver can pin the page by using pin sign
	#3-Truck driver can make the page favourite by using favourite sign
	#
	#
	@TR-197 @TR-198
	Scenario: US-018-Truck Driver sidebar widgets Test Case
		
		Given Navigate Fleet Vecihle
		When click on the sidebar widgets buttton on the vehicle page
		And click on the recent email add button
		And click on the sticky note add button
		And click on the task list add button
		And click on the close button on the sidebar widgets window
		Then truck driver can add email sticky task
			

	#User Story : 
	#
	#As a Truck Driver I should be able to use sidebar, widget, pins and favourite pages
	#
	# 
	#
	#Acceptance Criterias:
	#
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using  plus sign
	#2-Truck driver can pin the page by using pin sign
	#3-Truck driver can make the page favourite by using favourite sign
	#
	@TR-219 @TR-198
	Scenario: US-018-Truck Driver can add pin,favorite on the page Test Case
		
		Given navigate to Fleet Vehicle
		When click on the pin button on the vehicle page
		Then truck driver can pin the page 
		When click on the favorite button on the vehicle page 
		Then truck driver can make the page favorite on the vehicle page 
		