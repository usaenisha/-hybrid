package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class Lib implements Autoit {
	
//	public static WebDriver driver;
	
	
	public static void Screensort(WebDriver driver) throws IOException {
		
		TakesScreenshot ts =(TakesScreenshot) driver;//Takescreensort -interface
		
		File fromto =ts.getScreenshotAs(OutputType.FILE);//from to
		
		File wherekeep = new File(Screenshotpath);//where keep
		
		Files.copy(fromto, wherekeep);
		
		
		
		
		

	}
	public static String dataexcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fs = new FileInputStream(excel);
		Workbook wk = WorkbookFactory.create(fs);
		String data = wk.getSheet(sheet).getRow(row).getCell(cell).toString();
	    return data;
	}
	
	
 
	public static void javascript(WebDriver driver,WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor. executeScript("arguments[0]. click();", element); 

}
	 public static void dropdown(WebElement drpdown_element,String text) {
		Select sc=new Select(drpdown_element);
		sc.selectByValue(text);
	
	}
}