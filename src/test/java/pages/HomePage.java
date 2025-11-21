package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void OpenBrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
}
