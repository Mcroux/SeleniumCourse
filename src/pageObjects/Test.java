package pageObjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Test {
	static LoginPage logPage = new LoginPage();
	static WelcomePage welcomePage = new WelcomePage();
	static MenuPage menuPage = new MenuPage();

	public static void main(String[] args) {
		EventFiringWebDriver edriver = new EventFiringWebDriver(Driver.getDriver());
		edriver.register(new DriverListener());
		
		PageFactory.initElements(edriver, logPage);
		PageFactory.initElements(edriver, welcomePage);
		PageFactory.initElements(edriver, menuPage);
		Driver.getDriver().get("https://satrngselcypr.z16.web.core.windows.net/");
		menuPage.logout();
		logPage.loginWith("admin", "superduper");

		if (welcomePage.getWelcomeMessage().equals("Welcome\r\n"
				+ "Welcome to the exciting features provided to you by this Connection Management website, a glorified address book.\r\n"
				+ "A complete (well, as good as it gets) and detailed list of requirements (as a basis for testing) can be found in the 'Req' part of the site.\r\n"
				+ "Disclaimer\r\n"
				+ "This website was built for testing/teaching purposes, so the layout may be dodgy and the functionality might be... well, off a bit. I'm a tester, not a fulltime developer. The site is rich with HTML5 stuff as well.\r\n"
				+ "Also, click here for a picture of a bear high fiving:")) {
			System.out.println("the text is correct");
		} else {
			System.out.println("The text is incorrect");
		}

		Driver.driverQuit();
	}

}
