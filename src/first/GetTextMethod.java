package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver = new  ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		String txt = driver.findElement(By.xpath("//*[contains(text(),'connect and share with the')]")).getText();
		
		System.out.println(txt);
		
		

	}

}
