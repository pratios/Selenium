package mypackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver;
	@Given("Open Browser And Enter Login url={string}")
	public void OpenBrowser(String url) {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Given("Enter Email Address={string}")
	public void setEmail(String email) {
		WebElement e=driver.findElement(By.id("email_address"));
		e.sendKeys(email);
	}
	@Given("Enter Password={string}")
	public void setPassword(String pass) {
		WebElement e=driver.findElement(By.id("password"));
		e.sendKeys(pass);
	}
	@When("Click on login button")
	public void buttonCLick() {
		WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
		e.click();
	}
	@Then("It should show title={string}")
	public void confirmTitle(String expected) {
		try {
			Thread.sleep(4000);
		}
		catch(Exception ex) {}
		WebElement e=driver.findElement(By.xpath("//main/div/div/div/div/div/div/div/div/div/div"));
		String actual=e.getText();
		assertEquals(actual, expected);
		
	}
	
}
