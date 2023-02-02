package Page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import All_Automation_Utilities.SeleniumUtility;


public class AutomationDemoregisterform extends SeleniumUtility
{
		WebDriver driver;
		public AutomationDemoregisterform(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstnameinputfield;
	public void enterfirstname(String firstname)
	{
		typeInput(firstnameinputfield,firstname);
	}
	
	@FindBy(css="input[placeholder='Last Name']")
	private WebElement lastnameinputfield;
	public void enterlastname(String lastname)
	{
		typeInput(lastnameinputfield,lastname);
	}
	
	@FindBy(css="[ng-model='Adress']")
	private WebElement addressinputfiled;
	public void enteraddress(String address)
	{
		typeInput(addressinputfiled,address);
	}
	
	@FindBy(css="[ng-model='EmailAdress']")
	private WebElement emailIDinputfield;
	public void enteremailID(String emailID)
	{
		typeInput(emailIDinputfield,emailID);
	}
	
	@FindBy(css="[ng-model='Phone']")
	private WebElement phonenumberfield;
	public void enterphonenumber(String phonenumber)
	{
		typeInput(phonenumberfield,String.valueOf(phonenumber));
	}
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement clickmalecheckboxfield;
	public void clickonmalecheckbox()
	{
		performClick(clickmalecheckboxfield);
	}
	
	@FindBy(xpath="//input[@value='Cricket']")
	private WebElement clickcricketcheckboxfield;
	public void clickoncricketcheckbox() 
	{
	    performClick(clickcricketcheckboxfield);	
	}
	
	@FindBy(id="msdd")
	private WebElement openlanguagedropdown;
	public void openlanguagedropdown()
	{
		performClick(openlanguagedropdown);
	}
	
	@FindBy(xpath="//div[text()='Arabic']")
	private WebElement selectarabiclanguage;
	public void selectarabic()
	{
		handleHtmlDropdownListWithIndex(selectarabiclanguage, 1);
		performClick(selectarabiclanguage);
	}
	
	@FindBy(xpath="//option[text()='C++']")
	private WebElement selectskillCplusplus;
	public void selectskill()
	{
		handleHtmlDropdownListWithIndex(selectskillCplusplus, 10);
		//performClick(selectskillCplusplus);
	}
	
	@FindBy(xpath="//option[text()='Select Country']")
	private WebElement selectcountrybox;
	public void clickonselectcountry() 
	{
		performClick(selectcountrybox);
	}
	
	@FindBy(xpath="//span[text()='India']")
	private WebElement selectINDIAcountry;
	public void selectcountryindia()
	{
		//handleHtmlDropdownListWithIndex(selectINDIAcountry,5);
		performClick(selectINDIAcountry);
	}
	
	@FindBy(xpath="//option[text()='1997']")
	private WebElement selectyear;
	public void selectyear1997()
	{
		//handleHtmlDropdownListWithIndex(selectyear,2);
		performClick(selectyear);
	}
	
	@FindBy(xpath="//option[text()='August']")
	private WebElement selectmonth;
	public void selectaugust()
	{
		//handleHtmlDropdownListWithIndex(selectmonth,8);
		performClick(selectmonth);
	}
	
	@FindBy(xpath="//option[text()='14']")
	private WebElement selectDate;
	public void date14()
	{
		//handleHtmlDropdownListWithIndex(selectDate,14);
		performClick(selectDate);
	}
	
	@FindBy(css="#firstpassword")
	private WebElement firstpasswordinputfield;
	public void firstpassword(String firstpassword)
	{
		typeInput(firstpasswordinputfield,String.valueOf(firstpassword));
	}
	
	@FindBy(css="#secondpassword")
	private WebElement secondpasswordinputfield;
	public void secoundpassword(String secondpassword)
	{
		typeInput(secondpasswordinputfield,String.valueOf(secondpassword));
	}
	
	@FindBy(id="submitbtn")
	private WebElement clickonsubmitbutton;
	public void submitBUTTON()
	{
		performClick(clickonsubmitbutton);
	}
	
	
	
	

}
