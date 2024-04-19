package mYfirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidateCitynameIsPresentOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement pno = driver.findElement(By.id("select1"));
		Select s=new Select(pno);
		s.selectByIndex(1);
		driver.findElement(By.name("ph")).sendKeys("2547896453");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("select2"));
		Select s1=new Select(gender);
		s1.selectByValue("female");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("select3"));
		Select s2=new Select (country);
		s2.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("select5"));
		Select s3=new Select(state);
		s3.selectByValue("Karnataka");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));  //sibling xpath
		Select s4=new Select(city);
		s4.selectByVisibleText("Bangalore Urban");
		Thread.sleep(2000);
		List<WebElement> options=s4.getOptions();
		System.out.println(options.size());
		boolean flag=false;
		for(WebElement Element : options)
		{
			String text=Element.getText();
		
			
		if(text.equalsIgnoreCase("Bangalore Urban"))
		{
			flag=true;
			break;
		}
		}
		if(flag) {
			System.out.println("Bangalore is present");
		}
		else
		{
			System.out.println("Bangalore is not present");
		}
		
		
	}

}
