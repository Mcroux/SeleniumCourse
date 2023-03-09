package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuPage {

	@FindBy(how = How.ID, using = "logout")
	private WebElement btnLogout;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Admin")
	private WebElement btnAdmin;

	public void logout() {

		btnLogout.click();
	}
	
	public void clickAdmin() {

		btnAdmin.click();
	}
}
