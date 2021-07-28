package NewThings;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecuter {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//syntax	
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript(script, args);
		
		//flash
		
		//generate alerts
		
		JavaScriptUtil.alert(driver, "This is by JavaScript");
			
		
		//drawing border and screenshot
		
		/*WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.drawborder(logo, driver);*/
		
		/*TakesScreenshot sc=(TakesScreenshot) driver;
		File rc=sc.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\logo1.png");
	    FileUtils.copyFile(rc, trg);*/			
		
		
		//click action
		
		/*WebElement login=driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
		
		JavaScriptUtil.click(login, driver);*/	
		
		
		//refreshing page
		
		JavaScriptUtil.refresh(driver);
		
		
		
		
		//scrolling down page
		//scrolling up page
		//zoom page
		
		
		//get title JS
	    /*String title1=JavaScriptUtil.getTitleJS(driver);
		System.out.println(title1);*/
		

	}

}

