package Practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsPractise {

	@BeforeSuite
	public void DataBase()
	{
		System.out.println("Open Database connection");
	}
	@Test
	public void TestScript()
	{
		System.out.println("TestScript 1");
	}
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login to the Application");
	}
	@BeforeClass
	public void LaunchBrow()
	{
		System.out.println("Launching browser");
	}	
	@AfterMethod
	public void Logout()
	{
		System.out.println("Logout from Application");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close the  browser");
	}
	@AfterSuite
	public void closeDB()
	{
		System.out.println("Close DB Connection");
	}
	@Test
	public void TestScript1()
	{
		System.out.println("TestScript1");
	}
	@Test
	public void TestScript2()
	{
		System.out.println("TestScript2");
	}
}
