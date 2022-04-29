package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		String str = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(str);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();

	}

}
