package mytutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://leafground.com/button.xhtml");
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String titleofthepage=driver.getTitle();
		System.out.println("Title of the Page:   " +titleofthepage);
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement disabledbutton=driver.findElement(By.name("j_idt88:j_idt92"));
	
		boolean status=disabledbutton.isEnabled();
		System.out.println("button disabled or not: " +status);
		
		
		WebElement position= driver.findElement(By.id("j_idt88:j_idt94"));
		Point pos=position.getLocation();
		int xposition=pos.getX();
		int yposition=pos.getY();
		System.out.println("X position: "+xposition);
		System.out.println("Y position: " +yposition);
		
		
		WebElement savebutton=driver.findElement(By.id("j_idt88:j_idt94"));
		String color=savebutton.getCssValue("color");
		System.out.println("color of the save button: " + color);
		
		
		WebElement submitbutton=driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension size=submitbutton.getSize();
		int hsize=size.getHeight();
		int wsize=size.getWidth();
		System.out.println("height of submit button :" +hsize);
		System.out.println("width of submit button :" +wsize);
		
		
		
		
		
		

	}

}
