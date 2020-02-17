package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightElement
{
	// Element highlighter code
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	 
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	//js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid red;');", element);
	//js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", element);
	//js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
		 
		try 
		{
		Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
		 
		System.out.println(e.getMessage());
		} 
		//Again set the color to normal/white
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
	
    }	
}
