package page.object;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base{
	String prName;

	public DesktopsPage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='image']//a//img")
	private List<WebElement> items;
	
	public List<WebElement> allItems() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;
	}
	
	//By using concat function and button location number
	@FindBy(xpath="//button[@onclick=concat('cart.add(',\"'47', '1');\")]")
	private WebElement addproductHP;
	
	//By using " instead of '
//	@FindBy(xpath="//button[@onclick=\"cart.add('47', '1');\"]")
//	private WebElement addproductHP;
	
	//By index of buttons. we can use this for all buttons of the page
//	@FindBy(xpath="(//button[@type='button']) [15]")
//	private WebElement addproductHP;
		
	//By using contains function and button location numbers
//	@FindBy(xpath="//button[contains(@onclick,'cart.add') and contains(@onclick,'47')]")
//	private WebElement addproductHP;
	
	//By using the name of the product
//	@FindBy(xpath="//a[text()='HP LP3065']//ancestor::div[@class='caption']//following-sibling::div//button[contains(@onclick,'cart.add')]")
//	private WebElement addproductHP;
	
	//Trying to find a dynamic locator which changes be name of each product.
	//Cannot use driver.findaElement with @FindBy in the same class.
//	private WebElement addproduct = driver.findElement(By
//			.xpath("//button[contains(@onclick,'cart.add')]//ancestor::div//a[text()='"+this.prName+"']"));
	
	public void clickOnAddToCartHP () {
		addproductHP.click();
	}
	

	//By using concat function and button location number
	@FindBy(xpath="//button[@onclick=concat('cart.add(',\"'30', '1');\")]")
	private WebElement addCanon5D;
	
	//By using " instead of '
//	@FindBy(xpath="//button[@onclick=\"cart.add('30', '1');\"]")
//	private WebElement addproductHP;
	
	//By using contains function and button location numbers
//	@FindBy(xpath="//button[contains(@onclick,'cart.add') and contains(@onclick,'30')]")
//	private WebElement addCanon5D;
	
	//By using the name of the product
//	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']//ancestor::div[@class='caption']//following-sibling::div//button[contains(@onclick,'cart.add')]")
//	private WebElement addCanon5D;
	
	public void clickOnAddToCart5D () {
		addCanon5D.click();
	}
	
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement canon5D;
	
	public void clickOnCanon5D () {
		canon5D.click();
	}
	
	
	
	
	
	
	
	
	
	
}
