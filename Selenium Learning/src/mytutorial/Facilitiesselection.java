package mytutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Facilitiesselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);
		 driver.get("https://dev.orthologiq.net");
		 ngDriver.waitForAngularRequestsToFinish();
		 
		 WebElement username=driver.findElement(By.id("input-1"));
		 username.sendKeys("indiraenmovi@gmail.com");
		 
		 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("Ortho06*");
		 
		 WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		 loginbutton.click();

	}

}
