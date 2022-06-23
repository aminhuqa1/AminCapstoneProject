package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LapsAndNotesPage extends Base {

	public LapsAndNotesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath="//img[@title='MacBook Pro']")
	private WebElement macBookPro;
	
	public void clickOnItem(String item) {
		switch (item) {
		case "MacBook" : macBook.click(); break;
		case "MacBook Pro" : macBookPro.click();
		default: System.out.println("Incorrect item name is passed.");
		}
	}
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartPriceTag;
	
	public String cartPriceTag() {
	return cartPriceTag.getText();
	}
	
	
	@FindBy(xpath="//button[contains(@onclick,'compare.add') and contains(@onclick,'43')]")
	private WebElement compareMacBook;
	
	@FindBy(xpath="//button[contains(@onclick,'compare.add') and contains(@onclick,'44')]")
	private WebElement compareMacBookAir;
	
	public void clickOnCompare(String itemToCompare) {
		switch (itemToCompare) {
		case "MacBook" : compareMacBook.click(); break;
		case "MacBook Air" : compareMacBookAir.click(); break;
		default: System.out.println("Incorrect item name is passed.");
		}
	}
	
	@FindBy(id="compare-total")
	private WebElement productCompare;

	public void clickOnProductCompare () {
		productCompare.click();
	}
	
	
	@FindBy(xpath="//button[contains(@onclick,'wishlist.add') and contains(@onclick,'46')]")
	private WebElement addToWishSony;

	public void clickOnAddToWish(String itemName) {
		switch (itemName) {
		case "Sony VaIO" : addToWishSony.click(); break;
		default: System.out.println("Incorrect item name is passed.");
		}
	}
	
	
	
	
}
