package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {

	@FindBy(xpath= "//*[@onclick='OpenModalToChangePassword()']")
	WebElement changepasslink;
	@FindBy(id="txtcurrent_password")
	WebElement currentpass;
	@FindBy(id="txtnew_password")
	WebElement newpass;

	@FindBy(id="txtconfirm_new_password")
	WebElement confirmpass;

	@FindBy(id="btnchangepassword")
	WebElement btn;
	
	WebDriver driver;
	
	public ChangePasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}

	public void changepassbuttonClick() {
		changepasslink.click();
	}
public void setCurrentPass(String ps) {
		currentpass.sendKeys(ps);
	}
	public void setNewPassword(String ps) {
		newpass.sendKeys(ps);
	}
	public void setConfirmPassword(String ps) {
		confirmpass.sendKeys(ps);
	}
	public void buttonClick() {
		btn.click();
	}
}
