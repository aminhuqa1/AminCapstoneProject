package step.definition;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.AccountPage;
import page.object.HomePage;

public class RetailPageStepDef extends Base{
	HomePage homePage = new HomePage();
	AccountPage accountPage = new AccountPage();
	
//Background	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		homePage.clickOnMyAccount();
		logger.info("User clicked on MyAccount");	 
	}
	@When("User click on Login")
	public void user_click_on_login() {
		homePage.clickOnLogin();
		logger.info("User clicked on MyAccount");	 
	}
	
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		accountPage.enterEmail(string);
		accountPage.enterPassword(string2);
		logger.info("User enter username \"" + string +"\" and password \""+ string2 + "\"");	 
	}
	
	@When("User click on Login button")
	public void user_click_on_login_button() {
		accountPage.submitLogin();
		logger.info("User clicked on Login button");	 
	}
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(accountPage.myAccountText());
		logger.info("User is logged in to MyAccount dashboard");	 
	}

//	ChequePayment
	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		accountPage.clickOnAffiliateLink(string);
		logger.info("ser clicked on \"" + string + "\" link");	 
	}
	
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String,String>> info = dataTable.asMaps(String.class,String.class);
		accountPage.fillAffiliateForm(info.get(0).get("company"),
				info.get(0).get("website"),
				info.get(0).get("taxID"),
				info.get(0).get("paymentMethod"), 
				info.get(0).get("payee name"));
		
		logger.info("User filled affiliate form with given information");
		}
	
	
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		accountPage.checkAboutUS();
		logger.info("User checked on About us check box");	 
	}
	
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		accountPage.clickONContinueBttn();
		logger.info("User clicked on Continue button");	 
	}

//@BankTransfer
	@When("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		accountPage.clickONBankTransfer();
		logger.info("User clicked on Bank Transfer radio button");	 
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>> info = dataTable.asMaps(String.class,String.class);
		accountPage.fillBankForm(info.get(0).get("bankName"),
				info.get(0).get("abaNumber"),
				info.get(0).get("swiftCode"),
				info.get(0).get("accountName"), 
				info.get(0).get("accountNumber"));
		
		logger.info("User filled Bank information with below information");
	}

//@EditInfo
	
	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String,String>> info = dataTable.asMaps(String.class,String.class);
		accountPage.fillPersonalInfo(
				info.get(0).get("firstname"),
				info.get(0).get("lastName"),
				info.get(0).get("email"),
				info.get(0).get("telephone"));
		
		logger.info("User modified personal info with below information");
	}

}
