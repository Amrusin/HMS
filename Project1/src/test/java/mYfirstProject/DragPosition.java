package mYfirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
List<WebElement> draggable = driver.findElements(By.className("draggable"));
WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
WebElement target2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
Actions a =new Actions(driver);

for(WebElement ele: draggable)
{
	String text = ele.getText();
	System.out.println(text);
if(text.contains("Mobile"))
{
	a.dragAndDrop(ele, target1).pause(2000).perform();
}
else if(text.contains("Laptop"))
{
	a.dragAndDrop(ele, target2).pause(2000).perform();
}
Thread.sleep(2000);
	}
driver.quit();
	}

	}
