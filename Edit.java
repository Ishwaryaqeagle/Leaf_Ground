package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		String text = driver.findElement(By.xpath("//input[@name='username']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[ @value='Clear me!!']")).clear();
		//driver.findElement(By.xpath("//input[ @disabled='true']")).getText();
		boolean Disvalue=driver.findElement(By.xpath("//input[ @disabled='true']")).isEnabled();
		if(Disvalue==true)
		{
			System.out.println("The get value is enabled");
		}
		else
		{
			System.out.println("The get value is disabled");
		}
		
		
	}

}
