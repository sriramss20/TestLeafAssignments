package week1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys("DemosalesManager");
	driver.findElementById("password").sendKeys("crmsfa");	
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("testcompany");
	driver.findElementById("createLeadForm_firstName").sendKeys("sriram");
	driver.findElementById("createLeadForm_lastName").sendKeys("ram");
//	driver.findElementByXPath("//input[@name='companyName']").sendKeys("testcompany");
//	driver.findElementByXPath("//input[@name='firstName']").sendKeys("sriram");
//	driver.findElementByXPath("//input[@name='lastName']").sendKeys("ram");
	driver.findElementByXPath("//input[@name='submitButton']").click();
	String title = driver.getTitle();
	System.out.println(title);
	if (driver.getTitle().equalsIgnoreCase("View Lead | opentaps CRM")) {
		
		System.out.println("lead creeated successfully");
	}
	else {
		System.out.println("lead not created");
	}
	driver.navigate().to("https://www.facebook.com/");
	driver.findElementByXPath("//input[@id='email']").sendKeys("srira***e88@gmail.com");
	driver.findElementByXPath("//input[@id='pass']").sendKeys("Annai**");
	
	
	driver.findElementByXPath("//input[@type='submit']").click();
	
	System.out.println(driver.findElementByXPath("//span[text()='Sriram']").isDisplayed());
	driver.close();
		

	}

}
