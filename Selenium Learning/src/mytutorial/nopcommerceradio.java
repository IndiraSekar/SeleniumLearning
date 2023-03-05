package mytutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerceradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement male=driver.findElement(By.id("gender-male"));
		male.click();
		
		boolean radiostatus=male.isSelected();
		
		System.out.println("Male radio button state: " + radiostatus);
		
		WebElement female=driver.findElement(By.id("gender-female"));
		
		System.out.println("Female radio button state : " + female.isSelected());
		
		

	}

}
