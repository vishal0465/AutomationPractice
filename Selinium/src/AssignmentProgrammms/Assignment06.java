package AssignmentProgrammms;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment06 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://sampleapp.tricentis.com/101/");
		
		String actualURL =driver.getCurrentUrl();
		System.out.println("validation of url : "+actualURL.equals("https://sampleapp.tricentis.com/101/"));
		
		String pageTitle = driver.getTitle();
		System.out.println("page title : "+pageTitle);
		System.out.println("page title lengeth: "+pageTitle.length());
		
		String sourceCode = driver.getPageSource();
		System.out.println("source code length : "+sourceCode.length());
		
		
	}

}
