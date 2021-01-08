package E2E_Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;


public class validateTitle extends base {
	
	public static Logger log = LogManager.getLogger(validateTitle.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void browser() throws IOException
	{
		
		driver = initializeDrivers();
		driver.get(prop.getProperty("url"));
		
	}

	@Test
	public void checkTitle() throws IOException {
				
		LandingPage l = new LandingPage(driver);
		
		Assert.assertEquals(l.getTile().getText(), "FEATURED COURSES12");
		
		log.info("Title validated");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
