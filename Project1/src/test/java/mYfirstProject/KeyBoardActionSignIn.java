package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActionSignIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys("sindhu10.ammu@gmail.com".toUpperCase(),Keys.CONTROL +"AC");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmPassword")).sendKeys(Keys.CONTROL+ "V",Keys.ENTER);
		driver.quit();
	}

}
