package ParallelDemo;

import org.testng.annotations.Test;

public class C {
     
	@Test
	public void testcase4() {
		
		System.out.println("this is test case4"+Thread.currentThread().getName());
	}
}
