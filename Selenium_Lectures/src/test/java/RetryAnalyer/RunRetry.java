package RetryAnalyer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunRetry {

	@Test(retryAnalyzer=Retry.class)
	public void testcase1() {
		System.out.println("this is testcase1");
		Assert.assertTrue(false);
	}
	
	
	public void testcase2() {
		System.out.println("this is test case2");
		Assert.assertTrue(false);
	}
}

