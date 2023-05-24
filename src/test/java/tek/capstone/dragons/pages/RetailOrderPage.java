package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderPage extends CommonUtility {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(id = "search")
	public WebElement allDepartmentsDropdown;
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	@FindBy(id = "searchBtn")
	public WebElement searchBttn;
	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlugItem;
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement producQtyDropdown;
	@FindBy(xpath= "//span[text()='Add to Cart']")
	public WebElement addToCardBttn;
	@FindBy(id = "cartQuantity")
	public WebElement cartQtyField;
	
	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendsItem;
	@FindBy(id ="proceedBtn")
	public WebElement proccedToCheckOutBtn;
	@FindBy(xpath = "//*[@id=\"placeOrderBtn\"]")
	public WebElement placeOrderBttn;
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement orderPlaceSuccessllyMsg;

	// cancel order locators
	@FindBy(xpath = "//*[@id=\"orderLink\"]")
	public WebElement orderBttn;
	@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
	public List<WebElement> listOfOrder;
	@FindBy(xpath = "//div[@class='order']//descendant::button[@id='cancelBtn']")
	public List<WebElement> cancelBttn;
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div/div[2]/div/p[2]")
	public WebElement showDetails;
	@FindBy(id = "reasonInput")
	public WebElement cancelationReasonBttn;
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrderBttn;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/p")
	public WebElement yourOrderHasBeenCancelled;
	
	// Return Order locatores
	@FindBy(id = "returnBtn")
	public WebElement returnItemBttn;
	@FindBy(id = "reasonInput")
	public WebElement reasonInputBttn;
	@FindBy(id ="dropOffInput")
	public WebElement dropOffInputBttn;
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOrderSubmitBttn;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div/div/p")
	public WebElement returnWasSuccessfull;
	
	// Review on Order Placed
	@FindBy(xpath = "//*[@id=\"reviewBtn\"]")
	public WebElement reviewBttn;
	@FindBy(xpath = "//*[@id=\"headlineInput\"]")
	public WebElement headlineInputText;
	@FindBy(xpath = "//*[@id=\"descriptionInput\"]")
	public WebElement reviewTextInputText;
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addYourReviewBttn;
	@FindBy(xpath = "//*[@id=\"ek2ny8n\"]/div[1]/div[2]")
	public WebElement yourReviewWasAddedSuccessfully;
	
	
	
}