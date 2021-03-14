package tt.chase.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import tt.chase.pageElements.ChaseLocators;
import tt.utilities.SetupDrivers;

public class ChaseActions{
	
	ChaseLocators ChaseLocatorsObj;
	public ChaseActions(){
		ChaseLocatorsObj = new ChaseLocators();
		PageFactory.initElements(SetupDrivers.driver, ChaseLocatorsObj);

	}
	
	
	//Chase ATM Feature
	
	public void selectSiteMap(){
		ChaseLocatorsObj.ccSiteMap.click();
		
	}	
		
	public void selectATM(){
		ChaseLocatorsObj.ccATMBranch.click();
			
	}
	
	public void selectZip(String Product) throws Exception{
		if (Product.equals("11377")){
		ChaseLocatorsObj.ccZip.sendKeys("11377");
	}   else if (Product.equals("8989898")){
		ChaseLocatorsObj.ccZip.sendKeys("8989898");
	}	else if (Product.equals("000")){
		ChaseLocatorsObj.ccZip.sendKeys("000");
	}
		}
	
	public void selectSearch(){
		ChaseLocatorsObj.ccATMSearch.click();
	}
	
	public void selectBranch(){
		ChaseLocatorsObj.ccBranch.click();
	}
	
	public void selectLanguage(){
		ChaseLocatorsObj.ccLanguage.isDisplayed();
	}
	
	public void selectNone(){
		ChaseLocatorsObj.ccNone.isDisplayed();
	}
	
	
	//Chase Learn More Feature
	
	public void selectCC(){
		ChaseLocatorsObj.ccCC.click();
	}
	
	public void selectView(){
		ChaseLocatorsObj.ccView.click();
	}
	
	public void selectReviews(){
		ChaseLocatorsObj.ccReviews.click();
	}
	
	public void selectClose(){
		ChaseLocatorsObj.ccClose.click();
	}
	
	//Search
	
	public void selectSrchBtn(){
		ChaseLocatorsObj.ccSearch.click();
	}
	
	public void selectBar(){
		ChaseLocatorsObj.ccType.sendKeys("Home Loans");
	}
	
	public void selectBtn(){
		ChaseLocatorsObj.ccSchBtn.click();
	}
	
	public void selectHome(){
		ChaseLocatorsObj.ccHome.click();
	}
	
	public void selectTxt(){
		ChaseLocatorsObj.ccValidate.isDisplayed();
	}
}
