package generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Autoit {

	
	public WebDriver driver;
	@BeforeMethod
	
	
	public void open_application1() {
	System.setProperty(chromekey, chromepath);
	driver=new ChromeDriver();
	driver.get("https://admin.v-site.xyz/sign-in");
	
	
	driver.manage().window().maximize();
	}

	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	   public void close_application() throws IOException {
		
	//	Lib.Screensort(driver);
		driver.close();
	}
	
}

