package com.saucedemo.extentListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.saucedemo.Testbase.TestBase;
import com.saucedemo.utility.Screenshots;

public class ListenerSetUp extends TestBase implements ITestListener {
     ExtentReports extent= ExtentReportGen.extentReportGenerator();
ExtentTest  test;
	@Override
	public void onTestStart(ITestResult result) {
		 System.out.println(result.getName());
		test= extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		test.log(Status.PASS,"TestCase passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println(result.getName());
	test.fail(result.getThrowable());
	try {
		test.addScreenCaptureFromPath(Screenshots.captureScreenshot(driver,result.getName()));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
		test.log(Status.SKIP,"TestCase skipped");
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println(context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println(context.getName());
	extent.flush();
		ITestListener.super.onFinish(context);
	}
	
	

}
