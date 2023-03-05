package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/checkbox.xhtml");
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image'][@alt='Link']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Home Page")).click();
		//driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		List<WebElement>nlist=driver.findElements(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li"));
		for (WebElement webElement : nlist) {
			webElement.getText().equals("Vasanthi02");
			webElement.click();
		}*/
		

       /* 
       WebElement countryoption=driver.findElement(By.id("j_idt87:country_label"));
       countryoption.click();
       List<WebElement> countrydropdown=driver.findElements(By.xpath("//*[@id=\"j_idt87:country_items\"]/li"));
		for (WebElement son : countrydropdown) {
			if (son.getText().equals("Germany")) {
				son.click();
				
			}
		}
				
		*/
		
		
		//driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]")).click();
		
		//WebElement togglebutton = driver.findElement(By.id("j_idt87:j_idt100"))
		
		driver.findElement(By.id("j_idt87:multiple")).click();
		List<WebElement> options=driver.findElements(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li"));
		System.out.println("options" + options.size());
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			if (webElement.getText().equals("Paris")) {
				System.out.println(webElement.getText());
				webElement.click();
			}else if(webElement.getText().equals("Rome")) {
				System.out.println(webElement.getText());
				webElement.click();
		}
	}

	}
}
