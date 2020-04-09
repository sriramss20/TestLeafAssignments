package week2day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com");
		
		//clcik selectabe
		driver.findElementByXPath("//img[@alt='selectable']").click();
		
		//select last 4
		
		WebElement playwithselectable1 = driver.findElementByXPath("//li[text()='Item 4']");
		WebElement playwithselectable2 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement playwithselectable3 = driver.findElementByXPath("//li[text()='Item 6']");
		WebElement playwithselectable4 = driver.findElementByXPath("//li[text()='Item 7']");
		
		//write actions class
		
		Actions builder=new Actions(driver);
		builder.clickAndHold(playwithselectable1).release(playwithselectable4).perform();
		
	}

}
