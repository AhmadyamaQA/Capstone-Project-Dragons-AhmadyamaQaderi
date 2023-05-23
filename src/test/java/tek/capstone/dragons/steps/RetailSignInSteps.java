package tek.capstone.dragons.steps;

import tek.capstone.dragons.utilities.CommonUtility;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;

public class RetailSignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().retailLogo));
		logger.info("Retail website opened and verified");

	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user clicked on sign in option");

	}

	@Then("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signinpage().emailField, email);
		sendText(factory.signinpage().passwordField, password);
		logger.info(email + ": was entered");

	}

	@Then("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signinpage().loginButton);
		logger.info("login button was clicked");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		waitTillPresence(factory.homePage().accountOption);
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().ordersOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutOption));
		logger.info("user logged into account");
	}
	// Create new account
	@Then("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signinpage().newAccountButton);
		logger.info("New account button was clicked");
	}

	@Then("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			sendText(factory.signinpage().nameInputBox, row.get("name"));
			sendText(factory.signinpage().emailInputBoxSignUp, row.get("email"));
			sendText(factory.signinpage().passwordInputBoxSignUp, row.get("password"));
			sendText(factory.signinpage().passwordConfirmBox, row.get("confirmPassword"));
			logger.info("Registration info entered");
		}
	}

	@Then("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signinpage().SignUpButton);
		logger.info("Sign up button was clicked");
	}
	@Then ("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		click(factory.signinpage().accountOption);
	}
}
