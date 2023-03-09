package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	@FindBy(how = How.ID, using = "username")
	private WebElement txtUsername;

	@FindBy(how = How.ID, using = "password")
	private WebElement txtPassword;

	@FindBy(how = How.TAG_NAME, using = "span")
	private WebElement btnLogin;

	@FindBy(how = How.NAME, using = "language")
	private WebElement selLanguage;

	public void loginWith(String username, String password) {
		txtUsername.clear();
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);

		btnLogin.click();
	}

	public void setLanguage(String lang) {
		Select dprLanguage = new Select(selLanguage);

		dprLanguage.selectByVisibleText(lang);
	}
	

}
