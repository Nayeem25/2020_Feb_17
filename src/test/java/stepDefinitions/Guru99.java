package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Guru99
{
	
	public WebDriver driver;	

	@Given("^Open Browser and Start Application$")
	public void Open_Browser_and_Start_Application()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nayeem\\workspace\\ABD\\WebDriverTest\\DriverFiles\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/V4/");
		
		
		
	}
	@When("^Enter username and password$")
	public void Ente_username_and_password() throws Exception
	{
		driver.findElement(By.name("uid")).sendKeys("ABCD");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(2000);
		
	}
	
	@And("^Click on login button$")
	public void Click_on_login_button() throws Exception
	{
		driver.findElement(By.name("btnLogin")).click();
		
			
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert displayed when user enter invalid credentials :"+alertText);
		
		
		Assert.assertEquals("User or Password is not valid", alertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	
	
	
	
	
	
	
}
