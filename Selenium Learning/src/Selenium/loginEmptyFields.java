package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class loginEmptyFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);
		driver.navigate().to("https://dev-new.orthologiq.net");
		ngDriver.waitForAngularRequestsToFinish();
			
		driver.findElement(By.id("input-1")).sendKeys("tel.com");

		String error1=driver.findElement(By.xpath("/html/body/app-root/app-authentication/div/div[1]/div[2]/div/div/app-login/div/form/div[1]/app-form-input/div/app-form-input-error/div")).getText();
		if (error1.equals("Email format incorrect")) {
			System.out.println("Test Passed");
					
		}else {
			System.out.println("Test Failed");
		}

			//System.out.println(error1);	
	}

}
