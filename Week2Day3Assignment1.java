package week2assignment;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day3Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		WebElement firstrow = totalrows.get(1);


		List<WebElement> allcolumns = firstrow.findElements(By.tagName("td"));


		System.out.println("total column count: "+allcolumns.size());

		// Get the progress value of 'Learn to interact with Elements' and store it in a variable
		//		for (WebElement currentrow : totalrows) 
		//		{
		//			List<WebElement> currentcolvals = currentrow.findElements(By.tagName("td"));
		//
		//			for(int i=0;i<currentcolvals.size();i++)
		//			{
		//				String columntxtvalue = currentcolvals.get(i).getText();
		//				
		//				if(columntxtvalue.equalsIgnoreCase("Learn to interact with Elements"))
		//				{
		//					System.out.println("Progress Value is : "+currentcolvals.get(1).getText());
		//				}
		//			}

		//learn to interact with key board val
		for (WebElement currentrow : totalrows) 
		{
			List<WebElement> currentcolvals = currentrow.findElements(By.tagName("td"));

			for(int i=0;i<currentcolvals.size();i++)
			{
				String columntxtvalue = currentcolvals.get(i).getText();

				if(columntxtvalue.equalsIgnoreCase("Learn to interact using Keyboard, Actions"))
				{
					System.out.println("Progress Value is : "+currentcolvals.get(1).getText());
				}
			}
		}
		// Find the vital task for the least completed progress and check the box

//			String[]progressvalues = null;
//
//			for (WebElement currentrow: totalrows) {
//
//				List<WebElement> currentcolvals = currentrow.findElements(By.tagName("td"));
//
//				String text = currentcolvals.get(2).getText();	
//				for (int i = 0; i <totalrows.size(); i++) {
//					progressvalues[i]=currentcolvals.get(1).getText();
//					
//				}
//				Arrays.sort(progressvalues);
//				
//				for(int j = 0;j<currentcolvals.size();j++)
//				{
//					String columntxtvalue = currentcolvals.get(j).getText();
//					if(columntxtvalue.equalsIgnoreCase(progressvalues[0]))
//					{
//						System.out.println(currentcolvals.get(2).isEnabled());
//					}
//				}
		
	 WebElement progres = driver.findElementByXPath("//tr[i]//td[i]");
	 String interaction = progres.getText();
		String regex = null;
		String replacement = null;
		String replaceAll = interaction.replaceAll(regex, replacement);
	 System.out.println(replaceAll);
			}
			{

			}	

		

}



