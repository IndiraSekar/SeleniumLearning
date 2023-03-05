package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Neworthourl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Geckodriver/geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);

		//**OrthologiQ Login Page**
		// Positive scenario
		driver.get("https://dev.orthologiq.net/login");
		ngDriver.waitForAngularRequestsToFinish();
		Thread.sleep(500);
		
		boolean orthologo=driver.findElement(By.className("oiq-logo")).isDisplayed();
		System.out.println(orthologo);
		
		//username
		 driver.findElement(By.id("input-1")).sendKeys("indiraenmovi@gmail.com");
		Thread.sleep(500);

		//Password
		driver.findElement(By.id("input-3")).sendKeys("Vinayak030*");
		Thread.sleep(500);

		//Login button
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(500);

		//strykerlogo
		boolean strykerlogo=driver.findElement(By.id("svg135")).isDisplayed();
		System.out.println(strykerlogo);
		
		
		
	
		
//		//search bar
//		boolean searchbar=driver.findElement(By.id("input-4")).isDisplayed();
//		System.out.println(searchbar);
		
		

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://perf.orthologiq.net/login");
//		
//		WebElement username = driver.findElement(By.xpath("//*[@ng-reflect-name='orthoEmail']"));
//		username.sendKeys("indiraenmovi@gmail.com");
//		
//		WebElement password = driver.findElement(By.xpath("//*[@ng-reflect-name='orthoPassword']"));
//		password.sendKeys("Vinayak010*");
//		
//		WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
//		loginbutton.click();
//
//		/*WebElement forgotpwd=driver.findElement(By.linkText("Forgot Password"));
//		forgotpwd.click();
//		
//		WebElement textbox= driver.findElement(By.name("email"));
//		textbox.sendKeys("indiraenmovi@gmail.com");
//		*/


	}

}
