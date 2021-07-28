package NewThings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//get windowhandle
		
		//String WindowID=driver.getWindowHandle();
		//System.out.println(WindowID);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//get winndow handles
		
		Set<String> windowsID=driver.getWindowHandles();
		
	    //first method
		
		/*Iterator<String> it=windowsID.iterator();

	    String ParentID=it.next();
	    String ChildId=it.next();
	    
	    
	    System.out.println("Parent id is:" + ParentID );
	    System.out.println("Child id is:" + ChildId );*/

	    
	    
	    //using List or ArrayList
	    
	    List<String> windowList=new ArrayList(windowsID);
	    
	    //String ParentWindowId=windowList.get(0);
	    //String ChildWindowId=windowList.get(1);
	    
	    //System.out.println("Parent id is :"+ ParentWindowId);
	    //System.out.println("Child id is :"+ ChildWindowId);
	    
	    //switching browser windows
	    
	    //driver.switchTo().window(ParentWindowId);
	    //System.out.println("Parent window title :" +driver.getTitle());
	    
	    
	    //driver.switchTo().window(ChildWindowId);
	    //System.out.println("Child window title :" +driver.getTitle());
	    
	    
	    for(String e:windowList)
	    {
	    	System.out.println(e);
	    	String title=driver.switchTo().window(e).getTitle();
	    	if(title.equals("OrangeHRM"))
	    	{
	    		driver.close();
	    	}
	    	
	    	//System.out.println(title);
	    	
	    }
	    
	    //driver.close(); closes single browser
	    //driver.quit(); closes all browsers
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	

}
