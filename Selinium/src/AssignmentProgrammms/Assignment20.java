package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment20 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.findElement(By.className("button")).click();
		
		
        System.out.println("URL validation "+driver.getCurrentUrl().equals("https://demo.vtiger.com/vtigercrm/index.php"));
		
//		List<WebElement> deviceList = driver.findElements(By.cssSelector("div.dashBoardContainer.clearfix>div>div>div>div>div>div>div>ul>li>a"));
//		System.out.println("divice list count "+deviceList.size());
//		for(int i=0;i<deviceList.size();i++)
//		{
//			System.out.println(deviceList.get(i).getAttribute("innerHTML"));
//		}
        
        WebDriverWait wait=new WebDriverWait(driver,20);
		
		WebElement dropdown = driver.findElement(By.cssSelector("div.dashBoardTabContainer>div>div>div>button"));
		dropdown.click();
		
		List<WebElement>Options = driver.findElements(By.cssSelector("div.dashBoardTabContainer>div>div>div>ul>li>a"));
		System.out.println("option count "+Options.size());
		for(int i=0;i<Options.size();i++)
		{
			System.out.println(Options.get(i).getText());
		}
		Options.get(2).click();
		dropdown.click();
		Options.get(3).click();
		
		
		
		
		
		
	}


}
