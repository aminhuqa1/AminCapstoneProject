package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class AccountPage  extends Base{
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-email")
	private WebElement inputEmail;

	public void enterEmail(String email) {
		inputEmail.clear();
		inputEmail.sendKeys(email);
	}
	
	@FindBy(id = "input-password")
	private WebElement inputPass;

	public void enterPassword(String password) {
		inputPass.clear();
		inputPass.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement submitLogin;
	
	public void submitLogin() {
		submitLogin.click();
	}	
	
//My Account Dashboard
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement myAccountText;
	
	public boolean myAccountText() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(myAccountText));
		return myAccountText.isDisplayed();
	}	
	
	@FindBy(xpath="//a[text()='Register for an affiliate account']")
	private WebElement registerAffiliateAcc;
	
	@FindBy(xpath="//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateAcc;
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editYourInfo;
	
	public void clickOnAffiliateLink(String linkName) {
		switch (linkName) {
		case "Register for an Affiliate Account" : registerAffiliateAcc.click(); break;
		case "Edit your affiliate information" : editAffiliateAcc.click();break;
		case "Edit your account information" : editYourInfo.click();break;
		default: System.out.println("Incorrect link name is passed.");
		}
	}
	
	
	@FindBy(id="input-company")
	private WebElement inputCompany;
	@FindBy(id="input-website")
	private WebElement inputWebsite;
	@FindBy(id="input-tax")
	private WebElement inputTaxId;
	@FindBy(id="input-cheque")
	private WebElement inputCheque;
		
	@FindBy(xpath="//input[@value='cheque']")
	private WebElement radioCheque;
	@FindBy(xpath="//input[@value='paypal']")
	private WebElement radioPaypal;
	@FindBy(xpath="//input[@value='bank']")
	private WebElement radioBank;
	
	public void fillAffiliateForm(String company,String website,
			String taxId, String paymentMethod, String payeeName) {
		inputCompany.clear();
		inputCompany.sendKeys(company);
		inputWebsite.clear();
		inputWebsite.sendKeys(website);
		inputTaxId.clear();
		inputTaxId.sendKeys(taxId);
		inputCheque.clear();
		inputCheque.sendKeys(payeeName);
		
		switch (paymentMethod) {
		case "Cheque" : radioCheque.click(); break;
		case "PayPal" : radioPaypal.click(); break;
		case "Bank Transfer" : radioBank.click(); break;
		default  : System.out.println("Invalid payment method is passed");
		}
	}	
		
	@FindBy(name="agree")
	private WebElement aboutUsBox;
	
	public void checkAboutUS() {
		if(aboutUsBox.isDisplayed() == true && aboutUsBox.isEnabled() == true && aboutUsBox.isSelected() != true) { 
			aboutUsBox.click(); 
			}else { System.out.println("The status of check box does not return desired result!"); } 
	}

	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueBttn;
	
	public void clickONContinueBttn() {
		continueBttn.click();
	}
	
	public void clickONBankTransfer() {
		radioBank.click();
	}
	
	@FindBy(id="input-bank-name")
	private WebElement bankName;
	@FindBy(id="input-bank-branch-number")
	private WebElement branchNumber;
	@FindBy(id="input-bank-swift-code")
	private WebElement swiftCode;
	@FindBy(id="input-bank-account-name")
	private WebElement accountName;
	@FindBy(id="input-bank-account-number")
	private WebElement accountNumber;
	
	public void fillBankForm(String bName,String abaNumber,
			String swift, String aName, String aNumber) {
		bankName.clear();
		bankName.sendKeys(bName);
		branchNumber.clear();
		branchNumber.sendKeys(abaNumber);
		swiftCode.clear();
		swiftCode.sendKeys(swift);
		accountName.clear();
		accountName.sendKeys(aName);
		accountNumber.clear();
		accountNumber.sendKeys(aNumber);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	@FindBy(id="input-lastname")
	private WebElement lastName;
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	public void fillPersonalInfo(String fName,String lName,
			String email, String phone) {
		firstName.clear();
		firstName.sendKeys(fName);
		lastName.clear();
		lastName.sendKeys(lName);
		inputEmail.clear();
		inputEmail.sendKeys(email);
		telephone.clear();
		telephone.sendKeys(phone);
	}
}
