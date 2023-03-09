package seleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://satrngselcypr.z16.web.core.windows.net/");
		driver.manage().window().maximize();

		WebElement btnLogout = driver.findElement(By.xpath("//*[@id=\"logout\"]"));
		WebElement txtUsername = driver.findElement(By.cssSelector("[id=username]"));
		WebElement txtPassword = driver.findElement(By.cssSelector("[id=password]"));
		WebElement btnLogin = driver.findElement(By.className("content"));

		btnLogout.click();

		txtUsername.sendKeys("admin");
		txtPassword.sendKeys("superduper");

		btnLogin.click();

		driver.quit();

	}

}
