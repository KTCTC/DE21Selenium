package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		//driver.findElement(By.xpath("//*[contains(text(),'Interactions')]")).click();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Book Store Application')]"))).build().perform();
		act.click(driver.findElement(By.xpath("//*[contains(text(),'Interactions')]"))).build().perform();
		
		
		
	}

}
