package mytutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenOrange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\isekar\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		/*System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");*/
		
		//getmethods
		
		System.out.println("Title of the webpage "+driver.getTitle());
		System.out.println("Current URL  of the webpage "+ driver.getCurrentUrl());
		System.out.println("Title of the webpage "+ driver.getPageSource());
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
