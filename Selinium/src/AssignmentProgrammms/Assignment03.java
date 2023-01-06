package AssignmentProgrammms;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment03 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://msrtc.maharashtra.gov.in/");
		
		String PageTitle = driver.getTitle();
		System.out.println("page title : "+PageTitle);
		
		String ActualURL = driver.getCurrentUrl();
		System.out.println("actul url : "+ActualURL);
		System.out.println("url validation : "+ActualURL.equals("https://msrtc.maharashtra.gov.in/"));
		
		String PageSource = driver.getPageSource();
		System.out.println("page source code is : "+PageSource.length());
		
	}

}
