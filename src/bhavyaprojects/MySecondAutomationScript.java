package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MySecondAutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Chocolate");
		
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
//		String text = driver.findElement(By.cssSelector(".a-size-base-plus a-color-base a-text-normal")).click()
		
		//driver.findElement(By.linkText("Apple iPhone 12, 64GB, Black - Fully Unlocked (Renewed)")).click();
		
		//for scrolling the page
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,1000)"); //x-axis and y-axis values for the location
		
	     List<WebElement> results =
	    	        driver.findElements(By.cssSelector(".a-size-medium a-color-base a-text-normal"));
	     
	     System.out.println(results.size());
	     
	     for(int i=0;i<results.size();i++) {
	    	 System.out.println(results);
	     }
	     
//	     System.out.println(driver.findElement(By.cssSelector(null)));
	     
		//driver.close();
		

	}

}
