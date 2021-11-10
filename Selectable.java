package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/selectable.html");
		WebElement Select1=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement Select2=driver.findElement(By.xpath("//li[text()='Item 2']"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(Select1).click(Select2).build().perform();
	}

}
