package All_Selenium_Methods;


import java.io.Serializable;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String [] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver", "H:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	  driver.get("https://flipkart.com");
	  
	  driver.manage().window().maximize();
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  System.out.println("title is showed");
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  
	  WebElement flipkart = driver.findElement(By.xpath("//img[@title='Flipkart']"));
	  
	
	  
	  boolean True = flipkart.isDisplayed();
	  
	  if(True) {
		  
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 
	  }else {
		  
		  driver.close();
	  }
	  
	  String parent = driver.getWindowHandle();
	  System.out.println(parent);
	  
	  driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Pink, 128 GB)')]")).click();
	  Thread.sleep(3000);
	  
	Set <String>  allwindows = driver.getWindowHandles();
	  System.out.println(allwindows);
	  Thread.sleep(3000);
	  
	  for(String x: allwindows) {
		  
		  System.out.print(x);
		  driver.switchTo().window(x);
	  }
            
	  String price = driver.findElement(By.xpath("(//div[@class='CEmiEU']/div/div)[1]")).getText();
	  System.out.println(price);
	  Thread.sleep(3000);
	  
	  driver.switchTo().window(parent);
	  
	  driver.findElement(By.xpath("By.xpath(\"//input[@type='text']")).clear();
	  Thread.sleep(3000);
	  
	  driver.quit();
	  driver.close();
	   
	}

}
