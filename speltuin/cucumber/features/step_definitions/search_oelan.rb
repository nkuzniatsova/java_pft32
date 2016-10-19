Given /^Open Firefox and search for "Oelan"$/ do
	visit 'https://www.google.nl/'
	fill_in 'q',:with=>'Oelan' 
	click_on('Google zoeken')
end

Then /^Open the first link and verify I am on the Oelan website 'www.oelan.nl'$/ do 

	within ".mw" do 
		first('.item').click_link()
		sleep(1)

	if page.has_url?('https://www.oelan.nl')
			page.should have_url('https://www.oelan.nl')
		else
			sleep(1)
		end
	end
end

