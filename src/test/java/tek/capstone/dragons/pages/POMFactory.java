package tek.capstone.dragons.pages;

import tek.capstone.dragons.base.BaseSetup;

public class POMFactory extends BaseSetup{

	private SignInPage  signinpage;
	private HomePage homePage;
	private RetailAccountPage accountPage;
	private RetailOrderPage retailorderpage;

	
	
	public POMFactory () {
		
		this.signinpage = new SignInPage();
		this.homePage = new HomePage();
		this.accountPage = new RetailAccountPage();
		this.retailorderpage = new RetailOrderPage();
}
	public SignInPage signinpage() {
		return this.signinpage;
	}


	public HomePage homePage() {
		return this.homePage;
	}
	
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
	public RetailOrderPage retailorderpage() {
		return this.retailorderpage;
	}
	
}
