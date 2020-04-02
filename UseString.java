package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseString {

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
	WebElement findElementByLinkText = driver.findElementByLinkText("Demo Sales Manager");
	System.out.println(findElementByLinkText);
	String txt = "welcome to Testleaf";   // literal
	String txt1 = "ver 2.0";
	txt1.replace("come", "go");
	
	}

}

