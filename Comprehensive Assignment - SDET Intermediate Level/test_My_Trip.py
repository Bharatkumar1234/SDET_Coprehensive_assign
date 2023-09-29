import pytest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

@pytest.fixture
def driver():
    
    driver = webdriver.Chrome(executable_path="C:/Users/GURUBHARAT/Desktop/Comprehensive Assignment - SDET Intermediate Level/chromedriver.exe")
    yield driver
    # Close the WebDriver after the test
    driver.quit()

def test_makemytrip(driver):
    
    driver.get("https://www.makemytrip.com/")

    
    flights_option = driver.find_element_by_xpath("//a[contains(text(),'Flights')]")
    flights_option.click()

    
    round_trip_option = driver.find_element_by_xpath("//li[@data-cy='roundTrip']")
    round_trip_option.click()

    
    from_location = driver.find_element_by_id("fromCity")
    from_location.clear()
    from_location.send_keys("HYD")
    from_location.send_keys(Keys.RETURN)

    to_location = driver.find_element_by_id("toCity")
    to_location.clear()
    to_location.send_keys("MAA")
    to_location.send_keys(Keys.RETURN)

    
    departure_date = driver.find_element_by_xpath("//span[@aria-label='Tue Sep 30 2023']")
    departure_date.click()

    
    return_date = driver.find_element_by_xpath("//span[@aria-label='Wed Oct 05 2023']")
    return_date.click()

   
    search_button = driver.find_element_by_xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
    search_button.click()

    
    assert "MakeMyTrip - Flights" in driver.title
    assert "MakeMyTrip - Flights" in driver.find_element_by_tag_name("h1").text

    

if __name__ == "__main__":
    pytest.main()
