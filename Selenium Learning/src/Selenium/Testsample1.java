package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testsample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Geckodriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://dev.orthologiq.net/");
		String title=driver.getTitle();
		System.out.println("Pagetitle: "+title);
		
		//finding elements on the page
		WebElement username=driver.findElement(By.xpath("//*[@id='input-1']"));
		username.sendKeys("indiraenmovi@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@id='input-2']"));
		password.sendKeys("Vinayak030*");
		
		WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/div/app-login/form/div[4]/app-button/button"));
		loginbutton.click();
		
		Thread.sleep(3000);
		
		

	}

}
