package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.Login_page;
import Pages.user_name;
import generic.Basetest;
import generic.Lib;

public class Test_login extends Basetest{

	@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException  {
	
	Login_page obj=new Login_page(driver);
	
	user_name obj1=new user_name(driver);
	Thread.sleep(3000);
	
	
	String email = Lib.dataexcel("Sheet1", 1, 0);
	obj.setusername(email);
	
	Thread.sleep(3000);
	
	String password = Lib.dataexcel("Sheet1", 1, 1);
	obj.password(password);
	Thread.sleep(3000);
	
	
	
	obj.login();
	Thread.sleep(5000);
	
 
	//obj.signout();  
	 
    obj1.setusermanagment(driver);
    Thread.sleep(2000);
    
    obj1.setappraiser();
    Thread.sleep(2000);
    
    obj1.Add_Appraiser();
    Thread.sleep(2000);
    
    String firstname = Lib.dataexcel("user", 1, 0);
    obj1.setfirstname(firstname);
    Thread.sleep(2000);
    
    String lastname = Lib.dataexcel("user", 1, 1);
    obj1.setlastname(lastname);
    
    
    String emailaddress = Lib.dataexcel("user", 1, 2);
    obj1.setemailaddress(emailaddress);
  Thread.sleep(2000);
  
  String Cell_Phone = Lib.dataexcel("user", 1, 3);
  obj1.setphone_no(Cell_Phone );
Thread.sleep(2000);

String address = Lib.dataexcel("user", 1, 4);
obj1.setaddress_no(address );
Thread.sleep(2000);


String city = Lib.dataexcel("user", 1, 5);
obj1.setcity(city );
Thread.sleep(2000);




String state_name = Lib.dataexcel("user", 1, 6);
obj1.setstate(state_name);

       Thread.sleep(2000);
  
  
  String country_name = Lib.dataexcel("user", 1, 7);
  obj1.setcountry(country_name);
         Thread.sleep(2000);
         
         String Zip = Lib.dataexcel("user", 1, 8);
         obj1.setZip(Zip);
         
         Thread.sleep(2000); 
         obj1.submit();
    
	}

}
