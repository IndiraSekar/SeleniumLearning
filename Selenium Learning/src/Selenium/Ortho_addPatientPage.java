package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Ortho_addPatientPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);

		driver.get("https://dev.orthologiq.net/login");
		//driver.manage().window().maximize();
		ngDriver.waitForAngularRequestsToFinish();
		
			Ortho_addPatientPage.login(driver);
			Thread.sleep(3000);
			
			driver.findElement(By.className("icon-PersonAdd")).click();
			
			WebElement selectfacility=driver.findElement(By.xpath("//div[@class='clip-long-text']"));
			selectfacility.click();
			List<WebElement>navigation= driver.findElements(By.xpath("//app-option/li"));
			int size=navigation.size();
			System.out.println("Total facility present in the Navigation list : " +size);
			for (WebElement webElement : navigation) {
				//System.out.println(webElement.getText());

				if (webElement.getText().equals("Beta Practice - Beta Hospital")) {
					webElement.click();  
					break;

				}			

			}
			WebElement submit=driver.findElement(By.xpath("//app-button[@class='submit']"));
			submit.click();

			
			driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("i" +Keys.TAB);
			
           String firstNameError= driver.findElement(By.xpath("//div[@class='error-message']")).getText();
           System.out.println(firstNameError);
           Thread.sleep(2000);
           WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First name']"));
           firstName.clear();
           firstName.sendKeys(" "+Keys.BACK_SPACE);	
           
           driver.findElement(By.xpath("//input[@placeholder='First name']")).clear();
           driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("20");
          String expectedErr="Name format incorrect";
          String actualErr= driver.findElement(By.className("error-message")).getText();
          System.out.println(actualErr);
           
           if (actualErr==expectedErr) 
           {
			
        	   System.out.println("Error Matching");
		   }else 
		   {
			   System.out.println("Error not matching");
		   
		   }
		  

// lastname

	WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last name']"));
    lastName.clear();
    lastName.sendKeys(" "+Keys.BACK_SPACE);	
    
    driver.findElement(By.xpath("//input[@placeholder='Last name']")).clear();
    driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("20");
   String expectedErr1="Name format incorrect";
   String actualErr1= driver.findElement(By.className("error-message")).getText();
   System.out.println(actualErr1);
    
    if (actualErr1==expectedErr1) 
    {
		
 	   System.out.println("Error Matching");
	   }else 
	   {
		   System.out.println("Error not matching");
	   
	   }
	  }
	
	public static void login(WebDriver driver) throws InterruptedException {

			driver.findElement(By.id("input-1")).sendKeys("indiraenmovi@gmail.com");
			driver.findElement(By.id("input-3")).sendKeys("NewPassword555!");
			//Login button
			WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
			loginbutton.click();
			Thread.sleep(6000);	
	}
	
}
