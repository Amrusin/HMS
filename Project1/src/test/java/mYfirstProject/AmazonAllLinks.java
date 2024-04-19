package mYfirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
int size = AllLinks.size();
System.out.println(size);
for(int i=0;i<size;i++)
{
	String data = AllLinks.get(i).getText();
	System.out.println(data);
}

driver.quit();
	}

}
