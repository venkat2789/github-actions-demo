package ci_cd.github_actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	private WebDriver driver;

	/**
	 * initialize driver
	 * 
	 * @return - WebDriver
	 */
	public WebDriver setupDriver() {
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		return driver;
	}

}
