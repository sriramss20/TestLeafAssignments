package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementById("email").sendKeys("srir19@yahoo.co.in");
	driver.findElementByXPath("//input[@value='Append']").sendKeys("sir",Keys.TAB);
	String attribute = driver.findElementByXPath("//input[@name='username']").getAttribute("value");
	System.out.println(attribute);
	driver.findElementByXPath("//input[@name='username']").clear();
	boolean enabled = driver.findElementByXPath("//input['@disabled=true']").isEnabled();
	System.out.println(enabled);
	
	}

}
