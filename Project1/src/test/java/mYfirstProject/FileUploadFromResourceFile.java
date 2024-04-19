package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadFromResourceFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
WebElement ele = driver.findElement(By.id("fileInput"));
ele.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\textfile.txt");

	}

}
