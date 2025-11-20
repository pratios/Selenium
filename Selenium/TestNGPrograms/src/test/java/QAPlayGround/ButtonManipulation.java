package QAPlayGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonManipulation {
	
  @Test
  public void buttonPlay() {
	 
		WebDriver driver = new ChromeDriver();
		PGButtonManipulation pgb = new PGButtonManipulation(driver);
		pgb.AllFunctions("https://www.qaplayground.com/practice/button");
		
		
//		String lurl = "https://www.qaplayground.com/practice/button";
//		driver.get(lurl);
//		driver.manage().window().maximize();
//		
//		WebElement e = driver.findElement(By.xpath("//*[@class=\"button-section\"]/a"));
//		e.click();
//		waits();
//		WebElement p = driver.findElement(By.xpath("(//*[@href=\"/practice\"])[3]/button"));
//		p.click();
//		waits();
//		WebElement r = driver.findElement(By.xpath("//*[@href=\"/practice/button\"]"));
//		r.click();
//		waits();
//		driver.close();
  }
  
//  private void waits() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
