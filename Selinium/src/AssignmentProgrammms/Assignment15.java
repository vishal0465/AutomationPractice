package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.linkText("Mobiles")).click();
		
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.flipkart.com/"));
		
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#container>div>div._331-kn._2tvxW>div>div>div"));
		System.out.println("divice list count "+deviceList.size());
		for(int i=0;i<deviceList.size();i++)
		{
			System.out.println(deviceList.get(i).getText());
		}
	}

}


