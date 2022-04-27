package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableClass4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		// Write program to print all details of all companies
		// Write program to print company name and current price of companies which has current price > 200
		// // Write program to print company name and current price of companies which has current price > 200 and percentace change >3
		
		printCompanyNameANdPrice(driver);
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
		
		for (WebElement each:rows)
		{
			String cName = each.findElement(By.xpath("td/a")).getText();
			String cntPrice = each.findElement(By.xpath("td[4]")).getText();
			System.out.println(cName);
			System.out.println(cntPrice);
		}
	

	}
	
	public static void printCompanyNameANdPrice(WebDriver driver)
	{
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
		
		for (int i=1;i<=rows.size();i++)
		{
			String cName = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+i+"]/td[1]/a")).getText();
			
			String cntPrice = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+i+"]/td[4]")).getText();
			
			System.out.println("Company Name = "+cName+" Current Price = "+cntPrice);
		}
		
	}
	
	
	

}
