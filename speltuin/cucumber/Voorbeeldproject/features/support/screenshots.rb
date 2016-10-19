#Screenshot maken aan het eind van elk scenario. 
#Gebruik 'After (@tagname) do |scenario|; indien je alleen screenshots wilt van getagde scenario’s.
#Indien je alleen van de failed scenario's een screenshot wilt, kan je d.m.v. '#' de regels m.b.t. passed scenario screenshots uitzetten.

After do |scenario|
  if Capybara.javascript_driver == :selenium
    if(scenario.failed?)
      Dir::mkdir('screenshots') if not File.directory?('screenshots')
      page.driver.browser.save_screenshot("screenshots/FAILED_#{(Date.today).strftime("%d-%m-%Y")}_#{scenario.name.gsub(' ','_').gsub(/[^0-9A-Za-z_]/, '')}.png")
      embed("screenshots/FAILED_#{(Date.today).strftime("%d-%m-%Y")}_#{scenario.name.gsub(' ','_').gsub(/[^0-9A-Za-z_]/, '')}.png", "image/png", "SCREENSHOT")
    end
#     if(scenario.passed?)
#      Dir::mkdir('screenshots') if not File.directory?('screenshots')
#      page.driver.browser.save_screenshot("screenshots/PASSED_#{(Date.today).strftime("%d-%m-%Y")}_#{scenario.gsub(' ','_').gsub(/[^0-9A-Za-z_]/, '')}.png")
#      embed("screenshots/PASSED_#{(Date.today).strftime("%d-%m-%Y")}_#{scenario.name.gsub(' ','_').gsub(/[^0-9A-Za-z_]/, '')}.png", "image/png", "SCREENSHOT")
#     end
  end
end
