package page.object;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnDesktopTab() {
		desktopTab.click();

	}

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement lapsAndNotesTab;
	
	public void clickOnLapsAndNotesTab() {
		lapsAndNotesTab.click();
	}
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLapsAndNotes;

	public void clickOnShowAllLapsAndNotes() {
		showAllLapsAndNotes.click();
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccount;

	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	public void clickOnLogin() {
		login.click();
	}
	
	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currencyBttn;
	
	public void clickOnCcurrencyBttn() {
		currencyBttn.click();
	}
	@FindBy(name="EUR")
	private WebElement EuroBttn;
	
	public void clickOnEuroBttn() {
		EuroBttn.click();
	}
	
	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currencyBttn1;
	
	public void currencyText() {
		String actCurrency= currencyBttn1.getText();
		String expCurrency= "€ Currency ";
		Assert.assertEquals(actCurrency,expCurrency);
		}
	
	@FindBy(xpath="//p[text()='Your shopping cart is empty!']")
	private WebElement emptyCart;
	
	public void emptyCartText(String emptyMessage) {
		Assert.assertEquals(emptyCart.getText(), emptyMessage);
	}
	
	
}