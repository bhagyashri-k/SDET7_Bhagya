package pom_Repo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfoPage {
	
	WebDriver driver;
	public OrgInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createorglinkbtn;
	
	
	public WebElement getCreateorglinkbtn() {
		return createorglinkbtn;
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement orgnamesavedtxt;
	
	public WebElement getOrgnamesavedtxt() {
		return orgnamesavedtxt;
	}

	@FindBy(xpath="//td[@id='mouseArea_Organization Name']")
	private WebElement orgnameexisttxtbox;
	
	
	public WebElement getOrgnameexisttxtbox() {
		return orgnameexisttxtbox;
	}
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement orgnmsearchbox;
	
	@FindBy(xpath="//input[@class='crmbutton small create']")
	private WebElement searchnowbtn;
	
	public WebElement getOrgnmsearchbox() {
		return orgnmsearchbox;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement selectchechbox;
	
	public WebElement getSelectchechbox() {
		return selectchechbox;
	}
     
	@FindBy(xpath="//select [@id='bas_searchfield']")
	private WebElement orgnmsearchDD;
	
	
	public WebElement getOrgnmsearchDD() {
		return orgnmsearchDD;
	}
	
    @FindBy(xpath="//input[@name='selected_id']")
    private WebElement selcheckbox;
    
	public WebElement getSelcheckbox() {
		return selcheckbox;
	}
	
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement deletebtn;
	
	public WebElement getDeletebtn() {
		return deletebtn;
	}
	
	@FindBy(xpath="//a[text()='Organization Name']")
	private List<WebElement> listofexistorgs;
	
	public List<WebElement> getListofexistorgs() {
		return listofexistorgs;
	}
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchorgnametxtbox;
	
	public WebElement getSearchorgnametxtbox() {
		return searchorgnametxtbox;
	}

	
	


	

}
