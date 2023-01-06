package AssignmentProgrammms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment25 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//enter the website
		driver.get("https://www.ixigo.com/trains");
		//validation of URL
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.ixigo.com/trains"));
		//inspect the 'from' search box and send the key 
		driver.findElement(By.cssSelector("input[placeholder='Leaving from'")).sendKeys("New Delhi (NDLS)");

		driver.findElement(By.cssSelector("div[class='autocompleter-scroll-cntr']>div:nth-child(2)")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Going to']")).sendKeys("Pune jn (PUNE)");
		
		//driver.findElement(By.xpath("//div[div[div[div[text()='Lokmanyatilak T (LTT)']]]]/div[2]/div[1]/div[3]")).click();
		
		driver.findElement(By.xpath("//div[div[text()='Date']]/input[1]")).click();
		
		driver.findElement(By.xpath("//div[table[tbody[tr[td[div[text()='31']]]]]]/div[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='Search']/div[1]")).click();
}
	
	
}
