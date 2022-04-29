package actionsclass;

import org.openqa.selenium.By;

public class ToolTipClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write code to check if tool tip is displayed  https://demoqa.com/tool-tips
		// Write code to hover on menues https://demoqa.com/menu
		
		
		// to check if tooltip is displayed first option
		try {
			driver.findElement(By.xpath("/*[contains(text(),'You hovered over the Button')]")).isDisplayed(); 
			System.out.println("element is displayed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("element is not displayed");
		}
		
		// to check if tooltip is displayed second option	
		List<WebElement> ss = driver.findElements(By.xpath("/*[contains(text(),'You hovered over the Button')]"));
		
		if (ss.size()>0)
		{
			System.out.println("element is displayed");
		}
		else
		{
			System.out.println("element is not displayed");
		}
	}
	


}
