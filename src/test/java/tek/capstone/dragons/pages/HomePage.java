package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class HomePage extends BaseSetup {

	public HomePage() {
		PageFactory.initElements(getDriver(), this);

	}
	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement retailLogo;

	@FindBy(id = "signinLink")
	public WebElement signInOption;
	
	@FindBy (linkText = "Account")
	public WebElement accountOption;
	
	@FindBy(linkText ="Orders")
	public WebElement ordersOption;
	
	@FindBy(id = "logoutBtn")
	public WebElement logOutOption;
	
	@FindBy(id ="hamburgerBtn")
	public WebElement All;
	
	@FindBy(xpath ="search\"]/option[2]")
	public WebElement electronics;
	
	@FindBy(xpath = "//*[@id=\"search\"]/option[3]")
	public WebElement computer;
	
	@FindBy (xpath = "//*[@id=\"search\"]/option[4]")
	public WebElement smarthome;
	
	@FindBy (xpath = "//*[@id=\"search\"]/option[5]")
	public WebElement Sports;
	
	@FindBy(xpath = "//*[@id=\"search\"]/option[6]")
	public WebElement Automative;
	
	@FindBy (xpath = "//*[@id=\"sidebar\"]/div[2]/div[2]/span")
	public WebElement VideoGames;
	
	@FindBy (xpath = "//*[@id=\"sidebar\"]/div[2]/div[1]")
	public WebElement TvAndVideo;
	
	@FindBy (xpath = "//*[@id=\"sidebar\"]/div[2]/div[1]")
	public WebElement Accessories;
	
	@FindBy (xpath = "//*[@id=\"sidebar\"]/div[2]/div[2]")
	public WebElement Networking;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div[2]/div[1]/span")
	public WebElement smarthomelightning;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div[2]/div[2]/span")
	public WebElement plugsandoutlets;
	
	@FindBy (xpath ="//*[@id=\"sidebar\"]/div[2]/div[1]/span")
	public WebElement AthleticClothing;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div[2]/div[2]/span")
	public WebElement ExerciseFitness;
	
	@FindBy (xpath = "//*[@id=\"home\"]/div[2]/div[1]/div[5]/div/div/div[1]/p")
	public WebElement AutomativePartsAccessories;
	
	@FindBy(xpath = "//*[@id=\"home\"]/div[2]/div[1]/div[5]/div/div/div[2]/p")
	public WebElement MotorCyclePowersports;
	
	
	
	
	
	
	

	
	
	


	
	
	
}