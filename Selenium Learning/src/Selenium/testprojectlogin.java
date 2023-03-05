package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testprojectlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Geckodriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://example.testproject.io/web/");
		
		driver.findElement(By.id("name")).sendKeys("Raghav");
		driver.findElement(By.id("password")).sendKeys("12345");
		
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("logout")).click();
		
		Thread.sleep(3000);
		System.out.println("browser is closed ");
		driver.close();
		
		

	}

}
