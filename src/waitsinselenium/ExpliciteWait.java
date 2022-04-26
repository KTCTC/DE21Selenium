package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("KTCTC");

		driver.findElement(By.name("pass")).sendKeys("KT1234");
		WebElement createButton = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("before wait");
		/*
		 * 1. if we provide element to expected conditions method e.g.
		 * driver.findElement(By.name("login")), if element is not present then
		 * nosuchelement exception will be displayed/thrown after implicitlyWait time 
		 * 2.
		 * if we provide only locator to expected conditions method e.g.
		 * By.id("seertert"), if condition is not satisfied then exception will be
		 * displayed as TimeOutException
		 */
		WebDriverWait wt = new WebDriverWait(driver, 10);
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("egfwetegetger")));
		
		wt.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("egert"))));
		
		
		wt.until(ExpectedConditions.elementToBeSelected(By.id("fretert")));
		
		wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("eretr")));
		
		
		System.out.println("After wait");
		

	}

}
