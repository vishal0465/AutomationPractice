package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment22
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
		//enter username 
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter password
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		//click to login button
		driver.findElement(By.linkText("Login")).click();
		//click to add button
		driver.findElement(By.id("container_tasks")).click();
		//click to add new button
		
//		driver.findElement(By.className("downIcon")).click();
//		//select project
//		driver.findElement(By.className("createNewProject")).click();
//		//Enter the project name
		
		//Enter task path
		List<WebElement> taskName = driver.findElements(By.cssSelector(".dropdownContainer.addNewMenu>div"));
		System.out.println("task list "+taskName.size());
		taskName.get(2).click();
		
	}

}
