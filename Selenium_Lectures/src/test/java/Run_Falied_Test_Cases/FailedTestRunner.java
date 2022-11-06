package Run_Falied_Test_Cases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterClass;

import junit.framework.Test;

public class FailedTestRunner {
  
	@AfterClass
	public void runfailedtestcases() {
		
		TestNG ngobj =  new TestNG();
		
		List<String> list = new ArrayList<String>();
		
		list.add("C:\\Users\\Rahul\\git\\Selenium_Lectures\\Selenium_Lectures\\test-output\\Suite\\testng-failed.xml");
		
		
		ngobj.setTestSuites(list);
		
		ngobj.run();
		
	}
}
