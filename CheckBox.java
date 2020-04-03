package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//url
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//find selenium checkbox
		WebElement elementcheckbox = driver.findElementByXPath("//label[text()=\"Confirm Selenium is checked\"]");
		boolean checked = elementcheckbox.isSelected();
		System.out.println(checked);
		if (!checked) {
			elementcheckbox.click();
		}
		
	}

}
