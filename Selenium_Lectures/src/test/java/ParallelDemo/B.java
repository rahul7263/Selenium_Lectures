package ParallelDemo;

import org.testng.annotations.Test;

public class B {
  
	@Test
	public void testcase3() {
		
		System.out.println("this is test case3"+Thread.currentThread().getName());
	}
}
