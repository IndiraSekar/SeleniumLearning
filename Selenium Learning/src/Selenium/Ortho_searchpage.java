package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Ortho_searchpage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);

		driver.get("https://dev.orthologiq.net/login");
		//driver.manage().window().maximize();
		ngDriver.waitForAngularRequestsToFinish();
		
		driver.findElement(By.id("input-1")).sendKeys("indiraenmovi@gmail.com");
		driver.findElement(By.id("input-3")).sendKeys("NewPassword555!");
		//Login button
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(6000);	
		
		driver.findElement(By.id("input-4")).sendKeys("Automation");
		driver.findElement(By.xpath("//div[@class='facility']/following::div/div[@title='Automation, Test ']")).click();
		//verify patient block shown
		String patientBlockPage= driver.findElement(By.xpath("//span[text()='Patient Page']")).getText();
		if (patientBlockPage.equals("Patient Page")) {
			System.out.println("patient Page is displayed");
			
		}else
		{
			System.out.println("Patient page is not displayed");
		}
		
		driver.findElement(By.xpath("//app-icon[@name='ArrowLeft']")).click();
		
		//Add note
		
		boolean addNote=driver.findElement(By.id("button-16")).isDisplayed();
		System.out.println("addNote is displayed " + addNote);
		
		//String addNoteButton=driver.findElement(By.xpath("//*[text()= ' Add Note ']")).getText();
		
		//System.out.println("Add Note button :" + addNoteButton);
		 
		
		
			

	}

}
