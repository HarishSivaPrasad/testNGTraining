package testNG;

import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public class ListenerD implements ITestListener{
	

	public void onFinish(ITestContext arg0) {					
		System.out.println("Sciprt Completed");

	}		


	public void onStart(ITestContext arg0) {					
		// TODO Auto-generated method stub				
		System.out.println("Sciprt Start");
				
	}		


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
		// TODO Auto-generated method stub				

	}		


	public void onTestFailure(ITestResult result) {					
		// TODO Auto-generated method stub				
		System.out.println("Script Fail");	
	}		


	public void onTestSkipped(ITestResult arg0) {					
		// TODO Auto-generated method stub				

	}		


	public void onTestStart(ITestResult arg0) {					
		// TODO Auto-generated method stub				
		System.out.println("Script start method");	
	}		


	public void onTestSuccess(ITestResult arg0) {					
		// TODO Auto-generated method stub				
		System.out.println("Script Pass");	
	
	}		
	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub

	}

	public Set<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(ITestResult o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setStatus(int status) {
		// TODO Auto-generated method stub

	}

	public ITestNGMethod getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setParameters(Object[] parameters) {
		// TODO Auto-generated method stub

	}

	public IClass getTestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public Throwable getThrowable() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setThrowable(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	public long getStartMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getEndMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setEndMillis(long millis) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
