package testNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case started successfully");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Hurrey...... test case successed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("oh shit..... test case fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("OMG test case skipped!");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("oh tester, testing is start now ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("dhinkchika,testing is finished");

	}

}
