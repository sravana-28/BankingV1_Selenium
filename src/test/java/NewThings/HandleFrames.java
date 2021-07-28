package NewThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//1st iframe
		//name of the frame
		//id of the frame
		//index of the frame
		
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		//2nd iframes
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		
		//3rd iframes
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();
		
		
	}

}
