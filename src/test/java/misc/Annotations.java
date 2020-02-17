package misc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void bs()
	{
		System.out.println("I am the first of all");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("I am the last of all");
	}
	
	
	
	@BeforeTest
	public void bt()
	{
	System.out.println("I am second, after before suite");	
	}
	

	@AfterTest
	public void at()
	{
	System.out.println("I am second, after before suite");	
	}
	
	@BeforeClass
	public void bc()
	{
	System.out.println("I am third, after test and suite");	
	}
	
	@AfterClass
	public void ac()
	{
	System.out.println("I am third, after test and suite");	
	}
	
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("I am before every method");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("I am after every method");
	}
	
	@Test
	public void abc()
	{System.out.println("I am learning Cucumber and Maven ");
		
	}
	
}
