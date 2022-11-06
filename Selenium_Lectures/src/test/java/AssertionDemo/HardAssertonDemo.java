package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertonDemo {
  
	@Test
	public void testcase1() {
		
		System.out.println("Hard assertion Start");
		Assert.assertTrue(false);
		System.out.println("Hard assertion end");
	}
	
	@Test
	public void testcase2() {
		
		System.out.println("Hard assertion Start");
		Assert.assertTrue(true);
		System.out.println("Hard assertion end");
	}

	
}
