package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectUploadFilesQspiders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("fileInput"));
		ele.sendKeys("C:\\Users\\sindh\\OneDrive\\Desktop\\Amrutha_manual3+.pdf");
		ele.sendKeys("C:\\Users\\sindh\\OneDrive\\Documents\\Document (1).docx");
		WebElement data = driver.findElement(By.xpath("//ul[@class='list-decimal']"));
		System.out.println(data.getText());
	
	}

}
