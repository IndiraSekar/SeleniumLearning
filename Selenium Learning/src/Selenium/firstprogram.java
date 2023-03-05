package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://perf.orthologiq.net/login");
	//driver.get("https://dev.orthologiq.net/login");
	Thread.sleep(3000);
	//driver.close();
    driver.findElement(By.xpath("//input [@formcontrolname='orthoEmail']")).sendKeys("indiraenmovi+1000@gmail.com");
    driver.findElement(By.xpath("//input[@formcontrolname = 'orthoPassword']")).sendKeys("Vinayak010*");
    driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}

}
