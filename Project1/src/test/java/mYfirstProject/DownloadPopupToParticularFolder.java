     package mYfirstProject;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadPopupToParticularFolder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions options=new ChromeOptions();
HashMap<String, Object> chromePrefs=new HashMap<String, Object>();
chromePrefs.put("download.default_directory", "C:\\Users\\sindh\\OneDrive\\Desktop\\Downloads");
options.setExperimentalOption("prefs", chromePrefs);
WebDriver driver=new ChromeDriver(options);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
driver.findElement(By.id("writeArea")).sendKeys("Hi iam Amrutha");
Thread.sleep(2000);
driver.findElement(By.id("downloadButton")).click();
Thread.sleep(2000);

	}

}
