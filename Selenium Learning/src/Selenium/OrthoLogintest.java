package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class OrthoLogintest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Geckodriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);

		//**OrthologiQ Login Page**
		// Positive scenario
		driver.get("https://dev.orthologiq.net/login");
		ngDriver.waitForAngularRequestsToFinish();
		Thread.sleep(500);
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

		//**

		boolean state=driver.getPageSource().contains("Home");
		System.out.println("Home page is displayed:  " +state);

		//Assert.IsTrue(state);
		Thread.sleep(500);

		//**Admin Module
		Thread.sleep(5000);
		driver.findElement(By.linkText("Admin")).click();
		String Adminmessage=driver.findElement(By.xpath("//p")).getText();
		System.out.println(Adminmessage);
		Thread.sleep(500);

		//**Facility selection
		//driver.findElement(By.linkText("Select Facility")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-navigation-bar/div[3]/div/app-practice-selector/div/app-dynamic-dropdown/div/app-dropdown/div/div[1]/app-icon/span")).click();
				
		List<WebElement>facility=driver.findElements(By.xpath("//div[@class='selection']/ul/app-option/li"));
		int facilitysize=facility.size();
		System.out.println(facilitysize);
		System.out.println("here");
		
		for (WebElement webElement : facility) {
			System.out.println(webElement.getText());
			if (webElement.getText().equals("Memorial Practice - Orthosensor Health")) {
				Thread.sleep(5000);
				System.out.println(webElement.getText());
				//driver.navigate().refresh();
				webElement.click();
				Thread.sleep(5000);
				System.out.println("Clicked");
				break;
			}

		}
		
		        
		WebDriverWait(driver, 10);
		
		driver.findElement(By.linkText("My Patients")).click();
		
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-patient-list-with-sidebar/app-page/div/div[1]/div/div/app-patient-list//div/div/app-patient-list-filter-list/p/span[1]/text()")).click();;
		
		
		
		//List<WebElement>filters=
		//System.out.println("Filters");
			////	System.out.println(driver.findElement(By.name("FilterList")).getText());
				//System.out.println("Filters");
		//System.out.println(filters.size());
				
				///html/body/app-root/app-patient-list-with-sidebar/app-page/div/div[1]/div/div/app-patient-list//div/div/app-patient-list-filter-list/p/span[1]
				
				
				
				
				//driver.findElement(By.linkText("Clear All")).click();
			

		//**Logout
		driver.findElement(By.name("Account")).click();
		List<WebElement>navigation= driver.findElements(By.xpath("//div[1]/div/div[2]/app-user-menu/nav/div[2]/div[2]/ul/li"));
		int size=navigation.size();
		System.out.println("Total elements present in the Navigation list : " +size);

		for (WebElement webElement1 : navigation) {
			System.out.println(webElement1.getText());
			if (webElement1.getText().equals("Logout")) {
				webElement1.click();    		 

			}

		}



		Thread.sleep(500); 

		driver.close();

	}

	private static Object WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

//Notes


//System.out.println(driver.findElement(By.linkText("My Patients")).getText());

		//WebDriverWait(driver, 10).until( EC.element_to_be_clickable((By.XPATH, "your xpath value")) ).click()
		//driver.findElement(By.linkText("My Patients")).click();
		//ngDriver.waitForAngularRequestsToFinish();
		//System.out.println(driver.findElement(By.linkText("My Patients")).getText());
		//new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.linkText("My Patients")));
		//driver.findElement(By.linkText("My Patients")).click();
		//ngDriver.waitForAngularRequestsToFinish();
		//WebDriverWait wait= new WebDriverWait(ngDriver, 10);
		//wait.until(ExpectedConditions.stalenessOf(mypat));
