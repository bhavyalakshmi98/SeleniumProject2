package test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstAutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://adactinhotelapp.com");
		
		driver.manage().window().maximize();
		
//		driver.navigate().to("http://google.com");
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.quit();
		
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("donjiji20");
		
		WebElement pWord = driver.findElement(By.id("password"));
		pWord.sendKeys("donjiji@1234");
		
		 //Click n the register link by class
//        driver.findElement(By.cssSelector(".login_register")).click();
        
        //Click n the login button link by tag and id
        driver.findElement(By.cssSelector("input#login")).click();
        
        //Click n the login button link by tag and class
        //driver.findElement(By.cssSelector("input.login_button")).click();
        
        //Click n the login button link by tag and name attribute
        //driver.findElement(By.cssSelector("input[name=login]")).click();



       //Click n the login button link by tag and class and 'type' attribute
        //driver.findElement(By.cssSelector("input.login_button[type=Submit]")).click();
        
        //Click n the login button link by tag and class and 'value' attribute
        //driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();	
		
		//Forget Password
//		driver.findElement(By.cssSelector("a:contains('Forgot Password?')")).click();
		
//		new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
//		new Select(driver.findElement(By.className("search_combobox"))).selectByIndex(3);
        
        new Select(driver.findElement(By.className("search_combobox"))).selectByVisibleText("Melbourne");
        
        new Select(driver.findElement(By.cssSelector("#hotels.search_combobox"))).selectByValue("Hotel Sunshine");
        
        new Select(driver.findElement(By.cssSelector("select[name=room_type]"))).selectByValue("Double");
        
        driver.findElement(By.id("Submit")).click();
        
      //Radio next page
        driver.findElement(By.id("radiobutton_0")).click();
        
      //Click on any hyperlink above
//        driver.findElement(By.linkText("Booked Itinerary")).click();
//        
//        driver.findElement(By.linkText("Search Hotel")).click();
        
//        driver.findElement(By.partialLinkText("Search")).click();
        
        driver.findElement(By.id("continue")).click();
        
        WebElement fName = driver.findElement(By.id("first_name"));
		fName.sendKeys("Don");
		
		WebElement lName = driver.findElement(By.id("last_name"));
		lName.sendKeys("Jiji");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Demo");
		
		WebElement ccNo = driver.findElement(By.id("cc_num"));
		ccNo.sendKeys("1234567890098765");
		
		new Select(driver.findElement(By.id("cc_type"))).selectByValue("VISA");
		
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByValue("1");
		
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByValue("2022");
		
		WebElement ccCVV = driver.findElement(By.id("cc_cvv"));
		ccCVV.sendKeys("123");
        
		//Implicit Wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		PageLoadTimeout(), ScriptTimeout
		
		
		driver.findElement(By.id("book_now")).click();
		
		 //Fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30)) //wait for 30 sec max
                .pollingEvery(Duration.ofSeconds(2)) //checks element every 2 sec
                .ignoring(NoSuchElementException.class); //ignore no such element exception if element not found during polling



       WebElement itButton = fluentWait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("my_itinerary")));
       
         itButton.click();
		
		
//		driver.findElement(By.id("my_itinerary")).click();
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				
		WebElement logout_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		
		logout_button.click();
		
//		driver.findElement(By.linkText("Logout")).click();
        
        

        
		
//		driver.close();
	}

}
