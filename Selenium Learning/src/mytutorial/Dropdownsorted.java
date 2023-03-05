package mytutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.twoplugs.com/");

		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

		WebElement selection=driver.findElement(By.name("category_id"));
		Select select=new Select(selection);
		//select.selectByVisibleText("Automobile");
		
		List<WebElement>drplist= select.getOptions();
		
		
		
		
		
		ArrayList originallist=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for (WebElement item : drplist) {
			originallist.add(item.getText());
			templist.add(item.getText());
			}
		
		System.out.println("Original list : " + originallist);
		System.out.println("Temp list : " + templist);
		
		Collections.sort(templist);
		
		System.out.println("Original list after sort: " + originallist);
		System.out.println("Temp list after sort: " + templist);
		
		if (originallist.equals(templist)) {
			
			System.out.println("list is sorted");
			
		}else {
			System.out.println("List is not sorted");
		}
		
		
		
	}

}
