package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class Login_page {

	
		
		
		@FindBy(xpath="//*[@name='email']")
		
		WebElement username;
		
        @FindBy(xpath="//*[@name='password']")
		
		WebElement password;
        
        @FindBy(xpath="//*[text()='Sign In']")
        
        WebElement login;
        
        
        @FindBy(xpath="//*[text()='User Name or Password Is Not Valid']")
        
     WebElement signout;
            
   
   
        public Login_page(WebDriver driver){
        	
       	PageFactory.initElements(driver, this);
        	
        	
        	
        	
        }
        
		
		
		public void setusername(String email) {
			username.sendKeys(email);
			Reporter.log("Enter email", true);
		}
		
		
		public void password(String passwo) {
			password.sendKeys(passwo);
			
		}
		
		
		public void login() {
			login.click();
		}
		
		public void signout() {
			if(signout.isDisplayed()) {
				System.out.println("succesful sign in");
				
			}
			else {
				System.out.println("user not able to sign in");
			}
		}
		
	
		
		
		
		
		
		
		
		
	}


