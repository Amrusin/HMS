package Practise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTestNgTest {
  @Test(priority=-1)
  public void create()
  {
	  System.out.println("--Create Tst--");
	  Reporter.log("Hi Welcome");
	  
  }
  
  @Test(priority=4,invocationCount = 2,dependsOnMethods = "create")
  public void edit()
  {
	  System.out.println("--Edit Test--");
	  Reporter.log("--Hi Bye--",true);
  }
  
  @Test(priority=0)
  public void delete()
  {
	  System.out.println("--Delete Test--");
  }
}

