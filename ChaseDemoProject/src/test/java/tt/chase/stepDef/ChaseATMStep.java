package tt.chase.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.chase.pageAction.ChaseActions;
import tt.chase.pageAction.ChaseHomepageActions;

public class ChaseATMStep {
	
	 ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	 ChaseActions ChaseActionsObj = new ChaseActions();
	 
	 
	@Given("^Open Chase website$")
	public void open_Chase_website() throws Throwable {
		ChaseHomepageActionsObj.loadChaseHomepage();
	}

	@When("^Click Site Map$")
	public void click_Site_Map() throws Throwable {
		ChaseActionsObj.selectSiteMap();
	}
	
	@When("^Select ATM$")
	public void select_ATM() throws Throwable {
		ChaseActionsObj.selectATM();
	}
	
	@When("^Enter \"([^\"]*)\"$")
	public void enter(String zipcode) throws Throwable {
	    ChaseActionsObj.selectZip(zipcode);
	    ChaseActionsObj.selectSearch();
	}

	@When("^Select closest branch$")
	public void select_closest_branch() throws Throwable {
		ChaseActionsObj.selectBranch();
	}

	@Then("^Validate with ATM \"([^\"]*)\"$")
	public void validate_with_ATM(String arg1) throws Throwable {
	    ChaseActionsObj.selectLanguage();
	    ChaseActionsObj.selectNone();
	}
}