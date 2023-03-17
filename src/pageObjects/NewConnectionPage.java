package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import data.ConnectionData;
import helper.WaitingHelper;

public class NewConnectionPage {
	
	@FindBy(how = How.ID, using ="firstName")
	private WebElement fldFirstName;
	
	@FindBy(how = How.ID, using ="lastName")
	private WebElement fldLastName;
	
	@FindBy(how = How.ID, using ="sex")
	private WebElement cbxSex;
	
	@FindBy(how = How.ID, using ="email")
	private WebElement fldEmail;
	
	@FindBy(how = How.ID, using ="telephone")
	private WebElement fldTelephone;
	
	@FindBy(how = How.ID, using ="company")
	private WebElement fldCompany;
	
	@FindBy(how = How.ID, using ="SSU")
	private WebElement cbxSSU;
	
	@FindBy(how = How.ID, using ="seniority")
	private WebElement cbxSeniority;
	
	@FindBy(how = How.ID, using ="interests")
	private WebElement fldAdditionalInfo;
	
	@FindBy(how = How.XPATH, using ="//td[@id='add']//label")
	private WebElement btnAdd;
		
	
	/**
	 * Waits until the page is shown
	 */
	public void waitUntilShown() {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(btnAdd));
	}
	
	/**
	 * Create a new connection
	 */
	public void createNewConnection(String firstName, String lastName, String sex, String email, String telephone, String company, String ssu, String seniority, String additionalInfo) {
		System.out.println("Creating a new connection");
		
		fldFirstName.clear();
		fldFirstName.sendKeys(firstName);
		
		fldLastName.clear();
		fldLastName.sendKeys(lastName);
		
		Select selSex = new Select(cbxSex);
		selSex.selectByVisibleText(sex);
		
		fldEmail.clear();
		fldEmail.sendKeys(email);
		
		fldTelephone.click();
		fldTelephone.clear();
		fldTelephone.sendKeys(telephone);
		
		fldCompany.clear();
		fldCompany.sendKeys(company);
		
		Select selSSU = new Select(cbxSSU);
		selSSU.selectByVisibleText(ssu);
		
		Select selSeniority = new Select(cbxSeniority);
		selSeniority.selectByVisibleText(seniority);
		
		fldAdditionalInfo.clear();
		fldAdditionalInfo.sendKeys(additionalInfo);
		
		btnAdd.click();
		
	}
	
	public NewConnectionPage addConnection(ConnectionData c) {
		fldFirstName.clear();
		fldFirstName.sendKeys(c.getFirstName());
		
		fldLastName.clear();
		fldLastName.sendKeys(c.getLastName());
		
		WaitingHelper.waitUntillClickable(cbxSex);
		Select selSex = new Select(cbxSex);
		selSex.selectByVisibleText(c.getSex());
		
		WaitingHelper.waitUntillClickable(fldEmail);
		fldEmail.clear();
		fldEmail.sendKeys(c.getEmail());
		
		WaitingHelper.waitUntillClickable(fldTelephone);
		fldTelephone.click();
		fldTelephone.clear();
		fldTelephone.sendKeys(c.getTelephone());
		
		WaitingHelper.waitUntillClickable(fldCompany);
		fldCompany.clear();
		fldCompany.sendKeys(c.getCompany());
		
		WaitingHelper.waitUntillClickable(cbxSSU);
		Select selSSU = new Select(cbxSSU);
		selSSU.selectByVisibleText(c.getSsu());
		
		WaitingHelper.waitUntillClickable(cbxSeniority);
		Select selSeniority = new Select(cbxSeniority);
		selSeniority.selectByVisibleText(c.getSeniority());
		
		WaitingHelper.waitUntillClickable(fldAdditionalInfo);
		fldAdditionalInfo.clear();
		fldAdditionalInfo.sendKeys(c.getAdditionalInfo());
		
		btnAdd.click();
		return this;
		
	}

}
