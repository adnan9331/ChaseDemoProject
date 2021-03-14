package tt.chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChaseLocators{
	
	
	//ATM Feature
	
	@FindBy (xpath="//a[contains(text(),'Site map')]")
	public WebElement ccSiteMap;
	
	@FindBy (xpath="//a[contains(text(),'ATM / Branch Locator')]")
	public WebElement ccATMBranch;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/input[1]")
	public WebElement ccZip;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")
	public WebElement ccATMSearch;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/ol[1]/li[1]/article[1]/div[2]/div[1]/h3[1]/a[1]/span[1]/span[2]")
	public WebElement ccBranch;
	
	@FindBy (xpath="//div[contains(text(),'Chinese, French, German, Greek, Italian, Japanese,')]")
	public WebElement ccLanguage;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[3]/div[2]/h1[1]")
	public WebElement ccNone;
	
	//Learn More Feature
	
	@FindBy (xpath="//body/div[1]/div[6]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/a[1]/div[1]")
	public WebElement ccCC;
	
	@FindBy (xpath="//body/div[@id='jsEnabled']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	public WebElement ccView;
	
	@FindBy (xpath="//body/div[@id='jsEnabled']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/span[2]/span[2]")
	public WebElement ccReviews;
	
	@FindBy (xpath="//a[@id='ReviewsCloseModal']")
	public WebElement ccClose;
	
	//Search Feature
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[4]/header[1]/section[2]/section[1]/section[2]/div[1]/div[2]/a[1]/span[1]")
	public WebElement ccSearch;
	
	@FindBy (xpath="//body/div[1]/div[5]/main[1]/div[1]/div[3]/div[1]/section[1]/section[1]/div[4]/form[1]/label[1]/input[1]")
	public WebElement ccType;
	
	@FindBy (xpath="//a[contains(text(),'Search')]")
	public WebElement ccSchBtn;
	
	@FindBy (xpath="//a[contains(text(),'Home loans for low credit scores | Mortgage | Chas')]")
	public WebElement ccHome;
	
	@FindBy (xpath="//h1[contains(text(),'What home loans can you get with a low credit scor')]")
	public WebElement ccValidate;
	
}