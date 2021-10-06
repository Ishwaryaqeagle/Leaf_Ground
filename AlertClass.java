package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement findElement1 = driver.findElement(By.id("iframe"));
		driver.switchTo().frame(findElement1);
		driver.findElement(By.xpath("//body[@contenteditable=('false')]")).click();
		

	}

}

