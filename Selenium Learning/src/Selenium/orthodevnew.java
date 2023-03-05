package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orthodevnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://dev-new.orthologiq.net/");
		
		WebElement uname= driver.findElement(By.xpath("//*[@id=\"authentication\"]/div/app-login/form/div[1]/label"));
		String getuname=uname.getText();
		System.out.println(getuname);
		
		
		WebElement mypatientlink =driver.findElement(By.linkText("My Patients"));
		mypatientlink.click();

		//Object1- Username
		WebElement username= driver.findElement(By.id("input-1"));
		username.sendKeys("indiraenmovi@gmail.com");
	
			
		
		WebElement searchbox= driver.findElement(By.xpath("//input[@class='patient-search']"));
		searchbox.sendKeys("patient");
		
		//object 2 - Password
		WebElement password= driver.findElement(By.id("input-2"));
		password.sendKeys("Vinayak010*");
		
		//object3 - login button 
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();

	    // 
		


	}

}
