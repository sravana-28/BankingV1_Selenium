package NewThings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDowns {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     
	     driver.get("http://www.orangehrm.com/orangehrm-30-day-trial/");
	     driver.manage().window().maximize();
	     
	     
	     WebElement emp=driver.findElement(By.name("NoOfEmployees"));
	     SelectClass(emp,"11 - 15");
	     
	     WebElement ind=driver.findElement(By.name("Industry"));
	     SelectClass(ind,"Travel");
	     
	     WebElement country=driver.findElement(By.name("Country"));
	     SelectClass(country,"Australia"); 
	

	}
	
	public static void SelectClass(WebElement ele,String value)
	{
		Select drp=new Select(ele);
		
		List<WebElement> alloptions=drp.getOptions();
		
		for(WebElement e:alloptions)
		{
			if(e.getText().equals(value))
			{
				e.click();
				break;
				
			}
		}
		
		
		
	}

}
