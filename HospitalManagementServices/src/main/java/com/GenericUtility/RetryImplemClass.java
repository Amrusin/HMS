package com.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplemClass implements IRetryAnalyzer{

	int lowerCount=0;
	int upperCount=3;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(lowerCount<upperCount)
		{
			lowerCount++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
