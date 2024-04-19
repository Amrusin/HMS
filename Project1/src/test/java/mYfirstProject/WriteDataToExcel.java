package mYfirstProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\EmptyFile.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("Sheet1");
		sh.createRow(1).createCell(0).setCellValue("Selenium");
		sh.getRow(1).createCell(1).setCellValue("Java");
		sh.createRow(0).createCell(0).setCellValue("SQL");
		sh.getRow(0).createCell(1).setCellValue("Manual");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\EmptyFile.xlsx");
		
		  wb.write(fos);
	}

}
