package week3assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		
		List<WebElement> alltrains = driver.findElementsByXPath("//div[@id='divTrainsList']//td[@class=''][2]");
		
		ArrayList<String>newalltrains=new ArrayList<String>();
		
		for (WebElement trainname : alltrains) 
		{
			System.out.println("trainname is"+trainname.getText());
			
			newalltrains.add(trainname.getText());
			 //newalltrains.add(trainname);
			
		}
		Collections.sort(newalltrains);
		for (String train : newalltrains) {
		System.out.println("after sorting"+train);	
		}
		
		
		

	}

}
