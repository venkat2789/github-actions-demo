package ci_cd.github_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumWebTest extends DriverSetup {
	private WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = setupDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void launchGoogle() {
		launchUrlGetTitle("https://google.com");
	}

	@Test
	public void launchFacebook() {
		launchUrlGetTitle("https://facebook.com");
	}

	@Test
	public void launchYahoo() {
		launchUrlGetTitle("https://twitter.com");
	}

	@Test
	public void launchBing() {
		launchUrlGetTitle("https://www.bing.com");
	}

	@Test
	public void launchApple() {
		launchUrlGetTitle("https://www.apple.com/");
	}

	@AfterClass
	public void closeDriver() {
		driver.quit();
	}

	private void launchUrlGetTitle(String url) {
		driver.get(url);
		new WebDriverWait(driver, 15).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		System.out.println(driver.getTitle());
	}

}
