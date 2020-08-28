package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

   public WebDriver driver;
   
  // By signin= By.cssSelector("a[href*='sign_in']");
   By id= By.id("user_email");
   By pwd= By.id("user_password");
   By btn= By.name("commit");
   
   public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
   this.driver=driver;
   }
   
   
public WebElement getUserIdDetails ()
   {
	   return driver.findElement(id);
   }
public WebElement getUserPwdDetails()
   {
	 return driver.findElement(pwd);	
   }
public WebElement getBtnDetails()
   {
	 return driver.findElement(btn);	
   }

}
