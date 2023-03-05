package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class ngwebdrivertest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);
		
		//**OrthologiQ Login Page**
		// Positive scenario
		driver.get("https://dev.orthologiq.net/");
		ngDriver.waitForAngularRequestsToFinish();
		Thread.sleep(500);
		//username
		driver.findElement(By.id("input-1")).sendKeys("indiraenmovi@gmail.com");
		Thread.sleep(500);

		//Password
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("NewPassword555!");
		 
		

		//Login button
		 WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		 loginbutton.click();
		Thread.sleep(500);
		
		//**

		boolean state=driver.getPageSource().contains("Home");
		System.out.println("Home page is displayed:  " +state);
		
		//Assert.IsTrue(state);
		Thread.sleep(500);
        
		//**Admin Module
		/*driver.findElement(By.linkText("Admin")).click();
		String Adminmessage=driver.findElement(By.xpath("//p")).getText();
		System.out.println(Adminmessage);
		Thread.sleep(500);*/
        
		//**Logout
//		driver.findElement(By.name("Account")).click();
//		List<WebElement>navigation= driver.findElements(By.xpath("//div[1]/div/div[2]/app-user-menu/nav/div[2]/div[2]/ul/li"));
//		int size=navigation.size();
//		System.out.println("Total elements present in the Navigation list : " +size);
//
//		for (WebElement webElement : navigation) {
//			System.out.println(webElement.getText());
//			if (webElement.getText().equals("Logout")) {
//				webElement.click();    		 
//
//			}
//
//		}

		Thread.sleep(500); 
		
		driver.close();
		
	}

}







/*
boolean adstat=driver.getPageSource().contains("Admin");
System.out.println("Admin page is displayed:  " +state);

ngDriver.waitForAngularRequestsToFinish();*/

//driver.findElement(ByAngular.buttonText("Admin")).click();
/*
//WebElement admin=driver.findElement(By.xpath("//a[@href ='/admin']"));
WebElement admin=driver.findElement(By.cssSelector("Admin"));
		//("//a[contains(text(),'admin')]"));
//String admintext=driver.findElement(By.linkText("/admin")).getText();
//System.out.println(admintext);
admin.click();
 */
//boolean adminstatus=driver.getPageSource().contains("Admin overview works!");
//	System.out.println(" page is displayed:  " +adminstatus);



/*driver.get("https://juliemr.github.io/protractor-demo/");
ngDriver.waitForAngularRequestsToFinish();

//Element1
WebElement element1=driver.findElement(ByAngular.model("first"));
element1.sendKeys("5");

//Element 2
WebElement element2=driver.findElement(ByAngular.model("second"));
element2.sendKeys("4");


WebElement button=driver.findElement(ByAngular.buttonText("Go!"));
button.click();
 */


