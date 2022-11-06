package Run_Falied_Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Execute {
   
	@Test
	public void testcase1() {
		System.out.println("this is testcase1");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testcase2() {
		System.out.println("this is test case2");
		Assert.assertTrue(false);
	}
}

