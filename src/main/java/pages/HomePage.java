package pages;

import java.util.Set;
import java.util.Iterator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By hometab = By.xpath(" //a[@title='Home Tab']");
	By userMenu = By.id("userNavLabel");
	By myprofile =By.xpath("//a[@title='My Profile']");
	By mysettings =By.xpath("//a[@title='My Settings']");
	By logout = By.xpath(" //a[@title='Logout']");
	By developerconsole = By.xpath(" //a[@title='Developer Console (New Window)']");
	By accounts = By.xpath("//a[normalize-space()='Accounts']");
	//Constructor to initialize object
	public HomePage(WebDriver dr)
	              {
	  this.driver=dr;
	              }
	
	public String getTitleOfTheHomePage() {
		String title=getTitleOfTheHomePage();
		System.out.println("title of the page"+title);
		return title;
	}
	public void hometab() {
		driver.findElement(hometab).click();
	}
	
	public void usermenu() {
		driver.findElement(userMenu).click();
	}
	public void myProfile () {
		driver.findElement(myprofile).click();
	}
		public void mySettings () {
			driver.findElement(mysettings).click();
		
	}
		public void devloperconsole () {
			driver.findElement(developerconsole).click();
			 String MainWindow=driver.getWindowHandle();		
     		
		        // To handle all new opened window.				
		            Set<String> s1=driver.getWindowHandles();		
		        Iterator<String> i1=s1.iterator();		
		        		
		        while(i1.hasNext())			
		        {		
		            String ChildWindow=i1.next();		
		            		
		            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		            {    		
		                 
		                    // Switching to Child window
		                    driver.switchTo().window(ChildWindow);
		                    driver.close();
		            }                  
		            } 
		        //Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);	
		}
		public void Account() throws InterruptedException {
			driver.findElement(accounts).click();
			Thread.sleep(5000);
		}
		public void  fnamelname () {
			driver.findElement(By.xpath(" //h1[@class='currentStatusUserName']//a")).click();
		}
		public void datentime () {
      driver.findElement(By.xpath(" //span[@class='pageDescription']//a")).click();
      driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:28:j_id64']//a")).click();
      driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']")).click();}
  	public void combobox () {
		driver.findElement(By.xpath(" //h1[@class='pageDescription']")).click();
	
		 String MainWindow=driver.getWindowHandle();		
 		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);
	               
	                    
	                    driver.close();
	            }                  
	            } 
	        //Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);	
      }
	
		
	   public void logout()
       {
		             driver.findElement(userMenu).click();
                     driver.findElement(logout).click();
        }
	   

}
