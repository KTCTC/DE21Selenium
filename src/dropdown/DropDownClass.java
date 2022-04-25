package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Select sel = new Select(driver.findElement(By.name("country")));
		
		sel.selectByIndex(1);
		
		sel.selectByValue("BANGLADESH");
		
		sel.selectByVisibleText("BASSA DE INDIA");
		
		
		sel.deselectByVisibleText("BASSA DE INDIA");
		

	}

}
