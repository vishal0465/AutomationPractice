package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment18
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.jiomart.com/"));
		
		List<WebElement> deviceList = driver.findElements(By.cssSelector("div.menu_delivery_section>div>ul>li>a"));
		System.out.println("divice list count "+deviceList.size());
		for(int i=0;i<deviceList.size();i++)
		{
			System.out.println(deviceList.get(i).getText());
		}
	}


}
