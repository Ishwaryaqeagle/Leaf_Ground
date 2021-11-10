package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("Chennai Egmore");
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("Thanjavur");
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		

	}

}
