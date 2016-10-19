ENV['CONFIG'] ||='development'
ENV['NOTIFY'] ||="false"
ENV['WAIT'] ||="10"

ENV['URL'] ||="http://google.nl"

ENV['BROWSER'] ||="firefox"

require 'capybara/dsl'
require 'capybara/cucumber'
require 'capybara/rspec'
require 'selenium-webdriver'
# require 'capybara/poltergeist'
require 'chronic'

Capybara.default_selector = :css
Capybara.default_driver = :selenium
Capybara.default_max_wait_time = ENV['WAIT'].to_i

# if ENV['BROWSER'] == "chrome"
  # Capybara.register_driver(:selenium) { |app|
  # Capybara::Selenium::Driver.new(app, :browser => :chrome) }
# end

# if ENV['BROWSER'] == "ie"
  # Capybara.register_driver(:selenium) { |app|
  # Capybara::Selenium::Driver.new(app, :browser => :internet_explorer) }
# end

if ENV['BROWSER'] == "firefox"
  Capybara.register_driver(:selenium) { |app|
  Capybara::Selenium::Driver.new(app, :browser => :firefox) }
end

# if ENV['BROWSER'] == "headless"
#  Capybara.register_driver :poltergeist do |app|
#    Capybara::Poltergeist::Driver.new(app, {debug: false})
#  end
#  Capybara.javascript_driver = :poltergeist
# end
