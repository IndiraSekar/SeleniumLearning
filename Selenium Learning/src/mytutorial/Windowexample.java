package mytutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://testleaf.herokuapp.com/pages/Window.html");
			
			String parentwindow =driver.getWindowHandle();
			System.out.println("window name " +parentwindow);
			
			
			driver.findElement(By.xpath("//button[@onclick='openWin();']")).click();
			
			Thread.sleep(3000);
			
			Set<String> allwindows=driver.getWindowHandles();
			System.out.println("number of windows opened " + allwindows.size());
			for (String window : allwindows) {
				driver.switchTo().window(parentwindow);
				
			}
		driver.close();
	}

	
}
