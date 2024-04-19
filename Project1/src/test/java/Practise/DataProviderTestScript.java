package Practise;

import org.testng.annotations.Test;

public class DataProviderTestScript {
@Test(dataProviderClass=DataProvClass.class,dataProvider="Institutes")
		  public void testScript(String name,String place,String courses) 
		  {
			  System.out.println("Orname--->"+name+"--->Places--->"+place+"--->course--->"+courses);
		  }
	}
