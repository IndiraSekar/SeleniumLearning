package mytutorial;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtextbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\isekar\\OneDrive - Stryker\\Desktop\\Learnings\\Selenium\\Chrome Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://leafground.com/input.xhtml");
		
		
		
		
		WebElement tyn=driver.findElement(By.id("j_idt88:name"));
		tyn.sendKeys("India");
		
		WebElement country=driver.findElement(By.id("j_idt88:j_idt91"));
		country.sendKeys(" To United Kingdom");
		
		WebElement disabledbox= driver.findElement(By.id("j_idt88:j_idt93"));
		boolean disabledboxstate=disabledbox.isEnabled();
		System.out.println("Disabled box State: "+disabledboxstate);
		
		WebElement clearbox= driver.findElement(By.id("j_idt88:j_idt95"));
		clearbox.clear();
		
		WebElement retrievetextbox=driver.findElement(By.id("j_idt88:j_idt97"));
		String retrievedtext=retrievetextbox.getAttribute("value");
		System.out.println("Retrievedtext: " +retrievedtext);
		
		WebElement typeemail=driver.findElement(By.id("j_idt88:j_idt99"));
		typeemail.sendKeys("izsekar@gmail.com"+Keys.TAB);
		
		WebElement confirmbox=driver.findElement(By.id("j_idt106:thisform:age"));
		confirmbox.sendKeys(""+Keys.ENTER);
		Thread.sleep(3000);
		WebElement Errormsg=driver.findElement(By.xpath("//*[@id=\"j_idt106:thisform:j_idt110_error-detail\"]"));
		boolean state=Errormsg.isDisplayed();
		System.out.println("error is displayed: " + state);
		Thread.sleep(3000);
		
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]"));
		name.sendKeys("indira");
		
	/*	List name=driver.findElements(By.xpath("//*[@id=\\\"j_idt106:auto-complete_panel\\\"]/ul/li"));
		List<WebElement> names=driver.findElements(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li"));
		int sizeofdropdown=names.size();
		System.out.println("size of dropdown: " + sizeofdropdown);
		
		*/
		
		//WebElement name=driver.findElement(By.id("j_idt106:auto-complete_hinput"));
		//name.sendKeys("Sairam");
	//	Select select =new Select(name);
		//select.selectByIndex(2);
		
		
		
		
		//tyn.clear();
		//.sendKeys("SaiRam");
	/*	
		WebElement country=driver.findElement(By.id("j_idt88:j_idt91"));
		country.sendKeys(" To United Kingdom");
		
		
		
		
		
		
		
		/**/
		
	//	WebElement clickconfirmbox=driver.findElement(By.xpath("//*[@id=\"j_idt106:float-input\"]"));
	//	clickconfirmbox.sendKeys("Love All & Serve All ");
		
	//	WebElement name= driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/ul"));
		//WebElement name=driver.findElement(By.id("j_idt106:auto-complete_hinput"));
		//name.sendKeys("Sairam");
	//	Select select =new Select(name);
		//select.selectByIndex(2);
		
	
		
		
		
		
		
	}

}
