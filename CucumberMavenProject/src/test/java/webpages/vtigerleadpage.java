package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class vtigerleadpage extends SeleniumUtility	
{
	WebDriver driver;
	public vtigerleadpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addLead;
	
	@FindBy(css="#select2-chosen-2")
	private WebElement salotaionForLead;
	
	@FindBy(xpath="//div[@id='select2-drop']/ul/li[2]")
	private WebElement selectSalotationTypeForLead;
	
	@FindBy(id="Leads_editView_fieldName_firstname")
	private WebElement firstNameInputFieldForLead;
	public void enterfirstname(String name)
	{
		typeInput(firstNameInputFieldForLead, name);
	}
	@FindBy(id="Leads_editView_fieldName_lastname")
	private WebElement lastNameInputFieldForLead;
	public void enterlastname(String name)
	{
		typeInput(lastNameInputFieldForLead, name);
	}
	
	@FindBy(id="Leads_editView_fieldName_phone")
	private WebElement contactNumberOfLead;
	public void enternumber(String num)
	{
		typeInput(contactNumberOfLead, num);
	}
	
	
	@FindBy(css=".saveButton")
	private WebElement saveButtonForLead;
	public void clickonsavebutton()
	{
		clickOnElement(saveButtonForLead);
	}
	
	@FindBy(xpath="//h4[contains(text(),'Leads')]")
	private WebElement leadHeaderLink;
	
	@FindBy(xpath="//a[contains(text(),'Champak')]")
	private WebElement newlyCreatedLeadName;
	
	@FindBy(xpath="//tr[td[span[span[a[contains(text(),'Champak')]]]]]/td[1]//input")
	private WebElement newlyCreatedLeadCheckBox;
	
	@FindBy(id="Leads_listView_massAction_LBL_DELETE")
	private WebElement deleteLeadLink;
	
	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	private WebElement yesButtonOnConfirmPopup;
	
	@FindBy(css=".listViewEntriesMainCheckBox")
	private WebElement selectAllLeadsCheckBoxs;
	
	@FindBy(css="#listview-table>tbody>tr")
	private WebElement getAllLeads;
	
	public void clickOnHeader() {
		clickOnElement(leadHeaderLink);
	}
	
	public void deleteCreatedLead() {
		clickOnHeader();
		clickOnElement(newlyCreatedLeadCheckBox);
		clickOnElement(deleteLeadLink);
		clickOnElement(yesButtonOnConfirmPopup);
	}
	
	public boolean checkLeadCreation() {
		return isElementExist(newlyCreatedLeadName);
	}
	
	public void selectAllLeadsCheckBox() {
		clickOnElement(selectAllLeadsCheckBoxs);
	}
public void clickOnDeleteLogo() {
		clickOnElement(deleteLeadLink);
	}
	public void confirmLeadDeletion() {
		clickOnElement(yesButtonOnConfirmPopup);
	}
	
	public String getLeadsList(String value) {
		return getRequiredAttributeValue(getAllLeads, value);
	}
	public void clickonleadbutton()
	{
		clickOnElement(addLead);
	}
	

}
