package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	 WebElement sourceElement = driver.findElement(By.xpath("//*[@id='fourth']/a"));
	 
	 WebElement destinationElement = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceElement, destinationElement).build().perform();
		
		 WebElement sourceElement1 = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		 
		 WebElement destinationElement1 = driver.findElement(By.xpath("//*[@id='bank']/li"));
		 
		 act.clickAndHold(sourceElement1).moveToElement(destinationElement1).release().build().perform();
		
		
		
	}

}
