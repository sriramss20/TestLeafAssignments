package week2day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlpKartactions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		//url
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[text()='✕']").click();
		//click tv and appliances
		WebElement tvapl = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement Lg = driver.findElementByXPath("//a[text()='LG']");
		//WebElement lgapl = driver.findElementByLinkText("LG");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(tvapl).perform();
		Thread.sleep(1000);
		//click lg
		builder.moveToElement(Lg).click().perform();
		
		//first tv
		String firsttv = driver.findElementByXPath("//div[text()='LG All-in-One 80cm (32 inch) HD Ready LED Smart TV']").getText();
		System.out.println(firsttv);
		
		
		
	
	}

}
