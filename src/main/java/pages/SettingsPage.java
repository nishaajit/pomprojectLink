
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SettingsPage {
	WebDriver driver;
 By personal = By.id("PersonalInfo_font");
 By loginhistory = By.id("LoginHistory_font");
 By display = By.id("DisplayAndLayout_font");
 By customizetabs = By.id("CustomizeTabs_font");
 By email = By.xpath(" //span[@id='EmailSetup_font']");
 By emailset = By.id("EmailSettings_font");
 By calender = By.xpath(" //span[@id='CalendarAndReminders_font']");
 By activity = By.xpath(" //span[@id='Reminders_font']");
 public  SettingsPage(WebDriver dv)
	{
	              this.driver = dv;
	}
      public void  Personal() throws InterruptedException {
    	  driver.findElement(personal).click();
    	  driver.findElement(loginhistory).click();
    	  Thread.sleep(5000);
    	  driver.findElement(display).click();
    	  driver.findElement(customizetabs).click();
    	  WebElement contentEle=   driver.findElement(By.xpath("//select[@id='p4']"));
  		Select Content =new Select(contentEle);
  		Content.selectByVisibleText("Salesforce Chatter");
  		WebElement availabletabs = driver.findElement(By.xpath(" //select[@id='duel_select_0']"));
  		Select tabs = new Select (availabletabs);
  		tabs.selectByVisibleText("Reports");
  		driver.findElement(By.xpath("//img[@title='Add']")).click();
  		driver.findElement(By.xpath("//input[@title='Save']")).click();
      }
      public void emailtest () throws InterruptedException {
    	  driver.findElement(email).click();
    	  driver.findElement(emailset).click();
    	  WebElement emailname = driver.findElement(By.id("sender_name"));
 		 emailname.clear();
 		 emailname.sendKeys("nisha A");
 		 WebElement emailadd = driver.findElement(By.id("sender_email"));
 		 emailadd.clear();
 		 emailadd.sendKeys("nishaajith26@gmail.com");
 		 boolean radiobutton1= driver.findElement(By.xpath("//input[@id='auto_bcc1']")).isSelected();
          System.out.println("is radio button selected ?=" +radiobutton1);
        WebElement radiobutton2 =driver.findElement(By.xpath(" //input[@id='auto_bcc0']"));
       radiobutton2.click();
      System.out.println(radiobutton2.isSelected());
      driver.findElement(By.xpath("//input[@title='Save']")).click();
      Thread.sleep(5000);
      }
 
  public void clndr() throws InterruptedException {
	  driver.findElement(calender).click();
	  driver.findElement(activity).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(" //input[@id='testbtn']")).click();
  }
 
 
 

}
