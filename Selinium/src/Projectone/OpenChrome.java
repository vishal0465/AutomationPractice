package Projectone;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChrome 
{
	public static void main(String[]args)
	{
		/*set the driver path,
		 * By using System.setproperty(String key, String Value)
		 */
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
				
	}

}
