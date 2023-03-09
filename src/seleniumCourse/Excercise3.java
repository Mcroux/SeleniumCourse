package seleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://satrngselcypr.z16.web.core.windows.net/");
		driver.manage().window().maximize();

		WebElement btnLogout = driver.findElement(By.id("logout"));
		WebElement selLanguage = driver.findElement(By.name("language"));
		WebElement txtUsername = driver.findElement(By.id("username"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.tagName("span"));

		btnLogout.click();

		Select dprLanguage = new Select(selLanguage);

		dprLanguage.selectByVisibleText("French");
		txtUsername.sendKeys("admin");
		txtPassword.sendKeys("superduper");

		btnLogin.click();

		driver.quit();

	}

}
