package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		//Select Buttons image
		WebElement buttons= driver.findElement(By.xpath("//img[@alt='Buttons']"));
		buttons.click();
		
		//content
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
		driver.navigate().back();
		
		WebElement position = driver.findElement(By.id("position"));
		Point pos= position.getLocation();
		int xpos=pos.getX();
		System.out.println("Position- x value " + xpos);
		int ypos=pos.getY();
		System.out.println("Position - Y value" + ypos);
		
		WebElement color = driver.findElement(By.id("color"));
		String colorname=color.getCssValue("background-color");
		System.out.println("color is " +colorname);
		
		WebElement size = driver.findElement(By.id("size"));
		Dimension dsize= size.getSize();
		int height=dsize.getHeight();
		System.out.println("height is " + height);
		
		int width=dsize.getWidth();
		System.out.println("Width is " + width);
		
		
		
		
		
		
		
		
		
		

	}

}
