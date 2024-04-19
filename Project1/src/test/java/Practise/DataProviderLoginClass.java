package Practise;

import org.testng.annotations.DataProvider;

public class DataProviderLoginClass {

	@DataProvider(name="Login")
	  public Object[][] logindata()
	  {
		  Object[][] obj=new Object[2][2];
		  obj[0][0]="xyz@gmail.com";
		  obj[0][1]="xyz12345";
		  
		  obj[1][0]="amrutha@gmail.com";
		  obj[1][1]="amrutha";
		  
		  
		return obj;
		  
}
}