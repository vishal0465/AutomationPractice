package AssignmentProgrammms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https:\\demo.actitime.com/login.do");
		
		String PageTitle = driver.getTitle();
		System.out.println("page title: "+PageTitle);
		
		int TitleLength = driver.getTitle().length();
		System.out.println("title length is: "+TitleLength);
		
		String ActualURL = driver.getCurrentUrl();
		System.out.println("actual url: "+ActualURL);
		System.out.println("url validation: "+ActualURL.equals("https:\\demo.actitime.com/login.do"));
		
		String PageSource = driver.getPageSource();
		System.out.println("page source is: "+PageSource);
		System.out.println("source code lenght: "+PageSource.length());
		
	}

}
