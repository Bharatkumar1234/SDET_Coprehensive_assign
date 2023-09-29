package ExtentReports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Sdet_Methods.AnnotationsSDET.Guru99;
import Sdet_Methods.AnnotationsSDET.Moneycontrol;
import Sdet_Methods.AnnotationsSDET.amzon;

 

 public class Reportfile {
    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\GURUBHARAT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
        driver = new ChromeDriver();
        extent = new ExtentReports();
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("test-output/ExtentReport.html");
        extent.attachReporter(reporter);
        test = extent.createTest("Test Case Name");
    }

    @Test
    public void testExample() {
        amzon det=new amzon();
        Guru99 details=new Guru99();
        Moneycontrol data=new Moneycontrol();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Failed");
        }
        driver.quit();
        extent.flush();
    }
}
