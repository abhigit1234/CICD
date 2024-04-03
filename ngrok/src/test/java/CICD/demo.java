package CICD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	
	public static void main(String[] args) {
	
		for(int i=0;i<3;i++) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		}
		}
}
