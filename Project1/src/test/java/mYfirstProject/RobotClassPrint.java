package mYfirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassPrint {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		Set<String> allwid = driver.getWindowHandles();
		for(String wid: allwid)
			driver.switchTo().window(wid);
		SearchContext tree1 = driver.findElement(By.tagName("print-preview-app")).getShadowRoot();
		SearchContext tree2=tree1.findElement(By.id("sidebar")).getShadowRoot();
		SearchContext tree3 = tree2.findElement(By.cssSelector("print-preview-button-strip")).getShadowRoot();
		tree3.findElement(By.cssSelector("cr-button[class='action-button']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
