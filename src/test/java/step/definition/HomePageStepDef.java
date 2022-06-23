package step.definition;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.HomePage;
import utilities.Util;

public class HomePageStepDef extends Base {
	HomePage homePage = new HomePage();

	
//@CurrencyChange
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCcurrencyBttn();
		logger.info("User clicked on Currency");	 
	}
	
	@When("User choose Euro from dropdown")
	public void user_choose_euro_from_dropdown() {
		homePage.clickOnEuroBttn();
		logger.info("User chose Euro from dropdown");	 
	}
	
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePage.currencyText();
		logger.info("Currency value changed to Euro");	 

		Util.takeScreenShot();
	}
	
		
//@EmptyCart
	
	@Then("{string} message should display")
	public void message_should_display(String string) {
		homePage.emptyCartText(string);
		logger.info("\""+string+"\" message is displayed");	 

		Util.takeScreenShot();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
