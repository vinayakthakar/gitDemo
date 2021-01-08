package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	
	By Signin=By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	By Title=By.xpath("//h2[contains(text(),'Featured Courses')]");     
	By NavigateMenu = By.xpath("//a[contains(text(),'Contact')]");
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(Signin);
	}
	
	public WebElement getTile()
	{
		return driver.findElement(Title);
	}
	
	public WebElement navigateMenu()
	{
		return driver.findElement(NavigateMenu);
	}
	
	

}
