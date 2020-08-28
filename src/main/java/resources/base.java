package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	//private static final String TakeScreenshot = null;
	public static WebDriver driver;
	public Properties prop;
	
	public  WebDriver initializeDriver() throws IOException {
	     prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Tanvi\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
	    String browserName=prop.getProperty("browser");
	    
	    if(browserName.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanvi\\chromedriver.exe");
	         driver= new ChromeDriver();
	         //options.addArguments("chrome.switches","--disable-extensions");
	    }
	    else if(browserName.equals("Firefox"))
	    {
	    	
	    }
	    else if(browserName.equals("Explorer"))
	    {
	    	
	    }
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      return driver;
	}
      public void getScreenShot(String result)
      {
        //(TakesScreenshot)driver).getScreenShot(OutputType.FILE);
    	  TakesScreenshot scrShot =((TakesScreenshot)driver);
    	  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    	  //FileUtils.class 
      }
	}		

