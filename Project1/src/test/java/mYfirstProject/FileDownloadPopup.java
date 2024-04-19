package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("writeArea")).sendKeys("Hi iam Amrutha");
		Thread.sleep(2000);
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
