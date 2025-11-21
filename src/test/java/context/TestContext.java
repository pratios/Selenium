package context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestContext {

	WebDriver driver;
	PageObjectManager manager;
	 
	public void setChromeDriver() {
		driver=new ChromeDriver();
		
	}
	public void setEdgeDriver() {
		driver=new EdgeDriver();
	}
	public void setFirefoxDriver() {
		driver=new FirefoxDriver();
	}
	
	public PageObjectManager getPageObjectManagerInstance() {
		manager=new PageObjectManager(driver);
		return manager;
	}
	
}
