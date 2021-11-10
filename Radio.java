package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//img[@alt='Radio Button']")).click();
WebElement radio1=driver.findElement(By.xpath("//input[@class='myradio']"));
radio1.click();
//		driver.findElement(By.xpath())
String str=driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getAttribute("value");
if(str.equals(0))
{
	System.out.println("UnChecked");
	}
else
{
	System.out.println("Checked");
	}

	}

}
