package highlightElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight 
{

	
	public static void main(String []args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nayeem\\Desktop\\Selenium\\Drivers_ALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("http://www.facebook.com");
		 
		 Thread.sleep(5000);
		// Create the  JavascriptExecutor object
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// Inspect element
		WebElement username= driver.findElement(By.id("email")); 
		 
		// Call reuse method
		highLightElement(driver,username);
		 
		}
		 
		// Element highlighter code
		public static void highLightElement(WebDriver driver, WebElement element)
		{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		 
		try 
		{
		Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
		 
		System.out.println(e.getMessage());
		} 
		 
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
		 
		}
		 
		 
		}
	

