package seleniumCourse;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import pageObjects.AdminPage;
import pageObjects.Driver;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.WelcomePage;

public class Excercise8 {

	static LoginPage logPage = new LoginPage();
	static WelcomePage welcomePage = new WelcomePage();
	static MenuPage menuPage = new MenuPage();
	static AdminPage adminPage = new AdminPage();

	public static void main(String[] args) {

		PageFactory.initElements(Driver.getDriver(), logPage);
		PageFactory.initElements(Driver.getDriver(), welcomePage);
		PageFactory.initElements(Driver.getDriver(), menuPage);
		PageFactory.initElements(Driver.getDriver(), adminPage);
		Driver.getDriver().get("https://satrngselcypr.z16.web.core.windows.net/");

		menuPage.logout();
		logPage.loginWith("admin", "superduper");

		String currentWindow = Driver.getDriver().getWindowHandle();
		menuPage.clickAdmin();
		Set<String> allWindows = Driver.getDriver().getWindowHandles();
		String newWindow = null;

		for (String window : allWindows) {
			if (!currentWindow.equals(window)) {
				newWindow = window;
				break;
			}

		}

		Driver.getDriver().switchTo().window(newWindow);
		adminPage.resetUser();
		Alert popup = Driver.getDriver().switchTo().alert();
		popup.accept();
		adminPage.createNewUser("marvin", "marvin");
		Driver.getDriver().close();
		Driver.getDriver().switchTo().window(currentWindow);
		menuPage.logout();
		logPage.loginWith("marvin","marvin");
		Driver.driverQuit();
		

	}

}
