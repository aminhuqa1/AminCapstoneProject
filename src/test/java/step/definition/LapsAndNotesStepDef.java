package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.HomePage;
import page.object.LapsAndNotesPage;
import page.object.ProductsPage;
import utilities.Util;

public class LapsAndNotesStepDef extends Base {

	HomePage homePage = new HomePage();
	LapsAndNotesPage lapsAndNotesPage = new LapsAndNotesPage();
	ProductsPage productsPage= new ProductsPage();

	
// Background

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		homePage.clickOnLapsAndNotesTab();
		logger.info("User clicked on Laptop & NoteBook tab");
	  	}
	
	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		homePage.clickOnShowAllLapsAndNotes();
		logger.info("User clicked on Show all Laptop & NoteBook option");
	}
	
//@AddAndRemoveMac
	
	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		lapsAndNotesPage.clickOnItem(string);
		logger.info("User clicked on item");
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		String tag =lapsAndNotesPage.cartPriceTag(); 
		Assert.assertEquals(tag, string);
		logger.info("User sees \""+ string+"\" showed to the cart");
	}
	
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		productsPage.clickOnCartOption();
		logger.info("User clicked on cart option");
	}
	
	@Then("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		productsPage.clickOnCartRemove();
		try {Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();		}
		logger.info("User clicked on red X button to remove the item from cart");
	
		Util.takeScreenShot();
	}
	
//@ProductComparison
	
	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		lapsAndNotesPage.clickOnCompare(string);
		logger.info("User clicked on product comparison icon on "+ string);
	}
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		try {Thread.sleep(2000);
		} catch (InterruptedException e) {e.printStackTrace();}
		lapsAndNotesPage.clickOnProductCompare();
		logger.info("User clicked on Product comparison link");
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	    productsPage.CompareTablePresence();
		logger.info("User sees Product Comparison Chart");
	
		Util.takeScreenShot();
	}
	
//@AddToWish	
	
	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		lapsAndNotesPage.clickOnAddToWish(string);
		logger.info("User click on heart icon to add \""+ string +"\" laptop to wish list");
		try {Thread.sleep(2000);}
		catch (InterruptedException e) {e.printStackTrace();}
	
		Util.takeScreenShot();
	}

//@MacProPrice
	
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		productsPage.priceTagPresence(string);
		logger.info("User sees "+ string + " price tag is present on UI.");
		
		Util.takeScreenShot();
	}
	
}
