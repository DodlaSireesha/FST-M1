package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity19 {
	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		  System.out.println(" Alert page is:" +driver.getTitle());
		  // Find and click the button to open the alert
	        driver.findElement(By.id("confirm")).click();

	        // Switch focus to the alert
	        Alert confirmAlert = driver.switchTo().alert();

	        // Print the text in the alert
	        String alertText = confirmAlert.getText();
	        System.out.println("Text in alert: " + alertText);

	        // Close the alert by clicking OK
	        confirmAlert.accept();

	        // Can also close the alert by clicking Cancel
	        // confirmAlert.dismiss();

	        // Close the browser
	        driver.quit();
}
}
