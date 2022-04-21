package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver = new  ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		
		
		
		WebElement el = driver.findElement(By.xpath("//form//div//input"));
		el.sendKeys("ktctc");
		
		List<WebElement> elements = driver.findElements(By.xpath("//form//div//input"));
		
		for (int i=0; i<elements.size();i++)
		{
		 WebElement ee = elements.get(i);
		 
		 ee.sendKeys("KTCTC " + i);
			
		}
		
		

	}

}
