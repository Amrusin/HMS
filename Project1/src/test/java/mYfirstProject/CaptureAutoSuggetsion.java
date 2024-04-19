package mYfirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAutoSuggetsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("tshirts");
List<WebElement> tshirts = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']//li//div[2]//span"));

int count=tshirts.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	
	String data = tshirts.get(i).getText();
	String value = tshirts.get(i).getAttribute("value");
	System.out.println(data);
	System.out.println(value);
}

	}

}
