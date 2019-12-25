package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//@Listeners(ListenerD.class)
public class TestngD {

	WebDriver driver;
	
	@BeforeClass(groups = {"Contac","Da"})
	public void drivermethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Prasanth\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.totaralearning.com/");
		driver.manage().window().maximize();
	}
	

	
	@Test(priority = 1,description = "Verfiy Contact",dataProvider = "data",groups = {"Contac","Da"})
	public void contactUs(String str) {
		System.out.println(str);
		WebElement contact = driver.findElement(By.xpath("//nav[@id='block-utilities']//a[@href='/about/contact-us']"));
		contact.click();
	}
	
	/*
	 * @Test(priority = 2,dependsOnMethods = "contactUs") public void contactU1() {
	 * WebElement contact = driver.findElement(By.
	 * xpath("//li[@class='has-double-column-children has-hidden-parent js-toggle-promotion-slot-3 menu__item is-expanded active-trail']//a[@href='/about/contact-us']"
	 * )); contact.click(); }
	 */
	
	
	@AfterClass(groups = {"Contac","Da"})
	public void closeBroswer() {
		driver.quit();
	}
	
	@DataProvider(name ="data")
	public Object data() {
		
		Object[] d = {"sdifuhu","sdiufhiuds","686"};
		
		return d;
		
	}
	
	
}
