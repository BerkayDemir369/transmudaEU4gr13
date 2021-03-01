Feature: 

	Background:
		#@TR-174
		Given the user login as a "sales manager"
		Then the user should be able to login
		
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#informations
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Store manager/Sales Manager can see vehicle costs informations once navigate to vehicle page
	#2-Store manager/Sales Manager can change page number for getting following vehicle costs informations
	#3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Store manager/Sales Manager can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
	@TR-224
	Scenario: Us-33 as a Salesmanager/storemanager Get Vehicle Costs Information
		When the user navigates to "Fleet" , "Vehicle Costs"
		Then the user should be able to see costs information
		When the user click Page button to next page or previous page
		Then the user should be able to see next or previous page
		And the user click View Per Page button
		Then the user should be able to see entity number of View Per page
		When the user click any entity number in the View Per Page drop List
		Then System should be change the entity number of View Per Page
		And the user click Export Grid button
		When the user select any options of Export Grid Button
		Then "×Export started successfully. You will receive email notification upon completion." Email message should be displayed
		
		
		