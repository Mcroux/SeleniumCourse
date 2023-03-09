package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			setChromeDriver();
		}
		return driver;

	}

	public static void setChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void setFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\FireFoxDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	public static void driverQuit() {
		driver.quit();
		driver = null;

	}

}
