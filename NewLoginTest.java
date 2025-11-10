package mytestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewLoginTest {
	

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
	  wait1();
  }
  
  @Test(priority = 3)
  public void changePwd() {
	  WebElement cp =driver.findElement(By.xpath("//*[@onclick='OpenModalToChangePassword()']"));
	  cp.click();
	  wait1();
	  WebElement e = driver.findElement(By.id("txtcurrent_password"));
	  e.sendKeys("11");
	  WebElement n = driver.findElement(By.id("txtnew_password"));
	  n.sendKeys("11");
	  WebElement o = driver.findElement(By.id("txtconfirm_new_password"));
	  o.sendKeys("11");
	  WebElement b = driver.findElement(By.id("btnchangepassword"));
	  b.click();
	  wait1();
	  driver.switchTo().alert().accept();

  }
  
  @Test(priority = 4)
  public void LogOutTest() {
	  wait1();
	  WebElement e = driver.findElement(By.xpath("//*[@id=\"navbarCollapse2\"]/div/a[2]"));
	  e.click();
  }
  
  @AfterTest
  public void afterTest() {
	  wait1();
	  driver.close();
  }

  private void wait1() {
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  }
}
