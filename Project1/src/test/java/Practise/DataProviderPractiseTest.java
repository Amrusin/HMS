package Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderPractiseTest {
  @Test(dataProvider = "text")
  public void getText(String n, String p) 
  {
	  System.out.println("name---->"+n+"---->place---->"+p);
  }
  @DataProvider
  public Object[][] text()
  {
	  Object[][] obj=new Object[2][2];
	  obj[0][0]="Abc";
	  obj[0][1]="Qwe";
	  
	  obj[1][0]="Mnop";
	  obj[1][1]="Xyz";
	  return obj;
  }
}
