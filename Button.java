package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Button {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		driver.findElement(By.xpath("//button[@id='position']")).getLocation();
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
//		caps.setCapability(ChromeOptions.CAPABILITY, options);
	}
}
