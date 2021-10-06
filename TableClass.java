package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		WebElement tabel=driver.findElement(By.xpath("//table[@id='table_id']"));
		tabel.findElements(By.xpath("//table[@id='table_id']//tr"));
		List<WebElement> ColumnCount = tabel.findElements(By.xpath("//table[@id='table_id']//tr[1]/th"));
		System.out.println(ColumnCount.size());
		List<WebElement> RowCount = tabel.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println(RowCount.size());
        WebElement FindElement=tabel.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td"));// text based x	path.																																												
		// String string = FindElement.getText();
		System.out.println(FindElement.getText());
		List<WebElement> progressval = driver.findElements(By.xpath("//table[@class='display']//tr/td[2]"));
		for (int i = 0; i < progressval.size(); i++) {
			String text = progressval.get(i).getText();//To get the value and store them in text we are using this
			String replaceAll = text.replaceAll("%", " ");
			System.out.println(replaceAll);
			//int j=Integer.parseInt(replaceAll);  
			//int minvalue=Collections.min(j);
		}
		
		
	}
	
}
