package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver = new  ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		WebElement el = driver.findElement(By.xpath("//*[contains(text(),'you connect and share with the')]"));
		
		
	String fontFamily = el.getCssValue("font-family");	
	System.out.println(fontFamily);
	String fontSize = el.getCssValue("font-size");	
	System.out.println(fontSize);
	
	String color = el.getCssValue("color");	
	System.out.println(color);
	
		
		
		

	}

}
