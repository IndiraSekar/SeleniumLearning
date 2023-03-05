package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		WebElement alerticon = driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image'][@alt='Alert']"));
		alerticon.click();
		
		//finding alertbuttons
		
		WebElement alertbox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alertbox.click();
		
		Alert alert= driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirmbox.click();
		Alert confirmalert=driver.switchTo().alert();
		confirmalert.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptbox.click();
		Alert promptalert=driver.switchTo().alert();
		
		promptalert.sendKeys("SaiRam");
		promptalert.accept();
		
		WebElement linebreakbox = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		linebreakbox.click();
		Alert linebreakalert=driver.switchTo().alert();
		linebreakalert.accept();
		
		WebElement Sweetalertbox=driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
		Sweetalertbox.click();
		
        Alert sweetalert=driver.switchTo().alert();
        WebElement okbutton=driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']"));
        okbutton.click();
		
		
		
	}
}
