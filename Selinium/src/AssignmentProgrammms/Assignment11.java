package AssignmentProgrammms;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment11 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().window().maximize();
		
		//driver.manage().window().setSize(new Dimension(1000,3000));
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("@Test123");
		
		WebElement usernameField = driver.findElement(By.id("username"));
		System.out.println("user name displayed or not "+usernameField.isDisplayed());
		System.out.println("user name editable or not "+usernameField.isEnabled());
		
		String usernameInputFieldValue = usernameField.getAttribute("value");
		System.out.println("valiadtion of value "+usernameInputFieldValue.equals("admin"));
		
		WebElement passwordIdField = driver.findElement(By.id("password"));
		System.out.println("password dispalyed or not "+passwordIdField.isDisplayed());
		System.out.println("password editable or nor "+passwordIdField.isEnabled());
		
		String passwordinputFieldvalue = passwordIdField.getAttribute("value");
		System.out.println("validation of value "+passwordinputFieldvalue.equals("@Test123"));
		
		
		
	}

}
