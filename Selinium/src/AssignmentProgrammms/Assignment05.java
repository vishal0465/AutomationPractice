package AssignmentProgrammms;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment05 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String pageTitle = driver.getTitle();
		System.out.println("page title : "+pageTitle);
		System.out.println("page title length :"+pageTitle.length());
		
		String sourceCode = driver.getPageSource();
		System.out.println("source code length :"+sourceCode.length());
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("validation of url : "+actualURL.equals("https://opensource-demo.orangehrmlive.com/"));
		
		driver.findElement(By.id("logoutLink")).click();
	}

}
