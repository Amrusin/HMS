package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTopOfThePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Bottom of the page
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");  //Top of the page
	}

}
