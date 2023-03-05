package mytutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Logoutaccount {

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
		//password.sendKeys("Vinayak03*");
		password.sendKeys("Orthotest01*");

		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();

		Thread.sleep(4000);



		//logout icon

		driver.findElement(By.className("icon-Account")).click();
		
		List<WebElement>userinfo=driver.findElements(By.xpath("//div[@class='user-info']//ul/li"));
		for (WebElement item : userinfo) {
			if (item.getText().equals("OS Admin")) {
				System.out.println("User is Admin User");
			}else {
				System.out.println("user is not Admin user");
			}
			
		}
		//List<WebElement>navigation= driver.findElements(By.xpath("//div[1]/div/div[2]/app-user-menu/nav/div[2]/div[2]/ul/li"));
		//System.out.println(navigation.size());


		//driver.findElement(By.xpath("/html/body/app-root/div/app-navigation-bar/div[1]/div/div/app-user-menu/nav/div/app-icon[2]/span")).click();
		//user account
		//app-user-menu//nav//div[2]//ul/li[2]

	}

}
