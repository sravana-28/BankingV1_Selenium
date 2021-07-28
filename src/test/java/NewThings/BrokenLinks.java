package NewThings;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		int BrokenLinks=0;
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		
		for(WebElement e:linklist)
		{
			String url=e.getAttribute("href");
			
			if(url==null || url.isEmpty())
			{
				System.out.println("the link is empty");
				continue;
				
			}
			
			URL link=new URL(url);
			try {
				
				HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
				httpconn.connect();
				
				if(httpconn.getResponseCode()>=400)
				{
					System.out.println(httpconn.getResponseCode()+url+"is" +"BrokenLink");
					BrokenLinks++;
					
				}
				else
				{
					System.out.println(httpconn.getResponseCode()+url+"is" +"validlink");
				}
				
			} catch (Exception e1) {
				
			}
			
		}
		
			System.out.println("number of brokrn links:"+BrokenLinks);
			driver.quit();
			
			
		}

	}

