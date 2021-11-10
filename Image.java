package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);		
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Images']"))).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		System.out.println("I am a broken image");
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
		
		
	}

}
