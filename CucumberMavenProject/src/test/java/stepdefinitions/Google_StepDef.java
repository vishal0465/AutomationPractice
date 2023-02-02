//package stepdefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utilities.SeleniumUtility;
//
//public class Google_StepDef extends SeleniumUtility {
//	WebDriver driver;
//	@Given("User has already on google search page")
//	public void user_has_already_on_google_search_page() {
//		driver=setUp("chrome", "https://www.google.com");
//	}
//
//	@When("^user types (.+) in search input field and press enter key$")
//	public void user_types_in_search_input_field_and_press_enter_key(String texttobesearched) {
//		 typeInput(driver.findElement(By.name("q")), texttobesearched);
//		 getActiveElementFromUi().sendKeys(Keys.ENTER);
//	}
//
//	@Then("^User should able to get result page with title having (.+)$")
//	public void user_should_able_to_get_result_page_with_title_having(String texttobesearched) {
//	    String actualTitle=getCurrentTitleOfApplication();
//	    Assert.assertTrue(actualTitle.contains(texttobesearched));
//	}
//
//	@And("^close the browser$")
//	public void close_the_browser() {
//		cleanUp();
//	}
//}
