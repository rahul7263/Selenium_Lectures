package All_Selenium_Methods;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe {
    
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("//img[@src=\"images/high_tatras4_min.jpg\"]"));
		WebElement target = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
	
		 
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		String val = driver.findElement(By.xpath("//div/h1[contains(text(),'Drag And Drop')]")).getText();
		System.out.println(val);
		
	    driver.close();
	}
}
