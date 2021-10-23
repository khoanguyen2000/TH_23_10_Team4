package TH_23_10_Team4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListener implements ITestListener {
	@Override
	public void onStart (ITestContext arg0) {
		
		System.out.println("Bat dau TEST!!!");
		
	}
	
	@Override
	public void onFinish (ITestContext arg0) {
		System.out.println("Ket thuc TEST!!!");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage (ITestResult arg0) {
		
	}
	
	@Override
	public void onTestFailure (ITestResult arg0) {
		
	}
	
	@Override
	public void onTestSkipped (ITestResult arg0) {
		
	}
	
	@Override
	public void onTestStart (ITestResult arg0) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Next TESTING!!!");
	}
}
