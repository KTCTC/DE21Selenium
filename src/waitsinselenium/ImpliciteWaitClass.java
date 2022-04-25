package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImpliciteWaitClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");		
		
		driver.findElement(By.id("email")).sendKeys("KTCTC");	
		
		driver.findElement(By.name("pass")).sendKeys("KT1234");		
		
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		driver.close();
		
		
		/*
		 * ChromeOptions op = new ChromeOptions(); op.addArguments("--no-sandbox");
		 * 
		 * WebDriver driver1 = new ChromeDriver(op);
		 */
	}

}
