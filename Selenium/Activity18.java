package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity18 {
	 public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://v1.training-support.net/selenium/selects");
		  System.out.println("Title of the page is:" +driver.getTitle());
		// Find the dropdown
	        WebElement selectElement = driver.findElement(By.id("multi-select"));
	        // Pass the WebElement to the Select object
	        Select multiSelect = new Select(selectElement);

	        // Select "Javascript" using visible text
	        multiSelect.selectByVisibleText("Javascript");
	        // Select 4th, 5th, and 6th index options
	        for(int i = 4; i<=6 ; i++) {
	            multiSelect.selectByIndex(i);
	        }
	        // Select "NodeJS" using value attribute
	        multiSelect.selectByValue("node");
	        // Print the selected options
	        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
	        System.out.println("Selected options are: ");
	        for(WebElement option : selectedOptions) {
	            System.out.println(option.getText());
	        }

	        // Deselect the 5th index option
	        multiSelect.deselectByIndex(5);
	        // Print the selected options
	        selectedOptions = multiSelect.getAllSelectedOptions();
	        System.out.println("Selected options are: ");
	        for(WebElement option : selectedOptions) {
	            System.out.println(option.getText());
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


