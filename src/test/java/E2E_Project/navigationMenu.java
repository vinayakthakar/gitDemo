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


public class navigationMenu extends base {
	
	
	public static Logger log = LogManager.getLogger(navigationMenu.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void browser() throws IOException
	{	
		
		driver = initializeDrivers();
		log.info("Initialized the browser");
		driver.get(prop.getProperty("url"));
		
	}

	@Test
	public void navigateMenu() throws IOException {
		

		LandingPage l = new LandingPage(driver);

		Assert.assertTrue(l.navigateMenu().isDisplayed());
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
