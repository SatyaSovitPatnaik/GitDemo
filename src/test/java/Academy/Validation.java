package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import resources.base;

public class Validation extends base {
 
	public static Logger Log= LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void beforeTest() throws IOException
	{
	 driver= initializeDriver();
	 Log.info("Driver Initialized");
	driver.get(prop.getProperty("url"));
	
	Log.info("Navigator to HomePage");
	}
	
	@Test
	
	public void BasePageNavigator() throws IOException 
	{
	
		
		LandingPage lp= new LandingPage(driver);
		//lp.getLogin().click();
		System.out.println(lp.text().getText());
		Assert.assertEquals(lp.text().getText(), "FEATURED COURSES");
		 Log.info("Sucessfully Validated");
		
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
		driver=null;
	}
	
}
