package All_Selenium_Methods;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	    String parentWindwoHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
		Thread.sleep(3000);
		
	    Set<String> AllWindowHandles = driver.getWindowHandles();
	    
	    for(String handle:AllWindowHandles) {
	    	
	    	if(!handle.equals(parentWindwoHandle)) {
	    		driver.switchTo().window(handle);
	    		
	    		driver.manage().window().maximize();
	    		
	    		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Rahul");
	    		Thread.sleep(3000);
	    		
	    		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Kande");
	    		Thread.sleep(3000);
	    		
	    		driver.findElement(By.xpath("//input[@id=\"femalerb\"]")).click();
	    		Thread.sleep(3000);
	    		
//	    		driver.findElement(By.xpath("id=\"englishchbx\"")).click();
//	    		Thread.sleep(3000);
//	    		
//	    		driver.findElement(By.xpath("//input[@id=\"hindichbx\"]")).click();
//	    		Thread.sleep(3000);
	    		
	    		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kkrahul@gmail.com");
	    		Thread.sleep(3000);
	    		
	    		JavascriptExecutor js = (JavascriptExecutor)driver;
	    		js.executeScript("window.scrollBy(0,350)", "");
	    		Thread.sleep(3000);
	    		
	    		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("kadne@65784564");
	    		Thread.sleep(3000);
	    		
	    		driver.findElement(By.xpath("//button[@id=\"registerbtn\"]")).click();
	    		Thread.sleep(3000);
	    		
	    		driver.close();
	    	}
	    }
	    
	    driver.switchTo().window(parentWindwoHandle);
	    driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Window_Handling_is Done");
	    Thread.sleep(6000);
	    driver.close();
	}

}

