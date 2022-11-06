package RetryAnalyer;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer{
	
	

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor , Method testMethod) {
		
		
		annotation.setRetryAnalyzer(Retry.class);
	}

}
