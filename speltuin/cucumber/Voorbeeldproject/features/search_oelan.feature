Feature: Example I open Firefox and search for 'Oelan' 

Scenario: Example -> Open Firefox and search for 'Oelan' 
	Given Open Firefox and search for "Oelan"
	Then Open the first link and verify I am on the Oelan website 'www.oelan.nl'