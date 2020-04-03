package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://acme-test.uipath.com/account/login");
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
		//click login
		Thread.sleep(1000);
		driver.findElementByXPath("//button[@id='buttonLogin']").click();
		
		//mouse hover vendors
		
		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		//clck serach vendor
		
		driver.findElementByLinkText("Search for Vendor").click();
		//enter vendor id
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		//click search
		driver.findElementByXPath("//button[@id='buttonSearch']").click();
		
		//
		String cname=driver.findElementByXPath("//table[@class='table']").getText();
		 System.out.println(cname);
		
		 driver.findElementByXPath("//a[@href='/account/logout/']").click();
		 driver.close();
		}
		
	}


