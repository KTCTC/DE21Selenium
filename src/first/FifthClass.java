package first;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class FifthClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver = new  ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("Voting Information")).click();
		
		
		driver.close();
		
		

	}
	
	
	
	

}
