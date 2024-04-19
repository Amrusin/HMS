package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorUsingSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value=arguments[1]", ele,"iphone");
		
	}

}
