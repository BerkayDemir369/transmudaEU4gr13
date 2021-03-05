Feature: 

	Background:
		#@TR-174
		Given the user login as a "sales manager"
		Then the user should be able to login
		
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should be able to use sidebar widget, pins and favourite pages
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Store Manager/Sales Manager can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Store Manager/Sales Manager can pin the page by using pin sign
	#3-Store Manager/Sales Manager can make the page favourite by using favourite sign
	@TR-253 @TR-254
	Scenario: US-35 Sales Manager I should be able to use sidebar widget test case
		
		 Given sales manager navigate Fleet to Vehicle Costs
		 When click on Add sign on the sidebar widgets 
		 And click on Recent Emial Add Button on the sidebar widgets window
		 And click on Sticky Note Add Button on the sidebar widgets window
		 And click on Task list Add Button on the sidebar widgets window
		 And click on Close Button on the sidebar widgets window
		 Then sales manager can use sidebar widgets on the vehicle cost page	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should be able to use sidebar widget, pins and favourite pages
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Store Manager/Sales Manager can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
	#2-Store Manager/Sales Manager can pin the page by using pin sign
	#3-Store Manager/Sales Manager can make the page favourite by using favourite sign
	@TR-255 @TR-254
	Scenario: US-35 Sales Manager  should be able to use pins and favourite pages test case
		   Given sales manager navigate Fleet to Vehicle Costs page
		   When click on the Pin Icon on the Vehicle Costs page
		   And  click on the Favourite on the Vehicle Costs page
		   Then sales manager can pin, favourite the Vehicle Costs page

		   When click on the Username Dropdown Icon on Vehicle Costs page
		   And select the Logout on the Dropdown list 
		   Then user able to log out

		   Given the user login as a "sales manager"
		   Then user should be able to log in
		   When click on  favourites dropdown
		   And click  on  favourites button  
		   Then user should be able to see favourites top page and page pin
		