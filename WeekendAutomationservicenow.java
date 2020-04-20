package week3assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WeekendAutomationservicenow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//get url
		driver.get("https://dev92474.service-now.com/");

		//Login with valid credentials username as admin and password as India@123	

		WebElement frame1 = driver.findElementById("gsft_main");

		Thread.sleep(4000);

		driver.switchTo().frame(frame1);

		driver.findElementByXPath("//input[@type='text']").sendKeys("admin");

		driver.findElementByXPath("//input[@type='password']").sendKeys("India@123");

		//click

		driver.findElementByXPath("//button[@type='submit']").click();

		Thread.sleep(15000);

		driver.findElementByXPath("//input[@id='filter']").sendKeys("Incident");
		
		Thread.sleep(15000);

		//incident

		driver.findElementByXPath("//li[@id='concourse_application_dead1309c611228701e2bda7b4252474']//span[text()='Incident']").click();

		Thread.sleep(9000);

		driver.findElementByXPath("//a[@id='14641d70c611228501114133b3cc88a1']//div[@class='sn-widget-list-title'][contains(text(),'Create New')]").click();

		Thread.sleep(10000);

		// Navigate to frame
		driver.switchTo().frame("gsft_main");

		// Incident number
		String incidentnumber = driver.findElementById("incident.number").getText();		


		// Click search icon
		Thread.sleep(15000);

		driver.findElementByXPath("//button[@id='lookup.incident.caller_id']//span[contains(@class,'icon icon-search')]").click();

		Thread.sleep(15000);

		// Navigate to window

		String parentwindow = driver.getWindowHandle();

		Set<String> allWin = driver.getWindowHandles();



		List<String> list = new ArrayList<String>(allWin);

		String secWin = list.get(1);

		driver.switchTo().window(secWin);
		Thread.sleep(4000);

		driver.findElementByXPath("//tr[@id='row_sys_user_62826bf03710200044e0bfc8bcbe5df1']//td[3]/a").click();

		driver.switchTo().window(parentwindow);

		driver.switchTo().frame("gsft_main");

		WebElement categorydd = driver.findElementByXPath("//select[@name='incident.category']");

		Select category = new Select(categorydd);

		category.selectByVisibleText("Inquiry / Help");

		WebElement subcategorydd = driver.findElementByXPath("//select[@name='incident.subcategory']");

		Select subcategory = new Select(subcategorydd);

		subcategory.selectByValue("internal application");

		WebElement contactypedd = driver.findElementByXPath("//select[@name='incident.contact_type']");

		Select Contacttype = new Select(contactypedd);

		Contacttype.selectByIndex(4);

		WebElement statedd = driver.findElementByXPath("//select[@name='incident.state']");

		Select state = new Select(statedd);

		state.selectByVisibleText("In Progress");

		WebElement urgencydd = driver.findElementByXPath("//select[@name='incident.urgency']");

		Select urgency = new Select(urgencydd);

		urgency.selectByVisibleText("1 - High");

		driver.findElementByXPath("//button[@name='lookup.incident.assignment_group']").click();

		Set<String> allwindows = driver.getWindowHandles();

		ArrayList<String> allwindowslist = new ArrayList<String>(allwindows);

		String newwindow = allwindowslist.get(1);

		driver.switchTo().window(newwindow);

		Thread.sleep(5000);

		driver.findElementByXPath("//tr[@id='row_sys_user_group_36c741fa731313005754660c4cf6a70d']//td[3]/a").click();

		driver.switchTo().window(parentwindow);

		driver.switchTo().frame("gsft_main");

		Thread.sleep(4000);

		driver.findElementByXPath("//input[@name='incident.short_description']").sendKeys("Creating Incident For the Purpose of Management");

		driver.findElementByXPath("//*[@id='sysverb_insert_bottom']").click();

		Thread.sleep(4000);

		//driver.switchTo().frame("gsft_main");

	

		driver.findElementByXPath("(//input[@id='incident_table_header_search_control'])[1]").sendKeys(incidentnumber,Keys.ENTER);
	}
}