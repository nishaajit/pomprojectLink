package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeadPage {
	WebDriver driver; 
	By dropdown = By.id ("fcf");
	By contacts = By.id("//a[@title='Contacts Tab']");
	
	
	public LeadPage(WebDriver dr)         
    {                       
this.driver=dr;                     
    }                       
	public void dropdown () throws InterruptedException {
		driver.findElement(dropdown).click();
		Thread.sleep(5000);
		
	}
      public void todayslead () throws InterruptedException {
    	  WebElement usermenu = driver.findElement(By.id("userNavLabel"));
    		usermenu.click();
    		WebElement logout = driver.findElement(By.xpath(" //a[@title='Logout']"));
  		logout.click();
  		Thread.sleep(4000);
  		WebElement username = driver.findElement(By.id("username"));
  		username.sendKeys("nisha@tekarch.com");
  		WebElement pass =driver.findElement(By.id("password"));
  		pass.sendKeys("athipillil26");
  		WebElement login = driver.findElement(By.id("Login"));
          login.click();
  		WebElement leads2 = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
  		leads2.click();
  		WebElement go = driver.findElement(By.xpath( "//*[@id=\"filter_element\"]/div/span/span[1]/input"));
           go.click();
      }
      
      
      public void contactstab () throws InterruptedException {
    	  driver.findElement(contacts).click();
    	  Thread.sleep(5000);
			WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
          lightdialogue.click();
      }
      
      
      
      
      
      
      
      
      
      
}
