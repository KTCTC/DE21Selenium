package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDiaplayedIsSelectedIsEnabled2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@value='checkbox3']"));
		
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isSelected());
		System.out.println(checkBox.isEnabled());
		
		checkBox.click();
		
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isSelected());
		System.out.println(checkBox.isEnabled());
		

	}

}
