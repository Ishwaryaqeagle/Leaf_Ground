package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[@id='Click1']")).click();

	}

}
