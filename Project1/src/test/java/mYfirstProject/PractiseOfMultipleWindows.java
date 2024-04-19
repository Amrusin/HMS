package mYfirstProject;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseOfMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
Set<String> windowHandles = driver.getWindowHandles();

Iterator<String> iterator=windowHandles.iterator();
String google = iterator.next();
String amazon = iterator.next();
String facebook = iterator.next();
String flipkart = iterator.next();

driver.switchTo().window(flipkart);
driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
Thread.sleep(2000);
driver.switchTo().window(amazon);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
Thread.sleep(2000);




}

}
