package mYfirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassForEachLoop {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/virtual?sublist=0&scenario=4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).click();
		String text = "admin@gmail.com";
		Robot r =new Robot();
		for(char c : text.toCharArray())
		{
			int finaltext=KeyEvent.getExtendedKeyCodeForChar(c);
			r.keyPress(finaltext);
			r.keyRelease(finaltext);
		}
		
		
	}

}
