package seleniumDemo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import jdk.nashorn.internal.runtime.logging.Logger;

@Listeners(seleniumDemo.ListenerDemo.class)
@Test(groups = {"Reg1"})
public class DriverClass {

	static ExtentReports extent;
	ExtentTest test;
	ExtentHtmlReporter htmlReporter;
	WebDriver driver;
	@BeforeMethod
	public void driverS() {
		System.setProperty("webdriver.chrome.driver", "D:\\Prasanth\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.totaralearning.com/");
		driver.manage().window().maximize();
		
		File file = new File("C:/sindu/TetsNgDemo/target/ExtentReportResults.html");

		htmlReporter = new ExtentHtmlReporter(file);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle("Title");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("Exten et");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("AUT", "QA");
		
	}


	@Test(priority = 1, description = "UIhyd",groups = {"Reg"},dataProvider = "count")
	public void driverMethod(String author,String searchKey) {

		System.out.println(author+" "+searchKey);

		test = extent.createTest("Test");
		test.log(Status.PASS, "Passes");


	}

	@AfterMethod
	public void trungage() {
		driver.quit();
	}

	@DataProvider(name="count")
	public Object[][] data() {

		Object[][] obj = new Object[][]{
			{ "Guru99", "India" },
			{ "Krishna", "UK" },
			{ "Bhupesh", "USA" }
		};


		return obj;
	}

}
