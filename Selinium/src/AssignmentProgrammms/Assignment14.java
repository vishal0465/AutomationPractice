package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.linkText("Mobiles")).click();
		
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.amazon.in/"));
		
		//List<WebElement> deviceList = driver.findElements(By.cssSelector("#nav-xshop>a:nth-child(28)"));
		
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#nav-xshop>a"));
		
		System.out.println("divice list count "+deviceList.size());
		for(int i=0;i<deviceList.size();i++)
		{
			System.out.println(deviceList.get(i).getText());
		}
	}

}
