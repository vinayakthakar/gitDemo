package E2E_Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


public class startBrowser extends base{
	
	public static Logger log = LogManager.getLogger(startBrowser.class.getName());	
	public WebDriver driver;
	
	@Test(dataProvider="getData")
	public void getBrowser (String Username, String Password) throws IOException
	{
		
		driver = initializeDrivers();
		driver.get(prop.getProperty("url"));
				
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getSigin().click();
		
		driver.close();
		
		log.info("browser closed");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data=new Object[2][2];
		data[0][0]="vinayak.com";
		data[0][1]="123";
		
		data[1][0]="Thakar.com";
		data[1][1]="456";
		
		return data;
	}
	
	

}
