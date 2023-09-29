package Sdet_Methods.AnnotationsSDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amzon {
	WebDriver driver;
	@BeforeClass
	public void testSetup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GURUBHARAT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	}
	
	@BeforeMethod
  public void openBrowser(){
		driver.get("https://www.amezon.com");
  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
 }
	@Test
  public void signUp() throws InterruptedException{
  driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[17]")).click();
  Thread.sleep(2000);
  driver.findElement(By.name("field-keywords")).click();
  Thread.sleep(1000);
  driver.findElement(By.name("field-keywords")).sendKeys("laptops");
  Thread.sleep(1000);
  driver.findElement(By.id("nav-search-submit-button")).click();
  Thread.sleep(2000);

 

  }
	@AfterMethod
  public void postSignUp()
  {
WebElement us = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]"));
 System.out.println(us.getText());
}

 

 @AfterClass
 public void afterClass(){
  driver.close();
}

 

}

