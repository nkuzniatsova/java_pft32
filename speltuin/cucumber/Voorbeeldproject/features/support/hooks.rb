# Hooks are reasable just call the tags before a scenario and this will be executed first

Before do |scenario|
  if Capybara.javascript_driver == :selenium
    page.driver.browser.manage.window.maximize
  end
end

Before ('@portal_page_is_open') do
  # visit 'http://xxx.nl/login' 
  visit 'http://xxx.com/login' 
end

Before('@superuser_is_logged_in') do
  fill_in 'Gebruikersnaam', :with => 'superuser'
  fill_in 'Wachtwoord', :with => 'Super123'
  click_on('Inloggen')
end

Before('@processmanager_is_logged_in') do
  fill_in 'Gebruikersnaam', :with => 'procesbeheer'
  fill_in 'Wachtwoord', :with => 'Welkom1234'
  click_on('Inloggen')
end

Before('@configuratie_page_is_open') do
  click_on('Configuratie')
  
  #wait for config pages to load
	if page.has_content?("Gebruikers")
		page.should have_content("Gebruikers")
	else
		sleep(1)
	end	
end

Before('@gebruikers_tab_is_open') do
  click_on('Configuratie')
  
  #wait for config pages to load
	if page.has_content?("Gebruikers")
		page.should have_content("Gebruikers")
	else
		sleep(1)
	end	

  click_on('Gebruikers')
end

Before('@tab_uitslagen_back_end_is_open') do
  click_on('Configuratie')
  
  #wait for config pages to load
	if page.has_content?("Gebruikers")
		page.should have_content("Gebruikers")
	else
		sleep(1)
	end	
	
  click_on('Uitslagen')
end

Before('@tab_uitslagen_front_end_is_open') do
  click_on('Uitslagen')
end

Before('@tab_privacy_back_end_is_open') do
  click_on('Configuratie')
  click_on('Privacy')
end

Before('@tab_privacy_front_end_is_open') do
  click_on('Privacy')
end
