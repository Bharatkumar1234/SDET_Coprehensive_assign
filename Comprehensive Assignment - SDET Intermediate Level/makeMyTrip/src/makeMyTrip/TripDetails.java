package makeMyTrip;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TripDetails {
	

	    public static void main(String[] args)  {
	       
System.setProperty("webdriver.chrome.driver", "C:\\Users\\GURUBHARAT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        
	        ChromeOptions options = new ChromeOptions();
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.navigate().refresh();
	        
	        driver.get("https://www.makemytrip.com/");
	        driver.switchTo().frame("notification-frame-~5584c898");
	        System.out.println("Frame Switched Successfully");
	        WebElement popup = driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
	        if (popup.isDisplayed()) {
	            popup.click();
	            HighlightMethod(popup);
	            System.out.println("Popup Clicked SuccessFully");
	            driver.switchTo().defaultContent();

	            Set<String> totalWindows = driver.getWindowHandles();
	            System.out.println(totalWindows.size());
	            for (String windows : totalWindows) {
	                driver.switchTo().window(windows);
	                String ActualTittle = driver.getTitle();
	                if (ActualTittle.equalsIgnoreCase("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday")) {
	                    System.out.println("Page Tittle Matched");
	                } else {
	                    System.out.println("Driver reference currently matched");
	                }
	            }

	            System.out.println("Popup Handled SuccessFully");
	        } else {
	            System.out.println("popup not Displayed");
	        }
	    


	        try {
	            
            WebElement flightsTab = driver.findElement(By.xpath("[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[1]/div/a/span[1]"));
            flightsTab.click();

	            
	            WebElement roundTripRadio = driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
	            roundTripRadio.click();

	            
	            WebElement fromInput = driver.findElement(By.id("fromCity"));
	            fromInput.sendKeys("HYD");

	           
	            WebElement fromAutoSuggest = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][1]"));
	            fromAutoSuggest.click();

	            
	            WebElement toInput = driver.findElement(By.id("toCity"));
	            toInput.sendKeys("MAA");

	            
	            WebElement toAutoSuggest = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][1]"));
	            toAutoSuggest.click();

	            
	            WebElement departureDateInput = driver.findElement(By.xpath("//input[@id='departure']"));
	            departureDateInput.sendKeys("15-May-2023");	            
	            WebElement returnDateInput = driver.findElement(By.xpath("//input[@id='return']"));
	            returnDateInput.sendKeys("20-May-2023");

	            
	            WebElement searchButton = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
	            searchButton.click();

	            

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            
	            driver.quit();
	        }
	        
	        
	    }

		private static void HighlightMethod(WebElement popup) {
			ChromeOptions options = new ChromeOptions();
			WebDriver driver = new ChromeDriver(options);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].style.border='2px solid red'", popup);
	        System.out.println("highlighted element");
			
		}
	   
	    
	}



