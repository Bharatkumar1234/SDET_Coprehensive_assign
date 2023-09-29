import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTripAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Optional: Run Chrome in headless mode (comment this if you want to see the browser)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the MakeMyTrip website
        driver.get("https://www.makemytrip.com/");

        try {
            // Click on the "Flights" tab
            WebElement flightsTab = driver.findElement(By.xpath("//span[text()='Flights']"));
            flightsTab.click();

            // Select "ROUND TRIP"
            WebElement roundTripRadio = driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
            roundTripRadio.click();

            // Enter "HYD" in the "From" input field
            WebElement fromInput = driver.findElement(By.id("fromCity"));
            fromInput.sendKeys("HYD");

            // Wait for the auto-suggestion dropdown and select the first option
            WebElement fromAutoSuggest = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][1]"));
            fromAutoSuggest.click();

            // Enter "MAA" in the "To" input field
            WebElement toInput = driver.findElement(By.id("toCity"));
            toInput.sendKeys("MAA");

            // Wait for the auto-suggestion dropdown and select the first option
            WebElement toAutoSuggest = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][1]"));
            toAutoSuggest.click();

            // Select departure date (e.g., May 15, 2023)
            WebElement departureDateInput = driver.findElement(By.xpath("//input[@id='departure']"));
            departureDateInput.sendKeys("15-May-2023");

            // Select return date (e.g., May 20, 2023)
            WebElement returnDateInput = driver.findElement(By.xpath("//input[@id='return']"));
            returnDateInput.sendKeys("20-May-2023");

            // Click the "Search" button
            WebElement searchButton = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
            searchButton.click();

            // Verify the search page is displayed as expected (You can add your verification logic here)
            // ...

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }
}
