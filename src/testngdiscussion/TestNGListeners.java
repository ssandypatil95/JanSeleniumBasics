package testngdiscussion;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
	
	public class TestNGListeners implements  ITestListener {
	
		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("Test case "+result.getName()+" started");
		}
	
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test case "+result.getName()+" has passed");
		}
	
		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("Test case "+result.getName()+" has failed");
		}
	
		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test case "+result.getName()+" has skipped");
		}
	
		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}
	
		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			
		}
	
		@Override
		public void onStart(ITestContext context) {
			System.out.println("Test tag "+context.getName()+" has started");
		}
	
		@Override
		public void onFinish(ITestContext context) {
			System.out.println("Test tag "+context.getName()+" has completed");
		}

//	Source --> Add unimplemented method
	
	
	
	
	
}
