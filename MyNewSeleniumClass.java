package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyNewSeleniumClass {

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title2=driver.getTitle();
		System.out.println("Landed in right place" +title2);
		//driver.close();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Object webElement ;
		driver.findElement(By.linkText("Leads")).click();
		//create lead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ishwarya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manimeharan");
		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select var=new Select(findElement);
		var.selectByVisibleText("Employee");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		WebElement Element1 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select selectElement= new Select(Element1);
		selectElement.selectByVisibleText("ZRZ - Zaire");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.className("smallSubmit")).click();
		
		//driver.findElement(By.className("firstName")).click();
		//driver.findElement(By.className("firstName")).sendKeys("Ishwarya");
		//driver.findElement(By.className("x-btn-text")).click();
		//driver.findElement(By.className("linktext")).click();
		
	    
	}
		
	}

