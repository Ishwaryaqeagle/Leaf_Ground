package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.leafground.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
//		driver.findElement(By.xpath("//select[@id='dropdown1']")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select DD=new Select(dropdown);
		DD.selectByIndex(3);
		WebElement dropdowntext=driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select DD_text=new Select(dropdowntext);
		DD_text.selectByValue("3");
		WebElement dropdownText=driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select DD_Text=new Select(dropdownText);
		DD_Text.selectByVisibleText("Appium");
//		List<WebElement> dropdowncount=driver.findElements(By.xpath("//select[@class='dropdown']"));
//		Select count=new Select(dropdowncount);
//		Select select =new Select (driver.findElements(By.xpath("//select[@class='dropdown']")));	
//		List<WebElement> List_Options_count=list_options.size();
		
		
	}

}
