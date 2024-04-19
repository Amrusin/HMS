package Practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonIphone13StoreinExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13",Keys.ENTER);
		WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Pink']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::div[@class='a-section a-spacing-none a-spacing-top-micro puis-price-instructions-style']//span[@class='a-price-whole']"));
		String price = iphone.getText();
		System.out.println("IPhone Price is----->"+price);
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ExcelcopyReadinData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("IphonePrice");
		sh.createRow(0).createCell(0).setCellValue("PriceFor I Phone ");
		sh.getRow(0).createCell(1).setCellValue(price);
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\ExcelcopyReadinData.xlsx");
		wb.write(fos);

	}

}
