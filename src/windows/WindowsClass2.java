package windows;


import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsClass2 {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindow = driver.getWindowHandle();// 45
		System.out.println(parentWindow);
		
		driver.findElement(By.id("windowButton")).click();
		
		switchToRequiredNumberOfWindow(driver, 6);
		
		String str = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(str);
		
		//driver.close();		
		
		driver.quit();	
		

	}
	
	public static void switchToRequiredNumberOfWindow(WebDriver driver, int numberOfWindow)
	{
		Set<String> handles = driver.getWindowHandles();
		int i=1;
		boolean flag=true;
		
		for(String each:handles)
		{
			if (numberOfWindow==i)
			{
				driver.switchTo().window(each);
				flag=false;
				break;
			}
			i++;
		}
		
		if(flag)
			System.out.println("Window is not present");
		
		
	}
	
	
}
