package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SystemNotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions option=new ChromeOptions();
option.addArguments("--use-fake-ui-for-media-stream");
WebDriver driver=new ChromeDriver(option);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://mictests.com/");
driver.findElement(By.id("mic-launcher")).click();
	}

}
