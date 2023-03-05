package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Wait;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class MyPatientsVerification {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);

		driver.get("https://dev.orthologiq.net/login");

		ngDriver.waitForAngularRequestsToFinish();
		driver.findElement(By.id("input-1")).sendKeys("indiraenmovi@gmail.com");
		driver.findElement(By.id("input-3")).sendKeys("NewPassword555!");
		//Login button
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(6000);

		boolean myPatientsText=driver.findElement(By.className("current")).isDisplayed();
		System.out.println("Mypatients text"+ myPatientsText);

		boolean searchBox=driver.findElement(By.className("patient-search")).isDisplayed();
		System.out.println("searchBox"+ searchBox);
		Thread.sleep(3000);

		boolean filterList=driver.findElement(By.name("FilterList")).isDisplayed();
		System.out.println("filterlist present: "+ filterList);

		driver.findElement(By.name("FilterList")).click();

		boolean filterPane= driver.findElement(By.className("title")).isDisplayed();
		if (filterPane) {

			System.out.println("Filter Pane is Opened");

		}else {
			System.out.println("FilterPane is not Opened");
		}

		Thread.sleep(2000);

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile,new File("C:\\Users\\isekar\\OneDrive - Stryker\\Pictures\\Screenshots\\Addpatient\\" + System.currentTimeMillis()+"Screenshot.png"));


		boolean applyButton=driver.findElement(By.id("button-4")).isEnabled();
		System.out.println("Applybutton enabled?"+ applyButton);


		List<WebElement>checkBoxOptions=driver.findElements(By.xpath("//div[@class='checkbox']"));

		for (WebElement elementOne : checkBoxOptions) {
			elementOne.click();

		}

		driver.findElement(By.id("button-4")).click();

		String expectedUrl = "https://dev.orthologiq.net/patient/";
		String actualUrl= driver.getCurrentUrl();

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("back to MyPatient Page");
		}else {
			System.out.println("Test case failed-user not back to Mypatient");
		}

		Thread.sleep(3000);
		List<WebElement> facilityDropDown=driver.findElements(By.className("icon-ExpandMore"));
		facilityDropDown.get(1).click();

		List<WebElement>facilityDropDownOptions=driver.findElements(By.xpath("//*[@class='selection below']/ul/app-option/li"));
		System.out.println(facilityDropDownOptions.size());

		for (WebElement tempElement : facilityDropDownOptions) {
			System.out.println(tempElement.getText());
			if (tempElement.getText().equals("Beta Practice - Beta Hospital")) {
				System.out.println(tempElement);
				tempElement.click();
				break;
			}
			
			
		}

	}


}
