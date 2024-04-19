package mYfirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassEnterDataInUpperCase {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/virtual?sublist=0&scenario=4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).click();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_S);
		//r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_NUMPAD1);
		r.keyRelease(KeyEvent.VK_NUMPAD1);
		r.keyPress(KeyEvent.VK_NUMPAD0);
		r.keyRelease(KeyEvent.VK_NUMPAD0);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_G);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		driver.findElement(By.id("password")).click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
