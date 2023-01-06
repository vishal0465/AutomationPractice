package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment17 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.espncricinfo.com/");
		
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.espncricinfo.com/"));
		
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#main-container>div:nth-child(3)>div>nav>div>div>div>div>div:nth-child(1)>div"));
		System.out.println("divice list count "+deviceList.size());
		for(int i=0;i<deviceList.size();i++)
		{
			System.out.println(deviceList.get(i).getText());
		}
	}

}
