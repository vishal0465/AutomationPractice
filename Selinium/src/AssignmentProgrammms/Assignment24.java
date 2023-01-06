package AssignmentProgrammms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment24 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//enter the website
		driver.get("https://www.irctc.co.in/nget/train-search");
		//validation of URL
		System.out.println("URL validation "+driver.getCurrentUrl().equals("https://www.irctc.co.in/nget/train-search"));
		//inspect the 'from' search box and send the key 
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("MUMBAI CENTRAL - MMCT");
		//inspect the send key station 
		driver.findElement(By.cssSelector("ul>li.ng-tns-c57-8.ng-star-inserted.ui-autocomplete-list-item.ui-corner-all>span")).click();
		//inspect the 'to' search box and send the key
		driver.findElement(By.cssSelector("input.ng-tns-c57-9")).sendKeys("PUNE JN - PUNE");
		
		// inspect the send key or destination
		driver.findElement(By.xpath("//li[@role='option']")).click();
		//div>div>div>p-autocomplete>span>div>ul>li.ng-tns-c57-9
		
	    // select the date in calender and click
		driver.findElement(By.cssSelector("#jDate>span>input")).click();
		// click on next month
		driver.findElement(By.className("ui-datepicker-next-icon")).click();
		// select the date in calender this code is valid for only this date 28/01/2023 
		driver.findElement(By.cssSelector("table>tbody>tr:nth-child(4)>td:nth-child(7)>a")).click();
		// dropdown the list of train classes
		driver.findElement(By.cssSelector("#journeyClass>div")).click();
		//select the train class
		List<WebElement>trainClasses = driver.findElements(By.cssSelector("ul>p-dropdownitem"));
		System.out.println("train classse "+trainClasses.size());
		trainClasses.get(5);
		//click on search button
		driver.findElement(By.className("train_Search")).click();
		// now the train list is
		List<WebElement>trainList = driver.findElements(By.cssSelector("div.form-group.no-pad.col-xs-12.bull-back.border-all > app-train-avl-enq > div.ng-star-inserted > div.dull-back.no-pad.col-xs-12 > div.col-sm-5.col-xs-11.train-heading > strong"));
		// or this path also work "div>app-train-list>div.col-sm-9.col-xs-12>div>div.ng-star-inserted>div"
		for(int i=0;i<trainList.size();i++)
		{
			System.out.println("train list "+trainList.get(i).getText());
		}
	}

}
