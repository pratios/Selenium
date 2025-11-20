package mytestngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTesting {
	WebDriver driver;	
	String loginurl1="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		  @BeforeTest
		  public void beforeTest() {
			  driver=new ChromeDriver();
		  }

		
	  @Test(priority = 1)
	  public void OpenBrowser() {
		 
		  driver.get(loginurl1 );
		  wait1();
	  }
	  
	  @Test(priority = 2)
	  public void LoginTest() {
		  WebElement e=driver.findElement(By.name("username"));
		  e.sendKeys("Admin");
		  WebElement p=driver.findElement(By.xpath("//*[@type='password']"));
		  p.sendKeys("admin123");
		  WebElement btn=driver.findElement(By.xpath("//*[@type='submit']"));
		  btn.click();
		  wait1();
		  WebElement g=driver.findElement(By.linkText("My Info"));
		  g.click();
		  wait1();
//		  WebElement h=driver.findElement(By.name("firstName"));
//		  JavascriptExecutor js = (JavascriptExecutor) driver;
//		  js.executeScript("arguments[0].value=''; arguments[0].dispatchEvent(new Event('input'));", h);;
//		  wait1();
//		  h.sendKeys("Pratiksha");
		  
		  WebElement h = driver.findElement(By.name("firstName"));
		  Actions actions = new Actions(driver);
		  actions.click(h).
		  keyDown(Keys.CONTROL).
		  sendKeys("a"). 
		  keyUp(Keys.CONTROL). 
		  sendKeys(Keys.BACK_SPACE). 
		  sendKeys("Pratiksha"). 
		  perform();
		  wait1();
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  wait1();
		  driver.close();
	  }

	  private void wait1() {
		  try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	  }
}
