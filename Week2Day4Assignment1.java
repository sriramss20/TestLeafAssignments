package week2assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week2Day4Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		//url
//		driver.get("http://www.leafground.com/");
		driver.get("http://www.leafground.com/pages/drop.html");
		
		driver.manage().window().maximize();
//Click on Droppable
		
		//driver.findElementByXPath("//h5[text()='Droppable']").click();
		//Perform the Specified Action
		WebElement draggable = driver.findElementByXPath("//div[@id='draggable']");
		WebElement droppable = driver.findElementByXPath("//div[@id='droppable']");
		
		//actions
		
		Actions builder=new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();
	}

}
