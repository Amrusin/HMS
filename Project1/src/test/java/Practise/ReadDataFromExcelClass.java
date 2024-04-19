package Practise;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadDataFromExcelClass {
	@DataProvider(name="SignupReadDataExcel")
	  public Object[][] SignUp() throws Throwable
	  {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ExcelcopyReadinData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("dataprovider");
		int rowcount = sh.getPhysicalNumberOfRows();
		int cellcount = sh.getRow(0).getPhysicalNumberOfCells();
		
		  Object[][] obj=new Object[rowcount][cellcount];
		  for(int i=0;i<rowcount;i++)
		  {
			  for(int j=0;j<cellcount;j++)
			  {
				  obj[i][j]=sh.getRow(i).getCell(j).toString();
			  }
		  }
		  return obj;
}
}
