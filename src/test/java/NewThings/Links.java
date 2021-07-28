package NewThings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Links {

	private static final boolean Webelement = false;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		
		List<WebElement>list=driver.findElements(By.tagName("a"));
		
		System.out.println("No of links:"+ list.size());
		
	    /*for(int i=0;i<=list.size();i++)
	    {
	    	System.out.println(list.get(i).getText());
	    	System.out.println(list.get(i).getAttribute("href"));
	    	
	    	
	    	
	    }*/
		
		
		
		for(WebElement e:list)
		{
			System.out.println(e.getText());
			System.out.println(e.getAttribute("href"));
					
			
		}

	}

}
