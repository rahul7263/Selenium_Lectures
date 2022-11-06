package ParallelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
	
	WebDriver driver;
	
	@Test
	public void testcase1() {
		
		System.out.println("This is testcase 1"+Thread.currentThread().getName());
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://opencart.com");
	}
	
	@Test
	public void testcase2() {
		
		System.out.println("This is testcase 2"+Thread.currentThread().getName());
System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://opencart.com");
	}

}
