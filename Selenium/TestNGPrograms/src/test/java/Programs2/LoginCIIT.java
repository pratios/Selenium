package Programs2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginCIIT {

	By email = By.id("email_address");
	By pass = By.id("password");
	By btn = By.xpath("//*[@type='submit']");
	By usr = By.xpath("//*[@class='main-body']/div/div/div/div/div/div/div");
	WebDriver driver;
	
	public LoginCIIT(WebDriver driver) {
		this.driver = driver;
	}	
	public void setUrl(String url1) {
		driver.get(url1);
		driver.manage().window().maximize();
	}	
	public void setEmail(String em) {
		WebElement e = driver.findElement(email);
		e.sendKeys("yuvraj.gadadare@gmail.com");
	}
	public void setPass(String ps) {
		WebElement p = driver.findElement(pass);
		p.sendKeys("pp");
	}
	public void setBtn() {
		WebElement b = driver.findElement(btn);
		b.click();
	}
	
	public void usrName(String u) {
		WebElement un = driver.findElement(usr);
		String user = un.getText();
		System.out.println(user);
		assertEquals(user, u);
	}
	public void LoginData(String url, String email, String pass, String usr) {
		setUrl(url);
		setEmail(email);
		setPass(pass);
		setBtn();
		waits();
		usrName(usr);
		waits();
		driver.close();
	}
	
	private void waits() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
