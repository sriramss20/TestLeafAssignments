package week3day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();

		//inspect and click alert
		driver.findElementByXPath("//button[text()='Alert Box']").click();

		//switch to alert
		
		Alert alert = driver.switchTo().alert();
		
		//accept
		
		alert.accept();
		//confirm cancel box
		
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		
		Alert cncel = driver.switchTo().alert();
		cncel.dismiss();
		//prompt box
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("infy");
		
		//sweet alert
		
		driver.findElementByXPath("//button[text()='Sweet Alert']");
		
		
		Alert accept = driver.switchTo().alert();
		
		accept.accept();
		Alert sweetalert = driver.switchTo().alert();
		
		
		
	}

}
