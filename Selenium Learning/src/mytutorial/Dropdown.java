package mytutorial;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Selenium.Alertexample;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://testleaf.herokuapp.com/pages/Alert.html");
			
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		

		
		
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.dismiss();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("INDIA");
		Thread.sleep(2000);
		alert2.accept();
		
		
		/*
		WebElement DropDown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select select = new Select(DropDown1);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByVisibleText("Cypress");
		
		WebElement DropDown2 = driver.findElement(By.id("j_idt87:country_label"));
		DropDown2.click();
		List<WebElement> Country1 = driver.findElements(By.xpath("//*[@id=\"j_idt87:country_items\"]/li"));
		for (WebElement webElement : Country1) {
			if (webElement.getText().equals("India")) {
				webElement.click();	}
		}
		
		
		WebElement Dropdown3= driver.findElement(By.id("j_idt87:city_label"));
		Dropdown3.click();
		
		Thread.sleep(3000);
		
		List<WebElement> cities=driver.findElements(By.xpath("//*[@id=\"j_idt87:city_label\"]"));
		System.out.println("number of cities" +cities.size());
		
		*/

	}

}
