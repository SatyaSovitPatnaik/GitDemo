package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public static Logger Log= LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void beforeTest() throws IOException, InterruptedException
	{
	 driver= initializeDriver();
		
		// Thread.sleep(3000);
	}
 
	@Test(dataProvider="getData")
	
	public void BasePageNavigator(String userName, String password) throws IOException, InterruptedException 
	{
		driver.get(prop.getProperty("url"));
		LandingPage lp= new LandingPage(driver);
		lp.getLogin().click();
	   
		
		LoginPage lg= new LoginPage(driver);
		lg.getUserIdDetails().sendKeys(userName);
		lg.getUserPwdDetails().sendKeys(password);
	    lg.getBtnDetails().click();
	    Log.info("Credetials Entered");
	}
	

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[1][2];
		data[0][0]= "satya@123.com";
		data[0][1]= "1234";		
	//	data[1][0]= "moon@123.com";
		//data[1][1]= "5678";
		 
		return data;
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
		driver=null;
	}
}
