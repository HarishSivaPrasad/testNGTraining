package seleniumDemo;

import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerDemo implements ITestListener, ITestResult{


	public void onFinish(ITestContext arg0) {					
		// TODO Auto-generated method stub				

	}		


	public void onStart(ITestContext arg0) {					
		// TODO Auto-generated method stub				

				
	}		


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
		// TODO Auto-generated method stub				

	}		


	public void onTestFailure(ITestResult arg0) {					
		// TODO Auto-generated method stub				

	}		


	public void onTestSkipped(ITestResult arg0) {					
		// TODO Auto-generated method stub				

	}		


	public void onTestStart(ITestResult arg0) {					
		// TODO Auto-generated method stub				

	}		


	public void onTestSuccess(ITestResult arg0) {					
		// TODO Auto-generated method stub				
		System.out.println("Listner");	
	
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

	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getFactoryParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTestName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getInstanceName() {
		// TODO Auto-generated method stub
		return null;
	}

	public ITestContext getTestContext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTestName(String name) {
		// TODO Auto-generated method stub

	}

	public boolean wasRetried() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setWasRetried(boolean wasRetried) {
		// TODO Auto-generated method stub

	}



}
