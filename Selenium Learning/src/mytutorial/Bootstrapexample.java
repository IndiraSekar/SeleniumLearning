package mytutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapexample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();    
		driver.findElement(By.id("justAnInputBox")).click();
		
		//Single option
		//selectchoices(driver,"choice 1");
		
		//Multiple option
		selectchoices(driver,"choice 3", "choice 4", "choice 5");
		
		// All options
		//selectchoices(driver,"all");
		
		//multiple choices
		
		
	}


	public static void selectchoices(WebDriver driver,String...value) {
		
		List<WebElement> choicelist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if (!value[0].equalsIgnoreCase("all")) 
		{
			for(WebElement item:choicelist) 
			{
				String text=item.getText();
				for(String val:value) 
				{
					if (text.equals(val)) 
					{
						item.click();
												
					}
				}
				
				
			}
			
		}else 
		{
			for (WebElement item : choicelist) 
			{
				item.click();
				//break;
			}
		}
			
			

	}

}
