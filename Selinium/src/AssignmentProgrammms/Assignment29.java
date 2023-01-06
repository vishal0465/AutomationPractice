package AssignmentProgrammms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment29 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//enter password
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		// in dashboard click on PIM
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		// click on ADD EMPLOYEE BAR
		driver.findElement(By.xpath("//li[a[text()='Add Employee']]")).click();
		// click on first name
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).click();
		// enter the first name
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("VISHAL",Keys.TAB);
		// TAB the button and enter middle name
		driver.findElement(By.name("middleName")).sendKeys("R.",Keys.TAB);
		//TAB the button and enter the last name
		driver.findElement(By.name("lastName")).sendKeys("WANI",Keys.TAB);
		// TAB the button and click on employee ID
		driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div>input")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div>input")).clear(); this step is not necessary
		//Thread.sleep(3000); this step is not necessary
		
		// Delete the default number by using key function
		driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div>input")).sendKeys(Keys.chord(Keys.CONTROL,"a"),(Keys.chord(Keys.BACK_SPACE)));
		// Enter the EmployeeID and use the 'ENTER' function for save the daitailes
		driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div>input")).sendKeys("0465",Keys.ENTER);
		//Then again click on PIM
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		//then click on employee ID
		driver.findElement(By.cssSelector("div:nth-child(2)>div>div:nth-child(2)>input")).click();
		Thread.sleep(1000);
		// Enter the employee ID and search by useing ENTER Keyword function
		driver.findElement(By.cssSelector("div:nth-child(2)>div>div:nth-child(2)>input")).sendKeys("0465",Keys.ENTER); //OR This is also run sometime//"div.oxd-form-row>div>div:nth-child(1)"
		
		
		
		
		
		
		
		
		
	}

}
