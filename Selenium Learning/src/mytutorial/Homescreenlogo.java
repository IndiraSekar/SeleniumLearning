package mytutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Homescreenlogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		NgWebDriver ngDriver=new NgWebDriver(js);
		 driver.get("https://dev.orthologiq.net");
		 ngDriver.waitForAngularRequestsToFinish();
		 
		 WebElement username=driver.findElement(By.id("input-1"));
		 username.sendKeys("indiraenmovi@gmail.com");
		 
		 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("Orthotest01*");
		 
		 WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		 loginbutton.click();
		 
		 //strykerlogo
		 boolean strykerlogo=driver.findElement(By.id("svg135")).isDisplayed();
		 if (strykerlogo) {
			System.out.println("Strykerlogo present in home page");
		}else {
			System.out.println("strykerlogo not found in Home page");
		}
		 
		 //Orthosensor logo
		 boolean orthologo=driver.findElement(By.className("oiq-logo")).isDisplayed();
		 if (orthologo) {
			System.out.println("Orthologiq logo present in home page");
		}else {
			System.out.println("Orthologiq logo not present in home page");
		}
		 
		 
		 List<WebElement> chips=driver.findElements(By.xpath("//app-filter-chip//app-chip//span/text()"));
		 System.out.println(chips.size());
		 for (WebElement item : chips) {
			 System.out.println(item.getText());
			
		}
		 
		 Thread.sleep(3000);
		 //click on Filter list
		 driver.findElement(By.xpath("//app-icon[@class='filter-icon']")).click();
		 
		 boolean filterlist=driver.findElement(By.xpath("//h4[@class='title']")).isDisplayed();
		 if (filterlist) {
			System.out.println("Filter list pane is opened");
			 
		}else {
			System.out.println("Filter list pane is not opened");
		}
		 
		 //Filter options-gettext
		 List<WebElement> Filteroptions=driver.findElements(By.xpath("//div[@class='entry']"));
		 System.out.println(Filteroptions.size());
		 for (WebElement option : Filteroptions) {
			 System.out.println(option.getText());
			/* if (option.getText().equals("High Pain Score")) {
				 option.click();
				 System.out.println("High pain score is selected");
				 break;
				
			}*/
			
		}
		 
		 driver.findElement(By.xpath("//span[@class='clear'][text()='Clear All']")).click();
		 
		 Thread.sleep(5000);
		 
		 
		 //Filter options -Click all options
		 List<WebElement> Filterchecks=driver.findElements(By.xpath("//div[@class='checkbox']"));
		 System.out.println(Filterchecks.size());
		 for (WebElement foption : Filterchecks) {
			 foption.click();
		}
		 
		 
		 Thread.sleep(3000);
		// 
		 driver.findElement(By.xpath("//button[text()='Apply']")).click();
		 
		 
		//h1[text()=' My Patients ']
		 WebElement mypatient=driver.findElement(By.xpath("//h1[text()=' My Patients ']"));
		 System.out.println(mypatient.getText());
		 String text=mypatient.getText();
		 String expectedText = "My Patients";
		 if (text.contains(expectedText)) {
			System.out.println("Filter chips are added and My patients screen is displayed");
		}else {
			System.out.println("MY PATIENTS IS NOT DISPLAYED");
		}
		 
		 Thread.sleep(3000);
		 driver.close();
		 
		 
		 
        	

	}

	private static boolean assertEquals(String text, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

}
