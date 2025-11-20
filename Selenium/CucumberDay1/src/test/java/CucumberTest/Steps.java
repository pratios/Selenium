package CucumberTest;


import io.cucumber.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
	

WebDriver driver;	

	  @Given("Open Browser And Enter Login url={string}")	
	  public void OpenBrowser(String url) {
		  driver=new ChromeDriver();
	  driver.get( url );
	  driver.manage().window().maximize();
  }
  
@Given("Enter Email Address={string}")
	  public void LoginTest(String email) {
	  WebElement e=driver.findElement(By.id("email_address"));
	  e.sendKeys(email);
	  wait1();
//	  e.clear();
//	  e.sendKeys("yuvraj.gadadare@gmail.com");
//	  WebElement p=driver.findElement(By.id("password"));
//	  p.sendKeys("pp");
//	  WebElement btn=driver.findElement(By.xpath("//*[@type='submit']"));
//	  btn.click();
//	  wait1();
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
