package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {
	public static void main(String[] args) {
		WebDriverWait wait;
		WebDriver driver = new ChromeDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get(" https://v1.training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is:" +driver.getTitle());
		// Find the toggle button and click it
        WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));
        toggleButton.click();
        // Wait for the toggleButton to disappear
        WebElement dynamicBox = driver.findElement(By.id("dynamicCheckbox"));
        wait.until(ExpectedConditions.invisibilityOf(dynamicBox));
        System.out.println(dynamicBox.isDisplayed());
        // Click the button again
        toggleButton.click();
        // Wait for the element to appear
        wait.until(ExpectedConditions.visibilityOf(dynamicBox));
        System.out.println(dynamicBox.isDisplayed());

        // Close the browser
        driver.close();
       
       
	}

}
