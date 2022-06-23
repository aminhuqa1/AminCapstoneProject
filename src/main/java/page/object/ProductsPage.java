package page.object;

import org.junit.Assert;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

//This class stores elements in all products pages

public class ProductsPage extends Base {
	
	public ProductsPage () {
		PageFactory.initElements(driver, this);
	}
	
//HP page objects	
	@FindBy(name="quantity")
	private WebElement quantity;
	
	public void selectQuantity (Integer qty) {
		quantity.clear();
		quantity.sendKeys(qty.toString());;
	}
	
	@FindBy(css="button#button-cart")
	private WebElement addToCart;

	public void clickOnAddToCart () {
		addToCart.click();
	}
	
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	private WebElement successMessage;
	@FindBy(xpath="//button[text()='×']")
	private WebElement xButton;
	
	public void successMessage (String ExpMessage) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(successMessage));
		String actMessageAll = successMessage.getText();
		String actMessageFin = actMessageAll.replace("\n×", "");
		Assert.assertEquals(actMessageFin, ExpMessage);
		}
	

//5D camera elements

	@FindBy(id="input-option226")
	private WebElement optionsDropDown5D;
	
	public void selectOption(String color) {
	Select select = new Select(optionsDropDown5D);
	select.selectByVisibleText(color);
}
	
	@FindBy(css="button#button-cart")
	private WebElement addToCart5D;

	public void clickOnAddToCart5DPage () {
		addToCart5D.click();
	}
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement writeReveiw5D;
	
	public void writeReveiw5D() {
		writeReveiw5D.click();
	}
	
//MacBook
	@FindBy(xpath="//button[contains(@class,'btn btn-inverse btn')]")
	private WebElement cartOption;

	public void clickOnCartOption () {
		cartOption.click();
	}
	
	@FindBy(xpath="//button[contains(@onclick,'cart.remove(')]")
	private WebElement cartRemove;

	public void clickOnCartRemove () {
		cartRemove.click();
	}

//Comparison page
	@FindBy(css="table[class='table table-bordered']")
	private WebElement CompareTable;

	public void CompareTablePresence () {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(CompareTable));
		CompareTable.isDisplayed();
	}
	
	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement priceTag;

	public void priceTagPresence (String expProPrice) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(priceTag));
		String actProPrice = priceTag.getText();
		Assert.assertEquals(actProPrice, expProPrice);
	}
	
	
	
}
