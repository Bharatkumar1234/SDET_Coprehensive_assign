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

public class Moneycontrol {
    WebDriver driver;

    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GURUBHARAT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openBrowser() {
        driver.get("https://www.moneycontrol.com/");
        System.out.println("We are currently on the following URL: " + driver.getCurrentUrl());
    }

    @Test
    public void signUp() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[1]/span/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/section/div/div[3]/aside/div[11]/div[3]/p/a")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void postSignUp() {
        WebElement us = driver.findElement(By.xpath("/html/body/div/main/main/section[2]/div/div/div"));
        System.out.println(us.getText());
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}

