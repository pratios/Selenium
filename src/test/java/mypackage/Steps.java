package mypackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import context.*;
import pages.*;
public class Steps {

	TestContext context;
	PageObjectManager page;
	HomePage home;
	LoginPage login;
	ChangePasswordPage cpspage;
	@Given("Open Browser And Enter Login url={string}")
	public void OpenBrowser(String url) {
		context=new TestContext();
		context.setFirefoxDriver();
		page=context.getPageObjectManagerInstance();
		home=page.getHomePageInstance();
		home.OpenBrowser(url);
		
	}

	@Given("Enter Email Address={string}")
	public void EnterEmail(String email) {
		login=page.getLoginPageInstance();
		login.setEmail(email);
	}
	@Given("Enter Password={string}")
	public void EnterPassword(String ps) {
		login.setPassword(ps);

	}
	@When("Click on login button")
	public void LoginButtonClick() {
		login.buttonClick();
	}
	@Then("It should open dashboard page with url={string}")
	public void OpenDashbopard(String expected_url) {
		 Wait();
//		 String atualurl=driver.getCurrentUrl();
//		 assertEquals(atualurl, expected_url);
		 
	}
	
	@Given("Click to Change Password Link")
	public void ChangePasswordlink() {
//		Wait();
//		driver.findElement(By.xpath("//*[@onclick='OpenModalToChangePassword()']")).click();
	}
	@Given("Enter Current Password={string}")
	public void setCurrentPassword(String currentpass) {
		Wait();
//		driver.findElement(By.id("txtcurrent_password")).sendKeys(currentpass);
	}
	@Given("Enter New Password={string}")
	public void setNewPassword(String npass) {
		Wait();
//		driver.findElement(By.id("txtnew_password")).sendKeys(npass);
	}
	@Given("Enter Confirm Password={string}")
	public void setConfirmPassword(String confirmpass) {
		Wait();
//		driver.findElement(By.id("txtconfirm_new_password")).sendKeys(confirmpass);
	}
	
	@Given("Click to change password button")
	public void ButtonClick() {
		Wait();
//		driver.findElement(By.id("btnchangepassword")).click();
	}

	
	@Given("Close Alert")
	public void CloseAlert() {
		Wait();
//		driver.switchTo().alert().accept();
	}
	
	private void Wait() {
		try {
			Thread.sleep(4000);
		}
		catch(Exception ex) {}
	}
	
	
	
}
