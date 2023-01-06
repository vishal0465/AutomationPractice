package MouseFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Assignment01 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		WebElement flipcartMenu = driver.findElement(By.cssSelector("#container>div>div._331-kn._2tvxW>div>div>div:nth-child(2)>a>div._1mkliO>div>img"));
		
		Actions act = new Actions(driver);
		act.doubleClick(flipcartMenu).build().perform();
		
		List<WebElement> innerMenu = driver.findElements(By.cssSelector("#container>div>div._331-kn>div>div>span"));
		System.out.println("menu size"+innerMenu.size());
		for(int i=0;i<innerMenu.size();i++)
		{
			WebElement menu = innerMenu.get(i);
			act.moveToElement(menu).perform();
			Thread.sleep(1500);
		}
				
	}

}
