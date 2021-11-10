package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("s");
		driver.findElement(By.xpath("//li//div[text()='Selenium']")).click();
		

	}

}
