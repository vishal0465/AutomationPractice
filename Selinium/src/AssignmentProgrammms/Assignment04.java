package AssignmentProgrammms;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment04 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		String pageTitle = driver.getTitle();
		System.out.println("page title is : "+pageTitle);
		System.out.println("page title length : "+pageTitle.length());
		System.out.println("title validation : "+pageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println("actual url : "+actualUrl.equals("https://www.amazon.in/login.do"));
		
		String pageSourceCode = driver.getPageSource();
		System.out.println("source code length :"+pageSourceCode.length());
		
	}

}
