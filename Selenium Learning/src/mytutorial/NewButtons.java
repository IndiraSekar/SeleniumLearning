package mytutorial;

import java.awt.Dimension;
import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://leafground.com/button.xhtml");


		//Click and confirm title
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String title=driver.getTitle();
		System.out.println("Title of the webpage:  " +title);
		driver.navigate().back();
		Thread.sleep(3000);

		//confirm button is disabled
		boolean buttonstate= driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		System.out.println("Button state: " + buttonstate);

		//Position of Submit button
		WebElement submitbutton=driver.findElement(By.id("j_idt88:j_idt94"));
		org.openqa.selenium.Point location=submitbutton.getLocation();
		int xvalue= location.getX();
		int yvalue= location.getY();
		System.out.println("xvalue : " + xvalue);
		System.out.println("yvalue : " + yvalue);
		
		// Color of save button
		WebElement savecolor= driver.findElement(By.name("j_idt88:j_idt96"));
		String color=savecolor.getCssValue("color");
		System.out.println("color of save button" +color);
		
		//position of the submit button
		WebElement submit=driver.findElement(By.id("j_idt88:j_idt98"));
		org.openqa.selenium.Dimension submit1=submit.getSize();
		int height=submit1.getHeight();
		int weight=submit1.getWidth();
		System.out.println("Height of the button: " + height);
		System.out.println("weight of the button: " + weight);
		
		//round buttons
		
		List<WebElement> roundbuttons=driver.findElements(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]/button"));
		int Noofbuttons=roundbuttons.size();
		System.out.println("Number of round buttons" + Noofbuttons);
		
		/*List roundbuttons=driver.findElements(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]/button"));
		int rbuttonsize=roundbuttons.size();
		System.out.println("No. of round buttons: " + rbuttonsize);*/






	}

}
