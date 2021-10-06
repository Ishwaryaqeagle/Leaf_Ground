package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@link='blue'][1]")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		

	}

}
