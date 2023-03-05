package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testsample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.orthologiq.net/");
		String title=driver.getTitle();
		System.out.println("Pagetitle: "+title);
		
		//finding elements on the page
		WebElement username=driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/app-sharedlogin/div/form/div[2]/div[1]/app-email/div/input"));
		username.sendKeys("indiraenmovi+2000@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/app-sharedlogin/div/form/div[2]/div[2]/app-password/div/input"));
		password.sendKeys("Vinayak001*");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		
		Thread.sleep(3000);
		
		//boolean state=driver.findElement(By.xpath("/html/body/app-root/app-navigation-bar/div[1]/div/div/svg")).isDisplayed();
		//System.out.println(state);
		
		driver.quit();
		
	}


}
