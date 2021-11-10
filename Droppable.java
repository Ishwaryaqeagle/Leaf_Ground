package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(draggable,droppable).perform();
		

	}

}
