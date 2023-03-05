package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);



		driver.navigate().to("https://dev-new.orthologiq.net");
		ngDriver.waitForAngularRequestsToFinish();
		String beflog=driver.getTitle();
		System.out.println("Before login - login page : " + beflog);

        //username
		WebElement username= driver.findElement(By.id("input-1"));
		username.clear();
		username.sendKeys("indiraenmovi@gmail.com");

		//Password
		WebElement password=driver.findElement(By.id("input-2"));
		password.clear();
		password.sendKeys("DevPassword123*");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		String aflog=driver.getTitle();
		System.out.println("home page title : " + aflog);
		

	}

}
