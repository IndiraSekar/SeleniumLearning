package mytutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementvsfindelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/register");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("shop");
		
        List<WebElement>elements=driver.findElements(By.xpath("//div[@class='footer']//a"));
        System.out.println("size of elements " + elements.size());
        for (WebElement webElement : elements) {
        	System.out.println(webElement.getText());
		}
	}

}
