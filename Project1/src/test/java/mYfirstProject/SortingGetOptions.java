
package mYfirstProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingGetOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement country = driver.findElement(By.id("select3"));
		Select s2=new Select (country);
		s2.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("select5"));
		Select s3=new Select(state);
		s3.selectByValue("Karnataka");
		ArrayList<String> list=new ArrayList<String>();
		List<WebElement> options=s3.getOptions();
		System.out.println(options.size());
		for(WebElement Element:options)
		{
			list.add(Element.getText());
		}
		Collections.sort(list);
		for(String finalOptions:list)
		{
			System.out.println(finalOptions);
		}
		driver.quit();
	}

}
