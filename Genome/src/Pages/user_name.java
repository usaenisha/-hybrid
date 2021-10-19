package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.Basetest;
import generic.Lib;

public class user_name{

	
    @FindBy(xpath="//*[text()=\"User Management\"]")
    WebElement user_managment;
	
		
        @FindBy(xpath="//*[text()='RemoteVal Appraiser']")
		
		WebElement appraiser;
        
        @FindBy(xpath="//*[text()='Add Appraiser']")
        
        WebElement Add_Appraiser;
        
        @FindBy(xpath="//*[@name='firstName']")
        
        WebElement firstname;
        
        @FindBy(xpath="//*[@name='lastName']")
        
        WebElement lastname;
        
        @FindBy(xpath="//*[@name='emailAddress']")
        
        WebElement emailaddress;
        
        @FindBy(xpath="//*[@placeholder='Cell Phone']")
       
       WebElement Cell_Phone;
       
       @FindBy(xpath="//*[@name='address']")
       
       WebElement address ;
       
       @FindBy(xpath="//*[@name='city']")
  
       WebElement city;
       
       
       @FindBy(xpath="//*[@name=\"state\"]")
       
       WebElement state;
       
       @FindBy(xpath="//*[@name=\"countryName\"]")
       
       WebElement country;
       
       @FindBy(xpath="//*[@name='zip']")
       
       WebElement Zip;
       
      @FindBy(xpath="//*[@class=\"MuiButton-label\"]")
       
       WebElement create;
       
   
        public user_name(WebDriver driver){
        	
       	PageFactory.initElements(driver, this);
        	
        	
        	
        	
        }
        
		
		
        public void setusermanagment(WebDriver driver) {
        	Lib.javascript(driver, user_managment);
		}
		
		
        public void setappraiser() {
        	appraiser.click();
			
		}
		
		
		public void Add_Appraiser() {
			Add_Appraiser.click();
			
		}
		
		public void  setfirstname(String name) {
			 firstname.sendKeys(name);
			 Reporter.log("Enter firstname", true);
		
		}
		
		public void  setlastname(String lstname) {   
			lastname.sendKeys(lstname);

			 Reporter.log("Enter lastname", true);
		}
		public void  setemailaddress(String email1) {
			emailaddress.sendKeys(email1);
			 Reporter.log("Enter emailaddress", true);
		
		}
		
		public void  setphone_no(String phone1) {
			Cell_Phone.sendKeys(phone1);
			 Reporter.log("Enter phone", true);
}	
		public void  setaddress_no(String address1) {
			address.sendKeys(address1);
			 Reporter.log("Enter address", true);
}	
		
		public void  setcity(String city1) {
			city.sendKeys(city1);
			 Reporter.log("Enter city", true);
}	
		
		
		
		
		
		public void setstate(String state_name) {
        	Lib.dropdown(state,state_name);
        	 Reporter.log("state name", true);
		
		}
		public void setcountry(String country_name) {
        	Lib.dropdown(country,country_name);
        	 Reporter.log("country name", true);
		}
		
		public void  setZip(String Zip1) {
			Zip.sendKeys(Zip1);
			 Reporter.log("Enter Zip", true);
}	
		
		
		public void submit() {
			create.click();
			 Reporter.log("click", true);
		}
		
}


