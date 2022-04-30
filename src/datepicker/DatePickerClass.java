package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerClass {
	
public enum monthsOfYear {January,February,March,April,May,June,July,August,September,October,November,December}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		
		
		selectRequiredDateInDatePicker(driver, "1995", monthsOfYear.December, "25");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select selYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		selYear.selectByVisibleText("2020");
		
		Select selMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		
		selMonth.selectByVisibleText("January");
		
		driver.findElement(By.xpath("//*[@aria-label='Choose Sunday, January 26th, 2020']")).click();
		

	}
	
	
	public static void selectRequiredDateInDatePicker(WebDriver driver, String yyyy, monthsOfYear month, String dd)
	{
        driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select selYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		selYear.selectByVisibleText(yyyy);
		
		Select selMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		
		selMonth.selectByVisibleText(month.toString());
		
		driver.findElement(By.xpath("//*[contains(@class,'"+dd+"') and contains(@aria-label,'"+month.toString()+"')]")).click();
		
	}

}
