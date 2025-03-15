package vizza_insurence;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class transForm implements IAnnotationTransformer {
	
	 public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	        annotation.setRetryAnalyzer(RetryAnalyzer.class); // Set RetryAnalyzer for all test cases
	    }

	
}
