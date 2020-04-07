package week2assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Week2Day1Assignment1 {


	// TODO Auto-generated method stub

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//enter username
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		//enter pwd
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		//click login
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		//click crm sfa
		
		driver.findElementByXPath("//div[@id='label']/a").click();
		
		
		//click leads
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		
		//Temporary workaround to close additional tab opened.
		System.out.println("*****"+driver.getWindowHandles().size());
		Robot r = new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_W); 
		r.keyRelease(KeyEvent.VK_CONTROL); 
		r.keyRelease(KeyEvent.VK_W);

		
		
		// click find leads
		driver.findElementByXPath("//a[text()='Find Leads']");
		//enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("babu");
		//click find leads

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(6000);

		//click first name
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//td//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();

		//verify title of page
		String viewleadstitle = driver.getTitle();

		if (viewleadstitle.equalsIgnoreCase("View Lead | opentaps CRM")) {
			System.out.println("we are in view leads page");			

		}
		else {
			System.out.println("not in view leads page");
		}

		//click edit
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(10000);	
		//change company name
		Thread.sleep(10000);
		String latestcompanyname="infosys";
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("infosys");
		Thread.sleep(5000);
		//click update
		Thread.sleep(7000);
		driver.findElementByXPath("//input[@name='submitButton']").click();
		//confirm name change appears
		String newcompanyname = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		if (newcompanyname.contains(latestcompanyname)) {
			System.out.println("update lead success");
		}
			else {
				System.out.println("update lead failed");
			}
		driver.close();
		}
		
	}


