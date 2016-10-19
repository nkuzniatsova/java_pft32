Given /^I open the Laptop shop website$/ do
	visit url
end

Then /^I see '(.*?)' on the website$/ do |text| 
	# waiting for homepage to load properly
	if page.has_content?(text)
		page.should have_text(text)
	else
		sleep(2)
	end
	
	# sleep / wait on purpose for workshop
	sleep(5)
end