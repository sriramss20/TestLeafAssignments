package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get("http://www.leafground.com/pages/Link.html");
			
			//find all links
			List<WebElement> findalllinks = driver.findElementsByXPath("//a[contains(@href,'.html')]");
			//to get the count use size method
		int size = findalllinks.size();
		System.out.println(size);
		
		//click on 1st link
		findalllinks.get(0).click();
		
	}

}
