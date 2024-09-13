package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRM_Activity3 {

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
		WebElement Username = driver.findElement(By.id("txtUsername"));
		WebElement Password = driver.findElement(By.id("txtPassword"));
		Username.sendKeys("orange");
		Password.sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement Homepage = driver.findElement(By.id("welcome"));
		System.out.println("Title is:" + Homepage);
		Assert.assertEquals("Welcome Rachel", Homepage.getText());
		
		
	}
    @AfterClass
    public void aftermethod() {
    	driver.quit();
    }

}




