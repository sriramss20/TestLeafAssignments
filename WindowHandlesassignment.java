package week3assignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class WindowHandlesassignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WindowHandlesassignment obj=new WindowHandlesassignment();
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click leads link
		driver.findElementByLinkText("Leads").click();
		
		
		
		



		driver.findElementByXPath("//a[text()='Merge Leads']").click();

		String parentwindow = driver.getWindowHandle();

		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

		Thread.sleep(5000);

		Set<String> allwindows = driver.getWindowHandles();

		ArrayList<String> arraylistallwindows = new ArrayList<String>(allwindows);

		driver.switchTo().window(arraylistallwindows.get(1));

		driver.findElementByXPath("//input[@name='firstName']").sendKeys("babu");

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(4000);

		String lead1 = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//td//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();

		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//td//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		Thread.sleep(5000);

		driver.switchTo().window(parentwindow);

		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

		Set<String> newallwindows = driver.getWindowHandles();

		ArrayList<String> newarraylistallwindows = new ArrayList<String>(newallwindows);

		driver.switchTo().window(newarraylistallwindows.get(1));
		
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("babu");

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(4000);

		String lead2 = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//td//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]/a").getText();

		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//td//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]/a").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(parentwindow);
		
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		String Pagetitle = driver.getTitle();
		
		if(Pagetitle.equalsIgnoreCase("View Lead | opentaps CRM"))
		{
			System.out.println("Merge lead is success");
			
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			
			driver.findElementByXPath("//input[@name='id']").sendKeys(lead1);
			
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			
			
			
			
			Thread.sleep(5000);
			
			obj.snap(driver);
						
		}
		else
		{
			System.out.println("Merge lead is Failed");
		}
		
		
		
		





	}
	
	public static void snap(RemoteWebDriver driver) throws WebDriverException, IOException {
		/*File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:/Shrikanth/others/Selenium/chromedriver_win32/Facebook"+i+".jpg");
		FileUtils.copyFile(src, desc);
		i++;*/
		int i=1;
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	    
		ImageIO.write(fpScreenshot.getImage(),"JPEG",new File("./Screenshots/FullPageScreenshot"+i+".jpeg"));
	    
		i++;

}
	
}