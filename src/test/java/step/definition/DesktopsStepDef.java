package step.definition;
 
import java.util.List; 

import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.DesktopsPage;
import page.object.HomePage;
import page.object.ProductsPage;
import page.object.ReviewCanon5DPage;
import utilities.Util;

public class DesktopsStepDef extends Base  {

	HomePage homePage = new HomePage();
	DesktopsPage desktopsPage = new DesktopsPage();
	ProductsPage productsPage= new ProductsPage();
	ReviewCanon5DPage reviewCanon5DPage = new ReviewCanon5DPage();

// Background
		
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(homePage.isLogoDisplayed()); 
		logger.info("User is on Retail website");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		homePage.clickOnDesktopTab();
		logger.info("User clicked on Desktops tab");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		homePage.clickOnShowAllDesktops();
		logger.info("User clicked on Show all desktops");
	}

//@DesktopsItemPresence
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> elements = desktopsPage.allItems();
		for(WebElement ele:elements) {
			Assert.assertTrue(ele.isDisplayed());
			logger.info("\"" + ele.getAttribute("title")+"\"" + " is present in this page");
		}
		logger.info("All items are present in Desktop page");
		Util.takeScreenShot();
		
	}

//@AddHP3065

	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_HP_LP3065_item() {
		desktopsPage.clickOnAddToCartHP();
		logger.info("User clicked ADD TO CART option on HP LP3065 item");

	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		productsPage.selectQuantity(int1);
		logger.info("User selected quantity "+ int1);
	}

	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		productsPage.clickOnAddToCart();
		logger.info("User clicked add to Cart button");

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		productsPage.successMessage(string);
		logger.info("User can see the success message");
		
		Util.takeScreenShot();
	}
	
//@AddCanon5D
	
	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_Canon_EOS_5D_item() {
		desktopsPage.clickOnAddToCart5D();
		logger.info("User clicked ADD TO CART option on Canon EOS 5D item");
	}

	
	@When("User select color from dropdown {string}")
	public void user_select_color_from_dropdown(String string) {
		productsPage.selectOption(string);
		logger.info("User selected color from dropdown Red");
	}

//@AddReviewCanon5D

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopsPage.clickOnCanon5D();
		logger.info("User clicked on Canon EOS 5D item");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		productsPage.writeReveiw5D();
		logger.info("User clicked on write a review link");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>> info = dataTable.asMaps(String.class,String.class);
		reviewCanon5DPage.enterYourName(info.get(0).get("yourName"));
		reviewCanon5DPage.enterYourReview(info.get(0).get("yourReview"));
		reviewCanon5DPage.rating5D(info.get(0).get("Rating"));
		logger.info("user filled the review information with given information");
		}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		reviewCanon5DPage.clickOnConinueBtn5D();
		logger.info("User clicked on Continue Button");
	}

}