package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment26 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//enter the website
		driver.get("https://www.nseindia.com/");
		//validation of URL
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.nseindia.com/"));
		
		driver.findElement(By.xpath("//tr[td[a[text()='ADANIPORTS']]]/td[4]"));
		
		WebElement volumeofAdaniport = driver.findElement(By.xpath("//tr[td[a[text()='ADANIPORTS']]]/td[4]"));
		System.out.println("voiume of adniport is ="+volumeofAdaniport.getText());
		
	}
	
}

