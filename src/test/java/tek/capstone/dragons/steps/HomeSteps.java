package tek.capstone.dragons.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	// @AllSection
	// Scenario: Verify Shop by Department sidebar
	@When("User click on All section")
	public void userClickedOnAllSection() {
		click(factory.homePage().All);
		logger.info("User clicked on All Section successfully");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable Options) {
		List<List<String>> optionsToDisplay = Options.asLists(String.class);
		Assert.assertTrue(isElementDisplayed(
				getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']"))));
				logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
	}
	
	
	  //@Department;
	  //Scenario Outline: Verify department sidebar options
			
	      String department;

		@When("User is on {string}")
		public String userOnElectronics(String department) {

		switch (department) {
		case "Electronics":
			Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
			logger.info("user is on Electronics section");
			break;
			
		case "Computers":
			Assert.assertTrue(isElementDisplayed(factory.homePage().computer));
			logger.info("user is on Computers section");
			break;

		case "Smart Home":
			Assert.assertTrue(isElementDisplayed(factory.homePage().smarthome));
			logger.info("user is on Smart Home section");
			break;
			
		case "Sports":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Sports));
			logger.info("user is on Sports section");
			break;
			
		case "Automotive":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Automative));
			logger.info("user is on Automotive section");
			break;
		default:
		}
		
		return this.department = department;
	   
	}
		@When("User on then below options are present in department")
		public void userOnThenBelowOptionsArePresentInDepartment(DataTable dataTable) {
			List<List<String>> department = dataTable.asLists();
			
		switch ("department") {
			case "Electronics":
			click(factory.homePage().electronics);
			String video = getText(factory.homePage().VideoGames);
			String TVAndVideo = getText(factory.homePage().TvAndVideo);
			Assert.assertEquals(TVAndVideo, department.get(0).get(0));
			Assert.assertEquals(video, department.get(0).get(1));
			logger.info(video + " options are present in department" + TVAndVideo);
			break;
			
			case "Computers":
			click(factory.homePage().computer);
			String Accessories = getText(factory.homePage().Accessories);
			String Networking = getText(factory.homePage().Networking);
			Assert.assertEquals(Accessories, department.get(0).get(0));
			Assert.assertEquals(Networking, department.get(0).get(1));
			logger.info(Accessories + " options are present in department" + Networking);
			break;
			case "Smart Home":
			click(factory.homePage().smarthome);
			String SmartHomeLightning = getText(factory.homePage().smarthomelightning);
			String PlugsandOutlets = getText(factory.homePage().plugsandoutlets);
			Assert.assertEquals(SmartHomeLightning, department.get(0).get(0));
			Assert.assertEquals(PlugsandOutlets, department.get(0).get(1));
			logger.info(SmartHomeLightning + " options are present in department" + PlugsandOutlets);
			break;
			case "Sports":
			click(factory.homePage().Sports);
			String AthleticClothing = getText(factory.homePage().AthleticClothing);
			String ExerciseFitness = getText(factory.homePage().ExerciseFitness);
			Assert.assertEquals(AthleticClothing, department.get(0).get(0));
			Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
			logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
			break;
			case "Automotive":
			click(factory.homePage().Automative);
			String AutomativePartsAccessories = getText(factory.homePage().AutomativePartsAccessories);
			String MotorCyclePowersports = getText(factory.homePage().MotorCyclePowersports);
			Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
			Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
			logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
			break;
			
					}
			}
}