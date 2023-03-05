package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("http://www.leafground.com/");
	 WebElement dropdownicon=driver.findElement(By.xpath("//img[@alt='ListBox']"));
	 dropdownicon.click();
	 
	 // dropdonw list
	 WebElement dropdown1= driver.findElement(By.id("dropdown1"));
	 Select select=new Select(dropdown1);
	 select.selectByValue("1");
	 Thread.sleep(3000);
	 select.selectByIndex(0);
	 Thread.sleep(3000);
	 select.selectByVisibleText("Loadrunner");
	 Thread.sleep(3000);
	 
	 List<WebElement> listofoptions= select.getOptions();
	 int size=listofoptions.size();
     System.out.println(" Number of Elements " +size );	
     dropdown1.sendKeys("UFT/QTP");
     
     //multiselect box
     WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
       
     Select multiselect=new Select(dropdown2);
     multiselect.selectByIndex(1);
     multiselect.selectByIndex(2);
     multiselect.selectByIndex(3); 
     
     
     
	}
}
