package NewThings;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchrandom {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		List<WebElement> search=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println("Number of suggestions:"+search.size());
		
		for(WebElement e:search)
		{
			if(e.getText().equals("selenium webdriver"))
			{
				e.click();
				break;
			}
		}
		
		
		
	}

}
