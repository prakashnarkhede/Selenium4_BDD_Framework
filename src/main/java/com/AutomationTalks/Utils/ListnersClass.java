package com.AutomationTalks.Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start listeners");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Success listeners");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test failure listeners");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Skipped listeners");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Start listeners");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Start listeners");
	}

}
