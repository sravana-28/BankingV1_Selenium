package NewThings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTablewithPagination {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//login
		WebElement user=driver.findElement(By.name("username"));
		user.clear();
		user.sendKeys("demo");
		
		WebElement pass=driver.findElement(By.id("input-password"));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("//i[@class='fa fa-key']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'Orders')]")).click();
		
		

	}

}
