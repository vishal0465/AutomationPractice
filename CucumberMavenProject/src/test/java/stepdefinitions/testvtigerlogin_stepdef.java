package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;

public class testvtigerlogin_stepdef extends SeleniumUtility
{
	VtigerLoginPage getVtigerLoginPage;
	VtigerHomePage getVtigerHomePage;
	
	@Given("^user is having valid url$")
    public void user_is_having_valid_url()  
	{ 
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage = new VtigerLoginPage(driver);
		getVtigerHomePage = new VtigerHomePage(driver);
        
    }

    @And("^enter username$")
    public void enter_username()  
    {
    	getVtigerLoginPage.enterUsername("admin");
        
    }

    @And("^enter password$")
    public void enter_password()  
    {
    	getVtigerLoginPage.enterPassword("Test@123");
        
    }

    @And("^click  on sign in button$")
    public void click_on_sign_in_button() 
    {
    	getVtigerLoginPage.clickOnSigninButton();
    }

    @And("^click on app navigator$")
    public void click_on_app_navigator()  
    {
    	getVtigerHomePage.appnavigator();
    }

    @And("^click on marketing$")
    public void click_on_marketing()  
    {
    	getVtigerHomePage.clickonmarketing();
    }

    @And("^select lead$")
    public void select_lead()  {
    	getVtigerHomePage.selectleadfrommarketing();
    }


}
