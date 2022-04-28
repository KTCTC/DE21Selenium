package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassKeyBoard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailIdElement = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		act.click(emailIdElement).keyDown(Keys.SHIFT).sendKeys("welcome to ktctc").keyUp(Keys.SHIFT).build().perform();
		
	
		
		
		
	}

}
