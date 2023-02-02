package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.vtigerleadpage;

public class testvtigerlead_stepdef extends SeleniumUtility
{
  
	WebDriver driver;
	vtigerleadpage getvtigerleadpage;
	@When("^user click on add lead button$")
    public void user_click_on_add_lead_button()  
	{
		getvtigerleadpage = new vtigerleadpage(driver);
		getvtigerleadpage.clickonleadbutton();
    }

    @Then("^user should be able to get created lead which has first name as (.+)$")
    public void user_should_be_able_to_get_created_lead_which_has_first_name_as(String fname)  {
        
    }

    @And("^enter first name as (.+)$")
    public void enter_first_name_as(String fname)  {
    	getvtigerleadpage.enterfirstname(fname);
    }

    @And("^enter last name as (.+)$")
    public void enter_last_name_as(String lname)  {
    	getvtigerleadpage.enterlastname(lname);
    }

    @And("^enter phone number as (.+)$")
    public void enter_phone_number_as(String number)  {
    	getvtigerleadpage.enternumber(number);
    }

    @And("^click on save button$")
    public void click_on_save_button()  {
    	getvtigerleadpage.clickonsavebutton();
    }

    @And("^search created lead by first name (.+)$")
    public void search_created_lead_by_first_name(String fname)  {
        
    }
}
