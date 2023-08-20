package api.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.DecimalFormat;

public class CustomTestListener implements ITestListener {

    private long testStart;

    @Override
    public void onFinish(ITestContext arg0) {
        System.out.println("Finish test");
    }

    @Override
    public void onStart(ITestContext testContext) {
        System.out.println("Start test: " + testContext
                .getCurrentXmlTest().getXmlClasses().get(0).getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        System.out.println("Test failed: "+ arg0.getName());
    }

    @Override
    public void onTestFailure(ITestResult testResult) {
        System.out.println("Test failed: "+ testResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult testResult) {
        System.out.println("Test skipped: "+ testResult.getName());
    }

    @Override
    public void onTestStart(ITestResult testResult) {
        testStart = System.currentTimeMillis();
        System.out.println("Test start: " + testResult.getName() + "\n");

    }

    @Override
    public void onTestSuccess(ITestResult testResult) {
        System.out.println("Test end: "+ testResult.getName()
                + " Time elapsed: " + new DecimalFormat("0.000")
                .format((System.currentTimeMillis() - testStart) / 1000.0) + " seconds");
    }
}
