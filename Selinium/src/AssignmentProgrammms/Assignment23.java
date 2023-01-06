package AssignmentProgrammms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//enter the website
		driver.get("https://demo.actitime.com/login.do");
		//validation of URL
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.dmartindia.com/categories"));
		//enter login button
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div"));
		//enter password
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td/input"));
		//click forget password
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[7]/td/a"));
		

}
}
