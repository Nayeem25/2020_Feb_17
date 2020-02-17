package highlightElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.HighlightElement;

public class HighlightElementDemo1
{
	WebDriver driver;
	
	@BeforeClass
	public void preConditions()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nayeem\\Desktop\\Selenium\\Drivers_ALL\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver(); we should not write like this , 
		//if we write this it will considere and work only for this particular method and not pass the driver instance to to then next method.
		
		
		driver.manage().window().maximize();		
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
	}
	//@Test(priority=0)
	public void HighlightElementTest1() throws InterruptedException
	{
			// Inspect element
			WebElement username= driver.findElement(By.id("email"));
			WebElement password= driver.findElement(By.id("pass"));
			WebElement loginButton= driver.findElement(By.id("loginbutton"));
			
			
			WebElement femaleRadio= driver.findElement(By.id("u_0_6"));
			
			WebElement mailRadio= driver.findElement(By.id("u_0_7"));
		
			
			
			 
			// Call reuse method
			HighlightElement.highLightElement(driver,username);
			username.sendKeys("abdul");
			HighlightElement.highLightElement(driver, password);
			password.sendKeys("abdul11");
			HighlightElement.highLightElement(driver, loginButton);
			//loginButton.click();
			 
	}
	
	@Test(priority=1)
	public void validateDripdown()
	{
		
		WebElement birthday_day= driver.findElement(By.name("birthday_day"));		
		WebElement birthday_month= driver.findElement(By.name("birthday_month"));		
		WebElement birthday_year= driver.findElement(By.name("birthday_year"));
		
		
		// Call reuse method
		HighlightElement.highLightElement(driver,birthday_day);
		Select selectDate = new Select(birthday_day);
		selectDate.selectByIndex(25);
		
		// Call reuse method
		HighlightElement.highLightElement(driver,birthday_month);
		Select selectMonth = new Select(birthday_month);
		selectMonth.selectByIndex(9);
		
		
		// Call reuse method
		HighlightElement.highLightElement(driver,birthday_year);
		Select selelectYear = new Select(birthday_year);
		selelectYear.selectByIndex(35);
		
		
		
	}
			 
			
	
}
