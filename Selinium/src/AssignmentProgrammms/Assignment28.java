package AssignmentProgrammms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment28 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//enter the website
		driver.get("https://www.flipkart.com/tyy/4io/~cs-e0objcvf4c/pr?sid=tyy%2C4io&collection-tab-name=Realme+10+pro+5g&param=589&otracker=clp_bannerads_1_6.bannerAdCard.BANNERADS_Realme-10-Pro5g-sale-is-on_mobile-phones-big-saving-days-dec22-eidj8fs-store_I9339Z3O3SD2");
		//validation of URL
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.flipkart.com/tyy/4io/~cs-e0objcvf4c/pr?sid=tyy%2C4io&collection-tab-name=Realme+10+pro+5g&param=589&otracker=clp_bannerads_1_6.bannerAdCard.BANNERADS_Realme-10-Pro5g-sale-is-on_mobile-phones-big-saving-days-dec22-eidj8fs-store_I9339Z3O3SD2"));
		
		WebElement priceofMobile = driver.findElement(By.xpath("//div[div[div[text()='realme 10 Pro 5G (Hyperspace, 128 GB)']]]/div[2]/div[1]/div[1]/div[1]"));
		System.out.println("realme 10 price ="+priceofMobile.getText());
		
	}

}
