package NewThings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {		
		
		public static void drawborder(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		public static String getTitleJS(WebDriver driver)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			String title=js.executeScript("return document.title;").toString();			
			return title;
		}
		
		public static void click(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}
		
		public static void alert(WebDriver driver,String message)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("alert('" + message + "')");
		}
		
		public static void refresh(WebDriver driver)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("history.go(0)");
		}
		
		
		
		
		
		
		
		

		public static void main(String[] args) {
	}	

}
