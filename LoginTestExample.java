package mytestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTestExample {
	

WebDriver driver;	
String loginurl="https://ciitstudent.com/";
	  @BeforeTest
	  public void beforeTest() {
		  driver=new ChromeDriver();
	  }

	
  @Test(priority = 1)
  public void OpenBrowser() {
	 
	  driver.get(loginurl );
	  driver.manage().window().maximize();
  }
  
  @Test(priority = 2)
public void LoginTest() {
	  WebElement e=driver.findElement(By.id("email_address"));
	  e.sendKeys("yuvraj.gadadare@gmail.com");
	  WebElement p=driver.findElement(By.id("password"));
	  p.sendKeys("11");
	  WebElement btn=driver.findElement(By.xpath("//*[@type='submit']"));
	  btn.click();
	  Wait();
  }
  
//  @Test(priority = 3)
  @Test(enabled =false)

  public void ChangePasswordTest() {
	  WebElement clink=driver.findElement(By.xpath("//*[@onclick='OpenModalToChangePassword()']"));
	  clink.click();
	  Wait();
	  WebElement txtcpass=driver.findElement(By.id("txtcurrent_password"));
	  txtcpass.sendKeys("11");
	  WebElement txtnpass=driver.findElement(By.id("txtnew_password"));
	  txtnpass.sendKeys("11");
	  WebElement txtcnpass=driver.findElement(By.id("txtconfirm_new_password"));
	  txtcnpass.sendKeys("11");
	  WebElement btnchange=driver.findElement(By.id("btnchangepassword"));
	  btnchange.click();
	  Wait();
	  driver.switchTo().alert().accept(); // handling alerts
	 
		  
  }
@Test(priority = 4)
public void Logout() {
	Wait();
	WebElement btn=driver.findElement(By.xpath("//*[@href='/Student/Logout']"));
	btn.click();
}
  
  
  
  private void Wait() {
	  try {
		Thread.sleep(4000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

  }
}
