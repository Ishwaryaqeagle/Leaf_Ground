package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

		public static void main(String[] args) throws Exception {
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
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.linkText("Phone")).click();
			//driver.findElement(By.xpath("(//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("(//input[@type='text'])[35]")).sendKeys("9876543210");
			Thread.sleep(3000);
			WebElement find = driver.findElement(By.xpath("(//button[text()='Find Leads']"));
			find.click();
			driver.findElement(By.xpath("((//a[@class='linktext'])[4]")).click();
			driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Ishwar");
			driver.findElement(By.xpath("//input[@value='Update']")).click();

	}

}
