package week2assignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day2Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/home.html");

		driver.manage().window().maximize();

		driver.findElementByXPath("//h5[text()='Image']").click();

		List<WebElement> allimg = driver.findElementsByTagName("img");

		System.out.println("Total images available in the web Page is : "+allimg.size());
		int i = 1;
		for (WebElement tag : allimg) 
		{
			Thread.sleep(3000);
			if(i==allimg.size()-1)
			{
				System.out.println(tag.getAttribute("src"));
			}

			i++;

		}
		
		
		driver.navigate().back();
		
		driver.findElementByXPath("//h5[text()='Radio Button']").click();
		
		List<WebElement> allradiobtns = driver.findElementsByTagName("input");
		
		System.out.println("Total Radio Buttons Present in the Web Page is : "+allradiobtns.size());
		
		driver.navigate().back();
		
		driver.findElementByXPath("//h5[text()='Checkbox']").click();
		
		Thread.sleep(3000);
		
		List<WebElement> allcheckboxes = driver.findElementsByTagName("input");
		
		System.out.println("Total Radio Buttons Present in the Web Page is : "+allcheckboxes.size());
		
		for (WebElement individualcheckbox : allcheckboxes)
		{
			if(!individualcheckbox.isSelected())
			{
				individualcheckbox.click();
			}
							
		}
		
		Thread.sleep(7000);
		
	
		driver.close();
	}
}