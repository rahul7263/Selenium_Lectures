package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SofAssertonDemo {
  
	SoftAssert obj = new SoftAssert();
	SoftAssert ob = new SoftAssert();
	
	@Test
	public void testcase1() {
		
		System.out.println("Soft Assertion Start");
		obj.assertTrue(true);
		obj.assertEquals("helo", "helo");
		System.out.println("Soft Assertion end");
		obj.assertAll();
	}
	
	@Test
	public void testcase2() {
		
		System.out.println("Soft Assertion Start");
		ob.assertTrue(true);
		ob.assertEquals("helo", "helo");
		System.out.println("Soft Assertion end");
		ob.assertAll();
	}
	
	

	
}
