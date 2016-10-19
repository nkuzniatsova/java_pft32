
Feature: I visit the Laptopshop website, compare 2 Chromebooks and place the cheapest in the basket

Scenario: Example -> Open Firefox and visit the Laptophop website
	Given I open the Laptop shop website <url>
	Then I see <verify_text> on the website and I search for <llaptop_type>

Examples:
url | verify_text | laptop_type
http://www.laptopshop.nl | laptopshop.nl | Chromebook


# Scenario: Opdracht 1 - Open Google and search on Oelan and click on the link of the official website 