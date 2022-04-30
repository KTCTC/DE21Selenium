package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerSendKeysClass {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		
		String date = "06/22/2017";
		WebElement datePicker = driver.findElement(By.id("datePickerMonthYearInput"));
		datePicker.click();
		for(int i=0;i<10;i++)
		{
			datePicker.sendKeys(Keys.BACK_SPACE);
		}
		
		datePicker.sendKeys(date);
		
		datePicker.sendKeys(Keys.ENTER);
		
		
		

	}
	
	
	

}
