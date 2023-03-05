package mytutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.linkText("Platform")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
		int size=driver.findElements(By.tagName("a")).size();
		System.out.println("No. of links present: " + size);
		
		
		
		
		/*driver.navigate().to("https://leafground.com/select.xhtml");
		
		WebElement firstdropdown=driver.findElement(By.className("ui-selectonemenu"));
		Select select =new Select(firstdropdown);
			select.selectByIndex(1);
			Thread.sleep(2000);
			select.selectByVisibleText("Playwright");
			Thread.sleep(2000);
			select.selectByIndex(3);
			
			WebElement seconddropdown=driver.findElement(By.className("ui-selectonemenu-label ui-inputfield ui-corner-all"));
			seconddropdown.sendKeys("India"+Keys.ENTER);*/
			
			
	}

}
