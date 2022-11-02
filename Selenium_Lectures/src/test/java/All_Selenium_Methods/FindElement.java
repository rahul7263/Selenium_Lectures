package All_Selenium_Methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
	    System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
	    
	    //WebDriver is interface = ChromeDriver is child of a WebDriver interface
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.opencart.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	   
	    String url = driver.getCurrentUrl();
	   System.out.println(url);
	   
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	  int count = driver.findElements(By.tagName("a")).size();
	   System.out.println(count);
	   
	   driver.findElement(By.xpath("//a[@class=\"btn btn-black navbar-btn\"]")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@id=\"input-username\"]")).sendKeys("Rahul Knade");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@id=\"input-firstname\"]")).sendKeys("Rahul");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@id=\"input-lastname\"]")).sendKeys("Kande");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("kanderahul@gmail.com");
	   Thread.sleep(1000);
	   
	   Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"input-country\"]")));
	   dropdown.selectByValue("99");
	   
	   driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("Rahul@123");
	   
	   
	    driver.close();
	}

}
