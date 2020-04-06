package week1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		// click leads link
		driver.findElementByLinkText("Leads").click();

		// click find leads
		driver.findElementByLinkText("Find Leads").click();
		//enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("srikanth");
		//click find leads

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(6000);
		
		//capture lead id
		
		String leadid = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//td//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").getText();
		

		//click first name
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//td//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();

		//click del btn
		driver.findElementByLinkText("Delete").click();
		
		Thread.sleep(5000);
		//click on find leads
		driver.findElementByLinkText("Find Leads").click();
		//enter captured lead id
		driver.findElementByXPath("//div[@id='x-form-el-ext-gen246']//input']").sendKeys(leadid);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		//verify no records to dsplay in the lead list
		
		String resulttext = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		if (resulttext.equalsIgnoreCase("No records to display")) 
		{
			System.out.println("delete lead success");
		}
		
		else
		{
			System.out.println("delete lead not successful");
	}



	}

}
