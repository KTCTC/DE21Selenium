package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableClass3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		String ss = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr/td/a[contains(text(),'Bank')]")).getText();
		
		System.out.println(ss);
		
		String ss1 = driver.findElement(By.xpath("//table[@class='dataTable']")).findElement(By.xpath("//tbody/tr/td/a[contains(text(),'Bank')]")).getText();
		
		System.out.println(ss1);
	

	}
	
	
	

}
