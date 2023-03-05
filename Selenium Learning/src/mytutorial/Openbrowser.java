package mytutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chrome driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.close();
		
		
		
		//firefox browser
		
		/*System.setProperty("webdriver.gecko.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.leafground.com/");*/
		
		/*System.setProperty("webdriver.edge.driver", "C:/Users/isekar/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");*/
		
		
		
		
		
		
		
		
	}

}
