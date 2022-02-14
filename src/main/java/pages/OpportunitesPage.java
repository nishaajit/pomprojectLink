package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpportunitesPage {
	WebDriver driver;
	By leadsTab = By.xpath("//a[@title='Leads Tab']");
	public OpportunitesPage(WebDriver dr)
    {
       this.driver=dr;
    }
	public void opportab () {
		
       WebElement opportab = driver.findElement(By.xpath("//select[@id='fcf']"));
       opportab.click();          
		
	}
     public void newopty () throws InterruptedException {
    		
            driver.findElement(By.xpath(" //input[@title='New']")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("opp3")).sendKeys("manager");
            driver.findElement(By.id("opp4")).sendKeys("CDEF");
           WebElement tab = driver.findElement(By.id("opp9"));
           tab.click();
          WebElement date = driver.findElement(By.xpath("//a[@class='calToday']"));
           date.click();
           Actions a = new Actions(driver);
          WebElement body= driver.findElement(By.xpath(" //body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/table[1]/tbody[1]/tr[2]/td[2]"));
          body.click();
           WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
           stage.click();
           driver.findElement(By.xpath("td[id='topButtonRow'] input[title='Save']"));
     }
     
     public void pipeline () {
    	 
         driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")).click();
         driver.findElement(By.xpath(" //a[@title='Opportunities Tab']")).click() ;   
     }
     public void stuckopper () {
   driver.findElement(By.xpath(" //li[@class='hover']//a")).click();
   driver.findElement(By.xpath(" //a[@title='Opportunities Tab']")).click() ;  	 
     }
      public void quarterlysummerly () throws InterruptedException
      {
    	  WebElement interval = driver.findElement(By.id("quarter_q"));
          Select value = new Select(interval);
          value.selectByVisibleText("Current and Next FQ");
          WebElement include = driver.findElement(By.id("open"));
       
          Select text = new Select(include);
          text.selectByVisibleText("All Opportunities");
          Thread.sleep(5000);
          WebElement report = driver.findElement(By.xpath( "//input[@title='Run Report']"));
          report.click(); 
      }
      public void leadstab () {
    	driver.findElement(leadsTab).click();  
      }
     
     
     
     
     
     
     
}
