package Programs2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGPGVideoPlay {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		
	  	PGVideoPlay pg = new PGVideoPlay(driver);
		pg.allFunctions("https://ciitstudent.com/", "yuvraj.gadadare@gmail.com", "pp", "Yuvraj Gadadare");
  }
}
