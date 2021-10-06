package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		
		

	}

}
