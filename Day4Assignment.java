	package week1assignment;
	
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Day4Assignment {
	
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
	
			// click email
			driver.findElementByXPath("//span[text()='Email']").click();
	
			// enter email
			driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("ssss@ssss.com");
	
			// click findleads
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
	//capture name(value) of first resultant lead
			WebElement eleResultanatLead = driver
					.findElementByXPath("//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a");
			String leadID = eleResultanatLead.getText();
			
			System.out.println(leadID);
			eleResultanatLead.click();
			//click duplicate lead
			
			driver.findElementByLinkText("Duplicate Lead").click();
			
			//verify title
			
			String title = driver.getTitle();
			
			if (driver.getTitle().equalsIgnoreCase("Duplicate Lead | opentaps CRM")) {
				
				System.out.println("lead created successfully");
			}
			else {
				System.out.println("duplicate lead name is not same");
			}
			
			//click create lead
			
			driver.findElementByClassName("smallSubmit").click();
			
			//confirm if duplicated lead name is same as first name
			WebElement firstname = driver.findElementById("viewLead_firstName_sp");
			String text = firstname.getText();
			String fname="srikanth";
			if (text.equalsIgnoreCase(fname)) {
				System.out.println("verified");
			}
			else {
				System.out.println("not verified");
			}
		
			//close  broswer
			
			driver.close();
		}
	
	}
