package first;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");	
		System.setProperty("webdriver.gecko.driver", "");// this is for firefox driver
		
		ChromeDriver chDriver = new ChromeDriver();
		
		EdgeDriver edDriver = new EdgeDriver();
		
		chDriver.get("https://demoqa.com/text-box");
		
		edDriver.get("https://www.javatpoint.com/");
		
		
		chDriver.close();
		edDriver.close();

	}

}
