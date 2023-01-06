package AssignmentProgrammms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment07 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String loginpageTitle = driver.getTitle();
		System.out.println("login page title : "+loginpageTitle);
		System.out.println("login pagetitle length : "+loginpageTitle.length());
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("actual url : "+actualURL.equals("https://opensource-demo.orangehrmlive.com/wed/index.php/auth/login"));
		
		String sourceCode = driver.getPageSource();
		System.out.println("source code length : "+sourceCode.length());
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		                                //OR//
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		
		System.out.println("Home page title : "+driver.getTitle());
		
		
		
	}

}
