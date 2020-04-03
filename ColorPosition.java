package week1.day4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:/Automation/Drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//find the fontsize of username
		String fontsize = driver.findElementByLinkText("Leaftaps Login").getCssValue("background-color");
		
		System.out.println(fontsize);
		
		//width of login button
		int width = driver.findElementByClassName("decorativeSubmit").getSize().getWidth();
		
		System.out.println(width);
		
		//find the x position of username textbox
		WebElement elementusername = driver.findElementById("username");
		System.out.println("the x value is:"+elementusername.getLocation().getX());
	}

}
