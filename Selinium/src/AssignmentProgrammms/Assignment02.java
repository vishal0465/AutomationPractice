package AssignmentProgrammms;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment02
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		String PageTitle = driver.getTitle();
		System.out.println("page title: "+PageTitle);
		
		int TitleLength = driver.getTitle().length();
		System.out.println("page title length: "+TitleLength);
		
		String ActualURL = driver.getCurrentUrl();
		System.out.println("actul url: "+ActualURL);
		System.out.println("url validation: "+ActualURL.equals("https:\\www.facebook.com"));
		
		
	}

}
