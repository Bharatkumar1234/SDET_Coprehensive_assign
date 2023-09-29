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

public class Guru99 {

 WebDriver driver;

 
  @BeforeClass
public void testSetup(){
 System.setProperty("webdriver.chrome.driver","C:\\Users\\GURUBHARAT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
  driver=new ChromeDriver();
 driver.manage().window().maximize();

 

}

 

  @BeforeMethod
 public void openBrowser(){
 driver.get("https://demo.guru99.com/selenium/newtours/reservation.php");
  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
}

 

  @Test
  public void signUp() throws InterruptedException{
  driver.findElement(By.xpath("//*[@value='oneway']")).click();
  Thread.sleep(2000);
  driver.findElement(By.name("passCount")).sendKeys("3");
  Thread.sleep(2000);
 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
  Thread.sleep(2000);

 

}

 

  @AfterMethod
  public void postSignUp(){
WebElement us = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font"));




  String expected = us.getText();

 System.out.println(expected);
}

 

@AfterClass
  public void afterClass(){
  driver.close();
}

 

}
