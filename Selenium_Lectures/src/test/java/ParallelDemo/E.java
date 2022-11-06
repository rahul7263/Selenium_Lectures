package ParallelDemo;

import org.testng.annotations.Test;

public class E {
   
	@Test(threadPoolSize =3 ,invocationCount =3,timeOut=1000)
	public void m1() {
		
		System.out.println("This is Example of Independant Excution"+Thread.currentThread().getId());
		
	}
}
