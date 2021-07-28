package NewThings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String month="July";
		String year="2022";
		String date="15";
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		while(true)
		{
			String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
			break;
			
			else
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();			
			
		}
		
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement e:list)
		{
			
			String dt=e.getText();
			
			if(dt.equals(date))
			{
				e.click();
				break;
			}
		}

	}

	

}
