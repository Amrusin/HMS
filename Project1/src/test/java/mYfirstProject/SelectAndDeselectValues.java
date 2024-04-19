package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement options = driver.findElement(By.id("select-multiple-native")); 
Select s=new Select(options);
s.selectByValue("China");
Thread.sleep(2000);
s.selectByVisibleText("United Arab Emirates");
Thread.sleep(2000);
s.deselectByVisibleText("China");
Thread.sleep(2000);
s.deselectByValue("United Arab Emirates");
Thread.sleep(2000);
driver.quit();
	}

}
