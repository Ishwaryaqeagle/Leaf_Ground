package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement draggable=driver.findElement(By.id("draggable"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(draggable,90,90).perform();
		
		

	}

}
