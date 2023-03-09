package seleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise2 {

	public static void main(String[] args) {
		String title;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("the title is " + driver.getTitle());
		title = driver.getTitle();

		driver.get("https://bing.com");
		System.out.println("the title is " + driver.getTitle());
		driver.navigate().back();
		System.out.println("the title is " + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("the title is " + driver.getTitle());
		driver.quit();

	}

}
