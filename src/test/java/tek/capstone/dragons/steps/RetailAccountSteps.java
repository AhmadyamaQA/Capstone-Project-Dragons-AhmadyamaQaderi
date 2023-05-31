package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on account option");
	}

	@When("User should be logged into Account")
	public void userShouldBeLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));

	}

	// UpdateInfoScenario
	@And("User update Name {string} and phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		// clearTextUsingSendKeys(factory.accountPage().nameInput);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().nameInput, nameValue);
		sendText(factory.accountPage().phoneInput, phoneValue);
		logger.info("user updated the name and phone value");

	}

	@And("User click on update button")
	public void userClickOnUpdateButton() {
		waitTillPresence(factory.accountPage().personalUpdateButton);
		click(factory.accountPage().personalUpdateButton);
		logger.info("user clicked on update button");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShoulBeUpdated() {
		waitTillPresence(factory.accountPage().successMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().successMessage));
		logger.info("User Profile Information Updated");

	}

	// Add card method
	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
		logger.info("Add payment selected");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) throws InterruptedException {
		Thread.sleep(2000);
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumInputField, paymentInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOfTheCardInputField, paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthInputField, paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearInputField, paymentInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInputField, paymentInfo.get(0).get("securityCode"));
		logger.info("Card information entered");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		getElementText(factory.accountPage().addYourCardBttn);
		click(factory.accountPage().addYourCardBttn);
		logger.info("Add your card button was cliked successfully");

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMssg) {
		if (expectedMssg.contains("Payment")) {
			waitTillPresence(factory.accountPage().paymentMethodAddedSuccessMessag);
			Assert.assertEquals(expectedMssg, factory.accountPage().paymentMethodAddedSuccessMessag.getText());
			logger.info(expectedMssg + " is displayed");

		} else if (expectedMssg.contains("Updated")) {
			waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccessMsg);
			Assert.assertEquals(expectedMssg, factory.accountPage().paymentMethodUpdatedSuccessMsg.getText());
			logger.info(expectedMssg + "is displayed");

//		} else if (expectedMssg.contains("Order Placed")) {
//			waitTillPresence(factory.retailorderpage().orderPlaceSuccessllyMsg);
//			Assert.assertEquals(expectedMssg, factory.retailorderpage().orderPlaceSuccessllyMsg);
//			logger.info(expectedMssg + "message was verified successfully");
//
		}
	}

	// Edit card method
	@Then("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.accountPage().creditDebitCardEditBttn);
		logger.info("Edit button was clicked successfully");
	}

	@Then("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) throws InterruptedException {
		Thread.sleep(3000);
		List<Map<String, String>> UserEditInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumInputField);
		sendText(factory.accountPage().cardNumInputField, UserEditInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOfTheCardInputField);
		sendText(factory.accountPage().nameOfTheCardInputField, UserEditInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthInputField,
				UserEditInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearInputField, UserEditInfo.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInputField);
		sendText(factory.accountPage().securityCodeInputField, UserEditInfo.get(0).get("securityCode"));
		logger.info("User updated card info successfully");

	}

	@Then("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().addYourCardBttn);
		logger.info("User click on update payment button successfully");
	}

	// Remove card method
	@When("User select the card ending with {string}")
	public void userSelectTheCardEndingWith(String string) throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> cards = factory.accountPage().cardEndingNum;
		for (WebElement card : cards) {
			if (card.getText().contains(string)) {
				System.out.println(card.getText());
				click(card);
				logger.info(string + "is selected");
				break;
			}
		}
	}

	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().removeCardBttn);
		logger.info("Remove button was cliked successfully");

	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("Payment method removed");
	}

	// Add Address
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressLink);
		logger.info("Address Link was clicked successfully");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformations(DataTable dataTable) {
		List<Map<String, String>> UserInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropdown, UserInfo.get(0).get("country"));
		sendText(factory.accountPage().addressNameInputField, UserInfo.get(0).get("fullName"));
		sendText(factory.accountPage().addressPhoneInputField, UserInfo.get(0).get("phoneNumber"));
		sendText(factory.accountPage().addressStreetInputField, UserInfo.get(0).get("streetAddress"));
		sendText(factory.accountPage().addressAptInputField, UserInfo.get(0).get("apt"));
		sendText(factory.accountPage().addressCityInputField, UserInfo.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInputField, UserInfo.get(0).get("state"));
		sendText(factory.accountPage().addressZipcodeInputField, UserInfo.get(0).get("zipCode"));
		logger.info("User entered address info successfully");
	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() throws InterruptedException {
		Thread.sleep(2000);
		click(factory.accountPage().addressAddAddressBttn);
		logger.info("Add Address button was clicked successfully");
	}

	@Then("A message should be display {string}")
	public void aMessageShouldBeDisplay(String expectedMsg) {

		if (expectedMsg.contains("Address")) {
			waitTillPresence(factory.accountPage().addressAddedSuccessfully);
			Assert.assertEquals(expectedMsg, factory.accountPage().addressAddedSuccessfully.getText());
			logger.info(expectedMsg + "is displayed");
		}
	}

	// Edit Address Method
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().addressEditOption);
		logger.info("Edit option was cliked successfully");
	}

	@When("User fill new address form with below informations")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> EditAddress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropdown, EditAddress.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().addressNameInputField);
		sendText(factory.accountPage().addressNameInputField, EditAddress.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().addressPhoneInputField);
		sendText(factory.accountPage().addressPhoneInputField, EditAddress.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().addressStreetInputField);
		sendText(factory.accountPage().addressStreetInputField, EditAddress.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().addressAptInputField);
		sendText(factory.accountPage().addressAptInputField, EditAddress.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().addressCityInputField);
		sendText(factory.accountPage().addressCityInputField, EditAddress.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInputField, EditAddress.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().addressZipcodeInputField);
		sendText(factory.accountPage().addressZipcodeInputField, EditAddress.get(0).get("zipCode"));
		logger.info("User entered new address info successfully");

	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().addressAddAddressBttn);
		logger.info("Update your address clicked successfully");

	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully(String expectedMssg) {
		if (expectedMssg.contains("Address Updated Successfully")) {
			waitTillPresence(factory.accountPage().addressUpdatedSuccessfully);
			Assert.assertEquals(expectedMssg, factory.accountPage().addressUpdatedSuccessfully.getText());
			logger.info(expectedMssg + " is displayed");
		}

	}
	// Remove address method

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().addressRemoveOption);
		logger.info("Remove button cliced successfully");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("Address successfully removed");
	}
}
