package mytutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNopCommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/register");
		
		
		WebElement malecheckbox=driver.findElement(By.id("gender-male"));
		
		System.out.println(malecheckbox.isDisplayed());
		System.out.println(malecheckbox.isEnabled());
		
		System.out.println(malecheckbox.isSelected());
		driver.quit();
		
		
	}

}
