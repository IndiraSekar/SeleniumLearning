package mytutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_nopcommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/isekar/OneDrive - Stryker/Desktop/Learnings/Selenium/Chrome Webdriver/New/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/login");
		
		WebElement username=driver.findElement(By.id("Email"));
		//get attribute
	     String usertext=username.getAttribute("value");
	    		System.out.println(usertext);
		//gettext
	    		
	     WebElement email=driver.findElement(By.xpath("//div[@class='inputs']//label"));
	     String emailtext=email.getText();
	     System.out.println(emailtext);
	     
	     //get inner text from LOG IN Button
	     WebElement loginbutton=driver.findElement(By.xpath("//div[@class='buttons']//button "));
	     System.out.println(loginbutton.getText());

	}

}
