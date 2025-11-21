package context;

import org.openqa.selenium.WebDriver;

import pages.ChangePasswordPage;
import pages.HomePage;
import pages.LoginPage;

public class PageObjectManager {

	WebDriver driver;
	HomePage home;
	LoginPage login;
	ChangePasswordPage changepassPage;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public HomePage getHomePageInstance() {
		this.home=new HomePage(driver);
		return home;
	}
	public LoginPage getLoginPageInstance() {
		this.login=new LoginPage(driver);
		return this.login;
	}
	public ChangePasswordPage getChangePassPageInstance() {
		changepassPage=new ChangePasswordPage(driver);
		return changepassPage;
	}
	
}
