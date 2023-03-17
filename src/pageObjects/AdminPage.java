package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import data.ConnectionData;

public class AdminPage {

	@FindBy(how = How.XPATH, using = "//label[text()='reset users']")
	private WebElement btnResetUsers;

	@FindBy(how = How.ID, using = "new_username")
	private WebElement txtUser;

	@FindBy(how = How.ID, using = "new_password")
	private WebElement txtPassword;

	@FindBy(how = How.XPATH, using = ".//td[contains(@onclick, 'createUser()')]/span")
	private WebElement btnCreate;


	public void resetUser() {
		btnResetUsers.click();
	}

	public void createNewUser(String user, String pass) {
		txtUser.sendKeys(user);
		txtPassword.sendKeys(pass);
		btnCreate.click();
	}

}
