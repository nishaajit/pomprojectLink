package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	 static WebDriver driver;

     public static WebDriver StartBrowser(String browsername , String url)
     {
                  // If the browser is chrome
                if(browsername.equalsIgnoreCase("Chrome"))
                 {
                	WebDriverManager.chromedriver().setup();
                	 driver = new ChromeDriver();
                   }

               // If the browser is firefox
             else if(browsername.equalsIgnoreCase("Firefox"))
              {
                          
     System.setProperty("webdriver.gecko.driver","C:\\Users\\Nisha\\Downloads\\geckodriver.exe");
                   driver = new ChromeDriver();
              }
                driver.manage().window().maximize();
                driver.get(url);
               return driver;
        }

}
