package testcases;
import java.util.concurrent.TimeUnit;
import library.Browser;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.AccountPage;
import pages.ContactsPage;
import pages.HomePage;
import pages.LeadPage;
import pages.LoginPage;
import pages.OpportunitesPage;
import pages.RandomPage;
import pages.SettingsPage;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class LoginTestCase  {
	
	WebDriver driver;
    LoginPage lp;
    HomePage hp;
    SettingsPage ms;
   AccountPage ap;
   OpportunitesPage op;
   LeadPage lep;
   ContactsPage cp;
    RandomPage rp;
	
    
   // Launch of the given browser.
   @BeforeTest
   public void browserlaunch()
   {
                  driver = Browser.StartBrowser("Chrome", "https://login.salesforce.com/");
                  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                  lp = new LoginPage(driver);
                  hp = new HomePage(driver);
                  ms= new SettingsPage(driver);
                  ap = new AccountPage(driver);
                  op = new OpportunitesPage(driver);
                  lep = new LeadPage (driver);
                  cp = new ContactsPage (driver);
                  rp= new RandomPage (driver);
                 
    }
    
   ExtentHtmlReporter htmlreport = new ExtentHtmlReporter(".\\extendReport\\finalResult.html");
	ExtentReports reports = new ExtentReports();

	// This is the object of extentTest class, by which log is generate.
	ExtentTest testlog;
	

	@BeforeTest
	public void logWithScreenshot() throws IOException {

		System.out.println("Start");

		reports.attachReporter(htmlreport);

		// Customize Report property
		htmlreport.config().setReportName("Test Report");
		reports.setSystemInfo("Host Name", "Test Host");
		reports.setSystemInfo("Environment", "Automation Testing");
		reports.setSystemInfo("User Name", "QA Automation");
		htmlreport.config().setDocumentTitle("Automation Report");
		htmlreport.config().setTestViewChartLocation(ChartLocation.TOP);
		
    	testlog = reports.createTest("Test Log Login");
		testlog.info("This is Info log");
		

		testlog = reports.createTest("Test Log GetTitle");
		testlog.log(Status.INFO, "This is Info log");
		

		testlog = reports.createTest("Test log out");
		testlog.log(Status.INFO, MarkupHelper.createLabel("This is Info log", ExtentColor.GREEN));
		testlog.log(Status.PASS, MarkupHelper.createLabel("This is pass log", ExtentColor.RED));

	}
  
	    // Login to the Site.
  @Test(priority = 1)
  public void Login()
   {
  
   lp.loginToSite("nisha@tekarch.com","athipillil26");
 
   }
  
  // Verifing the Home Page.
  @Test(priority = 2)
  public void getTitleOfTheHomePage()
  {
	
                 }
  
   @Test (priority=3)
 public void logout() {
	 hp.logout();
	 
 }
   /*
   // password clear 
  @Test  (priority =4)
   public void invalidLogin()  {
	  lp.loginToSite("nisha@tekarch.com", "");
	  
  }
   @Test (priority =5)
   public void validateLoginError()
   {
   lp.loginToSite("123","22131");
   lp.clear();
   }
   
   @Test (priority = 6)
   public void Usermenudropdown() 
   {
	   lp.loginToSite("nisha@tekarch.com","athipillil26");
	   hp.usermenu();
   }
   @Test(priority=7)
   public void Myprofile() throws InterruptedException {
	   hp.myProfile();
	   Thread.sleep(5000);
	    }
   @Test(priority =8)
    public void MySettings () throws InterruptedException {
	   hp.usermenu();
	   hp.mySettings();
	   ms.Personal();
	   }
   @Test (priority=9)
   public void emailTest () throws InterruptedException {
	   ms.emailtest();
   }
   @Test (priority=10)
   public void calender () throws InterruptedException {
	   ms.clndr();
   }
  
   @Test (priority = 11)
   public void dconsole () {
	   hp.usermenu();
	   hp.devloperconsole();
   }
@Test (priority =12)
public void Caccount() throws InterruptedException {
     hp.Account();
     ap.createaccount();
 
 }
@Test (priority = 13)
 public void CreateView () {
	ap.createnewview();
}
@Test (priority = 14)
 public void oppertunities() throws InterruptedException {
	ap.oppurtunities();
}

  @Test (priority = 15)
  public void oppertab () {
	  op.opportab();
  }
  @ Test (priority =16)
  public void  newopty () throws InterruptedException {
	  op.newopty();
  }
  @ Test (priority =17)
  public void  pipelineopportunities () throws InterruptedException {
	  op.pipeline();
  }
	  @Test (priority = 18)
	  public void stuckoppor(){
		  op.stuckopper();
	  }
	  @Test(priority = 19)
	  public void summary () throws InterruptedException {
		  op.quarterlysummerly();
	  }
	  @Test (priority= 20)
	  public void leadsTab () {
		  op.leadstab();
	  }
	  @Test (priority =21)
	  public void dropdownlead () throws InterruptedException {
		  lep.dropdown();
	  }
	  @Test (priority = 22)
	  public void todaysLead () throws InterruptedException {
		  lep.todayslead();
	  }
	  
	  @Test (priority = 23)
	  public void contstab () throws InterruptedException {
		lep.contactstab();  
	  }
	  @Test (priority = 24)
   public void contstest () {
		 cp.contactstest(); 
	  }
	  @Test (priority =25)
	  public void createview () {
		  cp.createnewview();
	  }
	  @Test (priority =26)
	  public void Newview () {
	      cp.newview();
		  }
	     
	  @Test (priority =27)
	 public void  NewButton () {
		  cp.newbutton();
	  }
	  @Test (priority=28)
	  public void hometab () {
		  hp.fnamelname();
	}
	  @Test (priority = 29)
	  public void  Editprof ()
	  {
		rp.editprofile();
		
	  }
	 
	    @Test (priority =30)
	  public void plusTab () {
		  rp.plusTab();
		  hp.logout();
		  lp.loginToSite("nisha@tekarch.com","athipillil26");
	  }
	  @Test (priority =31)
	  public void blockeventinCalender() {
		  hp.hometab();
		  hp.datentime();
		  
	  }
	  */
	@AfterMethod  
  public void getResult(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			testlog.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			testlog.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			BufferedImage img = ImageIO.read(screen);
			File filetest = Paths.get(".").toAbsolutePath().normalize().toFile();
			ImageIO.write(img, "png", new File(filetest + "\\Screenshots\\" + "Test01.png"));
			testlog.info("Details of " + "Test screenshot", MediaEntityBuilder
					.createScreenCaptureFromPath(System.getProperty("user.dir") + "\\Screenshots\\" + "Test01.png")
					.build());
		} else if (result.getStatus() == ITestResult.SKIP) {
			// testlog.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			testlog.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}
	}

	@Test
	public void passTest() {
		testlog = reports.createTest("passTest");
		Assert.assertTrue(true);
		testlog.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));
	}

	@Test
	public void failTest() {
		testlog = reports.createTest("failTest");
		Assert.assertTrue(false);
		testlog.log(Status.PASS, "Test Case (failTest) Status is passed");
		testlog.log(Status.PASS, MarkupHelper.createLabel("Test Case (failTest) Status is passed", ExtentColor.GREEN));
	}

	@Test
	public void skipTest() {
		testlog = reports.createTest("skipTest");
		throw new SkipException("Skipping - This is not ready for testing ");
	}
  @AfterTest
 public void closeBrowser()
{
	  reports.flush();
       driver.close();
       System.out.println("End");
       }
   }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
  
