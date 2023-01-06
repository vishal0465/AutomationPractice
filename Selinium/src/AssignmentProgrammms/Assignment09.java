package AssignmentProgrammms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment09 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		WebElement usernameInputfield = driver.findElement(By.name("UserName"));
		usernameInputfield.sendKeys("execution");
		
		WebElement passwordInputfield = driver.findElement(By.name("Password"));
		passwordInputfield.sendKeys("admin");
		
		WebElement loginButton = driver.findElement(By.name("Login"));
		loginButton.submit();
		loginButton.click();
	}

}
