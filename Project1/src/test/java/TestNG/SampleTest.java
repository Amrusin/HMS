package TestNG;

import org.testng.annotations.Test;

public class SampleTest {
@Test(groups="smoke")
public void test1()
{
	System.out.println("-----Test Script1-----");
}
@Test(groups="regression")
public void test2()
{
	System.out.println("-----Test Script2-----");
}

}
