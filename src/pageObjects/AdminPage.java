package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {
	
	@FindBy(how = How.XPATH, using = "//label[text()='reset users']")
	private WebElement btnResetUsers;
	
	@FindBy(how = How.ID, using = "new_username")
	private WebElement txtUser;
	
	@FindBy(how = How.ID, using = "new_password")
	private WebElement txtPassword;
	
	@FindBy(how = How.XPATH, using = ".//td[contains(@onclick, 'createUser()')]/span")
	private WebElement btnCreate;
	
	String username;
	String password;
	
	
	public void resetUser() {
		btnResetUsers.click();
	}
	
	public void createNewUser(String user, String pass) {
		setUsername(user);
		setPassword(pass);
		txtUser.sendKeys(user);
		txtPassword.sendKeys(pass);
		btnCreate.click();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
