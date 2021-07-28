package NewThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logoLocation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
        
		System.out.println("location is:"+ logo.getLocation());
		System.out.println("location of X is:"+ logo.getLocation().getX());
		System.out.println("location of Y is:"+ logo.getLocation().getY());
		
		
		//get size
		 
		System.out.println("size is:"+logo.getSize());
		System.out.println("size is:"+logo.getSize().getHeight());
		System.out.println("size is:"+logo.getSize().getWidth());
		

	}
	
	

}
