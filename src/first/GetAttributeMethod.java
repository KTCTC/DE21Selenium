package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		ChromeDriver driver = new  ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		WebElement el = driver.findElement(By.id("email"));
		String placeholderAttribute = el.getAttribute("placeholder");
		
		String classAtribute = driver.findElement(By.id("email")).getAttribute("class");
		
		System.out.println(placeholderAttribute);
		System.out.println(classAtribute);
		

	}

}
