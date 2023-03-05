package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Testlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);

		//**OrthologiQ Login Page**
		// Positive scenario
		driver.get("https://dev.orthologiq.net/login");
		ngDriver.waitForAngularRequestsToFinish();
		Thread.sleep(500);
		
		driver.findElement(By.id("input-1")).sendKeys("indiraenmovi@gmail.com");
		Thread.sleep(500);

		//Password
		driver.findElement(By.id("input-3")).sendKeys("DevPassword321!");
		Thread.sleep(500);

		//Login button
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(3000);
		
		//Add Patient ( delay in element present in DOM)
		WebElement addpatient=driver.findElement(By.xpath("//*[@class='icon-PersonAdd']"));
		addpatient.click();
		
		//select facility
		
		WebElement selectfacility=driver.findElement(By.xpath("//div[@class='clip-long-text']"));
		selectfacility.click();
		
		List<WebElement>navigation= driver.findElements(By.xpath("//app-option/li"));
		int size=navigation.size();
		System.out.println("Total facility present in the Navigation list : " +size);
		for (WebElement webElement : navigation) {
			System.out.println(webElement.getText());
			
			if (webElement.getText().equals("Beta Practice - Beta Hospital")) {
				webElement.click();  
				break;

			}			

		}
		WebElement submit=driver.findElement(By.xpath("//app-button[@class='submit']"));
		submit.click();
		
		

	}

}
