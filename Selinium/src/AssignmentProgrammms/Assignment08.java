package AssignmentProgrammms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment08 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//https://demo.vitger.com/vtigercrm/index.php
		
		String loginpageTitle = driver.getTitle();
		System.out.println("login page title : "+loginpageTitle);
		System.out.println("login pagetitle length : "+loginpageTitle.length());
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("actual url : "+actualURL.equals("https://demo.vitger.com/vtigercrm/index.php"));
		
		String sourceCode = driver.getPageSource();
		System.out.println("source code length : "+sourceCode.length());
		
		//driver.findElement(By.id("Username")).sendKeys("admin");
		
		//driver.findElement(By.id("Password")).sendKeys("Test@123");
		
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.titleContains("vtiger"));
		
		System.out.println("Home page title : "+driver.getTitle());
		
		//driver.findElement(By.id("LogoutLink")).click();
		
	}

}


