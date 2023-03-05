package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class getpagetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);

		
		driver.get("https://dev-new.orthologiq.net/");
		ngDriver.waitForAngularRequestsToFinish();
		//Thread.sleep(500);
		//username
		 driver.findElement(By.id("input-1")).sendKeys("indiraenmovi@gmail.com");
		//Thread.sleep(500);

		//Password
		driver.findElement(By.id("input-2")).sendKeys("Vinayak030*");
		//Thread.sleep(500);

		//Login button
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		//Thread.sleep(500);
		
		String title= driver.getTitle();
		System.out.println(title);

		driver.close();
		
	}

}
