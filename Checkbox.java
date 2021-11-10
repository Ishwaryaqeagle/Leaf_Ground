package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean select=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isEnabled();
		if(select=true)
		{
		System.out.println("Selenium is checked");
		}
		String webele=driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).getText();
		System.out.println(webele);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		System.out.println("selected all check box");

	}

}
