#-------------------------
# Example-project step definitions
#-------------------------

Given /^I open the Oelan website$/ do
	visit 'https://www.oelan.nl/'
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


#-------------------------
# Opdracht-1 step definitions
#-------------------------

#-------------------------
# Opdracht-2 step definitions
#-------------------------

#-------------------------
# Opdracht-3 step definitions
#-------------------------

#-------------------------
# Opdracht-4 step definitions
#-------------------------

#-------------------------
# Opdracht-5 step definitions
#-------------------------

#-------------------------
# Opdracht-6 step definitions
#-------------------------

# Some use full Ruby / Capybara code :) Only for the once who looked below the following line
# ----
# capybara cheatsheet: https://gist.github.com/zhengjia/428105

# wait for specific text to be gone from page
	# while page.has_content?('Bezig met verwerken...')
		# sleep(1)
	# end 

	
# check or do actions in specific part of website (css based)
	# within('#zoek_uw_treinreis') do
	# page.should have_text('Zoek uw treinreis')
	# end
	
# click_button('Search')

# fill_in 'userName', :with => username
# fill_in 'password', :with => password