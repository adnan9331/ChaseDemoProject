package tt.chase.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.chase.pageAction.ChaseActions;
import tt.chase.pageAction.ChaseHomepageActions;

public class ChaseSearch{
	
	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	ChaseActions ChaseActionsObj = new ChaseActions();
	
	@When("^Click search icon$")
	public void click_search_icon() throws Throwable {
	    ChaseActionsObj.selectSrchBtn();
	}

	@When("^Enter Home Loan$")
	public void enter_Home_Loan() throws Throwable {
		ChaseActionsObj.selectBar();
		ChaseActionsObj.selectBtn();
	}

	@When("^Featured Link$")
	public void featured_Link() throws Throwable {
	    ChaseActionsObj.selectHome();
	}

	@Then("^Validate with loan options page$")
	public void validate_with_loan_options_page() throws Throwable {
	    ChaseActionsObj.selectTxt();
	}
	
}