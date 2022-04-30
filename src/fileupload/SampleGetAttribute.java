package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/java-tutorial");
		
		WebElement paraElement = driver.findElement(By.xpath("//*[contains(text(),'Java Tutorial')]/following-sibling::p[1]")); 
				
		String text = paraElement.getText();
		System.out.println(text);
		System.out.println("====================================================");
		String innerHTML = paraElement.getAttribute("innerHTML");
		System.out.println(innerHTML);
		System.out.println("====================================================");
		String innerText = paraElement.getAttribute("innerText");
         System.out.println(innerText);
	}

}
