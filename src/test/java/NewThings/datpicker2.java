package NewThings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datpicker2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		sel.selectByVisibleText("May");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("2022");
		
		String date="10";
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement e:list)
		{
			String ele=e.getText();
			if(ele.equals(date))
			{
				e.click();
				break;
			}
		}
		
		

	}

}
