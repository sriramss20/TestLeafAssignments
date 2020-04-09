package week2assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week2Day4Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/sortable.html");
		
		
		driver.manage().window().maximize();
		
		WebElement item1 = driver.findElementByXPath("(//ul[@id='sortable']//following::li)[1]");
		
		
		//actions
		
		Actions builder=new Actions(driver);
		
		builder.dragAndDropBy(item1, 0, 124).build().perform();
}}

	