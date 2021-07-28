package NewThings;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class captureScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Take Screen shot of full page
		
		TakesScreenshot sc=(TakesScreenshot) driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\homepage.png");
		FileUtils.copyFile(src, trg);
		
		//Screenshot of section or portion of page
		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src1=section.getScreenshotAs(OutputType.FILE);
		File trg1=new File(".\\Screenshots\\portion.png");
		FileUtils.copyFile(src1, trg1);
		
		//Screenshot of part
		WebElement part=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src2=part.getScreenshotAs(OutputType.FILE);
		File trg2=new File(".\\Screenshots\\logo.png");
		FileUtils.copyFile(src2, trg2);
		
		driver.close();
		

	}

}
