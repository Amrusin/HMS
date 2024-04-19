package mYfirstProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchParticularDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelcopyReadinData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet("Sheet2");
		  int rowcount = sh.getLastRowNum();
		  int cellcount = sh.getRow(0).getLastCellNum();
		  String Expected="Client";
		  for(int i=0; i<=rowcount; i++)
		  {
			  String data = sh.getRow(i).getCell(0).getStringCellValue();
			  //System.out.println(data);
			  if(data.equalsIgnoreCase(Expected))
			  {
				 System.out.println();
				 for(int j=0;j<cellcount;j++)
				 {
					 String value= sh.getRow(i).getCell(j).getStringCellValue();
					 System.out.print(value+ "    ");
				 }
		        }
			  }
		  }
	}
