package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//url
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//without clicking find the url
		WebElement findElementByLinkText2 = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
			
		String attribute = findElementByLinkText2.getAttribute("href");
		System.out.println(attribute);
		
		WebElement findElementByLinkText = driver.findElementByLinkText("Verify am I broken?");
		findElementByLinkText.click();
		
String title = driver.getTitle();
if (title.contains("404")) {
	System.out.println("broken");
}
else {
	System.out.println("looks good");
	}
}

}
