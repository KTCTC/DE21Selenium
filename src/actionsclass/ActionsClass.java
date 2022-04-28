package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement clickbutton = driver.findElement(By.xpath("//*[starts-with(text(),'Click Me')]"));
		
		Actions act = new Actions(driver);
		
		
		//act.click(clickbutton).build().perform();
		
		act.moveToElement(clickbutton).click().build().perform();
		
		
		act.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		
		act.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().build().perform();

	}

}
