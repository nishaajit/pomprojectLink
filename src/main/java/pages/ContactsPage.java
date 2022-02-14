package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage {
	WebDriver driver; 
	public ContactsPage(WebDriver dr)         
    {                       
this.driver=dr;                     
    }   
	
	public void contactstest () {
		driver.findElement(By.xpath("//input[@title='New']")).click();
		driver.findElement(By.id("name_lastcon2")).sendKeys("aj");
		driver.findElement(By.xpath(" //td[@id='topButtonRow']//input[@title='Save']")).click();
	}
 public void createnewview () {
	 driver.findElement(By.xpath("//div[@class='filterOverview']//a[2]")).click();
		driver.findElement(By.id("fname")).sendKeys("nish");
		driver.findElement(By.id("devname")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")).click();
 }
 public void newview () {
	  driver.findElement(By.xpath(" //input[@title='New']")).click();
     WebElement lastname = driver.findElement(By.id("name_lastlea2"));
     lastname.sendKeys("ABCD");
     WebElement company = driver.findElement(By.id("lea3"));
     company.sendKeys("xyz");
     driver.findElement(By.xpath(" //td[@id='topButtonRow']//input[@title='Save']")).click();
}
 public void newbutton () {
	 driver.findElement(By.xpath("//input[@title='New']")).click();
     driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
     driver.findElement(By.id("con4")).sendKeys("Global Media");
     driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']")).click();
 }
 public void homeTab () {
	 driver.findElement(By.xpath(" //a[@title='Home Tab']"));
 }
}
