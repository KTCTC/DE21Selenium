package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select sel = new Select(driver.findElement(By.id("fruits")));
		
		boolean flag = sel.isMultiple();
		System.out.println(flag);
		
		
		
		
		sel.selectByValue("apple");
		
		sel.selectByVisibleText("Orange");
		
		sel.selectByVisibleText("Grape");
		
		
		WebElement firstselOp = sel.getFirstSelectedOption();
		
		System.out.println(firstselOp.getText());
		
			
		List<WebElement> allSelOp = sel.getAllSelectedOptions();
		
		for (WebElement each:allSelOp)
		{
			System.out.println(each.getText());
		}
		
		
		List<WebElement> allOp = sel.getOptions();
	
		
		for (WebElement each:allOp)
		{
			System.out.println(each.getText());
		}
		
		
		
		sel.deselectByValue("orange");
		
		sel.deselectAll();
		
		
		
		

	}

}
