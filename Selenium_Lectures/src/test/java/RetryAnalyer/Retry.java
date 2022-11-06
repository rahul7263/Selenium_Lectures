package RetryAnalyer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
    
	int coun =0;
	int max = 2;
	
	public boolean retry(ITestResult result) {
		
		if(coun<max) {
			System.out.println("retrying"+result.getName()+"again and count is"+(coun+1));
			coun++;
			return true;
		}
		
		return false;
	} 
}
