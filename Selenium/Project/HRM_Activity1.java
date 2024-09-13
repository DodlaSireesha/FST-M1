package Project;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRM_Activity1 {
	WebDriver driver;
	
	@BeforeClass
	public void Beforemethod() {
		WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
	@Test
	public void Activity1() {
		String Title = driver.getTitle();
		System.out.println("Title of the page is:" + Title);
		Assert.assertEquals("OrangeHRM", Title);
		
	}
    @AfterClass
    public void aftermethod() {
    	driver.quit();
    }

}
