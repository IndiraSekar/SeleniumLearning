package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Filterexample {

	public static void main(String[] args) {
		// Login Page
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);
		driver.get("https://dev.orthologiq.net/login");
		driver.manage().window().maximize();
		ngDriver.waitForAngularRequestsToFinish();

		//**OrthologiQ Login Page**
		//*Useremail*
		WebElement Useremail=driver.findElement(By.id("input-1"));
		Useremail.sendKeys("indiraenmovi@gmail.com");
		//*Password*
		WebElement Password=driver.findElement(By.id("input-3"));
		Password.sendKeys("DevPassword321!");
				//Login button
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		//Thread.sleep(6000);

	}

}
