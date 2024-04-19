package Practise;

import org.testng.annotations.DataProvider;

public class DataProvClass
{
@DataProvider(name="Institutes")
  public Object[][] firstdata()
  {
	  Object[][] obj=new Object[3][3];
	  obj[0][0]="Qspiders";
	  obj[0][1]="Bangalore";
	  obj[0][2]="Selenium";
	  
	  obj[1][0]="Jspiders";
	  obj[1][1]="BTR";
	  obj[1][2]="Java";
	  
	  obj[2][0]="ProSpiders";
	  obj[2][1]="BTM";
	  obj[2][2]="Python";
	return obj;
	  }
}
