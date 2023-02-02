package StepDefinationFiles;

import org.openqa.selenium.WebDriver;

import All_Automation_Utilities.SeleniumUtility;
import Page_object_model.AutomationDemoregisterform;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class AutomationDemoRegStepDef extends SeleniumUtility
{
	WebDriver driver;
	AutomationDemoregisterform A1 =new AutomationDemoregisterform(driver);
	
	@Given("^enter the url of automation demo register$")
    public void enter_the_url_of_automation_demo_register()  {
       driver=setUp("Chrome","https://demo.automationtesting.in/Register.html");
       
    }

    @And("^enter first name (.+)$")
    public void enter_first_name(String firstname)  {
        A1.enterfirstname(firstname);
    }

    @And("^enter last name (.+)$")
    public void enter_last_name(String lastname)  {
        A1.enterlastname(lastname);
    }

    @And("^enter address (.+)$")
    public void enter_address(String address)  {
        A1.enteraddress(address);
    }

    @And("^enter email address (.+)$")
    public void enter_email_address(String emailid)  {
        A1.enteremailID(emailid);
    }

    @And("^enter phone number (.+)$")
    public void enter_phone_number(String phonenumber)  {
        A1.enterphonenumber(phonenumber);
    }

    @And("^select the gender male check box$")
    public void select_the_gender_male_check_box()  {
        A1.clickonmalecheckbox();
    }

    @And("^select the hobbies check box cricket$")
    public void select_the_hobbies_check_box_cricket()  {
        A1.clickoncricketcheckbox();
    }

    @And("^open the dropdown of languages$")
    public void open_the_dropdown_of_languages()  {
        A1.openlanguagedropdown();
    }

    @And("^select the languages$")
    public void select_the_languages()  {
        A1.selectarabic();
    }

    @And("^select the skills$")
    public void select_the_skills()  {
        A1.selectskill();
    }

    @And("^select the country$")
    public void select_the_country()  {
        A1.selectcountryindia();
    }

    @And("^select the country name$")
    public void select_the_country_name()  {
        A1.selectcountryindia();
    }

    @And("^select year$")
    public void select_year()  {
        A1.selectyear1997();
    }

    @And("^select month$")
    public void select_month()  {
        A1.selectaugust();
    }

    @And("^select date$")
    public void select_date()  {
        A1.date14();
    }

    @And("^enter the password (.+)$")
    public void enter_the_password(String firstpassword)  {
       A1.firstpassword(firstpassword); 
    }

    @And("^again enter the password (.+)$")
    public void again_enter_the_password(String secoundpassword)  {
       A1.secoundpassword(secoundpassword);
    }
    
    @Then("^click on submit button$")
    public void click_on_submit_button()  {
        A1.submitBUTTON();
    }

    @And("^close the browser$")
    public void close_the_browser()  {
        A1.cleanUp();
    }
}
