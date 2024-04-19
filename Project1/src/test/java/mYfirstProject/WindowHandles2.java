package mYfirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement windowHandles = driver.findElement(By.id("browserButton3"));
windowHandles.click();
Set<String> w=driver.getWindowHandles();
for(String wh:w)
{
	driver.switchTo().window(wh);
}
driver.findElement(By.id("email")).sendKeys("abc");
driver.findElement(By.id("password")).sendKeys("xyz");
driver.findElement(By.id("confirm-password")).sendKeys("xyz");
driver.quit();
	
	}

}
