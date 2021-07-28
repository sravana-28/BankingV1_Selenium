package NewThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeinaiframe {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(0);
        
        System.out.println("text present in inner frame:"+ driver.findElement(By.xpath("//h1")).getText());
        
        driver.switchTo().parentFrame();
        System.out.println("text in parent frame :" + driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText());
	}

}
