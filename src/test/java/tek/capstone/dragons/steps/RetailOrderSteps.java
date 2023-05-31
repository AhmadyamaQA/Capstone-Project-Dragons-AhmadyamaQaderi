package tek.capstone.dragons.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String SmartHome) {
		selectByVisibleText(factory.retailorderpage().allDepartmentsDropdown, SmartHome);
		logger.info(SmartHome + "option is selected successfully");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaoutdoorsmartplug) {
		sendText(factory.retailorderpage().searchInputField, kasaoutdoorsmartplug);
		logger.info(kasaoutdoorsmartplug + "item name was entered successfully");
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailorderpage().searchBttn);
		logger.info("search button was clicked successfully");

	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.retailorderpage().kasaOutdoorSmartPlugItem);
		logger.info("item was clicked successfully");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(factory.retailorderpage().producQtyDropdown, itemQty);
		logger.info(itemQty + "was selected successfully");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailorderpage().addToCardBttn);
		logger.info("add to cart button was clicked successfully");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		Assert.assertEquals(string, factory.retailorderpage().cartQtyField.getText());
		logger.info(string + "quantity was displayed in the cart");

	}

	// checkout item to the card and check out

	@When("User search for an item Apex Legends {string}")
	public void userSearchForAnItemApexLegends(String ApexLegends) {
		sendText(factory.retailorderpage().searchInputField, ApexLegends);
		logger.info(ApexLegends + "entered successfully");

	}

	@When("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(factory.retailorderpage().apexLegendsItem);
		logger.info("item was clicked successfully");
	}

	@When("User select Apex Legends quantity {string}")
	public void userSelectApexLegendsQuantity(String itemQty) {
		selectByVisibleText(factory.retailorderpage().producQtyDropdown, itemQty);
		logger.info(itemQty + " quantity was selected successfully");
	}

	@Then("the cart icon quantity Apex Legends should change to {string}")
	public void theCartIconQuantityApexLegendsShouldChangeTo(String expectedQty) {
		Assert.assertEquals(expectedQty, factory.retailorderpage().cartQtyField.getText());
		logger.info(expectedQty + "quantity was validated successfuly");
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.retailorderpage().cartBttn);
		logger.info("cart button was clicked successfully");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.retailorderpage().proccedToCheckOutBtn);
		logger.info("procced to checkout button was clicked successfully");

	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailorderpage().placeOrderBttn);
		logger.info("Place your order button was clicked successfully");

	}

	@Then("a message should be displayed 'Order Placed Successfully'​​​​​​​")
	public void aMessageShouldBeDisplayedOrderPlacedSuccessfully​​​​​​​() {

	}

	// Cancel Order Method
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailorderpage().orderBttn);
		logger.info("Orders button clicked successfully");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrders = factory.retailorderpage().listOfOrder;
		for (int i = 0; i < listOfOrders.size(); i++) {
			if (listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {

			} else if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(factory.retailorderpage().showDetails);
			}
		}

	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		List<WebElement> listOfCencelOptions = factory.retailorderpage().cancelBttn;
		for (int i = 0; i < listOfCencelOptions.size(); i++) {
		click(listOfCencelOptions.get(0));
		logger.info("Cancel the order button was clicked Successfully");
		break;
		}
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String Boughtwrongitem) {
		click(factory.retailorderpage().cancelationReasonBttn);
		selectByVisibleText(factory.retailorderpage().cancelationReasonBttn,Boughtwrongitem);
		logger.info("cacelation reason button was selected");

	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.retailorderpage().cancelOrderBttn);
		logger.info("cancel order button was clicked successfully");

	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled​​​​​​​(String cancelOrder) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(isElementDisplayed(factory.retailorderpage().yourOrderHasBeenCancelled));
		logger.info("Your Order has been cancelled message has been displayed");
	}
	
	// Return Order Method
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.retailorderpage().returnItemBttn);
		logger.info("return button was clicked successfully");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String Itemdamaged) {
		selectByVisibleText(factory.retailorderpage().reasonInputBttn, Itemdamaged);
		logger.info(Itemdamaged + "was selected");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String FedEx) {
		selectByVisibleText(factory.retailorderpage().dropOffInputBttn, FedEx);
		logger.info(FedEx + " service was selected");

	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.retailorderpage().returnOrderSubmitBttn);
		logger.info("return order button was clicked successfully");
	}
	@Then("a cancelation message should be displayed 'Return was successful'​​​​​​​")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful​​​​​​​() {
		Assert.assertTrue(isElementDisplayed(factory.retailorderpage().returnWasSuccessfull));
		logger.info("Return was successfull message diplayed");
		
	}
	
	// Review On Order Placed
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.retailorderpage().reviewBttn);
		logger.info("Review button was clicked");

	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string1) {
		sendText(factory.retailorderpage().headlineInputText,string );
		sendText(factory.retailorderpage().reviewTextInputText, string1);
		logger.info("User successfully write comment in Review section");

	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.retailorderpage().addYourReviewBttn);
		logger.info("Add Your Review button was clicked successfully");

	}
	@Then("a review message should be displayed 'Your review was added successfully'​​​​​​​")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully​​​​​​​() {
		Assert.assertTrue(isElementDisplayed(factory.retailorderpage().yourReviewWasAddedSuccessfully));
		logger.info("Your review was added successfully");

	}
}
