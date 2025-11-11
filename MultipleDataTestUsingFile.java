package mytestngpackage;

import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.sql.Driver;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MultipleDataTestUsingFile {
	
	String logurl = "https://ciitstudent.com/";
	
	
  @Test(priority=1)
  public void LoginMultipleData() {
	  
	  
	try {
		File f = new File("C:\\Users\\Pratiksha\\Documents\\ExcelFile\\Book2.xlsx");
		System.out.println("File exists: " + f.exists());
		System.out.println("File size: " + f.length());
		FileInputStream fin;
		fin = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fin);
		XSSFSheet sheet = book.getSheet("Sheet1");
		FileOutputStream fout = new FileOutputStream(f);
		
		int r = sheet.getLastRowNum();   
		System.out.println("Last row : "+r);
		
		for(int i=1; i<=r; i++) {
			WebDriver driver = new ChromeDriver();
			String email = sheet.getRow(i).getCell(0).getStringCellValue();
			String pass = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("email : "+email+" pass : "+pass);
			driver.get(logurl);
			driver.manage().window().maximize();
			WebElement e = driver.findElement(By.id("email_address"));
			e.sendKeys(email);
			WebElement p = driver.findElement(By.id("password"));
			p.sendKeys(pass);
			WebElement b = driver.findElement(By.xpath("//*[@type='submit']"));
			b.click();
			Wait();
			
			String currenturl = driver.getCurrentUrl();
			String result ="";
			if(!logurl.equals(currenturl)) {
				System.out.println("Test case passed for email : "+email+" and password : "+pass);
				result = "Pass";
				
			}
			else {
				System.out.println("Test case failed for email : "+email+" and password : "+pass);
				result = "Failed";
			}

			XSSFCell c = sheet.getRow(i).createCell(3);
			c.setCellValue(result);
			
			driver.close();
		}
		book.write(fout);
		book.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
  }
  
  private void Wait() {
	  try {
		  Thread.sleep(3000);
	  }catch (Exception e) {
		// TODO: handle exception
		  System.out.println(e.getMessage());
	}
  }
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }

}
