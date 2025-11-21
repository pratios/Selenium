package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="email_address")
	WebElement email;
	@FindBy(id="password")
	WebElement epass;
	@FindBy(xpath="//*[@type='submit']")
	WebElement btn;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	public void setEmail(String em) {
		email.sendKeys(em);
	}
	public void setPassword(String em) {
		epass.sendKeys(em);
	}
	public void buttonClick() {
		btn.click();
	}
}
