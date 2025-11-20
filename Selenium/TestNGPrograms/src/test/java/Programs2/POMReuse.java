package Programs2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMReuse {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  
	  LoginCIIT l = new LoginCIIT(driver);
	  l.LoginData("https://ciitstudent.com/", "yuvraj.gadadare@gmail.com", "pp", "Yuvraj Gadadare");
  }
}
