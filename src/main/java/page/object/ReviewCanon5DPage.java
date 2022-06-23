package page.object;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class ReviewCanon5DPage extends Base{
	
	public ReviewCanon5DPage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement yourName;
	
	public void enterYourName(String name) {
		yourName.sendKeys(name);
	}
	
	@FindBy(id="input-review")
	private WebElement yourReview;
	
	public void enterYourReview(String review) {
		yourReview.sendKeys(review);
	}
	
	@FindBy(xpath="//input[@value=1]")
	private WebElement rating5D1 ;
	@FindBy(xpath="//input[@value=2]")
	private WebElement rating5D2 ;
	@FindBy(xpath="//input[@value=3]")
	private WebElement rating5D3 ;
	@FindBy(xpath="//input[@value=4]")
	private WebElement rating5D4 ;
	@FindBy(xpath="//input[@value=5]")
	private WebElement rating5D5 ;
	
	public void rating5D(String value) {
		switch (value) {
		case "1" : rating5D1.click(); break;
		case "2" : rating5D2.click(); break;
		case "3" : rating5D3.click(); break;
		case "4" : rating5D4.click(); break;
		case "5" : rating5D5.click(); break;
		default  : System.out.println("Rating should be 1 to 5");
		}
		}
	
	@FindBy(css="button#button-review")
	private WebElement coninueBtn ;
	
	public void clickOnConinueBtn5D() {
		coninueBtn.click();
	}
	
}
