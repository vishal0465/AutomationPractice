package AssignmentProgrammms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 
{
	public static void main(String[]args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println("get page title "+driver.getTitle());
		
		driver.findElement(By.linkText("Today's Deals")).click();
		
		System.out.println("get page title another "+driver.getTitle());
	    Thread.sleep(2500);
	    
	    driver.navigate().back();
	    
	    System.out.println("after getting back title is "+driver.getTitle());
	    
	}

}
