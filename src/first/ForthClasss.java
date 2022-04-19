package first;

import javax.xml.ws.handler.MessageContext.Scope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForthClasss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver = new  ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.linkText("Facebook Lite")).click();
		
		
		driver.close();
		
		

	}
	
	
	
	

}
