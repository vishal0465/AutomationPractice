package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaa.com/");
		
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.nykaa.com/"));
		
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#app>header>div>div.css-uhagyq.e1e0j9zy3>div>div>div"));
		System.out.println("divice list count "+deviceList.size());
		for(int i=0;i<deviceList.size();i++)
		{
			System.out.println(deviceList.get(i).getText());
		}
	}




}
