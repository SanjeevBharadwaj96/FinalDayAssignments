
	Feature: Red bus
	Scenario: user enters the details
	Given I am having the redbus website 
	When I am having the src as Pune and dest as Hyderabad
	Then next page should be opened 
	Given I am having the view seats option
	When I click on the required seat
	And select the boarding and dropping points
	Then control should proceed forward



