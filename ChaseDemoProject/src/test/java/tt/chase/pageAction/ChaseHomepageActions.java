package tt.chase.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import tt.chase.pageElements.ChaseLocators;
import tt.utilities.SetupDrivers;

public class ChaseHomepageActions {
	
ChaseLocators ChaseLocatorsObj;
	
	public ChaseHomepageActions(){	
		ChaseLocatorsObj = new ChaseLocators();
		PageFactory.initElements(SetupDrivers.driver, ChaseLocatorsObj);
		
	}
	
	
	public void loadChaseHomepage(){
		SetupDrivers.driver.get("https://www.chase.com");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().window().maximize();
	}
}