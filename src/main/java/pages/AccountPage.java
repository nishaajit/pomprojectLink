package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	WebDriver driver;
	public AccountPage(WebDriver da)
    {
       this.driver=da;
    }
	
	public void createaccount() {
		WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
        lightdialogue.click();
        driver.findElement(By.xpath(" //input[@title='New']")).click();
        WebElement acname = driver.findElement(By.id("acc2"));
        acname.sendKeys("sepomxmltest");
        driver.findElement(By.xpath(" //td[@id='topButtonRow']//input[@title='Save']")).click();
	}
	public void createnewview () {
		WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
        lightdialogue.click();
		driver.findElement(By.xpath("//a[normalize-space()='Create New View']")).click();
		  WebElement viewname = driver.findElement(By.id("fname"));
          viewname.sendKeys("N ajit");
          WebElement uniquename = driver.findElement(By.xpath(" //input[@id='devname']"));
          uniquename.clear();
          uniquename.sendKeys("Nishh");
          driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")).click();
	}
	public void oppurtunities() throws InterruptedException {
		WebElement opportunities = driver.findElement(By.xpath(" //a[@title='Opportunities Tab']"));
		opportunities.click();
		Thread.sleep(5000);
		WebElement lightdialogue = driver.findElement(By.id("tryLexDialogX"));
        lightdialogue.click();
               
	}	

}
