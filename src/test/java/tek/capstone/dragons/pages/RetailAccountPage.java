package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id = "profileImage")
	public WebElement profileImage;
	@FindBy(id ="nameInput")
	public WebElement nameInput;
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalUpdateButton;
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement successMessage;
	
	// locators for add payment method
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div[2]/p")
	public WebElement addPaymentMethodLink;
	@FindBy(xpath ="//*[@id=\"cardNumberInput\"]")
	public WebElement cardNumInputField;
	@FindBy(xpath ="//*[@id=\"nameOnCardInput\"]")
	public WebElement nameOfTheCardInputField;
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInputField;
	@FindBy(id ="expirationYearInput")
	public WebElement expirationYearInputField;
	@FindBy(xpath ="//*[@id=\"securityCodeInput\"]")
	public WebElement securityCodeInputField;
	@FindBy (id = "paymentSubmitBtn")
	public WebElement addYourCardBttn;
	@FindBy (xpath = "//div[text()= 'Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSuccessMessag;
	
	// Edit payment method
	@FindBy(xpath = "//div[@class='account__payment']//button[text()='Edit']")
	public WebElement creditDebitCardEditBttn;
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdatedSuccessMsg;
	
	
	// remove payment method
	@FindBy(xpath = "//p[@class= 'account__payment__sub-text']")
	public List<WebElement> cardEndingNum;
	@FindBy (xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")
	public WebElement removeCardBttn;

	
	// Add Address
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div/div")
	public WebElement addAddressLink;
	@FindBy(name= "country")
	public WebElement countryDropdown;
	@FindBy(id = "fullNameInput")
	public WebElement addressNameInputField;
	@FindBy(id = "phoneNumberInput")
	public WebElement addressPhoneInputField;
	@FindBy(id = "streetInput")
	public WebElement addressStreetInputField;
	@FindBy(id = "apartmentInput")
	public WebElement addressAptInputField;
	@FindBy(id = "cityInput")
	public WebElement addressCityInputField;
	@FindBy(name ="state")
	public WebElement addressStateInputField;
	@FindBy(id = "zipCodeInput")
	public WebElement addressZipcodeInputField;
	@FindBy(id = "addressBtn")
	public WebElement addressAddAddressBttn;
	@FindBy (xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfully;
	
	// Edit address
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[1]")
	public WebElement addressEditOption;
	@FindBy(xpath = "//*[@id=\"xanlmwa\"]/div[1]/div[2]")
	public WebElement addressUpdatedSuccessfully;
	
	// Remove address method
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[2]")
	public WebElement addressRemoveOption;
	
	
	//@FindBy (id ="orderLink")
	//public WebElement orderOption;
	

	
}
