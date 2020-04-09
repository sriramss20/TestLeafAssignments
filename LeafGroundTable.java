package week2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		//get table and store in web element
		WebElement leafgroundstable = driver.findElementByXPath("//table[@id='table_id']");
		//find the number of rows and store in list
		List<WebElement> totalrows = leafgroundstable.findElements(By.tagName("tr"));
		System.out.println("total row count: "+totalrows.size());
		List<Integer> obj = new ArrayList<Integer>();
		for (int i = 2; i <= totalrows.size(); i++) {
			String progressValue = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]//td[2]").getText();
			String replacedString = progressValue.replaceAll("\\D", "");
			int intProgressValue = Integer.parseInt(replacedString);
			obj.add(intProgressValue);
		}
		
		System.out.println(obj);
		
		Integer min = Collections.min(obj);
		
		System.out.println(min);
		
		driver.findElementByXPath("//td[contains(text(),'"+min+"')]/following::td[1]/input").click();
		
		
		
		
		
		
		
		
//		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
