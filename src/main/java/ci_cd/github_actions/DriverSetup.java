package ci_cd.github_actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class DriverSetup {
	private WebDriver driver;

	/**
	 * initialize driver
	 * 
	 * @return - WebDriver
	 */
	public WebDriver setupDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		SeleniumManager.getInstance();
		driver = new ChromeDriver(options);
		return driver;
	}

}
