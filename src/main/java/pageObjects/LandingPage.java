package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

   public WebDriver driver;
   
   By signin= By.cssSelector("a[href*='sign_in']");
   //By text= By.cssSelector("body:nth-child(2) section:nth-child(5) div.container div.text-center > h2:nth-child(1)");
   By text= By.xpath("//h2[contains(text(),'Featured Courses')]");
   By bar= By.xpath("//ul[@class='nav navbar-nav navbar-right']");
   
   public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
this.driver=driver;
   }

public WebElement getLogin()
   {
	   return driver.findElement(signin);
   }
public WebElement text()
{
	   return driver.findElement(text);
}
public WebElement navBar()
{
	   return driver.findElement(bar);
}
}
