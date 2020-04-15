package week3day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		//inspect and click frame
		driver.switchTo().frame("iframeResult");
		//enter uname
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		//alert
		Alert ok = driver.switchTo().alert();
		ok.accept();
		
		
		

	}

}
