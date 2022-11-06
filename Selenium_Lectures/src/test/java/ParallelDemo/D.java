package ParallelDemo;

import org.testng.annotations.Test;

public class D {
     
	@Test
	public void instances() {
		
		System.out.println("This is demo of instances-1"+Thread.currentThread().getName());
	}
	
	@Test
	public void instances2() {
		
		System.out.println("This is demo of instances-2"+Thread.currentThread().getName());
	}
}
