package Projectone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicExample01 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://demo.automationtesting.in/Register.html");
		String PageTitle = cdriver.getTitle();
		System.out.println("Page title is: "+PageTitle);
		System.out.println("Page title validation: "+PageTitle.equals("Register"));
		System.out.println("page URL is: "+cdriver.getCurrentUrl());
		
	}

}
