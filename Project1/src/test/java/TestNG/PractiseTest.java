package TestNG;

import org.testng.annotations.Test;

public class PractiseTest{
	@Test(groups="smoke")
	public void practise1()
	{
		System.out.println("---Practise Create---");
	}
	@Test(groups="regression")
	public void practise2()
	{
		System.out.println("---Practise Edit---");
	}
	@Test(groups="smoke")
	public void practise3()
	{
		System.out.println("---Practise Delete---");
	}

}
