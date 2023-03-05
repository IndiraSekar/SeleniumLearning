package mytutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//
		driver.navigate().to("https://www.bing.com/");
		
		WebElement searchbox=driver.findElement(By.id("sb_form_q"));
		searchbox.sendKeys("selenium"+Keys.ENTER);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> options= driver.findElements(By.xpath("//ul[@class='sa_drw']/li"));
		System.out.println(options.size());
		
		ArrayList originallist=new ArrayList();
		
		

	}	

}
