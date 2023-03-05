package mytutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		Thread.sleep(2000);
		//driver.close();
				
		WebElement homepage=driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
				
		WebElement editbox=driver.findElement(By.xpath("//img[@alt=\"Edit / Text Fields\"]"));
		editbox.click();
		
		driver.findElement(By.id("email")).sendKeys("Sairam"+ Keys.ENTER);
		
		driver.findElement(By.xpath("//img[@alt=\"Edit / Text Fields\"]"));
		
		
		
	}

}
