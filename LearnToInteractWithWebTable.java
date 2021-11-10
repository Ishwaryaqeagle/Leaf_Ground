package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToInteractWithWebTable {

	public static void main(String[] args) {
		String compName = "Ernst Handel";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		List<WebElement> allSiblings = driver.findElements(By.xpath("//td[text()='"+compName+"']/following-sibling::td"));
		for (WebElement eachSibling : allSiblings) {
			System.out.println(eachSibling.getText());
		}
	}
}
