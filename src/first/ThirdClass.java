package first;

import javax.xml.ws.handler.MessageContext.Scope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver = new  ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*
		 * By em = By.id("email");
		 * 
		 * WebElement emailTextBox = driver.findElement(em);
		 * 
		 * emailTextBox.sendKeys("KTCTC");
		 */
		
		driver.findElement(By.id("email")).sendKeys("KTCTC");
		
		/*
		 * By ps = By.name("pass");
		 * 
		 * WebElement passWordTextBox = driver.findElement(ps);
		 * 
		 * passWordTextBox.sendKeys("KTCTC1232345345");
		 */
		
		driver.findElement(By.name("pass")).sendKeys("KT1234");
		
		
		
		//By bt = By.name("login");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		
		boolean flag = loginButton.isEnabled();	
		System.out.println(flag);
		
		loginButton.click();
		
		driver.close();
		
		

	}
	
	
	
	

}
