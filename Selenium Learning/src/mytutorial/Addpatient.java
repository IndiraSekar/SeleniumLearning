package mytutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Addpatient {

	public static void main(String[] args) throws InterruptedException {
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
		 password.sendKeys("Orthotest01*");
		 
		 WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		 loginbutton.click();
		 Thread.sleep(3000);
		 //Add Patient button
		 driver.findElement(By.xpath("//span[@class='icon-PersonAdd']")).click();
		 
		driver.findElement(By.xpath("//div[@class='clip-long-text']")).click();
		
		List<WebElement> facilityoptions=driver.findElements(By.xpath("//div[@class='selection above']/ul//app-option/li"));
		 
		System.out.println(facilityoptions.size());
		for (WebElement item : facilityoptions) {
			System.out.println(item.getText());
			if (item.getText().equals("Memorial Practice - Orthosensor Health")) {
				item.click();
				break;
			}
			
		}
		driver.findElement(By.xpath("//button[@class='btn btn-primary size-default']")).click();
		
        boolean status=driver.findElement(By.xpath("//h1[text()='Add Patient']")).isDisplayed();
        if (status) {
			System.out.println("Add patient screen is displayed");
		}else {
			System.out.println("Add patient screen is not displayed");
		}

	}

}
