package CICD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {
	WebDriver driver;

	@Parameters("Browser")
	@Test
	public void test(String browser) {
		if (browser.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.contains("edge")) {
			driver = new EdgeDriver();
		} else if (browser.contains("firefox")) {
			driver = new FirefoxDriver();

		}
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}
}
