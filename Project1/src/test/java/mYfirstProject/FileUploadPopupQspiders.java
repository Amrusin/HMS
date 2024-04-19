package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupQspiders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("fileInput"));
		ele.sendKeys("C:\\Users\\sindh\\Downloads\\Sindhu_Fresher.pdf");
		WebElement text = driver.findElement(By.xpath("//p[@class='me-2']"));
		System.out.println(text.getText());
		/*file f=new file("C:\\Users\\sindh\\Downloads\\Sindhu_Fresher.pdf");*/
		
		driver.quit();
	}

}
