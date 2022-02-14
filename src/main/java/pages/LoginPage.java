package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	WebDriver driver;
	 By username =By.id("username");
	By password= By.id("password");
	 By login=By.id("Login");
	 
	
    public  LoginPage(WebDriver driver)
	{
	              this.driver = driver;
	}
    public void loginToSite(String Usrname, String Password)
    {
                    this.enterUserName(Usrname);
                    this.enterPasssword(Password);
                    this.clickSubmit();
                   
    }
	public void enterUserName(String Usrname) {
		driver.findElement(username).sendKeys(Usrname);
		
	}
	public void checkrememberme () {
		
	driver.findElement(By.id("rememberUn")).click();
		
	}
	public void enterPasssword(String Password)
	{
	                driver.findElement(password).sendKeys(Password);
	}
	public void clickSubmit()
	{
	                driver.findElement(login).click();
	}
	public void clear() {
	driver.findElement(username).clear();
	}
}
