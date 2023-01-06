package AssignmentProgrammms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment27 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//enter the website
		driver.get("https://www.demoblaze.com/");
		//validation of URL
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.demoblaze.com/"));
		
		WebElement price =driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']//following:: h5[1]"));
		System.out.println("samsung galaxy price is ="+price.getText());
		
	}

}
