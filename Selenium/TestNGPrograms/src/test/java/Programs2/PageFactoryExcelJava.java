package Programs2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryExcelJava {
	
	WebDriver driver;
	
	@FindBy(id = "email_address")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement pass;
	
	@FindBy(id = "//*[@type='submit']")
	WebElement btn;
	
	@FindBy(id = "//*[@class='main-body']/div/div/div/div/div/div/div")
	WebElement user;
	
	public PageFactoryExcelJava(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void openBroswer(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void setEmail(String eml) {
		email.sendKeys(eml);	
	}
	public void setPass(String em) {
		pass.sendKeys(em);
	}
	public void clickBtn() {
		btn.click();
	}
	public void setUrl(String em) {
		
		try {
			File f = new File("C:\\Users\\Pratiksha\\Documents\\ExcelFile\\Book3.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook book = new XSSFWorkbook();
			XSSFSheet sheet = book.getSheet("Sheet1");
			FileOutputStream fout = new FileOutputStream(f);
			
			int r = sheet.getLastRowNum();   
			System.out.println("Last row : "+r);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public void allFunctions(String em1, String em2, String em3, String em4) {
		openBroswer(em1);
		setEmail(em2);
		setPass(em3);
		clickBtn();
		waits();
		setUrl(em4);
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
