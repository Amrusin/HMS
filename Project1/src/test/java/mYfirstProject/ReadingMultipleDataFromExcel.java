package mYfirstProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelcopyReadinData.xlsx");
Workbook wb= WorkbookFactory.create(fis);
  Sheet sh = wb.getSheet("Sheet1");
  int rowcount = sh.getLastRowNum();
  int cellcount = sh.getRow(0).getLastCellNum();
  
  String data = sh.getRow(0).getCell(0).getStringCellValue();
  System.out.println(data);
//  for(int i=0; i<=rowcount; i++)
//  {
//	  for(int j=0; j<cellcount; j++)
//	  {
//		 String value = sh.getRow(0).getCell(0).getStringCellValue();
//		 System.out.print(value+ "         ");
//	  }
//	  System.out.println("     ");
//  }

	}

}
