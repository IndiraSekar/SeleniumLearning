package mytutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://testleaf.herokuapp.com/pages/Window.html");
			
			String parentwindow =driver.getWindowHandle();
			System.out.println("window name " +parentwindow);
			
			WebElement homepageedit= driver.findElement(By.id("home"));
			homepageedit.click();
			
			Set<String> handles=driver.getWindowHandles();
			
			for (String newwindow : handles) {
				driver.switchTo().window(newwindow);
				
								
			}
			
			WebElement editbox=driver.findElement(By.xpath("//ul[@class='wp-categories-list']/li/a"));
			editbox.click();
			Thread.sleep(2000);
			driver.close();
			
			driver.switchTo().window(parentwindow);

			
			//driver.switchTo().defaultContent();
			

// openmultiplewindow and get size
			
			WebElement openmultiple=driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
			openmultiple.click();
			
			Set<String>multiplewindow=driver.getWindowHandles();
			System.out.println("opened windows : " + multiplewindow.size());
			
			
			WebElement dontclose=driver.findElement(By.xpath("//div[@class='example']/div/div/button[@id='color']"));
			dontclose.click();
			
			Set<String> newwindowhandles=driver.getWindowHandles();
			for (String allwindows : newwindowhandles) {
				if (!allwindows.equals(parentwindow)) {
					driver.switchTo().window(allwindows);
					
					Thread.sleep(2000);
					driver.close();
					
					
				}
				
			}
			
	}
	
	

}
