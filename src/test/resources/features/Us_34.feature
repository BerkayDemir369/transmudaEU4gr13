Feature: 

	Background:
		#@TR-174
		Given the user login as a "sales manager"
		Then the user should be able to login
		
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should be able to use all filtering functions
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Store Manager/Sales Manager can use Grid Settings button for arranging demanded columns.
	#2-Store Manager/Sales Manager can use Filters sign with opening Manage Filters button for filtering informations
	#3-Store Manager/Sales Manager can refresh the page by using Refresh button
	#4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TR-225 @TR-226
	Scenario: Us-34 as a Storemanager/salesmanager use all filtering functions Test Case-1
		When the user navigates to "Fleet" , "Vehicle Costs"
		Then the user should be able to see costs information
		And click Grid Settings Button
		When the user select any check box related columns
		Then selected columns should be attached on the current page	

	#*User Story :* 
	#
	#As a Store manager/Sales Manager I should be able to use all filtering functions
	#  
	#
	#*_Acceptance Criterias:_*
	#
	#1-Store Manager/Sales Manager can use Grid Settings button for arranging demanded columns.
	# 2-Store Manager/Sales Manager can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Store Manager/Sales Manager can refresh the page by using Refresh button
	# 4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TR-227 @TR-226
	Scenario: Us-34 as a Storemanager/salesmanager use all filtering functions Test Case-2
		When the user navigates to "Fleet" , "Vehicle Costs"
		Then the user should be able to see costs information
		And click Filters Button
		When the user click Manage Filters Button
		Then the user should be able to filter informations
			

	#*User Story :* 
	#
	#As a Store manager/Sales Manager I should be able to use all filtering functions
	#  
	#
	#*_Acceptance Criterias:_*
	#
	#1-Store Manager/Sales Manager can use Grid Settings button for arranging demanded columns.
	# 2-Store Manager/Sales Manager can use Filters sign with opening Manage Filters button for filtering informations
	# 3-Store Manager/Sales Manager can refresh the page by using Refresh button
	# 4-Store Manager/Sales Manager can reset the filtering settings by using Reset button
	@TR-228 @TR-226
	Scenario: Us-34 as a Storemanager/salesmanager use all filtering functions Test Case-3
		When the user navigates to "Fleet" , "Vehicle Costs"
		Then the user should be able to see costs information
		When the user click Refresh Button
		Then system should be able to refresh the page
		When the user click Reset Button
		Then system should be able to reset the filtering settings