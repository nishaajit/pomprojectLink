package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RandomPage {
	WebDriver driver;	
	public  RandomPage(WebDriver dv)
	{
	              this.driver = dv;
	}
   public void editprofile () {
	driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")).click();
	 driver.switchTo().frame("contactInfoContentId");
     driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
   
   }
   public void plusTab() {
	   driver.findElement(By.xpath(" //img[@title='All Tabs']")).click();
	   driver.findElement(By.xpath("//input[@title='Customize My Tabs']")).click();
	   driver.findElement(By.xpath (" //option[@value='Workspace']")).click();
	   driver.findElement(By.xpath("//input[@title='Save']")).click();
	   
   }
	
	
	
	
}
