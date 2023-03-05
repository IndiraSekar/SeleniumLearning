package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
		// finding the elements
		
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("indira.sekar@gmail.com");
		
		WebElement appendbox=driver.findElement(By.xpath("//input[@value='Append ']"));
		appendbox.sendKeys("Sairam");
		
		WebElement gettextbox=driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		String value=gettextbox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearbox = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearbox.clear();
		
		WebElement disabledbox=driver.findElement(By.xpath("//input[@type='text'][@disabled='true']"));
		boolean box=disabledbox.isEnabled();
		System.out.println("box is enabled  " +	box);
		
		
		

	}

}
