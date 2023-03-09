package seleniumCourse;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.AdminPage;
import pageObjects.Driver;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.WelcomePage;

public class TestSet {
	/**
	 * This is the test set for the selenium course :)
	 */

	static LoginPage logPage = new LoginPage();
	static WelcomePage welcomePage = new WelcomePage();
	static MenuPage menuPage = new MenuPage();
	static AdminPage adminPage = new AdminPage();

	@BeforeSuite
	public static void setupDriver() {
		Driver.setChromeDriver();
		PageFactory.initElements(Driver.getDriver(), logPage);
		PageFactory.initElements(Driver.getDriver(), welcomePage);
		PageFactory.initElements(Driver.getDriver(), menuPage);
		PageFactory.initElements(Driver.getDriver(), adminPage);

	}

	@BeforeTest
	public void navigateToBrowser() {
		Driver.getDriver().get("https://satrngselcypr.z16.web.core.windows.net/");
	}

	@AfterSuite
	public static void killDriver() {
		Driver.driverQuit();
	}



	@Test
	@Parameters({"name","password"})
	public void correctLogin(String username, String password) {
		menuPage.logout();
		logPage.loginWith(username, password);

		Assert.assertTrue(welcomePage.isWelcomeMessageShown());
	}

	
	@Test
	public void loginAsAdmin() {
		menuPage.logout();
		logPage.loginWith("admin", "superduper");
		Assert.assertTrue(welcomePage.isWelcomeMessageShown());
	}
	
	@Test
	public void incorrectLogin() {
		menuPage.logout();
		logPage.loginWith("admin", "nfji");
		Assert.assertFalse(welcomePage.isWelcomeMessageShown());
	}
}
