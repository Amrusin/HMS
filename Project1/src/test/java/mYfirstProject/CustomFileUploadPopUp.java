package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;                                    //Doesnot Work
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Upload File']"));
		Thread.sleep(3000);
		ele.click();
		ele.sendKeys("C:\\Users\\sindh\\OneDrive\\Documents\\Document (1).docx");
	
	}

}
