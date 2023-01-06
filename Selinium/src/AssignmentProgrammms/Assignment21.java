package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21
{
	public static void main(String[]args)
	{
		
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/");
	
	System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.dmartindia.com/categories"));
	
	driver.findElement(By.className("db")).sendKeys("Nashik");
	
	driver.findElement(By.className("selected")).click();
	
	driver.findElement(By.id("dest")).sendKeys("Pune");
	
	driver.findElement(By.cssSelector("#search>div>div:nth-child(3)>div>ul>li.selected")).click();
	
	driver.findElement(By.id("onward_cal")).click();
	
	driver.findElement(By.cssSelector("#rb-calendar_onward_cal>table>tbody>tr:nth-child(5)>td:nth-child(5)")).click();
	
	driver.findElement(By.cssSelector("#search_btn")).click();
	
	driver.findElement(By.cssSelector("#filter-block>div>div.details>ul.dept-time.dt-time-filter>li:nth-child(1)>label")).click();
	
	List<WebElement>busCount = driver.findElements(By.cssSelector(".travels lh-24 f-bold d-color"));
	System.out.println("bus count "+busCount.size());
	for(int i=0;i<busCount.size();i++)
	{
		System.out.println(busCount.get(i).getText());
	}
	

}
}
